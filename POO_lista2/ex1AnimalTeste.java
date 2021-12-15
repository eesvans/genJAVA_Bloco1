package POO_lista2;

public class ex1AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1Cachorro cachorro1  = new ex1Cachorro("Floquinho","Au au!",61,true);
		ex1Cavalo cavalo1= new ex1Cavalo("Bala no Alvo","IHIHIHIHHIHI!!",22,true);
		ex1Preguica preguica1= new ex1Preguica("Soneca","zZzZzZz",50,true);
		
		cachorro1.imprimirInfo();
		cachorro1.imprimirMovimento();
		
		cavalo1.imprimirInfo();
		cavalo1.imprimirMovimento();
		
		preguica1.imprimirInfo();
		preguica1.imprimirMovimento();
	}

}
