// Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].

import java.util.HashMap;

public class arraySubset {
    public static void main(String[] args){
        int[] a={11, 7, 1, 13, 21, 3, 7, 3};
        int[] b={11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));
    }

    public static boolean isSubset(int[] a, int[] b){
        HashMap<Integer,Integer> aMap=new HashMap<>();

        for(int ele:a){
            if(aMap.containsKey(ele)){
                int freq = aMap.get(ele);
                aMap.put(ele,freq+1);
            }else{
                aMap.put(ele,1);
            }
        }

        HashMap<Integer,Integer> bMap = new HashMap<>();

        for(int ele:b){
            if(!aMap.containsKey(ele)) return false;
            if(bMap.containsKey(ele)){
                int freq=bMap.get(ele);
                bMap.put(ele,freq+1);
            }else{
                bMap.put(ele,1);
            }
        }

        for(int key:bMap.keySet()){
            int freq=bMap.get(key);
            int aFreq=aMap.get(key);

            if(freq>aFreq) return false;
        }

        return true;
    }
}
