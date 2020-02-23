package pack6;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonDetailsTest {

	@Test
	public void testGetFirstname() {
		//fail("Not yet implemented");
		PersonDetails p=new PersonDetails("Ram","Chandra","M","9876543210");
		assertEquals("Ram",p.getFirstname());
	}

	@Test
	public void testGetLastname() {
		//fail("Not yet implemented");
		PersonDetails p=new PersonDetails("Ram","Chandra","M","9876543210");
		assertEquals("Chandra",p.getLastname());
	}

	@Test
	public void testGetGender() {
		//fail("Not yet implemented");
		PersonDetails p=new PersonDetails("Ram","Chandra","M","9876543210");
		assertEquals("M",p.getGender());
	}

	@Test
	public void testGetPhone() {
		//fail("Not yet implemented");
		PersonDetails p=new PersonDetails("Ram","Chandra","M","9876543210");
		assertEquals("9876543210",p.getPhone());
	}

	@Test
	public void testDisplay() {
		//fail("Not yet implemented");
		PersonDetails p=new PersonDetails("Ram","Chandra","M","9876543210");
		assertEquals("Ram",p.getFirstname());
		assertEquals("Chandra",p.getLastname());
		assertEquals("M",p.getGender());
		assertEquals("9876543210",p.getPhone());
	}

}
