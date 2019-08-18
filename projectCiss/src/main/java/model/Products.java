package model;

public class Products {

    private String id;
    private String idActivity;
    private String name;
    private String linkPhoto;
    private String price;

    public Products() {

    }

    public Products(String id, String idActivity, String name, String linkPhoto, String price) {
        this.id = id;
        this.idActivity = idActivity;
        this.name = name;
        this.linkPhoto = linkPhoto;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(String idActivity) {
        this.idActivity = idActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkPhoto() {
        return linkPhoto;
    }

    public void setLinkPhoto(String linkPhoto) {
        this.linkPhoto = linkPhoto;
    }

    public String getPrice() { return price; }

    public void setPrice(String price) { this.price = price; }
}
