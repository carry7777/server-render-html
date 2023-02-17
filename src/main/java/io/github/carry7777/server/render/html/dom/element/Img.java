package io.github.carry7777.server.render.html.dom.element;

import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Img extends DomElement {

    String src;

    @Override
    public String getTagName() {
        return "img";
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public void preHandle(StringBuilder sb) {
        if (getSrc() != null) sb.append(" src=\"").append(getSrc()).append("\"");
    }
}
