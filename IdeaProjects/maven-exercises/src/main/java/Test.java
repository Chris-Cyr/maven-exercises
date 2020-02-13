import org.apache.commons.lang3.StringUtils;

import java.lang.Object;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String userInput = scan.nextLine();
        if (StringUtils.isNumeric(userInput)){
            System.out.println("Whoops, you entered a number");
        }else {
            StringUtils.swapCase(userInput);
            StringUtils.reverse(userInput);
            System.out.println(userInput);
        }
    }
}
