package com.company;

import java.lang.NumberFormatException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        st = st.replaceAll(" ", "");
        String[] parts = st.split("[+\\-*/]");
        if (parts.length != 2) {
            throw new NumberFormatException("Неверный формат выражения (Введите 2 заначения)");
        }
        String par1 = parts[0];
        String par2 = parts[1];
        if (par1.contains(".")) {
            throw new NumberFormatException("Неверный формат числа (Введите цельное число)");
        }
        if (par2.contains(".")) {
            throw new NumberFormatException("Неверный формат числа (Введите цельное число)");
        }
        try {
            Integer.parseInt(par1);
            Integer.parseInt(par2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат выражения(Введите только числа)");
        }
        int a = Integer.parseInt(par1);
        int b = Integer.parseInt(par2);
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                throw new NumberFormatException("Неверный формат выражения(Введите только числа от 1 до 10)");
            }
        } else if (st.contains("+")) {
            System.out.println(a + b);
        } else if (st.contains("-")) {
            System.out.println(a - b);
        } else if (st.contains("*")) {
            System.out.println(a * b);
        } else if (st.contains("/")) {
            System.out.println(a / b);
        } else
            throw new NumberFormatException("Неверный формат выражения(Введите только +,-,*,/)");
    }
}
