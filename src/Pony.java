public class Pony {
    private String name;
    private  int age;


    public Pony(String ponyName,int ponyAge){
        name = ponyName;
        age = ponyAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

