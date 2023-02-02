package BJ10;

import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class cutline{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

      
        Integer arr[] = new Integer[N];

        for(int i = 0; i< N; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        System.out.println(arr[k-1]);

        
      
        int arr2[] = new int[N];
        
        for(int i = 0; i< N; i++){
            arr2[i] = sc.nextInt();
        }
        
        Arrays.sort(arr2);

        System.out.println(arr2[N-k]);


    }
}