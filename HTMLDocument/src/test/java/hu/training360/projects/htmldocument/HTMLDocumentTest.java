package hu.training360.projects.htmldocument;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HTMLDocumentTest {

    @Test
    public void generateHTML() {
        HTMLDocument htmlDocument = new HTMLDocument();
        Div div = new Div();
        Table table = new Table("intro important", "float:left");
        H1 h1 = new H1("This is text...");
        table.add(h1);
        div.add(table);
        htmlDocument.add(div);

        String result = htmlDocument.generateHTML();

        assertEquals("<html>" + System.lineSeparator() +
                "\t<div>" + System.lineSeparator() +
                "\t\t<table class=\"intro important\" style=\"float:left\">" + System.lineSeparator() +
                "\t\t\t<h1>This is text...</h1>" + System.lineSeparator() +
                "\t\t</table>" + System.lineSeparator() +
                "\t</div>" + System.lineSeparator() +
                "</html>" + System.lineSeparator(), result);
    }
}