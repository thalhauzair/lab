package pack6;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void testSetDay() {
		//fail("Not yet implemented");
		Date d=new Date(10,1,1999);
	    int day=15;
	    d.setDay(day);
	    assertEquals(d.getDay(),day);
	}

	@Test
	public void testGetDay() {
		//fail("Not yet implemented");
		Date d=new Date(10,1,1999);
		assertEquals(d.getDay(),10);
	}

	@Test
	public void testSetMonth() {
		//fail("Not yet implemented");
		Date d=new Date(10,1,1999);
	    int month=2;
	    d.setDay(month);
	    assertEquals(d.getDay(),month);
	}

	@Test
	public void testGetMonth() {
		//fail("Not yet implemented");
		Date d=new Date(10,1,1999);
		assertEquals(d.getMonth(),1);
	}

	@Test
	public void testSetYear() {
		//fail("Not yet implemented");
		Date d=new Date(10,1,1999);
	    int year=2001;
	    d.setDay(year);
	    assertEquals(d.getDay(),year);
	}

	@Test
	public void testGetYear() {
		//fail("Not yet implemented");
		Date d=new Date(10,1,1999);
		assertEquals(d.getYear(),1999);
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
		Date d=new Date(10,1,1999);
		assertEquals(d.toString(),"10/1/1999");
	}

}
