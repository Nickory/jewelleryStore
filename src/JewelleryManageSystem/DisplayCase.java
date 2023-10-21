public class DisplayCase {
    String identifier;
    String type;
    boolean isLighted;

    List<DisplayTray> trays=new List<>();

    public String getIdentifier() {
        return identifier;
    }


    public void setIdentifier(String identifier,JewelleryStore store) {
//if (store.isCaseIdentifierRepeated()==)
        this.identifier = identifier;
    }




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLighted() {
        return isLighted;
    }

    public void setLighted(boolean lighted) {
        isLighted = lighted;
    }

    public List<DisplayTray> getTrays() {
        return trays;
    }

    public void setTrays(List<DisplayTray> trays) {
        this.trays = trays;
    }



   public DisplayCase(String identifier, String type, boolean isLighted) {
        this.identifier = identifier;
        this.type = type;
        this.isLighted = isLighted;
        this.trays = new List<>();
    }

    public DisplayCase() {
    }

    void addTray(DisplayTray tray) {
        trays.addLast(tray);
    }

    void addNewTray(){
        DisplayTray tray=new DisplayTray();
        trays.addLast(tray);
    }

    //获取case中所有价格总和
    double getCasePrice() {

        double temp = 0;
        for (int i = 0; i < trays.size(); i++) {
            temp = trays.getDataByIndex(i).getTrayPrice() + temp;
        }
        return temp;
    }

    //返回一个case中所含item最少得tray
    private DisplayTray leastItemTray() {
        if (trays.size() == 0) {
            return null;
        }

        DisplayTray tempTray = trays.getDataByIndex(0);
        int temp = trays.getDataByIndex(0).getItems().size();

        for (int i = 1; i < trays.size(); i++) {
            int Size = trays.getDataByIndex(i).getItems().size();
            if (Size < temp) {
                temp = Size;
                tempTray = trays.getDataByIndex(i);
            }
        }
        return tempTray;
    }
}
