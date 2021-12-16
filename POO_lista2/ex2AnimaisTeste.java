package POO_lista2;

public class ex2AnimaisTeste {

	public static void main(String[] args) {

		ex2Cachorro cachorro = new ex2Cachorro("Floquinho", 61, true);
		cachorro.setSom("Au au");
		
		ex2Cavalo cavalo = new ex2Cavalo("Bala no Alvo", 21, true);
		cavalo.setSom("IHIHIHIHI");
		
		ex2Preguica preguica = new ex2Preguica("Soneca", 50, true);
		preguica.setSom("zZZzzzzZZz");
	
		/*cachorro.imprimirInfo();
		cachorro.imprimirMovimento();
		
		cavalo.imprimirInfo();
		cavalo.imprimirMovimento();
		
		preguica.imprimirInfo();
		preguica.imprimirMovimento();
		System.out.println(" ");*/
		
		ex2AnimaisBase[] animais = new ex2AnimaisBase[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(ex2AnimaisBase animal:animais) {
			System.out.println(animal.getSom());
		}
	}
}
