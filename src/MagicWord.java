
import java.util.Scanner;

public class MagicWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String nor = in.next();

            char[] arr = nor.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(Character.isDigit(arr[i])){
                    char g=(char)(65+Character.getNumericValue(arr[i]));
                    System.out.println(g);
                    if(g=='J'||g=='H')
                        arr[i]='C';

                    else
                        arr[i]=g;
                   // System.out.println(65+Character.getNumericValue(arr[i]));
                }
                arr[i] = (char) (isPrime(arr[i])); }
            String result = new String(arr);
            System.out.println(result); } }
    public static int isPrime(char a){
        int asc = a;
        int bsc = a;
        int p=0;

        boolean isp=false;
        boolean bsp = true;
        boolean s =true;
        while (isp!=true) {

            for(int j=2;j<bsc;j++){
                int atemp = bsc%j;

                if(atemp==0){
                    s=false;
                    break; } }
            for (int i = 2; i < asc; i++) {
                int temp = asc%i;
                if(temp==0){
                    bsp=false;
                    break; } }
                    if(s){

                        isp=true;
                      //  p=bsc;
                        }
                        else if(bsp){
                        //System.out.println(asc);
                            if( asc>122){
                               isp=false;
                            }

                            else{
                                isp=true;
                               // p=asc;
                            }

                        }
            if(!bsp){
                asc++;
                bsp=true;
            }if(!s){
                bsc--;
                s=true;

            }
        }
        if(asc>122){
            return bsc;
        }

        else {
            int l = asc - (int) a;
            //System.out.println(l);
            int f = (int) a - bsc;
            //System.out.println(f);
            if (l < f)
                return asc;
            else
                return bsc;
        }
    }
}
