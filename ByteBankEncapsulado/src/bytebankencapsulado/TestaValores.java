package bytebankencapsulado;

public class TestaValores {

        	
  private String palavra = "String do Objeto";
  
  public void testando(String palavra){
   System.out.println(palavra);
   System.out.println(this.palavra);
  }

  public static void main(String[] args){
   new TestaValores().testando("String local do metodo");
  }
 }
  
    
}
