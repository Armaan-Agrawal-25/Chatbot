import java.util.Scanner;

  /**
   * A simple class to run the Magpie class.
   * @author Laurie White
   * @version April 2012
   */

class Main {
  public static void main(String[] args)
  {
	  //Initializes object
		MagpiePersonal maggie = new MagpiePersonal();
    //Prints out greeting, obtain username, and concatanates username and chatbot name before every statement and response
		System.out.println ("LeBot James: " + maggie.getGreeting());
    Scanner in = new Scanner (System.in);
    String name = in.nextLine();
    System.out.print("LeBot James: Hello " + name + "! Let's talk basketball\n" + name + ": ");
		String statement = in.nextLine();
    //Keeps asking for responses as long as statement does not equal "Bye LeBot James"
		while (!statement.equals("Bye LeBot James"))
		{
			System.out.println (maggie.getResponse(statement, name));
      System.out.print(name + ": ");
			statement = in.nextLine();
		}
    System.out.println("LeBot James: Thanks for chatting about basketball with me!");
	  }
}

