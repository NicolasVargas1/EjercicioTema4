public class Main {
    public static void main(String[] args) {
        var numeroIf = 0;
        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        }else {
            System.out.println("Es igual a 0");
        }

        System.out.println();

        var numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println();

        do {
            numeroWhile--;
            System.out.println(numeroWhile);
        } while (numeroWhile > 3);

        System.out.println();



        for (int numeroFor = 0 ; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println();

        var season = "Autumn";

        switch (season) {
            case "Spring":
            case "Summer":
            case "Autumn":
            case "Winter":
                System.out.println("is " + season);
                break;
            default :
                System.out.println("No es una estacion");

        }

    }

}