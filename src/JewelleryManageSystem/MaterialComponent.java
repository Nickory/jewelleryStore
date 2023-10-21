public class MaterialComponent {

    String name;
    String description;
    double quantity;

    double quality;

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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;

    }


    MaterialComponent(String name, String description, double quantity, double quality) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.quality = quality;
    }
}
