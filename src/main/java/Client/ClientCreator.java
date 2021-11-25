package Client;

public class ClientCreator {
    Client[] clients;
    int ID;
    public ClientCreator(int n){
        clients = new Client[n];
        ID=0;
    }
    public void CreateClient(String name, int age, Gender sex){
        clients[ID]=new Client();
        clients[ID].create(name,age,sex);
    }
}
