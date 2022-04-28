package word.library.service;

import org.springframework.stereotype.Component;
import word.library.exception.IllegalCharacterException;


public interface WordCounterService {

    public void addWords(String word) throws IllegalCharacterException;

    public int countSimilarMeaningWords(String word);
}
