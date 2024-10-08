import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reverse Array Challenge!");
        int[] numberArray = {6,7,8,9,10,5,4,3,2,1};
//        System.out.println("Unreverse Array: " + Arrays.toString(numberArray));
//        System.out.println("Reverse Array: " + Arrays.toString(reverse(numberArray)));
//        reverse(numberArray);
//        System.out.println("Final: " + Arrays.toString(numberArray));
        int[] reverseCopy = reverseCopy(numberArray);
        System.out.println("Before reverse " + Arrays.toString(numberArray));
        System.out.println("After reverse " + Arrays.toString(reverseCopy));
    }

    private static void reverse(int[] array){
      int maxIndex = array.length - 1;
      int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("--->" +  Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for(int el: array){
            reversedArray[maxIndex--] = el;

        }
        return reversedArray;
    }
}
