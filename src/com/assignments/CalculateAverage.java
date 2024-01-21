package com.assignments;

class Average{
	double result;
	public double avgFirstN(int N) {
		
	    if(N>0)
        {     
	    	result =  (double) (N + 1) /2;
        }
	    else {
	    	throw new IllegalArgumentException();
	    }
		return result;
	}
}
public class CalculateAverage {

	public static void main(String[] args) {
		try {
		Average avg = new Average();
		System.out.println("Average is : "+ avg.avgFirstN(-10));
		}catch(IllegalArgumentException e){
            System.out.println(e 
            		+ ": Enter Positive Number");
        }catch(Exception e)
        {
        	System.out.println(e);
        }

	}

}
