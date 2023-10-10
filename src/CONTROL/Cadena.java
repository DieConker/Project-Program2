
package CONTROL;


public class Cadena {
    private String cad;

    public Cadena(String cad) {
        this.cad = cad;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    @Override
    public String toString() {
        return "Cadena{" + "cad=" + cad + "}\n";
    }
    
    public int longitud(){
        return cad.length();
    }
    
    public String invertir(){
        String r=null;
        StringBuilder sB = new StringBuilder(cad);
        r=sB.reverse().toString();
        
        return r;
    }
    
    public boolean esPalindromo(){
        boolean r=false;
        String inv=invertir();
       if(cad.compareTo(inv)==0)
           r=true;
        return r;
    }
    
    public String convertirMayus(){
        return cad.toUpperCase();
    }
    
    public String convertirMinus(){
        return cad.toLowerCase();
    }
        
    public boolean esMinuscula(String s) {
    return s.equals(s.toLowerCase());
    }
    
    public boolean esMayuscula(String s) {
    return s.equals(s.toUpperCase());
    }
    
    
    
    public static void main (String[] args){
        Cadena x= new Cadena("anitalavalatina");
        String y="SDAJDS ";
        System.out.println(x.longitud());
        System.out.println(x.invertir());
        if(x.esPalindromo())
            System.out.println("Si es");
        else
            System.out.println("No es");
        System.out.println(x.esPalindromo());
        System.out.println(x.esMinuscula(y));
    }
    
}
