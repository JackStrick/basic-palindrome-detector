import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){

        String continueTrying;

        do{
            String input = JOptionPane.showInputDialog(null, "Enter Your Palindrome: ");

            boolean test = Palindrome.isPalindrome(input);

            if (test){
                JOptionPane.showMessageDialog(null, "The phrase you entered is a palindrome");
            }
            else{
                JOptionPane.showMessageDialog(null, "The phrase you entered is not a palindrome ");
            }

            continueTrying = JOptionPane.showInputDialog(null, "Would you like to continue? ");

        }while(continueTrying.charAt(0) == 'Y' || continueTrying.charAt(0) == 'y');



        System.exit(0);

    }


}
