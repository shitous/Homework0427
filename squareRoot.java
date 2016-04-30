
public class squareRoot {
	 public int mySqrt(int x) {
		 for(int i=0;i<=x;i++){
			 if(i*i==x){
				 return i;
			 }
			
		 }
		 return x;
	        
	    }




public static void main(String[]args){
	squareRoot test=new squareRoot();
	System.out.println(test.mySqrt(8));
	
}}
