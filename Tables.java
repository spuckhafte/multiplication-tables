import java.io.*;
import java.lang.Thread;
public class Tables {
	public static void main(String[] args) throws IOException, InterruptedException {
		try {
			working();
		} catch (Exception e) {
			out("Wrong Input, Try again!\n");
			Thread.sleep(100);
			main(args);
		}
	}
	
	static boolean condition = false;
	static String response = null;
	
	// method for interacting with the user
	public static void working() throws IOException, InterruptedException {
		
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
		
		switch(response) {
		case "yes":
			out("");
			Tables.condition = false;
			working();
		case "no":
			out("\nCome again another day!");
			break;
		default:
			out("\nWrong Input, Try Again!");
			Thread.sleep(100);
			Tables.condition = true;
			working();
		}
	}
	
	// most important method, uses all the methods for fruit-full output
	public static void important() throws IOException, InterruptedException {
			out("Which Table: ");
			int table_number = In();
			int i = 1;
			out("\nMultiplication Table of "+Integer.toString(table_number)+":");
			while(i<=10) {
				out(Integer.toString(table_number)+" x "+Integer.toString(i)+" = "+Integer.toString(table_number*i));
				Thread.sleep(200);
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
