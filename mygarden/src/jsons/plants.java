package jsons;

public class plants{

    private String name;
    private int vida;
    private Object maximos;
    private int agua;
    private int sol;
    private int abono;
    private int vidaDias;


    public plants(String name, int vida, Object maximos) {
        this.name = name;
        this.vida = vida;
        this.maximos = maximos;
    }

    public plants(String name, int vida, int agua, int sol, int abono, int vidaDias) {
        this.name = name;
        this.vida = vida;
        this.agua = agua;
        this.sol = sol;
        this.abono = abono;
        this.vidaDias = vidaDias;
        
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return Object return the maximos
     */
    public Object getMaximos() {
        return maximos;
    }

    /**
     * @param maximos the maximos to set
     */
    public void setMaximos(Object maximos) {
        this.maximos = maximos;
    }
    
    /**
     * @return int return the agua
     */
    public int getAgua() {
        return agua;
    }

    /**
     * @param agua the agua to set
     */
    public void setAgua(int agua) {
        this.agua = agua;
    }

    /**
     * @return int return the sol
     */
    public int getSol() {
        return sol;
    }

    /**
     * @param sol the sol to set
     */
    public void setSol(int sol) {
        this.sol = sol;
    }

    /**
     * @return int return the abono
     */
    public int getAbono() {
        return abono;
    }

    /**
     * @param abono the abono to set
     */
    public void setAbono(int abono) {
        this.abono = abono;
    }

    /**
     * @return int return the vidaDias
     */
    public int getVidaDias() {
        return vidaDias;
    }

    /**
     * @param vidaDias the vidaDias to set
     */
    public void setVidaDias(int vidaDias) {
        this.vidaDias = vidaDias;
    }

    @Override
    public String toString (){
        return "nombre: " + name + " vida: " + vida + " agua: " + agua + " sol: " + sol + " abono: " + abono + " vidaDias: " + vidaDias;
    }

}