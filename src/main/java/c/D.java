package c;

class S{
	static int t=2;
	 void  wow(){
		System.out.println("wow");
	}
	
}

class M extends S{
	 void  wow1(){
		System.out.println();
	}
	 
	 void v(){
			System.out.println("v");
	 }
}

public class D {

	public static void main(String[] args) {
	System.out.println(M.t);
		}

}
