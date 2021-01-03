package hm.app.websocket.model;

public class Greeting {
    private String content; // Hello <<name>>

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
