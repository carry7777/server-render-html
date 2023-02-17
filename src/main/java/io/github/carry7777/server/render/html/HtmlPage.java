package io.github.carry7777.server.render.html;


import io.github.carry7777.server.render.html.dom.Body;
import io.github.carry7777.server.render.html.dom.Head;
import io.github.carry7777.server.render.html.dom.Html;
import io.github.carry7777.server.render.html.dom.head.Style;
import io.github.carry7777.server.render.html.dom.head.Title;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class HtmlPage {

    Html html;

    public HtmlPage() {
        html = new Html();
        html.setLang("en");
        Head head = new Head();
        Title title = new Title();
        title.setInnerHtmlAfter("Title");
        head.appendChild(title);
        Style style = new Style();
        head.appendChild(style);
        Body body = new Body();
        html.setHead(head);
        html.setBody(body);
    }

    public Html getHtml() {
        return html;
    }

    public void reader(HttpServletResponse response) {

        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType("text/html");
        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.write(html.toString());
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            System.out.println("1");
        }
    }


}
