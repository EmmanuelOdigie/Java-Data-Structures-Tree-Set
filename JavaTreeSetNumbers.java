package JavaTreeSet; // project created through eclipse
import java.util.TreeSet;// imported TreeSet class

public class JavaTreeSetNumbers { // created public class 'JavaTreeSetNumbers'

	public static void main(String[] args) {// reads,runs & executes code
	
	// created an object of the imported TreeSet class set as an Integer - TreeSet<Integer>
	// object created - myNumbers
	TreeSet<Integer> myNumbers = new TreeSet<Integer>();
	
// object 'myNumbers' calls onto the '.add' function to add numbers into the object 
	myNumbers.add(24);
	myNumbers.add(10);
	myNumbers.add(14);
	myNumbers.add(2);
	myNumbers.add(9);
	myNumbers.add(6281275);
	myNumbers.add(2476287);
	
// Display Text
	System.out.println("Numbers in order using the imported 'TreeSet' class");

// for loop made to create integer variable 'theNumbers' which takes in the numbers in the numbers
// from myNumbers object
	for(int theNumbers:myNumbers) {
		System.out.println(theNumbers); // display values in variable 'theNumbers'
	}

	}

}

// Result:
//Numbers in order using the imported 'TreeSet' class
//2
//9
//10
//14
//24
//2476287
//6281275

