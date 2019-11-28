package acme;

public class Cafe extends Bebidas{ 
       
    
    Cafe(String[] tipos, int[] azucar, int[] leche, int cont, float[] subTotal,int menu,int[] opcion) {
       super(tipos,azucar,leche,cont,subTotal,menu,opcion);
    }

   
   @Override
    protected void tipo(){
        super.tipo();
    }

    @Override
    protected void azucar(){   
        super.azucar();
    }  

    @Override
    protected void leche() {
        super.leche();
    } 
}
