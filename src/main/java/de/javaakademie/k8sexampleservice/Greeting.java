package de.javaakademie.k8sexampleservice;

public class Greeting {

    private Long id;
    private String content;
    private String env;

    public Greeting(Long id, String content, String env) {
        this.id = id;
        this.content = content;
        this.env = env;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
