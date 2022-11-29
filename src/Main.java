public class Main {
    public static void main(String[] args) {

        int resultado = Suma(5,5,5);

        System.out.println(resultado);

        System.out.println("-------------------------------------");

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();

        System.out.println(miCoche.puertas);

    }
    public static int Suma (int x, int y, int z) {

        return x + y + z;
    }

    static class Coche{
        int puertas = 4;

        public int aumentarPuertas (){
            puertas = puertas + 1;

            return puertas;
        }

    }

}