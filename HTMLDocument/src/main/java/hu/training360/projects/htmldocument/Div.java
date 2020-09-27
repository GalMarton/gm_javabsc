package hu.training360.projects.htmldocument;

public class Div extends HTMLContainer{

    public Div() {
        super("div");
    }

    public Div(String strClass) {
        super("div");

        setClass(strClass);
    }

    public void setClass(String strClass) {
        add(new Attribute("class", strClass));
    }
}
