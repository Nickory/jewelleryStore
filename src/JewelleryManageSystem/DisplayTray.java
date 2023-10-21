
public class DisplayTray {
    String identifier;
    String color;
    double sizeWidth;
    double sizeHeight;

    List<JewelleryItem> items=new List<>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(double sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public double getSizeDepth() {
        return sizeHeight;
    }

    public void setSizeDepth(double sizeDepth) {
        this.sizeHeight = sizeDepth;
    }

    public List<JewelleryItem> getItems() {
        return items;
    }

    public void setItems(List<JewelleryItem> items) {
        this.items = items;
    }

    DisplayTray(String identifier, String color, double sizeWidth, double sizeDepth) {
        this.identifier = identifier;
        this.color = color;
        this.sizeWidth = sizeWidth;
        this.sizeHeight = sizeDepth;
        this.items = new List<JewelleryItem>();
    }

    public DisplayTray() {
    }

    void addItem(JewelleryItem item) {
        items.addLast(item);
    }


    double getTrayPrice() {
        //if (items.size() == 0) {
        //   return 0;
        // } else {
        double temp = 0;
        for (int i = 0; i < items.size(); i++) {
            temp = items.getDataByIndex(i).getRetailPrice() + temp;
            // }
        }
        return temp;
    }


    //传入一个item通过对其本身参数与tray中各item逐个计算生成目标函数总和均值
    public double sumObject(JewelleryItem item) {
        double temp = 0;
        for (int i = 0; i < items.size(); i++) {
            temp = items.getDataByIndex(i).object(item) + temp;
        }
        return temp;
    }
}
