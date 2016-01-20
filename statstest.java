  package ca.blakey.monte_carlo.model;  
	  
	import static org.junit.Assert.*;  
	/** 
	* <h1 Statics test></h1> 
	* The statics class runs a test to see if the statics are evaluated correctly. 
	* A set of numbers is given and the variance, mean, max value, variance  and minimum value will be determined by methods in the class. 
	* the assert equals will check if the values are correct. 
	* 
	* @author  Zacchaeus Leung 
	* @version 1.0 
	* @since   2014-12-5  
	*/  
	   
	  
	import org.junit.Test;  
	  
	public class StatisticsTest {  
	  
	    @Test  
	    public void test() {  
	// enter a bunch of statics
	        Statistics statistics = new Statistics();  
	        statistics.run(1.0);  
	        statistics.run(1.0); 
	// check if the statics evaluate correctly 
	        assertEquals(2.0, statistics.getTotalPower0(), 0.0);  
	        assertEquals(2.0, statistics.getTotalPower1(), 0.0);  
	        assertEquals(2.0, statistics.getTotalPower2(), 0.0);  
	        assertEquals(0.0, statistics.getStandardDev(), 0.0);  
	        assertEquals(0.0, statistics.getVariance(), 0.0);  
	        assertEquals(1.0, statistics.getMean(), 0.0);  
	        assertEquals(1.0, statistics.getMaxValue(), 0.0);  
	        assertEquals(1.0,statistics.getMinValue(), 0.0);  
	    }  
	  
	    @Test  
	    public void differentInputtest() {  
	        Statistics statistics = new Statistics();  
	        statistics.run(2.0);  
	        statistics.run(1.0);  
	        assertEquals(2.0, statistics.getTotalPower0(), 0.0);  
	        assertEquals(3.0, statistics.getTotalPower1(), 0.0);  
	        assertEquals(5.0, statistics.getTotalPower2(), 0.0);  
	        assertEquals(0.5, statistics.getStandardDev(), 0.0);  
	        assertEquals(0.25, statistics.getVariance(), 0.0);  
	        assertEquals(1.5, statistics.getMean(), 0.0);  
	        assertEquals(2.0, statistics.getMaxValue(), 0.0);  
	        assertEquals(1.0,statistics.getMinValue(), 0.0);  
	    }  
	    @Test  
	    public void anotherdifferentInputtest() {  
	        Statistics statistics = new Statistics();  
	        statistics.run(3.0);  
	        statistics.run(2.0);  
	      
	        assertEquals(2.0, statistics.getTotalPower0(), 0.0);  
	        assertEquals(5.0, statistics.getTotalPower1(), 0.0);  
	        assertEquals(13.0, statistics.getTotalPower2(), 0.0);  
	        assertEquals(0.5, statistics.getStandardDev(), 0.0);  
	        assertEquals(0.25, statistics.getVariance(), 0.0);  
	        assertEquals(2.5, statistics.getMean(), 0.0);  
	        assertEquals(3.0, statistics.getMaxValue(), 0.0);  
	          
	        assertEquals(2.0,statistics.getMinValue(), 0.0);  
	    }     
	    @Test  
	    public void ThreeinputInputtest() {  
	        Statistics statistics = new Statistics();  
	        statistics.run(3.0);  
	        statistics.run(2.0);  
	        statistics.run(4.0);  
	      
	        assertEquals(3.0, statistics.getTotalPower0(), 0.0);  
	        assertEquals(9.0, statistics.getTotalPower1(), 0.0);  
	        assertEquals(29.0, statistics.getTotalPower2(), 0.0);  
	        //assertEquals(0.7, statistics.getStandardDev(), 0.0);  
	        assertEquals(0.0, statistics.getVariance(), 0.0);  
	        assertEquals(3.0, statistics.getMean(), 0.0);  
	        assertEquals(4.0, statistics.getMaxValue(), 0.0);  
	        assertEquals(2.0,statistics.getMinValue(), 0.0);  
	    }  
