class CA {

}


// class Mytask extends CA, Thread{ -> Error | Multiple inheritance is not allowed in Java
class Mytask extends CA implements Runnable{
	public void run(){
		for(int doc = 1; doc <=10 ; doc++){
			System.out.println("@@ Printing Document - Printer 2  #" + doc);
		}
	}
}

public class App4{
	// main methods reperesents main thread
	public static void main(String []args){
		// whatever we write in here will be executed by main thread here
		// threads always execute the jobs in a sequence
		// Execution Context

		// Job 1
		System.out.println("===Application Started===");

		// Job 2

		Runnable r = new Mytask();
		Thread t = new Thread(r);
		t.start();

		// Job 3
		for(int doc = 1; doc <=10 ; doc++){
			System.out.println("^^ Printing Document - Printer 1  #"  + doc);
		}

		// Job 3
		System.out.println("===Application Ends===");
	}
}

/********************

OUTPUT :



===Application Started===
^^ Printing Document - Printer 1  #1
^^ Printing Document - Printer 1  #2
^^ Printing Document - Printer 1  #3
@@ Printing Document - Printer 2  #1
^^ Printing Document - Printer 1  #4
@@ Printing Document - Printer 2  #2
^^ Printing Document - Printer 1  #5
@@ Printing Document - Printer 2  #3
@@ Printing Document - Printer 2  #4
^^ Printing Document - Printer 1  #6
@@ Printing Document - Printer 2  #5
^^ Printing Document - Printer 1  #7
@@ Printing Document - Printer 2  #6
^^ Printing Document - Printer 1  #8
@@ Printing Document - Printer 2  #7
@@ Printing Document - Printer 2  #8
^^ Printing Document - Printer 1  #9
@@ Printing Document - Printer 2  #9
^^ Printing Document - Printer 1  #10
===Application Ends===
@@ Printing Document - Printer 2  #10

********************/