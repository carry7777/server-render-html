package io.github.carry7777.server.render.html.dom.element;


import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class A extends DomElement {

    @Override
    public String getTagName() {
        return "a";
    }


    String download;

    String href;

    String rel;

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    @Override
    protected void preHandle(StringBuilder sb) {
        if (getDownload() != null) sb.append(" download=\"").append(getDownload()).append("\"");
        if (getHref() != null) sb.append(" href=\"").append(getHref()).append("\"");
        if (getRel() != null) sb.append(" rel=\"").append(getRel()).append("\"");
    }
}
