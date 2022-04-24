package word.counter.service;

import word.counter.WordCounter;
import word.counter.exception.IllegalCharacterException;
import word.external.translator.service.TranslatorService;

public class WordCounterServiceImpl implements WordCounterService{

    private WordCounter wordCounter;
    private TranslatorService translatorService;

    public WordCounterServiceImpl(WordCounter wordCounter, TranslatorService translatorService) {
        this.wordCounter =  WordCounter.getInstance();
        this.translatorService = translatorService;
    }

    @Override
    public void addWords(String word) throws IllegalCharacterException {
        if(null == word || !word.matches("[a-zA-Z]+")){
            throw new IllegalCharacterException("IllegalCharacterException: "+word+ "contains non-alphabet characters");
        }
        wordCounter.getAlphabetsOnlyWordList().add(word);
    }

    @Override
    public long countSimilarMeaningWords(String word){
        if(null != word)
            return this.wordCounter.getAlphabetsOnlyWordList().stream().filter(s -> s.equalsIgnoreCase(word) || (null != translatorService.translateToEnglish(s) && translatorService.translateToEnglish(s).equalsIgnoreCase(word))).count();
        else
            return 0;
    }

    public WordCounter getWordCounter() {
        return wordCounter;
    }
}
