package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

// Написать метод:
//1. Найти максимальный элемент в списке
//2 найти минимальный элемент в списке
//3 вывести список в обратном порядке
//4 поделить список на два списка - четные и нечетные

        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(500));
        }

        System.out.println("integers : " + integers);
        System.out.println(findMax(integers));
        System.out.println(findMin(integers));
        System.out.println(reverseList(integers));
        divideList(integers);
        System.out.println("Changes from Git");


    }


    public static int findMax(List<Integer> integers) {
        int currentMax = 0;
        for (int i = 0; i < integers.size(); i++) {
        //    currentMax = Math.max(integers.get(i), integers.get(i + 1));

            currentMax = Math.max(currentMax, integers.get(i));
        }
        return currentMax;
    }

    public static int findMin(List<Integer> integers) {

        int currentMin = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            currentMin = Math.min(currentMin, integers.get(i));
        }
        return currentMin;
    }

    public static List<Integer> reverseList(List<Integer> integers) {
        List<Integer> reverseInt = new ArrayList<>();
        for (int i = integers.size() - 1; i >= 0; i--) {
            reverseInt.add(integers.get(i));
        }
        return reverseInt;
    }

    public static void divideList(List<Integer> integers) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 == 0) {
                even.add(integers.get(i));
            } else {
                odd.add(integers.get(i));
            }
        }
        System.out.println("нечетные значения - "+odd);
        System.out.println("четные значения - "+even);
    }
}