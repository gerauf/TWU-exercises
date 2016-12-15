public class Main {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for(int x = 1; x <100; x++){
	        System.out.println(fb.generate(x));
        }
    }
}
