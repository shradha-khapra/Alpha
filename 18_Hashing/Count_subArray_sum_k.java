package Hashing;

import java.util.*;
public class Count_subArray_sum_k {
    public static void main(String args[]){

        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        //we need to put (0,1) in map for some corner cases
        map.put(0,1);


        int sum =0;
        int ans = 0;

        for(int i =0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum - k)){
                ans+=map.get(sum-k);
            }else{
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }

        System.out.println(ans);
    }
}
