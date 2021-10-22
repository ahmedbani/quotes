package quotes;

import java.util.ArrayList;

public class Quotes {
    private String author;
    private String text;
    private String quote;

    public Quotes(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public Quotes() {
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "{" +
                "\"author\":\"" + author + '\"' +
                ",\"quote\":" + text +
                "}";
    }
}
