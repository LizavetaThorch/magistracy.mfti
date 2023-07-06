package findMax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt(); // количество переменных

        // Беру листы, тк в массиве нужно указать конкретное число содержимого. А ArrayList "расширяется" самостоятельно
        // и при реализации не надо задавать начальное значение
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < scan; i++) {
            int value = scanner.nextInt(); // ввод первого массива
            list1.add(value);
        }

        for (int i = 0; i < scan; i++) {
            int value = scanner.nextInt(); // ввод второго массива
            list2.add(value);
        }

        int max = Integer.MIN_VALUE;
        List<Integer> maxList = new ArrayList<>(scan);
        int currentMax = 0;

        // Создаем массив с максимумами по 1 массиву для каждого элемента второго массива
        for (int i = 0; i < scan; i++) {
            if(list1.get(i) >= max){
                max = list1.get(i);
                currentMax = i;
            }
            maxList.add(currentMax);
        }

        // Проходим по 2 массиву находя наибольшую сумму
        int firstPosition = 0;
        int secondPosition = 0;

        for (int i = 0; i < scan; i++) {
            currentMax = list2.get(i) + list2.get(maxList.get(i)) ;
            if(currentMax > max){
                firstPosition = maxList.get(i);
                secondPosition = i;
            }
        }
        System.out.println(firstPosition + " " + secondPosition);
    }
}

