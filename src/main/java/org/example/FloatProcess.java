package org.example;

import java.util.Scanner;

public class FloatProcess {
    public float n, m, e;
    private Scanner sc = new Scanner(System.in);
    public void floatInput(){
        System.out.println("Nhập vào 2 số thực n, m va elipson: ");
        this.n = sc.nextFloat();
        this.m = sc.nextFloat();
        this.e = sc.nextFloat();
    }
}
