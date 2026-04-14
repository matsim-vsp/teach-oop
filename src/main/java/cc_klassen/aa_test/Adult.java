package cc_klassen.aa_test;

class Adult extends Person {
	private final String employer;
	public Adult( int yearOfBirth, String employer ){
		super( yearOfBirth );
		this.employer = employer;
	}
	public String getEmployer(){
		return employer;
	}
}
