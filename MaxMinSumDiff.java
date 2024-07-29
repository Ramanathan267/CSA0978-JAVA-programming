import java.util.Arrays;

public class MaxMinSumDiff {
  public static void main(String[] args) {
    int[] array = {5, 2, 8, 19, 3, 7, 4, 6};
    int M = 1; 
    int N = 1; 
    Arrays.sort(array);
    int max = array[array.length - M];
    int min = array[N - 1];

    int sum = max + min;
    int diff = max - min;

    System.out.println("Mth maximum number: " + max);
    System.out.println("Nth minimum number: " + min);
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + diff);
  }
}
