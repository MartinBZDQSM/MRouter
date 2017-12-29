package szkingdom.kds.comon;

/**
 * author:hy 2017/12/29.
 * email: yuan.hu@inin88.com
 */
public class Data {


    String title;

    String description;

    String content;

    public Data(String title, String description, String content) {
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
