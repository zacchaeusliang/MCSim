package ca.blakey.monte_carlo.model;




public class Buffon extends Measure {
/** 
	* <h1 buffons beedle simulation</h1> 
	* 
	* this is the buffon needle simulation which calculates pi .
        this lays a bunch of needles with the length one  (normalizes them if needed) and will check if they are before 0 and 1 
          if the 2 needles co ordinates round it will be a cross. The value of pi is calculated with trials*2/crosses

	* @author  Zacchaeus Leung 
	* @version 1.0 
	* @since   2014-12-5  
	* @param array of 4 doubles
	*/
       //
	@Override
	double Call(double[] input) {
		double x1 = input [0];
		double x2 = input [1];
		double y1 = input [2];
		double y2 = input [3];
		double dist;
		if ((Math.sqrt(x2*x2 + y2*y2) > 1) && !(x2==0 && y2==0)){
			 /*double x2temp=x2;
			 double y2temp=y2;
			 x2=x2-y2temp;
			 y2=y2-x2temp;*/
			 // scale the xy
			 x2 =Math.sqrt(1-x2*x2);
			 y2= Math.sqrt(1-y2*y2);
			 
		}// normalize to unit vectors
		dist = Math.sqrt(x2*x2 + y2*y2);
		x2 /= dist;
		y2 /= dist;
                 // add the x,y values 
		x2 += x1;
		y2 += y1;
		if (Math.round(x1) != Math.round(x2)){
		  	return 1.0;
			
		}else{
		  	return 0.0;}
			
	}
	


	@Override
	double postCall(double input) {
		// TODO Auto-generated method stub
		// this returns the  value of call *2 then is devided by the crosses in 
		return input*2;

	}
}






