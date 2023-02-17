package io.github.carry7777.server.render.html.dom.element;

import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Label extends DomElement {

    String forVal;

    public String getFor() {
        return forVal;
    }

    public void setFor(String forVal) {
        this.forVal = forVal;
    }

    @Override
    public String getTagName() {
        return "label";
    }

    @Override
    protected void preHandle(StringBuilder sb) {
        if (getFor() != null) sb.append(" for=\"").append(getFor()).append("\"");
    }
}
