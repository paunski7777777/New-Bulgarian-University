public class StartUp {
    public static void main(String[] args) {
        Post post1 = new Post("Definition of OOP Concepts in Java ", "OOP concepts in Java are the main ideas behind Java’s Object Oriented Programming. They are an abstraction, encapsulation, inheritance, and polymorphism. Grasping them is key to understanding how Java works. Basically, Java OOP concepts let us create working methods and variables, then reuse all or part of them without compromising security.");
        Post post2 = new Post("What is object oriented programming OOP?", "Object Oriented Programming OOP is the foundation of mastering most of the widely used programming languages such as Java, Python, Ruby and, of course, Swift. It helps you in the process of designing your app because an app without any proper planning will make you go crazy (trust me, been there, done that). ");
       // Post post3 = new Post("OOP batence", "OOP OOP OOP OOP OOP OOP");

        String word = "OOP";

        System.out.println(post1.isInTitle(word));
        System.out.println(post1.countOfWordInContent(word));
        System.out.println(post2.isInTitle(word));
        System.out.println(post2.countOfWordInContent(word));
       // System.out.println(post3.isInTitle(word));
       // System.out.println(post3.countOfWordInContent(word));
       // System.out.println(post3.isInTitle(word));

        Blog blog = new Blog();
        blog.addPost(post1);
        blog.addPost(post2);
      //  blog.addPost(post3);
        System.out.println();
        blog.posts.forEach(p -> System.out.println(p + "\r\n"));
        System.out.println();
        System.out.println(blog.getTitles(word));
    }
}
