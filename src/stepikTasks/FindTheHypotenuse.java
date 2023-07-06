package stepikTasks;

import java.util.Scanner;

/*
* Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.
* Входные данные: В двух строках вводятся два числа (числа целые, положительные, не превышают 1000).
* Выходные данные: Выведите ответ на задачу в виде целого числа
*
* Sample Input:
6
8
Sample Output:
10
*/
public class FindTheHypotenuse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // катет
        int b = scanner.nextInt(); // катет
        int c = (int) Math.sqrt(a*a + b*b); // гипотенуза a^2 + b^2 = c^2
        System.out.println(c);
        //System.out.println("катет 1: " + a + ", катет 2: " + b + ", гипотенуза: " + c);
    }
}
