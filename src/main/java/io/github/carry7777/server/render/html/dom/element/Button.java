package io.github.carry7777.server.render.html.dom.element;

import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Button extends DomElement {

    String type;

    String disabled;

    @Override
    public String getTagName() {
        return "button";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    @Override
    public void preHandle(StringBuilder sb) {
        if (getType() != null) sb.append(" type=\"").append(this.getType()).append("\"");
        if (getDisabled() != null) sb.append(" disabled=\"").append(this.getDisabled()).append("\"");
    }
}
