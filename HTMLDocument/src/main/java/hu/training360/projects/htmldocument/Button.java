package hu.training360.projects.htmldocument;

public class Button extends HTMLControl {

    public Button(String text) {
        super("button", text);
    }

    public Button(String text, String type, Boolean autofocus) {
        super("button", text);

        setType(type);
        setAutofocus(autofocus);
    }

    public void setType(String type) {
        add(new Attribute("type", type));
    }

    public void setAutofocus(Boolean autofocus) {

        if(autofocus) {
            add(new Attribute("autofocus"));
        }
    }
}
