package interfaceExam;

public class Lion extends Animal implements Predator, Barkable {
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}
}
