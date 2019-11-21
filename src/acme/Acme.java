package acme;

import java.util.Scanner;

public class Acme {
    
    public static void main(String[] args) {
        char n ='s';
        int cont =0; 
        String [] tipos = new String[5];
        int [] azucar = new int[5];
        int [] leche = new int[5];
        float [] subTotal =new float[5];
        int menu=0;
        Scanner sc = new Scanner(System.in);
       
        while((n=='s') || (n=='S')){     
            switch(ingreso(menu)){
                case 1:                   
                    Bebidas ca = new Cafe(tipos,azucar,leche,cont,subTotal,menu);
                    ca.tipo();
                    ca.azucar();
                    ca.leche();
                    cont = cont+1;
                break;          
                case 2:
                    Bebidas te = new Te(tipos,azucar,leche,cont,subTotal,menu);
                    te.tipo();
                    te.azucar();
                    te.leche();
                    cont = cont+1;
                break;              
            
                default:
                    System.out.println("O_o...,Eran 2 Opciones 1 O 2,Yo Que Usted Vuelvo A Recursar La Primaria...");
                    System.out.println(" ");
                    System.out.println("Favor De Ingresar 1 Para Un Cafe O 2 Para Un Te. :) ");
                    System.out.println(" ");
                    System.out.println("O Tambien Ingresar 3 Y Dejar A Acme Ser Feliz, Si Me Llamo Asi Y Soy Agente De La AFIP. :D");           
                    System.out.println(" ");
            }
            System.out.println("Desea Seguir Pagando Sabiendo Que No Le Voy A Dar Nada? S/N");
            n  = sc.next().charAt(0);
        }
        totales(tipos, azucar, leche, subTotal);
    }
    
    public static int ingreso(int men){
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvendo A La Maquina Expendedora Que No Expende Nada!!");     
            System.out.println(" ");
            System.out.println("Desea Un Cafè(Ingrese 1) O Un Tè(Ingrese 2)?");
            System.out.println(" ");
            System.out.println("O Tambien Puede Ingresar 3 Y Salir Del Sistema Y Permitirme No Verle Mas Lo Feo De Cara Que Es Y De Paso Seguir Llenandome De Guita Los Bolsillos");
            System.out.println(" ");
            int menu = sc.nextInt();
        return menu;
    }
    
    public static void totales(String[] tipos,int[] azucar,int[] leche,float[] subTotal){
        System.out.println("Aqui Esta El Resultarijillo");
        for(int i=0;i<tipos.length;i++){
            if(subTotal[i]!=0){
                System.out.print("Cafè "+tipos[i]+" Con ");
                System.out.print(azucar[i]+" De Azucar Y ");
                System.out.print(leche[i]+" De Leche: ");
                System.out.print(subTotal[i]+"$ ");
                System.out.println(" ");
                System.out.println("SUBTOTAL: "+subTotal[i]+"$ ");
                float total= subTotal[i]+(subTotal[i]/100*21);
                System.out.println("TOTAL: "+total+"$ ");
            }
        }
        System.out.println("E e e Eso Es Todo Amigos..(Are Bugs Bunny) ");       
    }
        
}
    


