package ca.blakey.monte_carlo.model;

public class Buffin extends Measure {


	@Override
	double Call(double[] input) {
		 double angle= 0.5*input[2]*Math.PI;
		if(input[1]<=0.5*Math.sin(angle)){
			return 1.0;
		}else{
		return 0.0;
	}

	}



	@Override
	double postCall(double input) {
		// TODO Auto-generated method stub
		return input;
		// hello
	}






}
