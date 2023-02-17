package io.github.carry7777.server.render.html.dom.element;


import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Input extends DomElement {

    String name;

    String type;

    String value;

    String disabled;

    @Override
    public String getTagName() {
        return "input";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    @Override
    protected void preHandle(StringBuilder sb) {
        if (getName() != null) sb.append(" name=\"").append(getName()).append("\"");
        if (getType() != null) sb.append(" type=\"").append(getType()).append("\"");
        if (getValue() != null) sb.append(" value=\"").append(getValue()).append("\"");
        if (getDisabled() != null) sb.append(" disabled=\"").append(getDisabled()).append("\"");
    }
}
