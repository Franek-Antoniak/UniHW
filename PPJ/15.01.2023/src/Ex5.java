import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Ex5 {
	public static void main(String[] args) {
		BufferedReader[] f = IntStream.range(0, 5)
				.mapToObj(i -> {
					try {
						return new FileReader("PPJ/15.01.2023/src/inputData" + i + ".txt");
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				})
				.map(BufferedReader::new)
				.toArray(BufferedReader[]::new);
		record Pair(int x, int y) implements Comparable<Pair> {
			@Override
			public int compareTo(Pair o) {
				return x - o.x;
			}
		}
		PriorityQueue<Pair> queue = new PriorityQueue<>();
		for (int i = 0; i < f.length; i++) {
			try {
				queue.add(new Pair(Integer.parseInt(f[i].readLine()), i));
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		try (PrintWriter pw = new PrintWriter("PPJ/15.01.2023/src/Ex5Answer.txt")) {
			while (!queue.isEmpty()) {
				Pair p = queue.poll();
				pw.println(p.x);
				if (f[p.y].ready()) {
					queue.add(new Pair(Integer.parseInt(f[p.y].readLine()), p.y));
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
