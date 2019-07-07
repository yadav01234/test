import java.util.Scanner;

public class Coprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l=0;
        int n=in.nextInt();
        for(int i=1;i<n-1;i++){//System.out.println("j");
            if(gcd(i,n)==1)
            { if(l<i)
                    l=i; } }
        System.out.println(l); }
    public static int gcd(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;
        if (a > b) return gcd(a-b, b);
        return gcd(a, b-a); }}
