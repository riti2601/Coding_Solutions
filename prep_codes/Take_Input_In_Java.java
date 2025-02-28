import java.util.*;
import java.io.*;

public class Main {
    
    public static void inputWithSize(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array (size given): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void inputAsString(Scanner sc) {
        sc.nextLine();  
        String line = sc.nextLine();
        String[] tokens = line.split("\\s+");

        List<Integer> arr = new ArrayList<>();
        for (String token : tokens) {
            try {
                arr.add(Integer.parseInt(token));
            } catch (NumberFormatException e) {
                // Ignore non-numeric values
            }
        }

        System.out.print("Array (from string using split()): ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void inputWithoutSize(Scanner sc) {
        List<Integer> arr = new ArrayList<>();
        while (sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }

        System.out.print("Array (size unknown): ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void mostUsedInputFormat(Scanner sc) {
        String line = sc.nextLine();
        List<Integer> arr = new ArrayList<>();
        StringBuilder numStr = new StringBuilder();

        for (char ch : line.toCharArray()) {
            if (Character.isDigit(ch)) {
                numStr.append(ch);
            } else if (numStr.length() > 0) {
                arr.add(Integer.parseInt(numStr.toString()));
                numStr.setLength(0);
            }
        }

        if (numStr.length() > 0) {
            arr.add(Integer.parseInt(numStr.toString()));
        }

        System.out.print("Array (extracted numbers): ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size and then numbers:");
        inputWithSize(sc);

        System.out.println("Enter numbers in a single line:");
        inputAsString(sc);

        System.out.println("Enter numbers (end with EOF or invalid input):");
        inputWithoutSize(sc);

        System.out.println("Enter a string containing digits and characters:");
        mostUsedInputFormat(sc);

        sc.close();
    }
}
