package JewelleryManageSystem;

import org.junit.Assert;
import org.junit.Test;
import JewelleryManageSystem.*;
import static org.junit.Assert.*;

public class ListTest {
    List<String> list = new List<>();
    @Test
    public void addLast() {
        String s1 = new String("test");
        list.addLast(s1);
        Assert.assertEquals("add wrong","test",list.getDataByIndex(0));
    }

    @Test
    public void addFirst() {
        String s1 = new String("test");
        list.addFirst(s1);
        Assert.assertEquals("add wrong","test",list.getDataByIndex(0));
    }

    @Test
    public void delete() {
        String s1 = new String("Test delete");
        list.addFirst(s1);
        list.delete(s1);
        Assert.assertNull("delete false",list.head);
    }

    @Test
    public void find() {
        String s1 = new String("test find");
        list.addFirst(s1);
        list.find(s1);
    }

    @Test
    public void print() {
        String s1 = new String("test print");
        String s2 = new String("wzh");
        list.addFirst(s1);
        list.addLast(s2);
        list.print();
    }

    @Test
    public void getDataByIndex() {
        String s1 = new String("test get");
        list.addLast(s1);
        String s2 = list.getDataByIndex(0);
        Assert.assertEquals("get wrong",s1,s2);
    }

    @Test
    public void size() {
        String s1 = new String("test size");
        String s2 = new String("test size");
        list.addLast(s1);
        list.addLast(s2);
        Assert.assertEquals("size wrong",2,list.size());
    }

    @Test
    public void last() {
        String s1 = new String("test last1");
        String s2 = new String("test last2");
        list.addLast(s1);
        list.addLast(s2);
        Assert.assertEquals("last wrong","test last2",list.last());
    }

    @Test
    public void clear() {
        String s1 = new String("test clear");
        list.addLast(s1);
        list.clear();
        Assert.assertNull("clear wrong",list.head);
    }

    @Test
    public void getIndexByData() {
        String s1 = new String("test get1");
        String s2 = new String("test get2");
        list.addLast(s1);
        list.addLast(s2);
        Assert.assertEquals("get wrong",1,list.getIndexByData(s2));
    }
}