package org.stringprogram;
import java.util.Arrays;

public class StringSpaceFill {
	//public final int i;
	/*
	 * public static void main(String[] args) { String st="hello java independent";
	 * 
	 * st=st.replaceAll("\\s", "-");
	 * 
	 * System.out.println(st);
	 * 
	 * }
	 */

public static void main(String args[] ) throws Exception {
    int array[]={10,20,30,40};
    int size=array.length;
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    int result=array[size-4];
    System.out.println(result);
    
    

}
}