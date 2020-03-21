class Printer{
	synchronized void printDocuments(int numOfCopies, String docName){
		for(int i=1 ; i<=numOfCopies;i++){
			try{
				Thread.sleep(500);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(">> Printing "+docName+ " "+i);
		}
	}
}

class SuyashThread extends Thread{

	Printer pRef;

	public SuyashThread(Printer p){
		pRef = p;
	}

	public void run(){
		pRef.printDocuments(10, "SuyashResume.pdf");
	}
}

class SamThread extends Thread{

	Printer pRef;

	public SamThread(Printer p){
		pRef = p;
	}

	public void run(){
		pRef.printDocuments(10, "SamResume.pdf");
	}
}

public class SyncApp5{

	public static void main(String []args){
		System.out.println("===Application Started===");

		// there is only one printer object
		Printer printer  = new Printer();
		

		// Multiple threads working on the same printer object
		// If multiple threads are going to work on the same printer object, we must synchronize them
		SuyashThread suyash = new SuyashThread(printer);
		SamThread sam = new SamThread(printer);

		suyash.start();
		sam.start();

		System.out.println("===Application Finished===");
	}
	
}


/********************

OUTPUT :


===Application Started===
===Application Finished===
>> Printing SuyashResume.pdf 1
>> Printing SuyashResume.pdf 2
>> Printing SuyashResume.pdf 3
>> Printing SuyashResume.pdf 4
>> Printing SuyashResume.pdf 5
>> Printing SuyashResume.pdf 6
>> Printing SuyashResume.pdf 7
>> Printing SuyashResume.pdf 8
>> Printing SuyashResume.pdf 9
>> Printing SuyashResume.pdf 10
>> Printing SamResume.pdf 1
>> Printing SamResume.pdf 2
>> Printing SamResume.pdf 3
>> Printing SamResume.pdf 4
>> Printing SamResume.pdf 5
>> Printing SamResume.pdf 6
>> Printing SamResume.pdf 7
>> Printing SamResume.pdf 8
>> Printing SamResume.pdf 9
>> Printing SamResume.pdf 10


********************/