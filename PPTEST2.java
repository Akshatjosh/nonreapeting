import java.util.*;

public class PPTEST2 {
    public static int inDex(String s) {
        int[] frequency = new int[26];


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequency[c - 'a']++;
        }


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequency[c - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        System.out.print("The index of non reapeting is "+inDex(str));
    }
}
