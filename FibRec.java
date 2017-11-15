/*
 * Task: Output number from fibonacci sequence on 
 * user's given index, using tail recursion.
 */
import java.util.Scanner;
public class FibRec
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number.");
        int n = input.nextInt();
        int f = fibAlt(n);
        System.out.println("Answer " + f);
    }
    
    public static int fibAlt(int n)
    {
        if(n == 1 || n == 2)
            return 1;
        return fibAlt(n-1)+fibAlt(n-2);
    }
}
