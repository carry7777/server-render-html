package io.github.carry7777.server.render.html.dom.head;

import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Meta extends DomElement {

    String charset;

    String name;

    String content;

    String httpEquiv;

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHttpEquiv() {
        return httpEquiv;
    }

    public void setHttpEquiv(String httpEquiv) {
        this.httpEquiv = httpEquiv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(this.getClass().getSimpleName().toLowerCase());
        if (this.getName() != null) {
            sb.append(" name=\"").append(this.getName()).append("\"");
        }
        if (this.getHttpEquiv() != null) {
            sb.append(" http-equiv=\"").append(this.getHttpEquiv()).append("\"");
        }
        if (this.getContent() != null) {
            sb.append(" content=\"").append(this.getContent()).append("\"");
        }
        if (this.getCharset() != null) {
            sb.append(" charset=\"").append(this.getCharset()).append("\"");
        }
        sb.append(">");
        return sb.toString();
    }
}
