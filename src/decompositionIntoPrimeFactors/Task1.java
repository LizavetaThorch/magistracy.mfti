package decompositionIntoPrimeFactors;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int value = scanner.nextInt();
        int multiplier = 2;
        double sqrt = Math.sqrt(value);

        while (value > 1 && multiplier < sqrt) {
            if(value % multiplier == 0){ // % деление с остатком
                System.out.print(multiplier + " ");
                value /= multiplier; // делю число на множитель
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if(value != 1){
            System.out.println(value);
        }
    }
}
