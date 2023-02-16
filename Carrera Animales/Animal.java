public class Animal extends Thread {
    /*Si utilizo un calse padre extendere esa calse a la padre y asi podre utilizarla en las hijas */
    private String nombre;
    private int numpasos;
     
    public Animal(){
       this.setNombre(nombre);
       this.numpasos = this.setNumPasos();
    }
     
    public void setNombre(String nombre){
           this.nombre =  nombre;
    }

    public String getNombre(){
          return this.nombre;
    } 
    public int setNumPasos(){
        int pasos;
         pasos =  (int)Math.random()*10;
        return pasos;
    }


    public void  correr(){
         
    }


}
