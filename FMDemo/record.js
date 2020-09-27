

// document 是js在浏览器中运行时一直存在的变量，表示的意思是代表文档树
// document 可以粗糙的理解为这个树的根

//getElementById 从树上，根据id，找到对应的节点标签
let preview = document.getElementById("preview");      //video id = "preview" width="160" height="120" autoplay muted></video>
let recording = document.getElementById("recording");
let startButton = document.getElementById("startButton");
let stopButton = document.getElementById("stopButton");
let downloadButton = document.getElementById("downloadButton");



function wait(delayInMS) {
	//setTimeout (执行什么方法，多少毫秒之后)
	// 类似Java当中的Times 
	//设置一个闹钟一样的效果
  return new Promise(resolve => setTimeout(resolve, delayInMS));
}



//开始录制
function startRecording(stream,lengthInMS) {
	console.log("开始录制");
	
	let recorder = new MediaRecorder(stream);    //定义一个媒体录制对象
	let data = [];
	
	// 当(on)数据（data）可用(available)时，执行该方法
	recorder.ondataavailable = function(event){
		console.log("数据可用了")
		//event.data 录制下来的视频和音频数据，存入data数组
		data.push(event.data);
	};
	
	// 开始录制
	recorder.start();

	// resolve 成功的时候应该执行的方法 对应then传入的方法
	// reject 失败的时候应该执行的方法 对应catch传入的方法
	let stopped = new Promise(function(resolve, reject){
		recorder.onstop = resolve;
		recorder.onerror = function(event){
			reject(event.name);
		}
	}); 
	
	// 持续lengthInMS时间后，执行 then中的方法
	let recorded = wait(lengthInMS).then(
		function(){
			// 判断recorder是否还在录制，如果还在== "recording" 则录制就停止
			if(recorder.state == "recording"){
				console.log("停止录制");
				recorder.stop();
			}
		}
	);
	
	return Promise.all([
		stopped,
		recorded
	]).then(() => data);
}

function startCapturing() {
	 console.log("点击了采集");
	
	//会触发申请权限的操作
	let promise = navigator.mediaDevices.getUserMedia({
		video:true,   //申请摄像头权限
		audio:true		//申请麦克风权限
	});
	
	//如果用户同意了就执行then中的方法，如果失败了(用户不同意/其他失败)就执行catch中的方法
	promise.then(function(stream){
		console.log("用户同意了授权")
		//用户同意了
		// stream 变量代表录制的视频和音频
		preview.srcObject = stream;
		
		//处理兼容性 类似 if(!preview.captureStream){preview.captureStream || preview.mozCaptureStream;}
		preview.captureStream = preview.captureStream || preview.mozCaptureStream;
		
		// 接着执行的是，当preview  开始 (on) 播放(playing) 时执行 then 的方法
		return new Promise(function(resolve){ 
			preview.onplaying = resolve
		});
	}).then(function(){ 
		startRecording(preview.captureStream(), 5000);   
 
	}).then(function(data){
		console.log("实用录制下来的数据");
		console.log(data);
		
		let recordedBolb = new Bolb(data,{type:"video/webm"});
		recording.src = URL.createObjectURL(recordedBolb);
	}).catch(e => {
		console.log(e)
	});
}

function stopRecording(){
	console.log("点击了结束录制");
	if(mediaRecorder){
		mediaRecorder.stop();
	}
	
}

//回调函数
startButton.onclick = startCapturing;   //进行事件绑定，发生了startButton的点击事件	请执行 startRecording

stopButton.onclick = stopRecording; 	   //进行事件绑定，发生了stopButton的点击事件	请执行 stopRecording 函数
