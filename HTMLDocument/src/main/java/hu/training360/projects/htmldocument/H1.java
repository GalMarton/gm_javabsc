package hu.training360.projects.htmldocument;

public class H1 extends HTMLControl{

    public H1(String text) {
        super("h1", text);
    }

    public H1(String text, String style) {
        super("h1", text);

        setStyle(style);
    }

    public void setStyle(String style) {
        add(new Attribute("style", style));
    }
}
