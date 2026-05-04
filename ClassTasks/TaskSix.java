import java.util.Arrays;

public class TaskSix {
    
    public static int[] getEvenIndexElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; 
        }

        int resultSize = (arr.length + 1) / 2; 
        int[] result = new int[resultSize];

        int resultIndex = 0;
        for (int i = 0; i < arr.length; i += 2) {
            result[resultIndex] = arr[i];
            resultIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {6, 16, 3, 33, 11, 4, 8, 9};
        
        
        int[] evenIndexElements = getEvenIndexElements(array);
        System.out.println("Elements at even indexes: " + Arrays.toString(evenIndexElements));
        
       
        int total = 0;
        for (int num : evenIndexElements) {
            total += num;
        }
        System.out.println("Sum of even index elements: " + total); 
    }
}
