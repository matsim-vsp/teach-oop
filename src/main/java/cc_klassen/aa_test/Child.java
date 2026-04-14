package cc_klassen.aa_test;

class Child extends Person {
	private final String school;
	public Child( int yearOfBirth, String school ){
		super( yearOfBirth );
		this.school = school;
	}
	public String getSchool(){
		return this.school;
	}
}
