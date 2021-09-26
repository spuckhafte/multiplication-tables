import java.io.*;
public class Tables {
	public static void main(String[] args) throws IOException {
		try {
			working();
		} catch (Exception e) {
			out("Wrong Input, Try again!\n");
			main(args);
		}
	}
	
	static boolean condition = false;
	static String response = null;
	
	// method for interacting with the user
	public static void working() throws IOException {
		
		if (Tables.condition == false) {
			important();
		}
		
		out("\nDo you want to continue (yes/no):");
		
		try {
			Tables.response = input();
		} catch (Exception e) {
			Tables.condition = true;
			working();
			return;
		}
		
		if (response.equals("yes")) {
			out("");
			Tables.condition = false;
			working();
		}
		else if(response.equals("no")) { 
			out("\nCome again another day!");
			return;
		}
		else {
			out("\nWrong Input, Try Again!");
			Tables.condition = true;
			working();
			return;
		}
	}
	
	// most important method, uses all the methods for fruit-full output
	public static void important() throws IOException {
			out("Which Table: ");
			int table_number = In();
			int i = 1;
			out("\nMultiplication Table of "+Integer.toString(table_number)+":");
			while(i<=10) {
				out(Integer.toString(table_number)+" x "+Integer.toString(i)+" = "+Integer.toString(table_number*i));
				i=i+1;
			}
	}
	
	//useful methods for the program
	public static void out(String text) {
		System.out.println(text);
	}
	
	public static String input() throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		String text = in.readLine();
		return text;
	}
	
	
	public static int In() throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int integer = Integer.parseInt(in.readLine());
		return integer;
	}
}






















