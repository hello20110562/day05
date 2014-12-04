public class Sum{
	String Sum;
	Sum(String x,String y){
		Sum=x+y;
	}
	Sum(String x,String y,String z){
		Sum= x+y+z;
	}
	void outp(){
		System.out.println("the sum is"+Sum+"\t");
	}
}