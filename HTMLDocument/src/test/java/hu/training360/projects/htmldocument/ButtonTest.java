package hu.training360.projects.htmldocument;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ButtonTest {

    @Test
    public void generateHTML() {
        Button button = new Button("Click me!", "button", true);

        String result = button.generateHTML();

        assertEquals("<button type=\"button\" autofocus>Click me!</button>" + System.lineSeparator(), result);
    }
}