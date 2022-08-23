package schema;

public class Simpledto {
    public boolean uniqueItems;
    public boolean additionalItems;
    public String type;
    public Itemsdto items;

    public Simpledto (){}

    public Simpledto(boolean uniqueItems, boolean additionalItems, String type, Itemsdto items) {
        this.uniqueItems = uniqueItems;
        this.additionalItems = additionalItems;
        this.type = type;
        this.items = items;
    }

    public boolean isUniqueItems() {
        return uniqueItems;
    }

    public void setUniqueItems(boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

    public boolean isAdditionalItems() {
        return additionalItems;
    }

    public void setAdditionalItems(boolean additionalItems) {
        this.additionalItems = additionalItems;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Itemsdto getItems() {
        return items;
    }

    public void setItems(Itemsdto items) {
        this.items = items;
    }
}
