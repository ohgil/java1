package org.example;

public class Main {
    public static void main(String[] args) {
        int age = 50;
        System.out.println("당신의 나이 : " + age);

        if (age >= 20) {
            System.out.println("성인입니다");
        }
        if (age < 20) {
            System.out.println("미성년자 입니다");
        }
    }
}