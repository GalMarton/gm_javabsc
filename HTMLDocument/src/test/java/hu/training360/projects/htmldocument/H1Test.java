package hu.training360.projects.htmldocument;

import org.junit.Test;
import static org.junit.Assert.*;

public class H1Test {

    @Test
    public void generateHTML() {
        H1 h1 = new H1("This is text...");

        String result = h1.generateHTML();

        assertEquals("<h1>This is text...</h1>" + System.lineSeparator(), result);
    }
}