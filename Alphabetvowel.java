import java.util.*;
class Alphabetvowel{
    public static void main (String[]args){
        Scanner s=new Scanner(System.in);
        String Ch=s.next();

        for (char c : Ch.toCharArray()){
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){

            System.out.print("the alphabet is vowel");
        }else{
            System.out.print("consonant");
        }
    }
}}