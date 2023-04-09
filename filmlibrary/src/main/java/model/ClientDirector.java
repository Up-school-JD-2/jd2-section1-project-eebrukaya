package model;

import java.util.ArrayList;

public class ClientDirector {

    private ArrayList<Client> clients;

    public ClientDirector() {
        clients = new ArrayList<>();
    }

    public void createAccount(Client client) {
        clients.add(client);
        System.out.println("Created account: " + client.getName());
    }

    public void removeAccount(int clientId) {
        Client client = searchClient(clientId);
        if (client != null) {
            clients.remove(client);
            System.out.println("removed account : " + client.getName());
        } else {
            System.out.println("not found client.");
        }
    }

    public void searchAccount(String clientName) {
        boolean found = false;
        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(clientName)) {
                System.out.println("ID: " + client.getId());
                System.out.println("Name: " + client.getName());
                System.out.println("E-mail: " + client.getEmail());
                System.out.println("---------------------");
                found = true;
            }
        }
        if (!found) System.out.println("not found client");

    }

    private Client searchClient(int clientId) {
        for (Client client : clients) {
            if (client.getId() == clientId) {
                return client;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ClientDirector{" +
                "clients=" + clients +
                '}';
    }
}
