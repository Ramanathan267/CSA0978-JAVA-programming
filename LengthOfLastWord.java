public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Length of the last word: " + lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }
}