
public class pruebas {

    static int pepe;

    private int atributo1; //creamos el atributo

    pruebas (int pepe) {

                  this.pepe= pepe;

            }

     public static int getAtrib1() {

                    return pepe;

       }

    public static void main (String[ ] Args) {


        System.out.println ("Pepe es igual a " + pruebas.getAtrib1()); //eliminación del this.

    } //Cierre del main

}