// Problem Description -:  Given two non-negative integers n1 and n2, where n1
// For example:
// Suppose n1=11 and n2=15.
// There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.
// Example1:
// Input:
// 11 — Vlaue of n1
// 15 — value of n2
// Output:
// 4

public class nonRepeatedDigits {

    public static int nonRepeated(int start, int end){
        int count=0;

        for(int i=start; i<=end; i++){
            int num=i;

            boolean[] visited = new boolean[10];

            while(num!=0){
                int rem=num%10;
                if(visited[rem]){
                    break;
                }
                visited[rem] = true;
                    num/=10;
                if(num==0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int start=101, end=200;
        System.out.println(nonRepeated(start,end));
    }
}
