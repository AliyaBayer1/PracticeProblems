package Chapter18;

import java.util.Scanner;

public class loginSimulatorBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean loggedIn = false;
		int log = 0;
		String username, password;
		Scanner scan = new Scanner( System.in );
		while (log == 0) 
		{
		    System.out.print("Username: ");
		    username = scan.next();
		    System.out.print("Password: ");
		    password = scan.next();
		    
		    if(username.equals("joy") && password.equals("sun"))
		    {
		    	System.out.print("You have logged on with priority 4");
		    	log += 1;
		    }
		    	else if (username.equals("gates") && password.equals("monopoly")) 
		    	{
		    		System.out.print("You have logged on with priority 1");
		    		log += 1;
		    	}
		    	else if (username.equals("jobs") && password.equals("appls"))
		    	{
		    		System.out.print("You have logged on with priority 3");
		    		log += 1;
		    	}
		    	else if (username.equals("root") && password.equals("secret"))
		    	{
		    		System.out.print("You have logged on with priority 5");
		    		log += 1;
		    	}
		    	else if (username.equals("quit") && password.equals("exit"))
		    	{
		    		System.out.print("System shutting down.\r\nBye.");
		    		log += 1;
		    	} else {
		    		System.out.print("Login Failed\n");
		    	}

		}
	}
}