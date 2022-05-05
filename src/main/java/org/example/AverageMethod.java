package org.example;

public class AverageMethod {
    public static void main(String[] args){
        System.out.println((double)average(2,5,8));
    }
    public static int sum (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int average (int avg1, int avg2, int avg3) {
       int solution = sum(avg1, avg2, avg3);
       return solution/3;
    }
}
