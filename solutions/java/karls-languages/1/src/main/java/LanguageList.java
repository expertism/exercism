import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();

    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        String firstLang = languages.getFirst();

        return firstLang;
    }

    public int count() {
        int countLang = languages.size();

        return countLang;
    }

    public boolean containsLanguage(String language) {
        boolean isLang = languages.contains(language);

        return isLang;
    }

    public boolean isExciting() {
        boolean hasLang = false;
        if (languages.contains("Kotlin")){
            hasLang = true;
        } else if(languages.contains("Java")){
            hasLang = true;
        }
        return  hasLang;
    }
}
