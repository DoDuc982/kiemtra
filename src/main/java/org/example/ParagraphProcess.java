package org.example;

import java.util.Scanner;

public class ParagraphProcess {
    public String paragraph;
    private Scanner sc = new Scanner(System.in);
    public void paragraphInput(){
        System.out.println("Nhập vào đoạn văn: ");
        this.paragraph = sc.nextLine();
    }
    public int paragraphLength(){
        return this.paragraph.length();
    }

    public int numberOfWord() {
        if (this.paragraph == null || this.paragraph.isEmpty()) {
            return 0;
        }
        return this.paragraph.split("\\s+").length;
    }
}
