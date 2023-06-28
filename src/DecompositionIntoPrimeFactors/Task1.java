package DecompositionIntoPrimeFactors;

public class Task1 {
    public static  void  main(String[] args){
        int value = 75;
        double sqtr = Math.sqrt(value);
        int currentValue = value;
        int multiplier = 2;

        while (currentValue > 1 && multiplier <= sqtr){
            if(currentValue % multiplier == 0){
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
            } else if (multiplier == 2){
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if(currentValue != 1){
            System.out.print(currentValue);
        }
    }
}
