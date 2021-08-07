package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExUsingJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people =Arrays.asList(
				new Person("Ram", "OBagdi", 40),
				new Person("Shyam", "Bagdi", 30),
				new Person("Om","ABagdi",80)
				);
		
		//sort the list based on last name 
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		System.out.println("Print all persons : ");
		printAll(people,new Condition() {
			@Override
			public boolean check(Person p) {
				return true;	
			}
		});
		System.out.println();
		
		System.out.println("Print all persons fisrt name starting with R");
		printAll(people, new Condition() {
			@Override
			public boolean check(Person p) {
				return p.getFirstName().startsWith("R");	
			}
		});
		
		System.out.println("Print all persons last name starting with B");
		printAll(people, new Condition() {
			@Override
			public boolean check(Person p) {
				return p.getLastName().startsWith("B");	
			}
		});
	}
	
	//print all the elements 
	public static void printAll(List<Person> people, Condition condition)
	{
		for(Person p : people)
		{
			if(condition.check(p))
			System.out.println(p);
		}
	}
	
	
	
}
interface Condition {
	boolean check(Person p);
}
