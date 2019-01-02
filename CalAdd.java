package my.examples.javaexam.algorithm;

import java.util.Scanner;

// 계산기 더하기
public class CalAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
