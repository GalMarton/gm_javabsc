package hu.training360.projects.htmlgenerate;

import hu.training360.projects.htmldocument.Button;
import hu.training360.projects.htmldocument.Div;
import hu.training360.projects.htmldocument.H1;
import hu.training360.projects.htmldocument.HTMLDocument;
import hu.training360.projects.htmldocument.Table;

public class Main {

    public static void main(String[] args) {

        HTMLDocument htmlDocument = new HTMLDocument();
        HTMLDocument htmlDocument2 = new HTMLDocument();
        Div div = new Div();
        Div div2 = new Div();
        Div div3 = new Div();
        div2.setClass("myDiv");
        Table table = new Table();
        Table table2 = new Table("intro important", "float:left");
        H1 h1 = new H1("This is text...");
        h1.setStyle("text-align:center");
        H1 h11 = new H1("This is other text...");
        Button button = new Button("Click me!", "button", false);
        Button button2 = new Button("Press!");
        button2.setType("reset");
        button2.setAutofocus(true);

        htmlDocument.add(htmlDocument2);
/*
        table.add(h1);
        table.add(button);
*/
        table.add(h1).
            add(button);
        div.add(table);

        table2.add(h1);
        div.add(table2);

        div2.add(h1);
        div2.add(button2).
            add(h11);

        div3.add(h11);
        div2.add(div3);

        htmlDocument.add(div);
        htmlDocument.add(div2);

        String s = htmlDocument.generateHTML();
        System.out.println(s);
    }
}
