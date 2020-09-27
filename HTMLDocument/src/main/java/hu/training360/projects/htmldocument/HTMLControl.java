package hu.training360.projects.htmldocument;

public class HTMLControl extends HTMLTagBase {

    public HTMLControl(String tag) {
        super(tag);
    }

    public HTMLControl(String tag, String text) {
        super(tag, text);
    }

    @Override
    public String generateHTML() {

        StringBuffer sb = new StringBuffer();

        sb.append(generateHTMLTag(true)).
                append(getText()).
                append(generateHTMLTag(false)).
                append(System.lineSeparator());

        return sb.toString();
    }
}
