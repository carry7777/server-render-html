package io.github.carry7777.server.render.html.dom;

import io.github.carry7777.server.render.html.dom.extend.DomElement;
import io.github.carry7777.server.render.html.dom.head.Style;
import io.github.carry7777.server.render.html.dom.head.Title;


public class Head extends DomElement {

    @Override
    public String getTagName() {
        return "head";
    }

    public Title getTitle() {
        for (DomElement child : getChildren()) {
            if (child instanceof Title) {
                return (Title) child;
            }
        }
        return null;
    }


    public Style getStyle() {
        for (DomElement child : getChildren()) {
            if (child instanceof Style) {
                return (Style) child;
            }
        }
        return null;
    }

}
