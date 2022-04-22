package Huevo;

import java.util.Objects;

public class Descripcion {
    public String color, size, type;
    public int piezas;

    public String getColor () {  return  color;  }
    public String getSize () {  return size;  }
    public int getPiezas ()  { return piezas;  }
    public String getType ()  { return type;  }


    public boolean setSize (String size)
        {
        if (Objects.equals(size,"grande") || Objects.equals(size,"Grande")) {
            this.size = "Suertudo te quieren en tu casa";
            return true;
        } else
            this.size = "Recuerda que tambiaen hay huevos mas grandes";
            return false;
    }

    public boolean setPiezas (int piezas)
    {
        if (piezas > 1) {
            this.piezas = piezas;
            this.type = "Armable";
            return true;
        } else
            this.piezas = piezas;
            this.type = "sencillo";
            return false;
    }


    public boolean setColor (String color)
    {
        if (Objects.equals(color, "azul") || Objects.equals(color,"Azul"))
        {
            this.color = "Para Niño";
            return true;
        } else
            this.color = "Para Niña";
            return false;
    }

}
