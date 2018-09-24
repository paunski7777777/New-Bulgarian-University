import java.util.*;

public class Blog {
    public List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<Post>();
    }

    public void addPost(Post post){
        this.posts.add(post);
    }

    public String getTitles(String word) {
        Map<String, Integer> currentPosts = new HashMap<>();

        for (Post post : this.posts) {
            if (!currentPosts.containsKey(post.title)){
                currentPosts.put(post.title, post.countOfWordInContent(word));
            }
        }

        Optional<Map.Entry<String, Integer>> optionalEntry = currentPosts
                .entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .findFirst();

        Map.Entry<String, Integer> entry = optionalEntry.get();

        return entry.getKey();
    }
}
