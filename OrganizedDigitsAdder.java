import java.util.Arrays;
import java.util.Scanner;
public class OrganizedDigitsAdder {
    public static void main(String[] args) {
        String m; 
        Scanner s = new Scanner(System.in);
        m= s.next();
        char [] c = new char[m.length()];
         for(int i=0;i<m.length();i++){
             if(Character.isDigit(m.charAt(i))){
             c[i]= m.charAt(i);
             }
        }
        Arrays.sort(c);
        for(int i=0;i<c.length-1;i++){
             if(Character.isDigit(c[i])){
                System.out.print(c[i]+"+");
             }
             }
       System.out.print(c[c.length-1]);
         System.out.println(" = "+sum(c));
    }
    public static int sum(char[] a){
        int b = 0, i;
         for( i=0;i<a.length;i++){
             if(Character.isDigit(a[i])){
               b+=Character.getNumericValue(a[i]);
             }
         }
        return b;
    }
}
