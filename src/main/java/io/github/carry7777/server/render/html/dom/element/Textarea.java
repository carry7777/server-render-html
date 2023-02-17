package io.github.carry7777.server.render.html.dom.element;

import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Textarea extends DomElement {


    String rows;

    String cols;


    @Override
    public String getTagName() {
        return "textarea";
    }

    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    public String getCols() {
        return cols;
    }

    public void setCols(String cols) {
        this.cols = cols;
    }


    @Override
    protected void preHandle(StringBuilder sb) {
        if (getRows() != null) sb.append(" rows=\"").append(getRows()).append("\"");
        if (getCols() != null) sb.append(" cols=\"").append(getCols()).append("\"");
    }
}
