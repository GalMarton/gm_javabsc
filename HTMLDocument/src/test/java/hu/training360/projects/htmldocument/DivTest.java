package hu.training360.projects.htmldocument;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DivTest {

    @Test
    public void generateHTML() {
        Div div = new Div();
        Button button = new Button("Click me!", "button", true);
        div.add(button);

        String result = div.generateHTML();

        assertEquals("<div>" + System.lineSeparator() +
                "\t<button type=\"button\" autofocus>Click me!</button>" + System.lineSeparator() +
                "</div>" + System.lineSeparator(), result);
    }
}