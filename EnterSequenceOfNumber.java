package dsalabexam;
import java.util.Scanner;
public class EnterSequenceOfNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the length of array: ");

            int maxSize = scanner.nextInt();
            int[] arrays = new int[maxSize];

            System.out.println("Enter elements: ");
            for (int i = 0; i < maxSize; i++) {
                arrays[i] = scanner.nextInt();
            }
            System.out.print("Enter the target element: ");
            int searchTarget = scanner.nextInt();
            int j = 0;
            for (int num : arrays) {
                if (num == searchTarget) {
                    j++;
                }
            }

            if (j > 0) {
                System.out.println(searchTarget + " is in the array" + j);
            } else {
                System.out.println(searchTarget + "not in the array");
            }

            scanner.close();
        }
    }