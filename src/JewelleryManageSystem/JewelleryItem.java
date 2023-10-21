

public class JewelleryItem {
    String description;
    String type;
    String gender;
    String imageUrl;
    double retailPrice;

    List<MaterialComponent> components;

    public JewelleryItem() {
    }

    JewelleryItem(String description, String type, String gender, String imageUrl, double retailPrice) {
        this.description = description;
        this.type = type;
        this.gender = gender;
        this.imageUrl = imageUrl;
        this.retailPrice = retailPrice;
        this.components = new List<MaterialComponent>();
    }

    void addComponent(MaterialComponent component) {
        components.addLast(component);
    }

    //传入一个新的珠宝物品，计算它与当前珠宝描述的匹配度
    private double computeSimilarity(JewelleryItem anotherItem) {
        String[] words1 = description.split("\\s");
        String[] words2 = anotherItem.getDescription().split("\\s");

        // 计算共同词汇数量


        int commonWords = CommonWords(words1, words2);

        // 计算总词汇数量
        int totalWords = words1.length + words2.length;

        // 计算相似度
        double similarity = (double) commonWords / totalWords;

        return similarity;
    }

    private static int CommonWords(String[] words1, String[] words2) {
        int i = 0;
        // 使用嵌套循环检查共同词汇
        for (String word1 : words1) {
            for (String word2 : words2) {
                if (word1.equals(word2)) {
                    i++;
                    break; // 一旦找到共同词汇，就不需要再继续检查该单词
                }
            }
        }
        return i;
    }

    public double abs(double number) {
        if (number > 0) {
            return number;
        } else return -number;
    }

    private double computeTypeSimilarity(JewelleryItem item){
        if (item.getType()==type) {
            return 1;
        }
        else return 0;
    }

    private double computeGenderSimilarity(JewelleryItem item){
        if (item.getGender()==gender) {
            return 1;
        }
        else return 0;
    }

    //传入一个item将其参数与当前item数值生成目标函数值
    public double object(JewelleryItem anotherItem) {
        double w1=0.5;
        double w2=0.5;
        double w3=0.5;
        double w4=0.5;
        double w5;

        double descriptionSimilarity = computeSimilarity(anotherItem);
        double priceSimilarity=(abs(anotherItem.getRetailPrice()-retailPrice))/retailPrice;
        double typeSimilarity=computeTypeSimilarity(anotherItem);
        double genderSimilarity=computeGenderSimilarity(anotherItem);

        return w1*descriptionSimilarity+w2*priceSimilarity;

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public List<MaterialComponent> getComponents() {
        return components;
    }

    public void setComponents(List<MaterialComponent> components) {
        this.components = components;
    }
}