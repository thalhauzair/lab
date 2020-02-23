package pack6;


import static org.junit.Assert.*;

import org.junit.Test;
public class 
PersonTest {

	@Test
	public void testGetFullName() 
	{
		System.out.println("from TestPerson2");
		Person per = new Person("Robert","King");
		assertEquals("Robert King",per.getFullName());
	}
	@Test (expected=IllegalArgumentException.class)
	public void testNullsInName()
	{
		System.out.println("from TestPerson2 testing exceptions");
		@SuppressWarnings("unused")
		Person per1 = new Person(null,null);
	}

	@Test
	public void testGetFirstName() 
	{
		System.out.println("from TestPerson2");
		Person per = new Person("Robert","King");
		assertEquals("Robert",per.getFirstName());
	}

	@Test
	public void testGetLastName() 
	{
		System.out.println("from TestPerson2");
		Person per = new Person("Robert","King");
		assertEquals("King",per.getLastName());
	}

}
