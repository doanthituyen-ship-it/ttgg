package Lecture1;

import java.util.Scanner;

public class EnterNumberNAndFindMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int n, max = 0, index = 0;
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        k = new int[n];
      /*
        //Cach 1
        for(int i=0;i<n;i++){
            System.out.print("Elements of array: ");
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            max = a[0];
            in = 0;
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("At position: " + index);
*/
      //Cach hai
       for(int i=0;i<n;i++){
            System.out.print("Elements of array: ");
            int x=sc.nextInt();
            if(i==0){
                max=x;
            }else{
                if(x>max)
                    max=x;
            }
        }
        System.out.println("Max value: "+max);
    }

}

