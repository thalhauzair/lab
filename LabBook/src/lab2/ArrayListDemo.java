package lab2;
import java.util.*;
public class ArrayListDemo {
public static  void main(String[] args){
/*	ArrayList<Integer> list = new ArrayList<>();
	list.add(10);
	list.remove(0);
	list.add(5);
	list.add(1);
	list.add(2);
	list.add(15);
	list.remove(1);
	list.add(2, 20);
	//System.out.println(list);
	Iterator<Integer> it = list.iterator();
	while(it.hasNext())
	{
		Integer i = it.next();
		list.add(25);
		System.out.println(i);
	}
	List<PersonDetails> p = new ArrayList<PersonDetails>();
	PersonDetails p1 = new PersonDetails("john");
	p.add(p1);
	p.add(new PersonDetails("mike"));
	p.add(new PersonDetails("ravi"));
	p.add(new PersonDetails("rahul "));
	p.add(new PersonDetails("suresh"));
	p.remove(1);
	p.add(1, new PersonDetails());
	if(p.contains(p1)) {
		System.out.println("contains");
	}
	else
	{
		System.out.println("Not contains");
	}
	
	Iterator<PersonDetails> i = p.iterator();
	while(i.hasNext())
	{
		PersonDetails pd = i.next();
	    System.out.println(pd);
	}

Set<String> country  = new TreeSet<>();
country.add("India");
country.add("US");
country.add("Canada");
country.add("Australia");
country.add("China");
country.add("Japan");
country.add("Russia");
System.out.println(country.size());
System.out.println(country);
*/
TreeMap<String,Integer> hmap =  new TreeMap<String,Integer>();
hmap.put("ONE",1);
hmap.put("TWO",2);
hmap.put("THREE", 3);
Set<String> s = hmap.keySet();
for(String i: s) {
	System.out.println("key "+i + " value "+ hmap.get(i));
}
Set<Map.Entry<String,Integer>> s1 = hmap.entrySet();
for(Map.Entry<String,Integer> i :s1)
{
	System.out.println(i.getKey() +" "+ i.getValue());
}


}
}

