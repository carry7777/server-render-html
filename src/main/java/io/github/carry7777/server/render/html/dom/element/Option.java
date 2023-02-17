package io.github.carry7777.server.render.html.dom.element;


import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Option extends DomElement {

    String value;

    @Override
    public String getTagName() {
        return "option";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    protected void preHandle(StringBuilder sb) {
        if (getValue() != null) sb.append(" value=\"").append(getValue()).append("\"");
    }
}
