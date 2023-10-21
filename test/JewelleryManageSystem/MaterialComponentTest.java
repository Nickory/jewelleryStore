package JewelleryManageSystem;

import org.junit.Assert;
import org.junit.Test;
import JewelleryManageSystem.*;
import static org.junit.Assert.*;

public class MaterialComponentTest {
    MaterialComponent materialComponent = new MaterialComponent("platinum","PT999",2.0,12.0);

    @Test
    public void getName() {
        materialComponent.getName();
    }

    @Test
    public void setName() {
        materialComponent.setName("gold");
        Assert.assertEquals("set wrong","gold",materialComponent.name);
    }

    @Test
    public void getDescription() {
        materialComponent.getDescription();
    }

    @Test
    public void setDescription() {
        materialComponent.setDescription("24K");
        Assert.assertEquals("set wrong","24K",materialComponent.description);
    }

    @Test
    public void getQuantity() {
        materialComponent.getQuantity();
    }

    @Test
    public void setQuantity() {
        materialComponent.setQuantity(2.0);
        Assert.assertTrue("set wrong",materialComponent.quantity == 2.0);
    }

    @Test
    public void getQuality() {
        materialComponent.getQuality();
    }

    @Test
    public void setQuality() {
        materialComponent.setQuality(12.0);
        Assert.assertTrue("set wrong",materialComponent.quality == 12.0);
    }
}