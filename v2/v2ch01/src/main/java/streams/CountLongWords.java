package streams;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLongWords {
	public static void main(String[] args) throws IOException {
		Path path=Paths.get(Paths.get(new File("").getAbsolutePath()).getParent().getParent().toAbsolutePath().toString(),"gutenberg/alice30.txt");
		System.out.println(path.toAbsolutePath());
		String contents = new String(Files.readAllBytes(path),
				StandardCharsets.UTF_8);
		List<String> words = Arrays.asList(contents.split("\\PL+"));

		long count = 0;
		for (String w : words) {
			if (w.length() > 12)
				count++;
		}
		System.out.println(count);

		count = words.stream().filter(w -> w.length() > 12).count();
		System.out.println(count);
		
		String first=words.stream().filter(w->w.length()>2222).findFirst().orElse("niu");
		System.out.println(first);
		
		count = words.parallelStream().filter(w -> w.length() > 12).count();
		System.out.println(count);
	}
}