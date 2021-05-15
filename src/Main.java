import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        System.out.println(inputString);
        
        int intList = 0;
        boolean errors = false;
        
        char[] charList = inputString.toCharArray();
        for (char c:charList
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
