package acme;

import java.util.Scanner;

public abstract class Bebidas {
    protected String[] tip;
    protected int[] azu ;
    protected int[] lech;
    protected int con,men;
    protected float[] subT;
    protected int[] opc;
 
    Scanner sc = new Scanner(System.in);     
    
    protected void tipo(){
        if(men==1){ 
            System.out.println("Desea Cafe Expresso(Opcion 1),Ristretto(Opcion 2),Normal(Opcion 3)"); 
            men=sc.nextInt();
            switch(men){
                case 1: 
                    tip[con]="Expresso";    
                    subT[con]=subT[con]+100;
                break;
                case 2:
                    tip[con]="Ristretto";    
                    subT[con]=subT[con]+110;
                break; 
                case 3:
                    tip[con]="Normal";    
                    subT[con]=subT[con]+90;    
                break;
            } 
           opc[con]=1;
        }
        else{
            System.out.println("Desea Te Negro(Opcion 1),Rojo(Opcion 2),Verde(Opcion 3)"); 
            men=sc.nextInt();
            switch(men){
                case 1:
                    tip[con]="Negro";    
                    subT[con]=subT[con]+70;    
                break;   
                case 2:
                    tip[con]="Rojo";  
                    subT[con]=subT[con]+70;
                break;         
                case 3:
                    tip[con]="Verde";    
                    subT[con]=subT[con]+75;
                break;
            }
            opc[con]=2;
        }
        
    }
    
    protected void azucar(){
        System.out.println("Que Cantidad De Azucar Desea Agregar?(Ingrese Del 1 Al 3)");
        azu[con]=sc.nextInt();
        switch(azu[con]){
            case 1:
                subT[con]=subT[con]+5;
                break;
            case 2:
                subT[con]=subT[con]+10;
                break;
            case 3:
                subT[con]=subT[con]+15;
                break;   
        }
    
    }
    
    protected void leche(){
        
          System.out.println("Que Cantidad De Leche Desea Agregar?(Ingrese Del 1 Al 3)");
        lech[con]=sc.nextInt();
        switch(lech[con]){   
            case 1:
                subT[con]=subT[con]+5;
                break;
            case 2:
                subT[con]=subT[con]+10;
                break;
            case 3:     
                subT[con]=subT[con]+15;
                break;
        } 
        
        
    }

    public int[] getOpc() {
        return opc;
    }

    public void setOpc(int[] opc) {
        this.opc = opc;
    }
    
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

      Bebidas(String[] tipos, int[] azucar, int[] leche, int cont, float[] subTotal,int menu,int[] opcion) {
        this.tip=tipos;
        this.azu=azucar;
        this.lech=leche;
        this.con=cont;   
        this.subT=subTotal;
        this.men=menu;
        this.opc=opcion;
        
    }
    

   
}
