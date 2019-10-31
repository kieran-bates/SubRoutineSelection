/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subroutineselection;
import java.util.Scanner;
/**
 *
 * @author kibat6204
 */
public class SubroutineSelection {

    /**
     * @param args the command line arguments
     */
    
    public static int areaAndOut(int l, int w, int h)
        {
            int answer = l*w*h;
            return answer;
        }
    
    public static void averageAndOut(int one, int two, int three, int four)
    {
        System.out.println((one + two + three + four)/4);
    }
    
    public static void circumferanceAndOut(int one)
    {
        System.out.println(2*(Math.PI)*one);
    }
            
    public static void main(String[] args) {
        
        boolean exit = false;
        
        Scanner input = new Scanner(System.in);
        
        while(exit == false)
        {
            System.out.println("***CALCULATOR***");
            System.out.println("1...Rectancular Prism Volume Calculator");
            System.out.println("2...Average Calculator");
            System.out.println("3...Circumferance Calculator");
            System.out.println("\nPlease select the program number you wish to run -->");
            
            if(input.nextInt() == 1)
            {
                System.out.println("\nEnter the length -->");
                int l = input.nextInt();
                System.out.println("Enter the width -->");
                int w = input.nextInt();
                System.out.println("Enter the height -->");
                int h = input.nextInt();
                
                System.out.println("\nThe volume is "+areaAndOut(l, w, h));
            }
        }
    }
    
}
