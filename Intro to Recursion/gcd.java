import java.util.Scanner;
/**
 * Write a description of class gcd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gcd
{
    public static void main(String[] args)
 {
    
  int a, b;
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter two integers: ");
  a = scan.nextInt();
  b = scan.nextInt();
  System.out.println("GCD of two no.: " + gcd(a,b));
 }
}

