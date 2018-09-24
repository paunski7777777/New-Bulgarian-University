import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Post {
    private static final AtomicInteger count = new AtomicInteger(0);

    public int id;
    public String title;
    public String content;

    public Post(String title, String content) {
        this.id = count.incrementAndGet();
        this.title = title;
        this.content = content;
    }

    public boolean isInTitle(String word){
        if (this.title.contains(word)){
            return true;
        }
        else {
            return false;
        }
    }

    public int countOfWordInContent(String word){
        int count = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(this.content);

        while (matcher.find()){
            count++;
        }

        return count;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.title + "\r\n" + this.content;
    }
}
