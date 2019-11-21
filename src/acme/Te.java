package acme;

import java.util.Scanner;

public class Te extends Bebidas{ 
    Scanner sc = new Scanner(System.in);  
   
    Te(String[] tipos, int[] azucar, int[] leche, int cont, float[] subTotal,int menu) {
        super(tipos,azucar,leche,cont,subTotal,menu);   
    }

       
  @Override
    public void tipo(){
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
    }

    @Override
    void azucar() {
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

    @Override
    void leche() {
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
    
}
