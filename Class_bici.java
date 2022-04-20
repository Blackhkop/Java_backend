package bicicleta;

public class bici {
    public int pins, rodada, velocidad;
    public String color, type;
    public char simb1 = 10;

    public int getVelocidad () {  return velocidad;  }
    public String getColor () {  return  color;  }
    public String getType () {  return  type;  }
    public int getRodada () {  return rodada;  }
    public int getPins () {  return pins;  }

    public boolean setPins (int pins)
    {
        if (pins > 0) {
            this.pins = pins;
            return true;
        } else
            return false;
    }
    public boolean setRodada (int rodada)
    {
        if (rodada > 0) {
            this.rodada = rodada;
            return true;
        } else
            return false;
    }
    public boolean setVelocidad (int velocidad)
    {
        if (velocidad > 2) {
            this.velocidad = velocidad*3;
            this.type = "Profecional";
            return true;
        } else
            this.velocidad = velocidad+15;
            this.type="Casual";
            return false;

    }
    public boolean setColor (String color)
    {
        if (!color.isEmpty()) {
            this.color = color;
            return true;
        } else
            return false;
    }

    public String printState (){
        return "pins: "+pins+simb1+
                "rodada: "+rodada+simb1+
                "color: "+color+simb1+
                "velocidad: "+velocidad;
    }
}
