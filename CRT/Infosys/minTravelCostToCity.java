// A company is organizing a conference in two cities, City A and City B. There are 2N employees, and exactly N employees must be assigned to each city.
// For each employee i:
// The cost of sending the employee directly to City A is A[i].
// To travel to City B, the employee must first stop ata transit hub. The total travel cost to City B is:
// min(A[i], B[i]) + B[i]
// where:
// A[i] is the cost of traveling directly to City A.
// B[i] is the cost of traveling from the transit hub to City B.
// Determine the minimum total travel cost while ensuring that exactly N employees are assigned to each city.

import java.util.Scanner;
public class minTravelCostToCity {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();

        int[] a=new int[2*n];
        int[] b=new int[2*n];

        for(int i=0; i<a.length; i++){
            a[i]=ip.nextInt();
        }

        for(int i=0; i<b.length; i++){
            b[i]=ip.nextInt();
        }

        System.out.println(minCost(n,a,b));
    }

    public static int minCost(int n, int[] a, int[] b){

        int size=2*n;

        int[] costA = a.clone();
        int[] costB = new int[size];
        int[] diff = new int[size];

        for(int i=0; i<size; i++){
            costB[i]=Math.min(a[i],b[i])+b[i];
            diff[i]=costA[i]-costB[i];
        }

        // bubble sort

        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(diff[j] > diff[j+1]){

                    // swap diff
                    int temp = diff[j];
                    diff[j]=diff[j+1];
                    diff[j+1]=temp;

                    // swap costA
                    temp=costA[j];
                    costA[j]=costA[j+1];
                    costA[j+1]=temp;

                    // swap costB
                    temp=costB[j];
                    costB[j]=costB[j+1];
                    costB[j+1]=temp;
                }
            }

        }
            // count the total cost from city A and B

            int total=0;

            for(int i=0; i<n; i++){
                total+=costA[i];
            }

            for(int i=n; i<size; i++){
                total+=costB[i];
            }

            return total;
        }   
}
