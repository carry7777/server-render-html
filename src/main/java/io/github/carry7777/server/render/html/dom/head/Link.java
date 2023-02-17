package io.github.carry7777.server.render.html.dom.head;

import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Link extends DomElement {

    String rel;

    String type;

    String href;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(this.getClass().getSimpleName().toLowerCase());
        if (this.getHref() != null) {
            sb.append(" href=\"").append(this.getHref()).append("\"");
        }
        if (this.getRel() != null) {
            sb.append(" rel=\"").append(this.getRel()).append("\"");
        }
        if (this.getType() != null) {
            sb.append(" type=\"").append(this.getType()).append("\"");
        }
        sb.append(">");
        return sb.toString();
    }
}
