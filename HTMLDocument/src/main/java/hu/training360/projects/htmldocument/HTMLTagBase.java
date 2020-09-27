package hu.training360.projects.htmldocument;

import java.util.ArrayList;
import java.util.List;

abstract class HTMLTagBase implements IHTMLTagBase{

    private String tag = "";
    private String text = "";
    private final List<Attribute> attrList = new ArrayList<>();

    public HTMLTagBase(String tag) {
        this.tag = tag;
    }

    public HTMLTagBase(String tag, String text) {
        this.tag = tag;
        this.text = text;
    }

    protected StringBuffer generateHTMLTag(boolean bStart) {

        StringBuffer sb = new StringBuffer();

        sb.append('<');

        if(!bStart) {
            sb.append('/');
        }

        sb.append(tag);

        if(bStart) {
            for (Attribute attr : attrList) {
                sb.append(' ').
                        append(attr.toString());
            }
        }

        sb.append('>');

        return sb;
    }

    protected HTMLTagBase add(Attribute attr) {
        attrList.add(attr);
        return this;
    }

    protected String getTag() {
        return tag;
    }

    protected String getText() {
        return text;
    }
}
