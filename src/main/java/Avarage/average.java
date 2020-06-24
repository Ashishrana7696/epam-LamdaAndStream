package Avarage;

import java.util.Arrays;
import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Average of array :"+Arrays.stream(arr).average().getAsDouble());


}}
