package io.github.carry7777.server.render.html.dom.head;

import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Script extends DomElement {

    String src;

    String type;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(this.getClass().getSimpleName().toLowerCase());
        if (this.getType() != null) {
            sb.append(" type=\"").append(this.getType()).append("\"");
        }
        if (this.getSrc() != null) {
            sb.append(" src=\"").append(this.getSrc()).append("\"");
        }
        sb.append(">");
        if (this.getInnerHtmlBefore() != null) {
            sb.append(this.getInnerHtmlBefore());
        }
        sb.append("</").append(this.getClass().getSimpleName().toLowerCase()).append(">");
        return sb.toString();
    }
}
