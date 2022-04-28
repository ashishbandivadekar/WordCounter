package word.library;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import word.library.exception.IllegalCharacterException;

@SpringBootApplication
public class WordCounterApplication {

	public static void main(String[] args) throws IllegalCharacterException {
		SpringApplication.run(WordCounterApplication.class, args);
	}
}
