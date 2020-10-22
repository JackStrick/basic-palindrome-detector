import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){

        String input = JOptionPane.showInputDialog(null, "Enter Your Palindrome: ");



        boolean test = Palindrome.isPalindrome(input);

        if (test == true){
            JOptionPane.showMessageDialog(null, "The phrase you entered is a palindrome");
        }
        else{
            JOptionPane.showMessageDialog(null, "The phrase you entered is not a palindrome ");
        }


        System.exit(0);
        
    }


}
