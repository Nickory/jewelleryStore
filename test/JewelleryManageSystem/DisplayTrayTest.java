package JewelleryManageSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import JewelleryManageSystem.*;
import static org.junit.Assert.*;
import JewelleryManageSystem.*;
public class DisplayTrayTest {
    JewelleryItem jewelleryItem = new JewelleryItem("24K","golden","man","",252.0);
    DisplayTray displayTray = new DisplayTray();

    List<JewelleryItem> items=new List<>();
    @Test
    public void getIdentifier() {
        displayTray.getIdentifier();
    }

    @Test
    public void setIdentifier() {
        displayTray.setIdentifier("A12");
        Assert.assertEquals("set wrong","A12", displayTray.getIdentifier());
    }

    @Test
    public void getColor() {
        displayTray.getColor();
    }

    @Test
    public void setColor() {
        displayTray.setColor("black");
        Assert.assertEquals("set wrong","black", displayTray.getColor());
    }

    @Test
    public void getSizeWidth() {
        displayTray.getSizeWidth();
    }

    @Test
    public void setSizeWidth() {
        displayTray.setSizeWidth(10.0);
        Assert.assertTrue("set wrong", displayTray.getSizeWidth() == 10.0);
    }

    @Test
    public void getSizeHeight() {
        displayTray.getSizeHeight();
    }

    @Test
    public void setSizeDepth() {
        displayTray.setSizeHeight(20.0);
        Assert.assertTrue("set wrong",displayTray.sizeHeight == 20.0);
    }

    @Test
    public void getItems() {
        displayTray.getItems();
    }

    @Test
    public void setItems() {
        displayTray.setItems(items);
    }

    @Test
    public void addItem() {
        displayTray.addItem(jewelleryItem);
        Assert.assertEquals("add wrong","man",displayTray.items.getDataByIndex(0));
    }

    @Test
    public void getTrayPrice() {
        JewelleryItem jewelleryItem1 = new JewelleryItem("24K","golden","man","",256.0);
        JewelleryItem jewelleryItem2 = new JewelleryItem("24K","golden","man","",252.0);
        JewelleryItem jewelleryItem3 = new JewelleryItem("24K","golden","man","",251.0);
        displayTray.addItem(jewelleryItem1);
        displayTray.addItem(jewelleryItem2);
        displayTray.addItem(jewelleryItem3);
        double price = displayTray.getTrayPrice();
        Assert.assertTrue("get wrong",price == 759);
    }

    @Test
    public void sumObject() {
        displayTray.sumObject(jewelleryItem);
    }
}