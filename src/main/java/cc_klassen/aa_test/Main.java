package cc_klassen.aa_test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main( String[] args ) {

		List<Person> persons = new ArrayList<>();
		
		//

		Person person = new Person( 2024-33);
		persons.add( person );

		System.out.println("person.toString=" + person.toString() );

		System.exit(-1);

		System.out.println( "age=" + person.getAge());

		//

		Child child = new Child( 2015, "Kreuzgasse");

		persons.add( child );

		System.out.println("age=" + child.getAge() + "; school=" + child.getSchool() );

		//

		Adult adult = new Adult( 2000, "Siemens");

		persons.add( adult );

		System.out.println( "age=" + adult.getAge() + "; employer=" + adult.getEmployer() );
		
		//

		for( Person person1 : persons ){
			person1.print();
		}
		
	}
}
