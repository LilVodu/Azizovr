package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	// write your code here
        int a = in.nextInt();
        int b = in.nextInt();
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        CompiexNumbers n1 = new CompiexNumbers(a,b);
        CompiexNumbers n2 = new CompiexNumbers(a1,b1);
        n1.slozenie(n1,n2).printCompl();
        n1.vichitanie(n1,n2).printCompl();
        n1.umnozenie(n1,n2).printCompl();
        n1.delenie(n1,n2).printCompl();

    }
}
