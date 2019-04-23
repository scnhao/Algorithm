package factorial;

public class fact {
	public static int factorial(int i){
		if(i == 1){
			return 1;
		}else {
			return i*factorial(i - 1);
		}
	}
	public static void main(String[] args) {
		int f = factorial(5);
		System.out.println(f);
	}
}
