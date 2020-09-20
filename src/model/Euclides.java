package model;

public class Euclides {
	
	public int mcd(int a, int b) {
		int x=a;
		int y= b;
		int r=0;
		
		while(y!=0) {
			r= x%y;
			x=y;
			y=r;
		}
		return x;
	}

}
