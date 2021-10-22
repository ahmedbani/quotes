package quotes;

public class ApiQuotes {
    private String quoteAuthor;
    private String quoteText;

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public String getQuoteText() {
        return quoteText;
    }

    @Override
    public String toString() {
        return "{" +
                "\"author\":\"" + quoteAuthor + '\"' +
                ",\"quote\":\"" + quoteText +
                "\"}";
    }
}
