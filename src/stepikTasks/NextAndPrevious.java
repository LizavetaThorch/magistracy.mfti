package stepikTasks;

import java.util.Scanner;

/*
*Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере.
* Пробелы, знаки препинания, заглавные и строчные буквы важны!
* Входные данные: Вводится целое число, по модулю не превосходящее 10000.
* Выходные данные: Выведите сначала фразу "The next number for the number ",
* затем введенное число, затем слово " is ", окруженное пробелами,
* затем формулу для следующего за введенным числа, наконец, знак точки без пробела.
* Аналогично в следующей строке для предыдущего числа.
*
The next number for the number 179 is 180.
The previous number for the number 179 is 178.
*/
public class NextAndPrevious {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number < 1000){
            System.out.println("The next number for the number " + number + " is " + (number + 1));
            System.out.println("The previous number for the number " + number + " is " + (number - 1));
        }
    }
}