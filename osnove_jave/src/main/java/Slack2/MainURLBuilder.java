package Slack2;

public class MainURLBuilder {
    public static void main(String[] args) {
        KeyValuePair first = new KeyValuePair("key1","value1");
        KeyValuePair secound = new KeyValuePair("key2", "key2");

        KeyValuePair milan = new KeyValuePair("fullName", "Milan");
        KeyValuePair age = new KeyValuePair("age", "27");



        UrlBuilder example = new UrlBuilder("http://www.example.com/somepage/index.html");
        example.addKeyValuePair(first);
        example.addKeyValuePair(secound);
        example.removeKeyValuePair("key1");
        example.removeKeyValuePair("key2");
        System.out.println(example.generateURL());

        System.out.println();

        UrlBuilder example2 = new UrlBuilder("http://www.example.com/somepage/index.html");
        example2.addKeyValuePair(milan);
        example2.addKeyValuePair(age);
        System.out.println(example2.generateURL());

    }
}
