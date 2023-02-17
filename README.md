# server-render-html
server-render-html is a html page creator, render html page in server, no more write html, suitable for small projects to use java code manage html.

## Uage

___

### Install

download and install in maven

```shell
mvn install:install-file -Dfile=server-render-html-0.1.0-SNAPSHOT.jar -DgroupId=io.github.carry7777 -DartifactId=server-render-html -Dversion=0.1.0-SNAPSHOT -Dpackaging=jar
```

add dependency

```xml
<dependency>
    <groupId>io.github.carry7777</groupId>
    <artifactId>server-render-html</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>
```

### Create a page

```java
@Controller
public class IndexPage {

    @RequestMapping("/")
    void index(HttpServletResponse response) {
        HtmlPage htmlPage = new HtmlPage();
        htmlPage.reader(response);
    }
}
```

### Custom component

```java
import io.github.carry7777.server.render.html.dom.element.Button;

public class PrimaryButton extends Button {
    PrimaryButton() {
        addCssClass("btn");
        addCssClass("btn-primary");
    }
}
```

### With Vue.js

```java
import io.github.carry7777.server.render.html.dom.element.Button;

public class ElButton extends Button {
    @Override
    public String getTagName() {
        return "el-button";
    }
}
```

### Pre Handle

can edit tag

```java
import io.github.carry7777.server.render.html.dom.element.Button;

public class ElButton extends Button {
    @Override
    public String getTagName() {
        return "el-button";
    }

    @Override
    public void preHandle(StringBuilder sb) {
        sb.append(" type=\"").append("primary").append("\"");
    }
}
```

this will be render like

```html
<el-button type="primary"></el-button>
```


