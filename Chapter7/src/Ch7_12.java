import java.util.Scanner;
public class Ch7_12 {
    static int removeDuplicates(int arr[], int size) {
        if (size==0 || size==1) {
            return size;
        }
        int[] temp = new int[size];
        int j = 0;
        for (int i=0; i<size-1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
            temp[j++] = arr[size - 1];
        for (int i=0; i<j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        int arrLength=5;
        int[] numbers = new int[arrLength];
        System.out.println("Enter 5 numbers between 10 and 100: ");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        printArr(numbers);
        System.out.println("\n Array without duplicates: ");
        //Print updated array
        arrLength = removeDuplicates(numbers, arrLength);
       for (int i=0; i<arrLength; i++)
           System.out.print(numbers[i]+" ");
    }
}



