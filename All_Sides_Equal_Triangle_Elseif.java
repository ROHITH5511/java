/*   Write a program to input all sides of a triangle and check whether triangle is valid or not.  */

package Java_basics;
import java.util.Scanner;
public class All_Sides_Equal_Triangle_Elseif {

	public static void main(String[] args) {
		
			Scanner rk = new Scanner (System.in);
			System.out.println("Enter the side A of the triangle :- ");
			System.out.println("Enter the side B of the triangle :- ");
			System.out.println("Enter the side B of the triangle :- ");
			byte side_A = rk.nextByte();
			byte side_B = rk.nextByte();
			byte side_C = rk.nextByte();
			if(side_A == side_B && side_B == side_C) {
				System.out.println(" It is a valid triangle ");
			}
			else if(side_A!=side_B && side_B!=side_C) {
				System.out.println(" it is not a valid triangle ");
			}
			else {
				System.out.println();
			}
			
			rk.close();
			}
		}
