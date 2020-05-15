import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        int num = in.nextInt();
        String str = String.valueOf(num);
        if (str.contains("2") || str.contains("3") || str.contains("4") || str.contains("5") || str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9")) {
            System.out.println("Число имеет неверный формат!");
        } else {
            int n = 0;
            for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
                n += (str.charAt(i) - '0') * j;
            }
            System.out.println("Число в десятичном формате: " + n);
        }
    }
}
