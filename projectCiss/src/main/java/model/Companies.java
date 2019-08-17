package model;

public class Companies {

    private String id;
    private String name;
    private String description;
    private String linkCompanie;

    public Companies() {

    }

    public Companies(String id, String name, String description, String linkCompanie) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.linkCompanie = linkCompanie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkCompanie() { return linkCompanie; }

    public void setLinkCompanie(String linkCompanie) { this.linkCompanie = linkCompanie; }
}
