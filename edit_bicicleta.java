package bicicleta;
import java.util.Scanner;

public class mount_bici {
    public static void main(String[] args)
    {
        def();
    }

    public static void def()
    {
        int pins,rodada,velocidad;
        String color;
        bici biciMountain = new bici();
        Scanner dato=new Scanner(System.in);
        String titulo = "Programa para revisar caracteristicas de una bicicleta";
        titulo += "\nA continuacion introduce los datos que se te pide";
        titulo += "\n Color de bicicleta:";
        System.out.println(titulo);
        color=dato.next();
        biciMountain.setColor(color);
        System.out.println("Numero de pines:");
        pins=dato.nextInt();
        biciMountain.setPins(pins);
        System.out.println("Numero de rodada:");
        rodada=dato.nextInt();
        biciMountain.setRodada(rodada);
        System.out.println("Numero de velocidades:");
        velocidad=dato.nextInt();
        biciMountain.setVelocidad(velocidad);

        String msg = "Soy una bici de montaña con estas caracteristicas: ";
        msg += "\nEl tipo de bicicleta es:"+ biciMountain.getType();
        msg += "\nColor: "+ biciMountain.getColor();
        msg += "\nVelocidad maxima:" + biciMountain.getVelocidad();
        msg += "\nRodada: "+ biciMountain.getRodada();
        msg += "\nPins:  "+ biciMountain.getPins();

        System.out.print(msg);
    }
}
