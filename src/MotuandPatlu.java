import java.util.Scanner;

public class MotuandPatlu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a[];
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            a=new int[n];
            for(int j=0;j<n;j++)
                a[j]=in.nextInt();
            long sm=0,sp=0;
            int cm=0,cp=0;
            int m=-1,p=n;
            while (m<p-1){
                if(sm<sp*2){
                    cm++;
                    m++;
                    sm+=a[m]; }
                else if(sm>sp*2) {
                    p--;
                    sp+=a[p]; }
                else {
                    m++;
                    cm++;
                    sm+=a[m];
                    p--;
                    sp+=a[p];
                } }
            System.out.println(cm+" "+(n-cm));
            if(cm>(n-cm))
            System.out.println("Motu");
            else if(cm<(n-cm))
                System.out.println("Patlu");
            else
                System.out.println("Tie");
        } }}
