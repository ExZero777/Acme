package acme;

public abstract class Bebidas {
    protected String[] tip;
    protected int[] azu ;
    protected int[] lech;
    protected int con,men;
    protected float[] subT;
 
    
    abstract void tipo();
    abstract void azucar();
    abstract void leche();
    
  

    public String[] getTip() {
        return tip;
    }

    public void setTip(String[] tip) {
        this.tip = tip;
    }

    public int[] getAzu() {
        return azu;
    }

    public void setAzu(int[] azu) {
        this.azu = azu;
    }

    public int[] getLech() {
        return lech;
    }

    public void setLech(int[] lech) {
        this.lech = lech;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getMen() {
        return men;
    }

    public void setMen(int men) {
        this.men = men;
    }

    public float[] getSubT() {
        return subT;
    }

    public void setSubT(float[] subT) {
        this.subT = subT;
    }

      Bebidas(String[] tiposs, int[] azucar, int[] leche, int cont, float[] subTotal,int menu) {
        this.tip=tiposs;
        this.azu=azucar;
        this.lech=leche;
        this.con=cont;   
        this.subT=subTotal;
        this.men=menu;
    }
    

   
}
