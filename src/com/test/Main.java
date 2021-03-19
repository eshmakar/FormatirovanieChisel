package com.test;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance(); // выводит с пробелом после каждой тысячи: 1 234 567 890
        System.out.println(nf.format(1234567890));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(); //выводит валюту в конце цифр: 0,75 ₽
        System.out.println(nf2.format(.75F));

        NumberFormat nf3 = NumberFormat.getPercentInstance(); //добавляет знак процента, в конце цифр: 14 %
        System.out.println(nf3.format(.14f));
    }
}
