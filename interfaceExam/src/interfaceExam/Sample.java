package interfaceExam;

public class Sample {
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
//		zookeeper.feed(tiger);
//		zookeeper.feed(lion);
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}
