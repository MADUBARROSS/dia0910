package atividade0910;

public class CasaConstrutor {

	public static void main(String[] args) {

		Casa casal = new Casa ("Casa do Bytemaster", 10, 20, "Telhado triângular,", 2) ;

		System.out.println (casal.getNome ()) ;
		System. out.println (casal.getAltura ()) ;
		System. out.println (casal.getLargura()) ;
		System. out.println (casal.getTelhado ()) ;
		System. out.println (casal. getNumeroJanelas () ) ;
	}

}
