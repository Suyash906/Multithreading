class Printer{
	void printDocuments(int numOfCopies, String docName){
		for(int i=1 ; i<=numOfCopies;i++){
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


public class SyncApp2{

	public static void main(String []args){
		System.out.println("===Application Started===");

		
		Printer printer  = new Printer();
		
		// a separate thread has been created to print documents
		SuyashThread suyash = new SuyashThread(printer);
		suyash.start();

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

********************/