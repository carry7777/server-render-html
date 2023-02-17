package io.github.carry7777.server.render.html.dom.head;

import io.github.carry7777.server.render.html.dom.extend.DomElement;

import java.util.HashMap;
import java.util.Map;

public class Style extends DomElement {

    Map<String, Map<String, String>> values = new HashMap<>();

    public void add(String selector, String key, String value) {
        Map<String, String> style = values.get(selector);
        if (style != null) {
            style.put(key, value);
        } else {
            Map<String, String> styleAdd = new HashMap<>();
            styleAdd.put(key, value);
            values.put(selector, styleAdd);
        }
    }

    public Map<String, Map<String, String>> get() {
        return values;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(this.getClass().getSimpleName().toLowerCase()).append(">");
        for (String selector : this.get().keySet()) {
            sb.append(selector).append("{");
            Map<String, String> css = this.get().get(selector);
            for (String key : css.keySet()) {
                sb.append(key).append(":").append(css.get(key)).append(";");
            }
            sb.append("}");
        }
        sb.append("</").append(this.getClass().getSimpleName().toLowerCase()).append(">");

        return sb.toString();
    }
}
