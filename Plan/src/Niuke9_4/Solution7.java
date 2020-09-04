package Niuke9_4;

public class Solution7 {
    /**
     *给定一个数组A[0,1,...,n-1],构建一个数组B[0,1,...,n-1],
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
     * （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];
     * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
     * @param A
     * @return
     */
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if (A.length == 1){
            return null;
        }
        for(int i = 0;i<A.length;i++){
            int count = 1;
            for(int j = 0;j<A.length;j++){
                if(i!=j){
                    count = count*A[j];
                }
                B[i] = count;
            }
        }
        return B;
    }
}
