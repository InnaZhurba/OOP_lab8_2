package Client;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class Client {
    @Template(key = "%AGE%")
    private int ID;
    private String name;
    private int age;
    private Gender sex;
    private String email;

    private static int counter =0;
    public Client(){
        counter++;
        setID(counter);
    }

    //public Client.Client(){id = ClientGenerator.generateID();LinkedList<Integer> arr = new LinkedList

    public void create(String name, int age, Gender gender){
        //setID(ID);
        setName(name);
        setAge(age);
        setSex(gender);
    }
}


    /*public static class ClientIDGenerator{
        private static int counter =0;
        public static int generate(){
            counter++;
            return counter;
        }
    }*/
