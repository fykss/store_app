package entity;

public class Cart {
    private int id;
    private int user_id;
    private int commodity_id;
    private int quantity;

    public Cart(int user_id, int commodity_id, int quantity) {
        this(-1, user_id, commodity_id, quantity);
    }

    public Cart(int id, int user_id, int commodity_id, int quantity) {
        this.id = id;
        this.user_id = user_id;
        this.commodity_id = commodity_id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(int commodity_id) {
        this.commodity_id = commodity_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
