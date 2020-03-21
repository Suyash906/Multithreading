public class App{
	// main methods reperesents main thread
	public static void main(String []args){
		// whatever we write in here will be executed by main thread here
		// threads always execute the jobs in a sequence
		// Execution Context

		// Job 1
		System.out.println("===Application Started===");

		// Job 2
		for(int doc = 1; doc <=10 ; doc++){
			System.out.println("Printing Document #" + doc);
		}

		// Job 3
		System.out.println("===Application Ends===");
	}
}

/********************

OUTPUT :

===Application Started===
Printing Document #1
Printing Document #2
Printing Document #3
Printing Document #4
Printing Document #5
Printing Document #6
Printing Document #7
Printing Document #8
Printing Document #9
Printing Document #10
===Application Ends===


********************/