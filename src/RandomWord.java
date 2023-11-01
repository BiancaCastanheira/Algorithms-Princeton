import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
	public static void main(String[] args) {

		int counter = 0;
		String champion = " ";

		while (!StdIn.isEmpty()) {
			String world = StdIn.readString();

			counter++;

			if (counter == 0) {
				champion = world;
				continue;
			}

			double probability = (double) 1 / counter;
			boolean isChampion = StdRandom.bernoulli(probability);

			if (isChampion == true) {
				champion = world;
			}
		}

		StdOut.println(champion);		
    }
}