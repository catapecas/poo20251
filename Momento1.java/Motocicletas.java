public class Motocicletas {

    private string placa;
    private double cilindraje;
    private string marca;
    private int tiempo;

    //conductor de la clase

    public Motocicletas ( String placa, double cilindraje,string marca,
    int tiempo){

        this.placa = placa;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.tiempo = tiempo;
    
    }

    public String getPlaca(){
         return placa;

    }

    public double getCilindraje(){

    }
    public String getMarca (){
        return marca;

    }

    public int getTiempo(){
        return tiempo;
    }
    public String setPlaca(){
        return placa;
    }
    public double setCilindraje(){
        return cilindraje;

    }
    public String setMarca(){
        return marca;

    }
    public int setTiempo(){
        return tiempo;
    }

}