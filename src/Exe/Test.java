package Exe;

public class Test {
	/**
	 * initialization block.
	 * These blocks are executed whenever an object of that class is constructed.
	 */
	{ System.out.printf("NON-STATIC BLOCK\n");}

	public static Test m = new Test();
	
	static{System.out.printf("STATIC BLOCK\n");}

	

	public Test(){
        System.out.printf("MAIN CONSTRUCTOR\n");
    }

	public static void main(String... args) {
	  //Test m = new Test();
		System.out.printf("MAIN METHOD\n");

	}
}
