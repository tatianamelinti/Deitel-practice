import static java.util.Arrays.fill;

public class Ch7_11 {
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void setToZero(int arr[]) {
            fill(arr, 0);
    }

    public static void plusBonus(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void main(String[] args) {
        int[] zero = new int[10];
        setToZero(zero);
        printArr(zero);
        System.out.println(" ");

        int[] bonus = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        plusBonus(bonus);
        printArr(bonus);
        System.out.println(" ");


        int[] bestScores = {100, 99, 97, 96, 96, 90, 89, 87};
        for (int i = 0; i < 5; i++) {
            System.out.println(bestScores[i]);
        }

    }
}