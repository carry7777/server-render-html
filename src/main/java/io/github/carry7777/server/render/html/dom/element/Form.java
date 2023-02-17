package io.github.carry7777.server.render.html.dom.element;


import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Form extends DomElement {

    String method;

    String action;

    @Override
    public String getTagName() {
        return "form";
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    @Override
    protected void preHandle(StringBuilder sb) {
        if (getMethod() != null) sb.append(" method=\"").append(getMethod()).append("\"");
        if (getAction() != null) sb.append(" action=\"").append(getAction()).append("\"");
    }
}
