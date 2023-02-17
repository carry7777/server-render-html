package io.github.carry7777.server.render.html.dom;


import io.github.carry7777.server.render.html.dom.element.Div;
import io.github.carry7777.server.render.html.dom.extend.DomElement;

public class Body extends DomElement {

    @Override
    public String getTagName() {
        return "body";
    }

    @Override
    public String toString() {

        if (getChildren().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("<").append(this.getTagName().toLowerCase()).append(">");

            Div div = new Div();
            div.setInnerHtmlBefore("welcome to server render html page!");
            sb.append(div.toString());

            sb.append("</").append(this.getTagName().toLowerCase()).append(">");
            return sb.toString();
        }


        return super.toString();
    }
}
