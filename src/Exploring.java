import java.util.Scanner;

public class Exploring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            int p = i-1;
            int n =i+1;
            if(str.length>1) {
                if (i == 0 && str[i] == '?' ) {
                    if (str[n] == 'a')
                        str[i] = 'b';
                    else
                        str[i] = 'a';
                } else if (i == str.length - 1 && str[i] == '?' ) {
                    if (str[p] == 'a')
                        str[i] = 'b';
                    else
                        str[i] = 'a';
                } else if (str[i] == '?' ) {
                    if (str[p] == 'a' || str[n] == 'a')
                        str[i] = 'b';
                    else
                        str[i] = 'a';
                }
            }
            else if(str[i]=='?')
                str[i]='a';
        }

        String ns = new String(str);
        System.out.println(ns);
    }
}
