import java.util.*;
class UniqueChar {
    
	public static void main(String args[]) {
		
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        HashSet<Character> unique = new HashSet<>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(unique.contains(ch) == true) {
                //this character has already occured
                unique.remove(ch);
            } else {
                unique.add(ch);
            }
        }

        if(unique.size() == 0) {
            System.out.println("There are no unique characters");
        }

        for(Character ch : unique) {
            System.out.print(ch + "  ");
        }

    }
}
