//William Bellas
//Software Engineering
//Lab 1 Part 4
package carpetdriver;
import java.util.Scanner;
public class CarpetDriver {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        RoomCarpet theCarpet;
        theCarpet = new RoomCarpet();
        theCarpet.theDimensions = new RoomDimension();
        System.out.println("Enter Height:");
        theCarpet.theDimensions.roomLength=in.nextInt();
        System.out.println("Enter Width:");
        theCarpet.theDimensions.roomWidth=in.nextInt();
        System.out.println("The cost is: "+theCarpet.getCost()+"$");
    }
    
}
