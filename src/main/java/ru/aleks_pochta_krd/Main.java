package ru.aleks_pochta_krd;


import java.lang.foreign.AddressLayout;
import java.util.*;

public class Main {
    public static void main(String... args) {


//        // Типы данных
//        // Логические
//        boolean d = true;
//        // целочисленные в
//        byte varByte = 100; // -128 ... 127 8 бит
//        short varShort = 10000; // -32768... 32767 16 бит
//        int varInt = 1000000000; // -2147483648... 2147483647 32 бит
//        long varLong = 1000000000000000000L; // -9223372036854775808... 9223372036854775807 64 бит
//        var aVar = 10; // 32 бит - целочисленные
//        // плавающие числа
//        float varFloat = 1.1f; // 32 бит
//        double varDouble = 1.11; // 64 бит
//        // символьные
//        char varChar = 'a'; // 16 бит (под капотом тип int)
//        // строки
//        String varString0 = "Hello"; // 16 бит не сравниваются, т.к. сравнивается адрес. сравниваються enum
//        String varString1 = "Hello"; // 16 бит не сравниваются, т.к. сравнивается адрес. сравниваються enum
//
//        boolean equals = varString0 == varString1; // false
//
//        // Операторы математические
//        int result = 10;
//        result += 1;
//        result = result + 1;
//        result = ++result;
//
//        // Операторы сравнения
//        boolean res = varInt > 10; // true
//        boolean res2 = varInt == 0; // false
//
//        // Операторы логические
//        int coinNominal = 3;
//        String coinCurrency = null;
//
//        if ((coinNominal == 2) && (coinCurrency.equals("RUB"))) {}
//
//

        String[] array2 = {"Hello", "World"};

        int[] array0 = {100, 150, -1, 900};
        int[] array1 = {100, 150, -1, 900};

//        int[][] array2 = {array0,array1}; // 2-мерный массив

        int[] array = {100, 150, -1, 900};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }


        List<String> stringList = new ArrayList<>(); // Список строк который внутри себя использует массив
        stringList.add("Hello");
        stringList.addAll(Arrays.asList("petrov", "krd"));
        stringList.get(0);
        stringList.remove(0);
        stringList.stream()
                .filter(s -> s.equals("Hello"))
                .map(s -> s.toUpperCase());


        Set<Integer> stringSet = new HashSet<>();
        stringSet.add(1);
        stringSet.add(2); // Множество


        Map<Integer, Human> aMap = new HashMap<>();
        aMap.put(3434, new Human("Petrov", "M", 33));
        aMap.put(34345, new Human("vasa", "m", 34));

        Set<Integer> passportNumbers = aMap.keySet();
        Collection<Human> humans = aMap.values();
        Set<Map.Entry<Integer, Human>> entrySet = aMap.entrySet();

        for (Map.Entry<Integer, Human> entry : entrySet) {
            if (entry.getKey() == 3434) {
                System.out.println("Нашли Петра: " + entry.getValue().getName());
            }
        }







//        System.out.println(array[1]);






        





    }
}