import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner (System.in);
        
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        
        System.out.println("X = " + (A + B));
 
    }
 
}