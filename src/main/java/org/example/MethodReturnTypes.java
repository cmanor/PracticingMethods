package org.example;

public class MethodReturnTypes {
    public static void main(String[] args){
        System.out.println(returnString());
        System.out.println(returnInt());
        System.out.println(returnBoolean());
    }
    public static String returnString(){
        return "deez";
    }
    public static int returnInt() {
        return 5;
    }
    public static boolean returnBoolean() {
        return false;
    }

}
