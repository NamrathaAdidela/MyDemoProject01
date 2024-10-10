package Pages;

public class mergedemopage {
	public static void main(String s) {
		System.out.println("Merge demo Page class 1");
		System.out.println("Merge demo Page class 1.01");
		System.out.println("Merge demo Page class 1.02");
//<<<<<<< Updated upstream
		String str = "Stash";
		String str1 = "Checking";
		System.out.println(str+str1);
//=======
		int i = 20;
		System.out.println("age is "+ i);
//>>>>>>> Stashed changes
		System.out.println("Explored stash command in git");
		
	}
	
}
