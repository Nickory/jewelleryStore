package JewelleryManageSystem;

import org.junit.Assert;
import org.junit.Test;
import JewelleryManageSystem.*;
import static org.junit.Assert.*;

public class JewelleryStoreTest {
    JewelleryStore jewelleryStore = new JewelleryStore();
    DisplayCase displayCase = new DisplayCase("A12","golden",false);
    DisplayTray displayTray = new DisplayTray("A12","green",20.0,12.0);
    JewelleryItem jewelleryItem = new JewelleryItem("black Targerine","plastic","man","",100000.0);
    MaterialComponent materialComponent = new MaterialComponent("golden","24K",12.0,2.0);
    List<DisplayCase> cases;

    @Test
    public void addDisplayCase() {
        jewelleryStore.addDisplayCaseWithInformation("A12","golden",false);
        Assert.assertTrue("add wrong",jewelleryStore.getCases().getDataByIndex(0).type.equals("golden"));
    }

    @Test
    public void addDisplayTrayToCase() {
        jewelleryStore.addDisplayTrayToCase(displayTray,displayCase);
        Assert.assertTrue("add wrong",displayCase.getTrays().getDataByIndex(0).sizeWidth == 20.0);

    }

    @Test
    public void addItemToTray() {
        jewelleryStore.addItemToTray(jewelleryItem,displayTray);
        double a = displayTray.getItems().getDataByIndex(0).retailPrice;
        Assert.assertTrue("add wrong", a == 100000.0);
    }

    @Test
    public void addMaterialToItem() {
        jewelleryStore.addMaterialToItem(materialComponent,jewelleryItem);
        Assert.assertTrue("add wrong",jewelleryItem.getComponents().getDataByIndex(0).description.equals("24K"));
    }

    @Test
    public void getStorePrice() {
        double a =jewelleryStore.getStorePrice();
    }

    @Test
    public void getCaseTrayIn() {
        jewelleryStore.getCaseTrayIn(displayTray);
    }

    @Test
    public void getTrayItemIn() {
        jewelleryStore.getTrayItemIn(jewelleryItem);
    }

    @Test
    public void getCaseItemIn() {
        jewelleryStore.getCaseItemIn(jewelleryItem);
    }



    @Test
    public void leastTrayCase() {
        jewelleryStore.addDisplayCaseWithInformation("A12","golden",false);
        DisplayCase number = jewelleryStore.leastTrayCase();
        Assert.assertEquals("get wrong","A12",number.identifier);
    }

    @Test
    public void smartAdd() {
        jewelleryStore.smartAdd(jewelleryItem);
        Assert.assertEquals("add wrong","man",jewelleryStore.getCases().getDataByIndex(0).trays.getDataByIndex(0).getItems().getDataByIndex(0).gender);
    }
}