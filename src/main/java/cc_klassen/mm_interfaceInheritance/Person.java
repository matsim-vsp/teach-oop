package cc_klassen.mm_interfaceInheritance;

class Person implements Agent, CanSpeak{
	private int id;
	@Override
	public int getId(){
		return this.id;
	}
	@Override
	public void move(){
		System.out.println(  "calling Adult move method" );
	}

	// additional, non-certified functionality
	@Override public void speak() {
		System.out.println(  "calling Adult speak method" );
	}
}
