import java.util.Scanner;
public class CommandInterpreter {
public static void run(Agent p){
	Scanner kbd = new Scanner(System.in);
	boolean control = true;
	System.out.println(p.getName()+ " is in "+p.getLocation());
	while(control){
		System.out.println("==>");
		String input = kbd.next();
		if(input.equals("quit")){
			control = false;
		}
		else if(input.equals("go")){
			p.usePortal();
		}
		else if(input.equals("help")){
			System.out.println("This version currently provides the following functions:");
			System.out.println("go");
			System.out.println("look");
			System.out.println("help");
			System.out.println("quit");
			System.out.println("where");
		
		}
		else if(input.equals("where")){
			System.out.println(p.getLocation().toString());
		}
		else if(input.equals("look")){
		
			System.out.println(p.getLocation().toStringLong());
		}
		else{
			System.out.println("Sorry, I don't understand "+ input);
		}
	}
}
}
