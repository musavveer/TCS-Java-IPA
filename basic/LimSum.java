package basic;

import java.util.Scanner;

class LimSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();

        int count =0;
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>limit1 && arr[i]<limit2) {
                sum = sum+arr[i];
                count++; 
            }
        }
        int res = sum/count;
        System.out.println(res);
        sc.close();
    }    
}
