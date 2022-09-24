package geeksForGeeks.strings;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        String reverse = reverseWords(S);
        System.out.println(reverse);
    }

    private static String reverseWords(String S) {
        String ns = S.replace("." , " ");
        String[] str = ns.split(" ");
        String rev = "";
        for(int i=str.length-1; i>=0; i--){
            if(i>0) rev = rev + str[i] + ".";
            else rev = rev + str[i];
        }
        return rev;
    }
}
