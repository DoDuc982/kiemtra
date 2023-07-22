package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareMatrix {
    private final Scanner sc = new Scanner(System.in);
    private int n;
    public ArrayList<Integer> arr1 = new ArrayList<>();
    public ArrayList<Integer> arr2 = new ArrayList<>();
    public void matrixInput(){
        System.out.println("Nhập cạnh của ma trận vuông: ");
        this.n = sc.nextInt();
        System.out.println("Nhập cho ma trận vuông thứ 1: ");
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                this.arr1.add(sc.nextInt());
            }
        }
        System.out.println("Ma trận 1 đã đủ, chuyển sang nhập ma trận 2: ");
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                this.arr2.add(sc.nextInt());
            }
        }
    }

    public ArrayList<Integer> getSummaryOfRow() {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < this.n * this.n; i++) {
            if (count < n){
                sum += this.arr1.get(i);
                count++;
            } else{
                arr.add(sum);
                sum = 0;
                count = 0;
            }
        }
        return arr;
    }
}
