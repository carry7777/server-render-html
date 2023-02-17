package io.github.carry7777.server.render.html.dom.extend;


import java.util.*;

public abstract class DomElement {


    /**
     * css style, will be format like style="{key:value}"
     */
    Map<String, String> cssStyle = new HashMap<>();

    List<DomElement> children = new ArrayList<>();

    String innerHtmlBefore;

    String innerHtmlAfter;

    Set<String> cssClass = new HashSet<>();

    String id;

    /**
     * customer attr
     */
    Map<String, String> attrs = new HashMap<>();

    public String getTagName() {
        return "div";
    }

    public List<String> getCssClass() {
        return new ArrayList<>(this.cssClass);
    }

    public void addCssClass(String cssClass) {
        this.cssClass.add(cssClass);
    }

    public void removeCssClass(String cssClass) {
        this.cssClass.remove(cssClass);
    }

    public Map<String, String> getCssStyle() {
        return cssStyle;
    }

    public void addCssStyle(String key, String value) {
        this.cssStyle.put(key, value);
    }


    public void appendChild(DomElement domElement) {
        children.add(domElement);
    }

    public void removeChild(DomElement domElement) {
        children.remove(domElement);
    }

    public List<DomElement> getChildren() {
        return children;
    }

    public String getInnerHtmlBefore() {
        return innerHtmlBefore;
    }

    public void setInnerHtmlBefore(String innerHtmlBefore) {
        this.innerHtmlBefore = innerHtmlBefore;
    }

    public String getInnerHtmlAfter() {
        return innerHtmlAfter;
    }

    public void setInnerHtmlAfter(String innerHtmlAfter) {
        this.innerHtmlAfter = innerHtmlAfter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAttr(String key, String value) {
        this.attrs.put(key, value);
    }

    public void removeAttr(String key) {
        this.attrs.remove(key);
    }

    /**
     * extend should override
     */
    protected void preHandle(StringBuilder sb) {

    }

    /**
     * extend should not override
     */
    protected void baseHandle(StringBuilder sb) {
        //id
        if (id != null) {
            sb.append(" id=\"").append(id).append("\"");
        }
        //class
        List<String> classList = new ArrayList<>(this.getCssClass());
        if (classList.size() > 0) {
            sb.append(" class=\"");
            for (int i = 0; i < classList.size(); i++) {
                if (i == 0) {
                    sb.append(classList.get(i));
                } else {
                    sb.append(" ").append(classList.get(i));
                }
            }
            sb.append("\"");
        }
        //style
        Map<String, String> cssStyle = this.getCssStyle();
        if (cssStyle.keySet().size() > 0) {
            sb.append(" style=\"");
            for (String cssClass : cssStyle.keySet()) {
                String text = cssClass + ":" + cssStyle.get(cssClass) + ";";
                sb.append(text);
            }
            sb.append("\"");
        }
        //attrs
        if (attrs.size() > 0) {
            for (String key : attrs.keySet()) {
                sb.append(" ").append(key).append("=\"").append(attrs.get(key)).append("\"");
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        //start
        sb.append("<").append(this.getTagName().toLowerCase());
        //baseHandle
        this.baseHandle(sb);
        //childHandle
        this.preHandle(sb);
        //end
        sb.append(">");
        //innerHtml before
        sb.append(this.getInnerHtmlBefore() == null ? "" : this.getInnerHtmlBefore());
        //children
        List<DomElement> children = this.getChildren();
        if (!children.isEmpty()) {
            for (DomElement childElement : this.getChildren()) {
                sb.append(childElement.toString());
            }
        }
        //innerHtml after
        sb.append(this.getInnerHtmlAfter() == null ? "" : this.getInnerHtmlAfter());
        //close
        sb.append("</").append(this.getTagName().toLowerCase()).append(">");
        return sb.toString();
    }
}
