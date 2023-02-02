package trialRun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{
	Person R;
	Person J;
	Person M;
	Person Y;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		R = new Person("Romeo", "Montegeu", 15);
		J = new Person("Juliette", "Capulette", 13);
		M = new Person("Count", "Dukoo", 54);
		Y = new Person("Contess", "Dukoo", 50);
	}

	@Test
	void testToString()
	{	
		assertEquals(R.toString(), "Person: Romeo Montegeu, 15");
//		fail("Not yet implemented");
	}
	
	@Test
	void testNewPerson()
	{
		assertThrows(UnderAgeException.class,
				()->{

					R.makePerson(J);
				});
		
		assertThrows(UnderAgeException.class,
				()->{

					M.makePerson(J);
				});
		
		Person child;
		try
		{
			child = M.makePerson(Y);
			assertEquals(M.getFname(), child.getFname());
			assertEquals(Y.getLname(), child.getLname());
			assertEquals(0, child.getAge());
		} catch (UnderAgeException e)
		{
			e.printStackTrace();
			fail("threw exception");
		}
		
		
		
	}

}
