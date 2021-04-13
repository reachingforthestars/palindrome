class PalindromeChecker {

    public static void main(String[] args) {

        if(args.length != 1) {
            System.out.println("Not valid input");
            return;
        }

        System.out.println(isPalindrome(args[0]));

    }

    private static boolean isPalindrome(String phrase) {

        for(int i = 0; i < phrase.length()/2; i++) {

            char left = phrase.charAt(i);
            char right = phrase.charAt((phrase.length()-1)-i);

            if(left != right) {
                return false;
            }

        }

        return true;

    }

}