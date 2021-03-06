import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        displayArrReverse(arr, arr.length - 1);

    }

    public static void displayArrReverse(int[] arr, int idx) {

        if (idx < 0) {
            return;
        }

        System.out.println(arr[idx]);

        displayArrReverse(arr, idx - 1);
    }

}