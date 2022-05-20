package d19_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost();
        post1.fullNamePostOwner = "Zoran Milovanovic";
        post1.fullNameProfileOwner = "Vladimir Minic";
        post1.text = "Da li sam dobro uradio domaci?";
        post1.likes = 1;
        post1.shares = 0;

        post1.like();
        post1.dislake();
        post1.share();
        post1.print();

        System.out.println();
        FacebookPost post2 = new FacebookPost();

        post2.fullNamePostOwner = "Vladimir Minic";
        post2.fullNameProfileOwner = "Zoran Milovanovic";
        post2.text = "Ne, naravno da nisi, pisem ti na Slack-u probleme koje sam uocio!";
        post2.likes = 2;
        post2.shares = 1;

        post2.like();
        post2.like();
        post2.dislake();
        post2.share();
        post2.print();


    }
}
