import java.util.Arrays;

public class TestHeap {
    public int[] elem;
    public int userSize;
    public TestHeap(){
        this.elem = new int[10];  //对elem进行初始化，大小为10
    }

    //向下调整
    /**
     * 时间复杂度：O(logn)
     * @param root：每棵树的开始位置
     * @param len：结束位置
     */
    public void adjustDown(int root,int len) {
        int parent = root;
        int child = 2 * parent + 1;
        while (child < len){ //肯定有左孩子
            if (child + 1 < len && this.elem[child] < this.elem[child + 1]) {
                child = child + 1;
            }
            if (this.elem[parent] < this.elem[child]) {
                //交换
                int tmp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = tmp;

                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }

    //将数组创建成堆
    /**
     * 建堆复杂度为O(n)
     * @param array
     */
    public void creatHeap(int[] array){
        for (int i = 0;i<array.length;i++){
            this.elem[i] = array[i];
            this.userSize++;
        }

        //i：每颗子树的根节点
        for (int i= (this.userSize-1-1)/2;i>=0;i--){
            adjustDown(i,this.userSize);
        }
    }

    //插入数据
    public void push(int val){
        //判断堆是否满  扩容
        if (isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length );
        }
        //放到数组的最后一个位置
        this.elem[this.userSize] = val;
        this.userSize++;
        //进行调整
        adjustUp(this.userSize-1 );
    }

    //删除
    public void pop(){
        //是否为空
        if (isEmpty()){
            return;
        }
        //最后一个元素和堆顶元素交换
        int tmp = this.elem[this.userSize-1];
        this.elem[this.userSize-1] = this.elem[0];
        this.elem[0] = tmp;
        this.userSize--;
        //调整0号下标这棵树
        adjustDown(0,this.userSize);
    }

    //打印数组第一个元素
    public int peek(){
        if (isEmpty()){
            return -1;
        }
        return this.elem[0];
    }

    //判空
    public boolean isEmpty(){
        return this.userSize == 0;
    }

    //向上调整
    public void adjustUp(int child){
        int parent = (child -1)/2;
        while (child > 0){
            if (this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child -1)/2;
            } else {
                break;
            }
        }
    }

    //判满
    public boolean isFull(){
        return this.userSize == this.elem.length;
    }

    //打印
    public void show(){
        for (int i =0;i<this.userSize;i++){
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    //堆排序

    /**
     * 时间复杂度：O(n*logn)
     *  O(n*logn) + O(n)
     * 空间复杂度：O(1)
     */
    public void HeapSort(){
       int end = this.userSize-1;
       while (end > 0){
           int tmp = this.elem[0];
           this.elem[0] = this.elem[end];
           this.elem[end] = tmp;
           adjustDown(0,end);
           end--;
       }
    }
}
