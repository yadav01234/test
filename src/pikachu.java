  import java.util.Scanner;

public class pikachu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =0;
        int n = in.nextInt();
        String s1 = in.next();
        String s2= in.next();
        for(int i=0;i<s1.length();i++){
           count+= find(s1.charAt(i),s2.charAt(i));
            //System.out.println(find(s1.charAt(i),s2.charAt(i)));
        }
        System.out.println("count"+count);
        System.out.println('Z'-'G'+"hkj");


    }
     public static int find(char a, char b){
        int l=0,c=0,s=0;
        boolean v=false,n=false;
        if(a>b){

             s=Math.abs(a-'Z')
                    +Math.abs(b-'A')+1;
           // System.out.println("S is "+s);

        }
        else {

            s=Math.abs(b-'Z')+Math.abs(a-'A')+1;
            //System.out.println("S is "+s);
        }

         l = Math.abs((b) - (a));
         System.out.println("l is "+l);
         System.out.println("S is "+s);
        /* if(s>13){
             s = s-13;
             if(s<l){
                 l=s;
                 c=c+2;
             }}
             else if(s<l &&l<13){
                 l=s;

         }
*/
        if(s>13){
            s-=13;
           // c=c+2;
            n=true;
        }
        else if(l>13){
            l=l-13;
           // c=c+2;
            v=true;
        }
        if(s<l){
            l=s;
            if(n)
                c++;
        }

        else if (v)
            c++;
         System.out.println(l);
         System.out.println("co"+c);
        while (l!=0) {

            //if (l >= 13) {
              //  c += 1;
              //  l -= 13;
            l -= 1;
            c += 1;
        }




         System.out.println("c is "+c);
        return c;
     }
}
