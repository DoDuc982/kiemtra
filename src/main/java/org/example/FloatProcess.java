package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FloatProcess {
    public ArrayList<Float> arr = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void arrayInput(){
        System.out.println("Mời bạn nhập số phần tử: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Phần tử " + i + ":");
            this.arr.add(sc.nextFloat());
        }
    }
    public float summaryOfArray(){
        float sum = 0;
        for (float a : this.arr) {
            sum += a;
        }
        return sum;
    }
    public ArrayList<Float> sortArray(){
        Collections.sort(this.arr);
        return this.arr;
    }
}
