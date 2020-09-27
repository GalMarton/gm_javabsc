package hu.training360.projects.htmldocument;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HTMLControlTest {

    @Test
    public void generateHTMLTest() {
        HTMLControl htmlControl = new HTMLControl("p1", "This is text...");

        String result = htmlControl.generateHTML();

        assertEquals("<p1>This is text...</p1>" + System.lineSeparator(), result);
    }
}