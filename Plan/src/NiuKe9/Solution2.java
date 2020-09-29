package NiuKe9;
import java.util.*;
public class Solution2 {
    /**
     * 得到一个数据流中的中位数
     * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
     * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
     * 使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
     */
    ArrayList<Integer> list = new ArrayList<>();
    int len = 0;
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        Collections.sort(list);
        int len = list.size();
        if(len % 2 ==1){
            int n = len/2;
            double ret = list.get(n);
            return ret;
        } else {
            int n = len / 2;
            int c = list.get(n-1) + list.get(n);
            double ret = c/2.0;
            return ret;
        }
    }
}