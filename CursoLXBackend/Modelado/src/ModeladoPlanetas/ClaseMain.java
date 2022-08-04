package ModeladoPlanetas;

public class ClaseMain {
    public static void main(String[] args) {
    def();
    }
    //Aqui se pueden crear diferentes planetas con diferentes caracteristicas por que ya lo modelamos en planeta
    public static void def(){ //estab show colocamos def
        Planeta Mercurio = new Planeta(); //Utilizando el contructor por omision
        Mercurio.setnombre("Mercurio");
        Mercurio.settipo("Rocoso");
        Mercurio.setmasa(Double.parseDouble("3.0"));
        Mercurio.setorbita(Integer.parseInt("88"));
        String msg = "Planeta con las siguientes caracteristicas: ";
        msg += "\nNombre: "+Mercurio.getnombre();
        msg += "\nTipo: "+Mercurio.getTipo();
        msg += "\nMasa: "+Mercurio.getMasa();
        msg += "\nOrbita: "+Mercurio.getOrbita();

        System.out.println(msg);

    }



}
