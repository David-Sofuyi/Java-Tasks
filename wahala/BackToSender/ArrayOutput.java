public class ArrayOutput {

    public static int difference(int[] numbers) {
       

        int max = numbers[0];
        int min = numbers[0];

        for (int num = 1; num < numbers.length; num++) {
            if (numbers[num] > max) {
                max = numbers[num];
            }
            if (numbers[num] < min) {
                min = numbers[num];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 20};
        int result = difference(arr);
        System.out.println("Difference: " + result);
    }
}
