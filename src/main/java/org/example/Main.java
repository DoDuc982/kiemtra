package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FloatProcess floatProcess = new FloatProcess();
        ParagraphProcess paragraphProcess = new ParagraphProcess();
        SquareMatrix squareMatrix = new SquareMatrix();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            choice = menu(sc);
            switch (choice) {
                case 1 -> {
                    floatProcess.arrayInput();
                    System.out.println("Dãy bạn đã nhập là: ");
                    System.out.println(floatProcess.arr);
                    sleep(1500);
                }
                case 2 -> {
                    System.out.println("Tổng của dãy là: ");
                    System.out.println(floatProcess.summaryOfArray());
                    sleep(1500);
                }
                case 3 -> {
                    System.out.println("Dãy sắp xếp là: ");
                    System.out.println(floatProcess.sortArray());
                    sleep(1500);
                }
                case 4 -> {
                    paragraphProcess.paragraphInput();
                    System.out.println("Đoạn văn bạn đã nhập là: ");
                    System.out.println(paragraphProcess.paragraph);
                    sleep(1500);
                }
                case 5 -> {
                    System.out.println("Độ dài của xâu là: ");
                    System.out.println(paragraphProcess.paragraphLength());
                    sleep(1500);
                }
                case 6 -> {
                    System.out.println("Số từ có trong xâu là: ");
                    System.out.println(paragraphProcess.numberOfWord());
                    sleep(1500);
                }
                case 7 -> {
                    squareMatrix.matrixInput();
                    System.out.println("Ma trận 1 và 2 đã nhập là: ");
                    System.out.println(squareMatrix.arr1);
                    System.out.println(squareMatrix.arr2);
                    sleep(1500);
                }
                case 8 -> {
                    System.out.println("Ma trận tổng là: ");
                    System.out.println((squareMatrix.getSummaryOfTwoArr()));
                    sleep(1500);
                }
                default -> choice = 0;
            }
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
    }

    private static int menu(Scanner sc) {
        int choice;
        System.out.println("______________MENU______________");
        System.out.println("1. Nhập vào dãy số thực");
        System.out.println("2. Tính tổng dãy số thực");
        System.out.println("3. Sắp xếp dãy số thực");
        System.out.println("4. Nhập vào một đoạn");
        System.out.println("5. Đưa ra độ dài xâu");
        System.out.println("6. Tách các từ trong đoạn");
        System.out.println("7. Nhập vào ma trận vuông");
        System.out.println("8. Tính tổng các phần tử trong ma trận vuông");
        System.out.println("Mời bạn nhập lựa chọn: ");
        choice = sc.nextInt();
        return choice;
    }
}