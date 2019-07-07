import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MinimumCabs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int track=1;
        int n=in.nextInt();
        HashSet<Integer> mm1 = new HashSet<>();
        HashSet<Integer> mm2 = new HashSet<>();
        for(int i=0;i<n;i++){
            int h=in.nextInt();
            int m=in.nextInt();
            int h1=in.nextInt();
            int m2=in.nextInt();
            //System.out.println("j");

                mm1.add(h);
                mm2.add(h1);
                h=0;h1=0;
        }


        System.out.println(n-mm1.size()+n-mm2.size()+1);

    }
}
