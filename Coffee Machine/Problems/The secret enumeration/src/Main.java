public class Main {

	public static void main(String[] args) {
		int counter = 0;
		for (Secret secret : Secret.values()) {
			if (String.valueOf(secret).startsWith("STAR")) {
				counter++;
			}
		}

		System.out.println(counter);

	}
}

// At least two constants start with STAR
enum Secret {
	STAR, CRASH, START, // ...
}
