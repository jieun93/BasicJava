package z_exam;

public class P1 {

	public static void main(String[] args) {
		 
		int a = (int)(Math.random()*10+1);
		int b = (int)(Math.random()*10+1);
		int c = (int)(Math.random()*10+1);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		 
		int min = a;
		int mid = a;
		int max = a;
		 
	    if(b < min && b < c ){
	    	min = b;
	    	}else if(c < min){
	    		
	    		 min = c;
	    	}
	    if((mid < b && b < c) || (c < b && b < mid)){
	    	mid = b;
	    }else if((mid < c && c < b) || (b < c && c < mid)){
	    	mid = c;
	    	}
	    if(max < b && b < c){
	    	max = c;
	    	}else if(max < b){
	    		max = b;
	    	}
	    

		max = max < b ? b : max;
		max = max < c ? c : max;
		
		min = min > b ? b : min;
		min = min > c ? c : min;
		
		mid = mid < b && b < c ? b : mid;
		mid = mid < c && c < b ? c : mid;

	    
	    System.out.println(" 가장작은수 "+min+" 중간수 "+mid+" 가장큰수 "+max);
		 
		 
	}

}
