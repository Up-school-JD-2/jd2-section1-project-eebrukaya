package model;

public class Client {
    private int id;
    private String name;
    private String password;
    private String email;

    public Client(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nEmail: " + email;
    }
}
