package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Java Maven App!")  // 세미콜론 누락
        System.out.println("Build test successful."       // 괄호, 세미콜론 누락
    }

    public static int add(int a, int b) {
        return a + b
    }  // 세미콜론 누락
}
