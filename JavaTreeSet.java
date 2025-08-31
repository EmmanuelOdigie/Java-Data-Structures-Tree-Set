package JavaTreeSet; // project made in eclipse
import java.util.TreeSet; // imported class 'TreeSet'

public class JavaTreeSet {// public class JavaTreeSet made

	public static void main(String[] args) {// read, runs & executes code
		
	// created an object of the imported class 'TreeSet' named 'myNames' 
	// the class was set up to take 'String' values - TreeSet<String>
	// it can also take others like int - TreeSet<Integer>
		TreeSet<String> myNames = new TreeSet<String>();
	
	// object made is used to call onto the '.add' function to add names in the object
		myNames.add("Melanie");
		myNames.add("Stephanie");
		myNames.add("Chloe");
		myNames.add("Tatiana");
		myNames.add("Sydnee");
		myNames.add("Bethany");
		myNames.add("Tatiana");
	
	// Display text
		System.out.println("Names in order:");
	
	//for loop is used to set up String variable 'list', that takes information from the object 'myNames' 
		for(String list : myNames) {
			System.out.println(list); // Display names that are now put in String variable list
		}
	}

}

// Result:
//Names in order:
//Bethany
//Chloe
//Melanie
//Stephanie
//Sydnee
//Tatiana