public class Motocicletas {

    private String placa;
    private double cilindraje;
    private String marca;
    private int tiempo;

    //conductor de la clase

    public Motocicletas ( String placa, double cilindraje,String marca,
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
        return cilindraje;

    }
    public String getMarca (){
        return marca;

    }

    public int getTiempo(){
        return tiempo;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setCilindraje(double cilindraje){
       this.cilindraje= cilindraje;

    }
    public void setMarca(String marca){
        this.marca = marca;

    }
    public void setTiempo(int tiempo){
       this.tiempo = tiempo;
    }

    

}