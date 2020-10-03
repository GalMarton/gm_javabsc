package hu.training360.projects.htmldocument;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HTMLContainerTest {

    @Test
    public void generateHTML() {
        HTMLControl htmlControl = new HTMLControl("div", "This is a container...");

        String result = htmlControl.generateHTML();

        assertEquals("<div>This is a container...</div>" + System.lineSeparator(), result);
    }
}