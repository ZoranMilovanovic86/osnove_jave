package d20_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost("Zoran Milovanovic", "Vladimir Minic",
                "Bas nam je bilo lepo u kafani. Zar ne?");
        post1.likes = 6;
        post1.shares = 31;

        post1.like();
        post1.dislake();
        post1.dislake();
        post1.dislake();
        post1.dislake();
        post1.dislake();
        post1.share();
        post1.print();

        System.out.println();

        FacebookPost post2 = new FacebookPost();
        post2.fullNamePostOwner = "Vladimir Minic";
        post2.fullNameProfileOwner = "Zoran Milovanovic";
        post2.text = "Ne sumnjam da tebi jeste bilo lepo, ali ne i ljudima oko tebe!";
        post2.likes = 678;
        post2.shares = 245;

        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.dislake();
        post2.share();
        post2.print();

        System.out.println();

        FacebookPost post3 = new FacebookPost("Zoran Milovanovic", "Vladimir Minic",
                "Dobro, razumem, ponasacu se na sledecem okupljanju! ;)");
        post3.likes = 33;
        post3.shares = 11;
        post3.like();
        post3.like();
        post3.like();
        post3.like();
        post3.like();
        post3.dislake();
        post3.share();
        post3.print();


    }
}
