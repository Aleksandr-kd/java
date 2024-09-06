package ru.aleks_pochta_krd;


public class Main {
    public static void main(String[] args) {
        // Типы данных
        // Логические
        boolean d = true;
        // целочисленные в
        byte varByte = 100; // -128 ... 127 8 бит
        short varShort = 10000; // -32768... 32767 16 бит
        int varInt = 1000000000; // -2147483648... 2147483647 32 бит
        long varLong = 1000000000000000000L; // -9223372036854775808... 9223372036854775807 64 бит
        var aVar = 10; // 32 бит - целочисленные
        // плавающие числа
        float varFloat = 1.1f; // 32 бит
        double varDouble = 1.11; // 64 бит
        // символьные
        char varChar = 'a'; // 16 бит (под капотом тип int)
        // строки
        String varString0 = "Hello"; // 16 бит не сравниваются, т.к. сравнивается адрес. сравниваються enum
        String varString1 = "Hello"; // 16 бит не сравниваются, т.к. сравнивается адрес. сравниваються enum

        boolean equals = varString0 == varString1; // false

        // Операторы математические
        int result = 10;
        result += 1;
        result = result + 1;
        result = ++result;

        // Операторы сравнения
        boolean res = varInt > 10; // true
        boolean res2 = varInt == 0; // false

        // Операторы логические
        int coinNominal = 3;
        String coinCurrency = null;

        if ((coinNominal == 2) && (coinCurrency.equals("RUB"))) {}






        





    }
}