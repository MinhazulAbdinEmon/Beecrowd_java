
import java.util.*;
public class simple_sum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = a + b;
        String formatStr = String.format("SOMA = %s", soma);

        System.out.println(formatStr);
        
        // System.out.print("SOMA = " + SOMA);
    }
} 