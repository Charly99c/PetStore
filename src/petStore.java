public class petStore {
    public static void main(String[] args) {

        Bird bird1 = new Bird("Australiano", "Miguel", "M");
        Snake snake1 = new Snake("Coralillo", "Raul", "M");

        System.out.println("El nombre del Bird1 = " + bird1.getName() + ",especie: " + bird1.getRaza());
        System.out.println("El nombre del Snake1 = " + snake1.getName() + ",especie " + snake1.getRaza());
        //Bird
        bird1.setLegs("2 patas");
        bird1.setTypeOfMouth("Corto y lengua corta");
        bird1.setNoseColor("Rosa");
        //Snake
        snake1.setScaleColor("Rojo,Blanco y Negro");
        snake1.setScrollType("Se arrastra");
        snake1.setTypeOfPoison("Es neurotoxico");

        //Probando la sobrecarga de un metodo
        System.out.println("\nMetodo toString() de Bird : " + bird1.toString());
        System.out.println("\nMetodo toString() de Snake : " + snake1.toString());
    }
}
