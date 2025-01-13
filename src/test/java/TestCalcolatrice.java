import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestCalcolatrice {

	@Test
	public void testSomma() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(5,6);
		
		Assert.assertEquals(11,res,0);
	}

	@Test
	public void testSomma2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(2,0);
		
		Assert.assertEquals(2,res,0);
	}
	
	@Test
	public void testSomma3() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(2,-1);
		
		Assert.assertEquals(1,res,0);
	}
	
	@Test
	public void testDifferenza() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.differenza(5,2);
		
		Assert.assertEquals(3,res,0);
	}
	
	@Test
	public void testMoltiplicazione() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.moltiplicazione(5,2);
		
		Assert.assertEquals(10,res,0);
	}
	
	@Test
	public void testDivisione() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.divisione(10,2);
		
		Assert.assertEquals(5,res,0);
	}
	
	@Test
	public void testDivisione2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.divisione(10,0);
		
		Assert.assertEquals(10,res,0);
	}
}
