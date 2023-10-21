package JewelleryManageSystem;

import org.junit.Assert;
import org.junit.Test;
import JewelleryManageSystem.*;
import static org.junit.Assert.*;

public class DisplayCaseTest {
    JewelleryStore jewelleryStore = new JewelleryStore();
    DisplayCase displayCase= new DisplayCase();
    DisplayTray displayTray = new DisplayTray();
    List<DisplayTray> trays;


    @Test
    public void getIdentifier() {
        displayCase.getIdentifier();
    }

    @Test
    public void setIdentifier() {
        displayCase.setIdentifier("A12",jewelleryStore);
        Assert.assertEquals("set wrong","A12", displayCase.getIdentifier());
    }

    @Test
    public void getType() {String a = displayCase.getType();}

    @Test
    public void setType() {
        displayCase.setType("golden");
        Assert.assertEquals("set wrong","golden",displayCase.getType());
    }

    @Test
    public void isLighted() {displayCase.isLighted();
    }

    @Test
    public void setLighted() {displayCase.setLighted(true);
        Assert.assertEquals("set wrong",true, displayCase.isLighted());
    }

    @Test
    public void getTrays() {displayCase.getTrays();
    }

    @Test
    public void setTrays() {displayCase.setTrays(trays);}

    @Test
    public void addTray() {
        displayTray.setColor("green");
        displayCase.addTray(displayTray);
        Assert.assertEquals("add wrong","green", displayCase.getTrays().getDataByIndex(0).color);
    }

    @Test
    public void addNewTray() {
        displayCase.addNewTray();
    }

    @Test
    public void getCasePrice() {
        JewelleryItem jewelleryItem1 = new JewelleryItem("","","","",1000.0);
        JewelleryItem jewelleryItem2 = new JewelleryItem("","","","",2000.0);
        JewelleryItem jewelleryItem3 = new JewelleryItem("","","","",2000.0);
        displayTray.addItem(jewelleryItem1);
        displayTray.addItem(jewelleryItem2);
        displayTray.addItem(jewelleryItem3);
        displayCase.addTray(displayTray);
        double price = displayCase.getCasePrice();
        Assert.assertTrue("get wrong",price == 5000.0);

    }
}