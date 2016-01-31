package movies;

public class Person {

	public enum Gender{
		MALE,FEMALE
	}
	
	private String firstName;
	private String lastName;
	private Gender gender;
	private boolean hasOscar;
	private boolean hasGoldenGlobe;	
	
	public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hasOscar = hasOscar;
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public boolean isHasOscar() {
		return hasOscar;
	}
	
	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}
	
	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
	}
	
	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
	}
	
	public String toXMLString(){
		StringBuffer XMLString = new StringBuffer();
		XMLString.append(Tools.toXMLTag("firstName",this.firstName));
		XMLString.append(Tools.toXMLTag("lastName",this.lastName));
		XMLString.append(Tools.toXMLTag("gender",this.gender.toString()));
		XMLString.append(Tools.toXMLTag("hasOscar",Boolean.toString(this.hasOscar)));
		XMLString.append(Tools.toXMLTag("hasGoldenGlobe",Boolean.toString(this.hasGoldenGlobe)));

		return XMLString.toString();
	}
	
}
