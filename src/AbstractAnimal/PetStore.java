package AbstractAnimal;

public class PetStore {

    public static void main(String[] args) {

        Cat garfield = new Cat("Garfield", "Gris",6);
        Cat felix = new Cat("Felix", "Blanco", 4);
        Dog firulais = new Dog("Firulais", "Negro", 8);
        Rooster claudio = new Rooster("Claudio", "Cafe con negro", 2);

        System.out.println(" Ejemplo de polimorfismo usando clase abastracta\n");

        System.out.println("Invocando al metodo toString: \n");
        System.out.println(garfield.toString());
        System.out.println(felix.toString());
        System.out.println(firulais.toString());
        System.out.println(claudio.toString());
    }
}
