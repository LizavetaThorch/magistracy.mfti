package findMax;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); //  количество чисел в массивах
        int[] a = new int[number];
        int[] b = new int[number];

        for (int i = 0; i < number; i++) { // вводим значение первого массива
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < number; i++) { // вводим значение второго массива
            b[i] = scanner.nextInt();
        }

        int aCurrMax = 0;
        int aMax = 0;
        int bMax = 0;

        for (int i = 1; i < number; i++) {
            if (a[i] > a[aCurrMax]) { // поиск максимума в первом массиве
                aCurrMax = i;
            }

            if (a[aCurrMax] + b[i] > a[aMax] + b[bMax]) {
                aMax = aCurrMax;
                bMax = i;
            }
        }
        System.out.println(aMax + " " + bMax);
    }
}
