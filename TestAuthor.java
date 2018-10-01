public class TestAuthor
{
	public static void main(String[] args)
	{
		Author a1 = new Author("Nobody","nobody@gmail.com",'m');
		System.out.println("NAME: "+a1.getName()+" EMAIL: "+a1.getEmail()+" GENDER: "+a1.getGender());
		a1.setEmail("may@gmail.com");
		System.out.println(a1.toString());
	}
}
class Author
{
	private String name;
	private String email; 
	private char gender;
	Author(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
		public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		return name+" ("+gender+") "+ "at "+email;
	}
}