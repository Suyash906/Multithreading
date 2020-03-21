class Printer{
	void printDocuments(int numOfCopies, String docName){
		for(int i=1 ; i<=numOfCopies;i++){
			System.out.println(">> Printing "+docName+ " "+i);
		}
	}
}

public class SyncApp1{

	public static void main(String []args){
		System.out.println("===Application Started===");

		// Printing is happening in the main thread
		Printer printer  = new Printer();
		printer.printDocuments(10, "Resume.pdf");

		System.out.println("===Application Finished===");
	}
	
}


/********************

OUTPUT :

===Application Started===
>> Printing Resume.pdf 1
>> Printing Resume.pdf 2
>> Printing Resume.pdf 3
>> Printing Resume.pdf 4
>> Printing Resume.pdf 5
>> Printing Resume.pdf 6
>> Printing Resume.pdf 7
>> Printing Resume.pdf 8
>> Printing Resume.pdf 9
>> Printing Resume.pdf 10
===Application Finished===

********************/