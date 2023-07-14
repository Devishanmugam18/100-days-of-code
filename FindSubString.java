import java.util.Scanner;

public class FindSubString {
public static void main( String args[ ] ) {
	Scanner scan = new Scanner( System.in );
	System.out.println( "Enter main string");
	String str1 = scan.nextLine();	 	    
	char str1arr[ ] = str1.toCharArray( );
	int len1 = str1arr.length;
	System.out.println( "Enter sub string");
	String str2 = scan.nextLine();	 
	char str2arr[ ] = str2.toCharArray( );
	int len2 = str2arr.length;
	
	int j = 0;
	int count = 0;
	int i = 0;
	while( i < len2 ) {
		while(j < len1) {
			if( str1arr[ j ] != str2arr[ i ] ) {	
				j++;
			}
			else {
				count++;
				j++;
				i++;
		}
			if( count == len2 ) {
				 int start_ind = j - len2;
				 System.out.println( "Sub string found at index pos :" );
					System.out.println( start_ind );
					break;
				}
		}
			break;
		}
	if( count != len2)
	System.out.println( "Sub string not found" );
	System.out.println( -1 );
}
}


	




