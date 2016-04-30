
public class Power {
public double myPow(double x, int n) {

	double cur=x;
	for(int i =0;i<n-1;i++){
		cur=cur*x;

	}

	return cur;

}


public static void main(String[]args){
	Power test=new Power();
	System.out.println(test.myPow(9, 3));
	
}}