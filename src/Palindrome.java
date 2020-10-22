public class Palindrome {

    public static boolean isPalindrome(String phrase){

        String backwards = "";
        int length = phrase.length();

        for (int i = length - 1; i >= 0; i--){
            backwards += phrase.charAt(i);
        }


        if(phrase.equalsIgnoreCase(backwards)){
            return true;
        }
        else{
            return false;
        }



    }


}
