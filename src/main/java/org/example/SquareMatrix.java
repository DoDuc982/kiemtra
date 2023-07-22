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
    }

    public ArrayList<Integer> getSummaryOfRow() {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < this.n * this.n; i++) {
            if(count!=this.n){
                count++;
                System.out.print(this.arr1.get(i));
            } else {
                System.out.println();
                count = 0;
            }
        }
        return arr;
    }
}
