package d20_05_2022;

public class FacebookPost {
    String fullNamePostOwner;
    String fullNameProfileOwner;
    String text;
    int likes;
    int shares;

    FacebookPost() {}
    FacebookPost(String fullNamePostOwner, String fullNameProfileOwner, String text) {
        this.fullNamePostOwner = fullNamePostOwner;
        this.fullNameProfileOwner = fullNameProfileOwner;
        this.text = text;
    }


    public void like() {
        this.likes++;
    }

    public void dislake() {
        this.likes--;
        if (this.likes < 0) {
            this.likes = 0;
        }
    }

    public void share() {
        this.shares++;
    }

    public void print() {
        System.out.println(this.fullNamePostOwner + " >>>>> " + this.fullNameProfileOwner);
        System.out.println(this.text);
        System.out.println("Likes " + this.likes + " | Shares " + this.shares);
    }

}
