import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String str = in.next();
        int n = 0;
        for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            int sym = str.charAt(i) - '0';
            if (sym > 1 || sym < 0) {
                System.out.println("Число имеет неверный формат!");
                return;
            }
            n += sym * j;
        }
        System.out.println("Число в десятичном формате: " + n);


    }
}
