package entity;

public class User implements Identifiable{
    private int id;
    private String login;
    private String password;

    public User(String login, String password) {
        this(-1, login, password);
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("User{id=%d, login='%s', password='%s'}", id, login, password);
    }
}
