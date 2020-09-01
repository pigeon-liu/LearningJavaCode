package Niuke9_1;

public class Solution1 {
    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int [][] array) {
        if(array.length == 0 ){
            return false;
        }
        //外部循环
        for(int i = 0;i<array.length;i++){
            if((array[i]).length == 0){
                return false;
            }
            //内部循环，循环每个一维数组
            for(int j = 0;j<array.length;j++){
                if (array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }



}
