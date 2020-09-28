package Niuke9_28;

import java.util.*;
public class Solution2 {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length <= 0){
            return false;
        }
        if(numbers.length==1){
            return true;
        }
        Arrays.sort(numbers);
        int i = 0;
        int count = 0;
        while(i < numbers.length){
            if(numbers[i] == 0){
                count++;
                i++;
            } else{
                break;
            }
        }
        for(i = i+1; i<numbers.length;i++){
            int num = numbers[i] - numbers[i-1];
            if(num == 0){
                return false;
            }else if(num != 1){
                count = count - num + 1;
            }
            if(count < 0){
                return false;
            }
        }
        return true;
    }
}