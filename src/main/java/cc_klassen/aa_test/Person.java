package cc_klassen.aa_test;

class Person{

	private int yearOfBirth ;

	Person( int yearOfBirth ) {
		this.yearOfBirth = yearOfBirth;
	}

	int getAge() {
		return 2024 - yearOfBirth;
	}

	void print() {
		System.out.println( "calling the PERSON print method");
	}


}
