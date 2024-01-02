package com.algorithms;

public class PrimaryNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers in the range of 0 to 1000:");
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int count = 2;
        while((count*count)<=n){
            if(n%count==0){
                return false;
            }
            count++;
        }
        return true;
    }
}
