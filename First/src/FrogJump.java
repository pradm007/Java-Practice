
public class FrogJump {

	public static void main(String[] args) {
		int x = 10, y = 85, d = 30;

		int diff = y - x;
		int numberOfJumps = 0;
		if (diff > 0) {
			numberOfJumps = diff / d;
			if (diff % d > 0)
				numberOfJumps++;
		}
		
		System.out.println("" + numberOfJumps);
	}

}
