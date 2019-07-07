import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PikTestClass {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        char[] s=br.readLine().toCharArray();
        char[] t=br.readLine().toCharArray();
        int d=0,is,it;
        for(int i=0;i<N;i++)
        {
            is=s[i];
            it=t[i];
            System.out.println("a:"+is);
            System.out.println("b:"+it);
            if(is==it)
                continue;
            if(it<is)
            {
                it+=(26-is)+is;
            }

            if(it-is>=13)
            {
                is+=13;
                d++;
            }
            it-=is;

            d+=it;
            System.out.println(d);
        }
        System.out.println(d);
    }

}
