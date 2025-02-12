package reveresd;

public class Reversed_String {
	


	public static void main(String[] armaan) {
		
		 
		String name = "1 2 3 4 5 6 7 8 9 0";
		String rvName = "";
		System.out.println("Orginal string:" + name);
		
		for(int i = 0; i<name.length();  i++) {
			rvName = name.charAt(i) + rvName;
			
		}
		
		System.out.println("Reveresed string :" + rvName);
		
		
	}
	
	

}
