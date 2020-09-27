package hu.training360.projects.htmldocument;

public class Table extends HTMLContainer{

    public Table() {
        super("table");
    }

    public Table(String strClass, String style) {
        super("table");

/*
        setClass(strClass);
        setStyle(style);
*/
        add(new Attribute("class", strClass)).
                add(new Attribute("style", style));
    }

    public void setClass(String strClass) {
        add(new Attribute("class", strClass));
    }

    public void setStyle(String style) {
        add(new Attribute("style", style));
    }
}
