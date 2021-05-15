import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        System.out.println(inputString);
        int intList = 0;
        char[] charList = inputString.toCharArray();
        for (char c:charList
             ) {
            intList += Integer.parseInt(Character.toString(c));
        }
        System.out.println(intList);
    }
}
