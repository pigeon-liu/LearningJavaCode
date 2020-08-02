import java.util.Arrays;

public class TestHeap  {
    public int[] elem;
    public int userSize;
    public TestHeap(){
        this.elem = new int[10];  //对elem进行初始化，大小为10
    }

    //向下调整
    /**
    * root：每棵树的开始位置
    * len：结束位置
    */
    public void adjustDown(int root,int len){
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            //判断是否有左右孩子，有的话找到最大值C，下标表示最大值下标
            if(child+1 < len && this.elem[child] < this.elem[child+1]) {
                child++;
            }
            //代码到这里时，c表示最大值下标
            if(this.elem[child] > this.elem[parent]) {
                //交换
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    //将数组创建成堆
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
    public void push(int val) {
        //堆是否是满的,如果已将满了进行扩容
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //放到数组的最后一个位置
        this.elem[this.userSize] = val;
        this.userSize++;//11
        //进行调整
        adjustUp(this.userSize-1);
    }

    public void adjustUp(int child) {
        int parent = (child-1)/2;
        while (child > 0) {
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }
        }
    }
    public boolean isFull() {
        return this.userSize == this.elem.length;
    }

    public void pop() {
        //判断是否为空
        if(isEmpty()) {
            return;
        }
        //最后一个元素和堆顶元素交换
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.userSize-1];
        this.elem[this.userSize-1] = tmp;
        this.userSize--;
        //调整0号下标这棵树
        adjustDown(0,this.userSize);
    }

    public boolean isEmpty() {
        return this.userSize == 0;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }

    /**
     * 时间复杂度：O(n*logn)
     * 空间复杂度：O(1)
     */
    public void heapSort() {
        int end = this.userSize-1;
        while (end > 0) {
            int tmp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = tmp;
            adjustDown(0,end);
            end--;
        }
    }

    public void show() {
        for (int i = 0; i < this.userSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
}
