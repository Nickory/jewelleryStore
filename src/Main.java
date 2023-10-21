package JewelleryManageSystem;

public class Main {

    public static void main(String[] args) {

        JewelleryStore store = new JewelleryStore();
        store.addDisplayCase();
        System.out.println(store.getCases().size());
        List<Integer> list = new List<>();

        for (int i = 0; i < 1000; i++) {
            list.addLast(i);
        }

        System.out.println(list.size());
        System.out.println(list.last());


        JewelleryItem item1 = new JewelleryItem("shuodedaoli1", "watch", "female", "www.genshin.com", 1566.2);
        store.smartAdd(item1);

        System.out.println(store.getCases().getIndexByData(store.getCaseItemIn(item1)));

        new JewelleryStoreFrame().init();
    }
}