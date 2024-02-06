package POO.LH1;

public class Automovil { //Falta class y Automovil debe tener la A en mayuscula

    String marca;
    String color;
    double kilometros;

    public Automovil() {

    }

    public Automovil(String marca, String color, double kilometros) { //Faltan los tipos de datos de los parametros
        this.marca = marca;
        this.color = color;
        this.kilometros = kilometros;
    }

    public String mostrarMarcaYColor() {
        String marcaYColor = "La marca del auto es: " + this.marca + ". El color del auto es: " + this.color;
        return marcaYColor; //Falta el return
    }

    public static void switchMethod(){
        String a = "A";

        switch (a){
            case "A" -> {
                System.out.println("A");
            }
            case "B" -> {
                System.out.println("B");
            }
            default -> {
                System.out.println("Default");
            }
        }
    }
}