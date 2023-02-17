package io.github.carry7777.server.render.html.dom.element;


import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Select extends DomElement {

    String name;

    @Override
    public String getTagName() {
        return "select";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected void preHandle(StringBuilder sb) {
        if (getName() != null) sb.append(" name=\"").append(getName()).append("\"");
    }
}
