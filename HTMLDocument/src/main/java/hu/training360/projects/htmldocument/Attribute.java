package hu.training360.projects.htmldocument;

public class Attribute {

    String key = "";
    String value = "";

    public Attribute(String key) {
        this.key = key;
    }

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append(key);

        if(!value.isEmpty()) {
            sb.append("=\"").append(value).append("\"");
        }

        return sb.toString();
    }
}
