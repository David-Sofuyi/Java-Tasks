import java.util.Arrays;

public class StandardDeviation {


    public static double sum(double[] numbers) {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            double num = numbers[i];
        total += num;
}
        }

        return total;
    }


    public static double mean(double[] numbers) {
        return sum(numbers) / numbers.length;
    }

    
    public static double variance(double[] numbers) {
        double mean = mean(numbers);
        double temp = 0;

       for (int i = 0; i < numbers.length; i++) {
        double num = numbers[i];
        temp += Math.pow(num - mean, 2);
}

        return temp / numbers.length;
    }

    
    public static double standardDeviation(double[] numbers) {
        return Math.sqrt(variance(numbers));
    }

    
    public static double meanDeviation(double[] numbers) {
        double mean = mean(numbers);
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += Math.abs(numbers[i] - mean);
}
        return total / numbers.length;
    }

    
    public static void main(String[] args) {

        double[] numbers = {10, 15, 15, 25, 35};

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Mean: " + mean(numbers));
        System.out.println("Variance: " + variance(numbers));
        System.out.println("Standard Deviation: " + standardDeviation(numbers));
        System.out.println("Mean Deviation: " + meanDeviation(numbers));
    }
}
