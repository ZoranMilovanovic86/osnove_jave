package Slack2;

import java.util.ArrayList;

public class UrlBuilder {
    private String baseURL;
    private ArrayList<KeyValuePair> pairArray = new ArrayList<>();

    public UrlBuilder(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void addKeyValuePair(KeyValuePair keyValuePair) {
        pairArray.add(keyValuePair);
    }

    public void removeKeyValuePair(String keyValue) {
        for (int i = 0; i < pairArray.size(); i++) {
            if (pairArray.get(i).generateParamString().contains(keyValue)) {
                pairArray.remove(i);
            }
        }
    }

    public String generateURL() {
        String pairs = "";
        if (pairArray.size() > 0) {
            for (int i = 0; i < pairArray.size(); i++) {
                pairs = pairs + pairArray.get(i).generateParamString();
                if (i < pairArray.size() - 1) {
                    pairs = pairs + "&";
                }
            }
            return this.baseURL + "?" + pairs;
        } else {
            return this.baseURL;
        }
    }

}
