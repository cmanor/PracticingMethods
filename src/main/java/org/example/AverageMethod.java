package org.example;

public class AverageMethod {
    public static void main(String[] args){
        System.out.println((double)average(2,5,8));
    }
    public static int sum (int sum1, int sum2, int sum3) {
        return sum1 + sum2 + sum3;
    }
    public static int average (int avg1, int avg2, int avg3) {
       int baseSum = sum(avg1, avg2, avg3);
       return baseSum/3;
    }
}
