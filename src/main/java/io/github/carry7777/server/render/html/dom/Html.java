package io.github.carry7777.server.render.html.dom;

import io.github.carry7777.server.render.html.dom.extend.DomElement;


public class Html extends DomElement {

    Head head;
    Body body;
    String lang;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>");
        sb.append("<html");
        if (lang != null) {
            sb.append(" lang=\"").append(lang).append("\"");
        }
        super.baseHandle(sb);
        sb.append(">");
        sb.append(head.toString());
        sb.append(body.toString());
        sb.append("</html>");

        return sb.toString();
    }
}
