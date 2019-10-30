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
    public static void areaAndOut(int l, int w, int h)
        {
        
            System.out.println(l*w*h);
        }
    
    public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            
            int l = input.nextInt();
            int w = input.nextInt();
            int h = input.nextInt(); 
        
            areaAndOut(l, w, h);
        
    }
    
}
