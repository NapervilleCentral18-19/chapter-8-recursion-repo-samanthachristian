import java.util.Scanner;
/**
 * Write a description of class getRich here.
 *
 * @author (Samantha Christian)
 * @version (a version number or a date)
 */
public class getRich
{
   
 public static int collect(int monataryGoal)
    {
        
        if (monataryGoal >= 1000)
        return 1;
    
        else
        return (monataryGoal + collect(monataryGoal));
        
    }

  public static void main(String[] args)
 {
  int num;
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter num (1000, 100, 10): ");
  num = scan.nextInt();
  int result = collect(num);
  System.out.println(result);
}
}
