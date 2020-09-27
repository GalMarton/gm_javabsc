package hu.training360.projects.htmldocument;

import java.util.List;
import java.util.ArrayList;

public class HTMLContainer extends HTMLTagBase {

    private final List<IHTMLTagBase> tagList = new ArrayList<>();
    private static int tabs = 0;

    public HTMLContainer(String tag) {
        super(tag);
    }

    @Override
    public String generateHTML() {
        StringBuffer sb = new StringBuffer();

        sb.append(generateHTMLTag(true)).
           append(System.lineSeparator());
        tabs++;

        for (IHTMLTagBase tag : tagList) {
            writeTabs(sb);
            sb.append(tag.generateHTML());
        }

        tabs--;
        writeTabs(sb);
        sb.append(generateHTMLTag(false).
           append(System.lineSeparator()));

        return sb.toString();
    }

    public HTMLContainer add(IHTMLTagBase tag) {

        if(!(tag instanceof HTMLDocument)) {
            tagList.add(tag);
        }

        return this;
    }

    private void writeTabs(StringBuffer sb) {

        for (int i = 0; i < tabs; i++) {
            sb.append("\t");
        }
    }
}
