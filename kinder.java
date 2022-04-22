package Huevo;

import java.util.Scanner;

public class kinder {
    public static void main(String[] args){
        def();
    }
    public static void def(){
        int piezas;
        String color,size;

        Descripcion sorpresa = new Descripcion();
        Scanner dato=new Scanner(System.in);
        String titulo = "Programa para revisar caracteristicas de un Huevito kinder";
        titulo += "\nA continuacion introduce los datos que se te pide";
        titulo += "\n Color de etiqueta:";
        System.out.println(titulo);
        color=dato.next();
        sorpresa.setColor(color);
        System.out.println("Numero de piezas:");
        piezas=dato.nextInt();
        sorpresa.setPiezas(piezas);
        System.out.println("Tamaño del huevo:");
        size=dato.next();
        sorpresa.setSize(size);

        String msg = "Huevo kinder te toco con estas caracteristicas: ";
        msg += "\nEl tipo de juguete es:"+ sorpresa.getType();
        msg += "\nEl tipo de huevo es: "+ sorpresa.getColor();
        msg += "\nNumero de piezas:" + sorpresa.getPiezas();
        msg += "\nTamaño: " + sorpresa.getSize();

        System.out.print(msg);


    }

    }
