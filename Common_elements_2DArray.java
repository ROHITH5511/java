package Arrays_2D;

import java.util.Arrays;

public class Common_elements_2DArray {

	public static void main(String[] args) {
		
		int [][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] array2 = {{10,1,6},{11,12,9},{13,5,14}};
		System.out.println("Common elements of array1 and array2: ");
		
		for(int i = 0; i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				int element = array1[i][j];
				boolean found = false;
				for(int k = 0; k<array2.length;k++) {
					for(int l = 0; l<array2[i].length;l++) {
						if(element == array2[k][l]) {
							found = true;
							break;
						}
					}
					if(found) {
						break;
					}
				}
				if(found) {
					System.out.println(element+" ");					
				}
			}
		}

	}

}
