public class Animal {

    private String raza;
    private String name;
    private String sex;

    public Animal(String raza, String name, String sex) {
        this.raza = raza;
        this.name = name;
        this.sex = sex;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
