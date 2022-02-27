package buy.domain;

public class BuyDTO {
    public final static BuyDTO buyDTO = new BuyDTO();
    private BuyDTO(){}
    public static BuyDTO getInstance(){return buyDTO;}

    private int num;
    private String memId;
    private String prodName;
    private String groupName;
    private int price;
    private int amount;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMemId() {
        return memId;
    }

    public void setMem_id(String memId) {
        this.memId = memId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProd_name(String prodName) {
        this.prodName = prodName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroup_name(String group_name) {
        this.groupName = groupName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
