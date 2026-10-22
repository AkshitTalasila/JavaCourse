package edu.umass;

public class Calculator{


	public double doStuff(double a,double b,String opps){


		if(opps.equalsIgnoreCase("add")){

			return a+b;
		}else if(opps.equalsIgnoreCase("sub")){


			return a-b;
		}else if(opps.equalsIgnoreCase("mul")){

			return a*b;
		}else if(opps.equalsIgnoreCase("div")){

			return a/b;
		}else{


			return a*b*0;
		}

	}
}
