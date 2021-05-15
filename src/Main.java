import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        System.out.println(inputString);
        
        int intList = 0;
        boolean errors = false;
        int newint = 123;

        char[] charList = inputString.toCharArray();
        char[] charList2 = Integer.toString(newint).toCharArray();

        System.out.println(charList2);

        for (char c:charList2
             ) {
            try {
                intList += Integer.parseInt(Character.toString(c));
            } catch (Exception e) {
                errors = true;
            }
        }
        if (errors) {
            System.out.println("Введенные не цифры исключены из суммирования");
        }
        System.out.println(intList);
    }
}
