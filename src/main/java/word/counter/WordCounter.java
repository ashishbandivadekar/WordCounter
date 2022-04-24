package word.counter;

import java.util.ArrayList;
import java.util.List;

public class WordCounter {

    private List<String> alphabetsOnlyWordList;
/*
    public WordCounter(List<String> alphabetsOnlyWordList) {
        this.alphabetsOnlyWordList = alphabetsOnlyWordList;
    }
*/
    private WordCounter() {
        this.alphabetsOnlyWordList = new ArrayList<>();
    }

    private static class BillPughSingleton
    {
        private static final WordCounter INSTANCE = new WordCounter();
    }

    public static WordCounter getInstance()
    {
        return BillPughSingleton.INSTANCE;
    }

    @Override
    public String toString() {
        return "WordCounter{" +
                "alphabetsOnlyWordList=" + alphabetsOnlyWordList +
                '}';
    }

    public List<String> getAlphabetsOnlyWordList() {
        return alphabetsOnlyWordList;
    }

    public void setAlphabetsOnlyWordList(List<String> alphabetsOnlyWordList) {
        this.alphabetsOnlyWordList = alphabetsOnlyWordList;
    }
}
