package hu.training360.projects.htmldocument;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TableTest {

    @Test
    public void generateHTML() {
        Table table = new Table("intro important", "float:left");
        H1 h1 = new H1("This is text...");
        table.add(h1);

        String result = table.generateHTML();

        assertEquals("<table class=\"intro important\" style=\"float:left\">" + System.lineSeparator() +
                "\t<h1>This is text...</h1>" + System.lineSeparator() +
                "</table>" + System.lineSeparator(), result);
    }
}