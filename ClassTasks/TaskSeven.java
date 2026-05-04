import java.util.Arrays;

public class TaskSeven {
    
    public static int[] getOddIndexElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; 
        }

        int resultSize = (arr.length + 1) / 2; 
        int[] result = new int[resultSize];

        int resultIndex = 0;
        for (int i = 0; i < arr.length; i += 3) {
            result[resultIndex] = arr[i];
            resultIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {6, 16, 3, 33, 11, 4, 8, 9};
        
        
        int[] oddIndexElements = getOddIndexElements(array);
        System.out.println("Elements at odd indexes: " + Arrays.toString(oddIndexElements));
        
       
        int total = 0;
        for (int num : oddIndexElements) {
            total += num;
        }
        System.out.println("Sum of odd index elements: " + total); 
    }
}
