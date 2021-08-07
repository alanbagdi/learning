package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExWithJava8Lambda {

	public static void main(String args[])
	{
		// TODO Auto-generated method stub
				List<Person> people =Arrays.asList(
						new Person("Ram", "OBagdi", 40),
						new Person("Shyam", "Bagdi", 30),
						new Person("Om","ABagdi",80)
						);
				
				//sort the list based on last name 
				Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
				
				System.out.println("Print all persons : ");
				printAll(people,p -> true);
				System.out.println();
				
				System.out.println("Print all persons fisrt name starting with R");
				printAll(people,p -> p.getFirstName().startsWith("R"));
				
				System.out.println("Print all persons last name starting with B");
				printAll(people, p -> p.getLastName().startsWith("B"));
			}
			
			//print all the elements 
			public static void printAll(List<Person> people, Predicate<Person> condition)
			{
				for(Person p : people)
				{
					if(condition.test(p))
					System.out.println(p);
				}
			}
}
