package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int n = 2;
		int m = 2;
		if(n>0 && m>0) {
			System.out.println("ќтвет " + Exercise.recursion(n, m)); 
        }
        else{
            System.out.println("¬ведите положительные целые числа!!!");}
    }
}
