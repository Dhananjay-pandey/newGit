/*import java.util.Scanner;
public class Sum_Zero 
{
    public static void main(String[] args) 
    {
        int n, min1 = 0, min2 = 1, sum, minimum;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements you want:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the numbers:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        minimum=Math.abs(a[0] + a[1]);
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                sum = Math.abs(a[i] + a[j]);
                if(sum < minimum)
                {
                    min1 = i;
                    min2 = j;
                    minimum = sum;
                }
            }
        }
        System.out.println("Element 1:"+a[min1]); 
        System.out.println("Element 2:"+a[min2]);
    }
}*/



import java.util.*;

public class SumCloseToZero {

    public int findSum(int [] a){
        Arrays.sort(a);
        int i=0;
        int j = a.length-1;
        int positiveClose = Integer.MAX_VALUE;
        int negativeClose = Integer.MIN_VALUE;
        while(i<j){
            int temp = a[i] + a[j];
            //check if temp is greater than 0
            if(temp>0){
                //check if positiveClose needs to be updated
                if(positiveClose>temp){
                    positiveClose = temp;
                }
                //decrement j, in order to reduce the difference, close to 0
                j--;
            }else if(temp<0){
                //check if negative needs to be updated
                if(negativeClose<temp){
                    negativeClose = temp;
                }
                //increment i, in order to reduce the difference, close to 0
                i++;
            }else{
                //means temp is 0, that is the closest to zero we can get, return 0
                return 0;
            }
        }
        //check the least absolute value in postiveClose and negativeClose
        return Math.min(Math.abs(positiveClose), Math.abs(negativeClose));
    }
    public static void main(String[] args) {
        int a [] = {-5,-10,-15};
        int closestSum = new SumCloseToZero().findSum(a);
        System.out.println("Sum close to zero in the given array is : " + closestSum);
    }
}















