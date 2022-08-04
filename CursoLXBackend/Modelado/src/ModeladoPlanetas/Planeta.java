package ModeladoPlanetas;

public class Planeta {
    public void Planeta(){ //Contructor por omision

    }
    public String nombre;
    public String tipo;
    public double masa;
    public int orbita;

    //Metodos

    public String getnombre() { return nombre;}
    public String getTipo() {return tipo;}
    public double getMasa() {return masa;}
    public int getOrbita() {return orbita;}

    public boolean setnombre (String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean settipo (String tipo){
        if(!tipo.isEmpty()){
            this.tipo = tipo;
            return true;
        }else
            return false;
    }
    //
    public boolean setmasa (double masa){ //El valor (int masa) se utiliza aqui, por que es el valor que nos vamos a traer al set
        if (masa>0){
            this.masa =masa; //El valor que ingreso el usuario por teclado estara en =masa. Entonces el valor de (int masa) es el mismo que (= masa)
            return true;
        }else
            return false;
    }

    public boolean setorbita (int orbita){ // Firma o signatura del metodo
        if (orbita>0){
            this.orbita = orbita;
            return true;
        }else
            return false;
    }
    //metodo de control para saber el estado en el que se encuentra
    public String printState(){
        return "nombre: "+nombre+"\n"+
                "tipo: "+tipo+"\n"+
                "masa: "+masa+"\n"+
                "orbita: "+orbita+"\n";
    }
}

