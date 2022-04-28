package word.library.translator;

import org.springframework.stereotype.Component;

@Component("translatorService")
public class TranslatorService {
    public String translateToEnglish(String word) {
        return word;
    }

}
