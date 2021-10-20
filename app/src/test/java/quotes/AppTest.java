/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Gson gson = new Gson();
    @Test void gson() throws FileNotFoundException {
        Reader reader = new FileReader("/Users/macbookpro/projects/401/quotes/app/src/main/resources/data.json");
        Quotes [] quotesArray = gson.fromJson(reader,Quotes[].class);
        Quotes quote = quotesArray[5];
        String text = "{\"author\":\"ahmed\",\"text\":\"roses are red\"}";
        Quotes quote1 = gson.fromJson(text,Quotes.class);
        assertTrue(Arrays.asList(quotesArray).contains(quote));
        assertFalse(Arrays.asList(quotesArray).contains(quote1));
        assertEquals("{\"author\":\"Marilyn Monroe\",\"text\": “I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.” }",quotesArray[0].toString());
    }
}