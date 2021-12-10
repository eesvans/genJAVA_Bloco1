//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package Java_LacosRep;

import java.util.Scanner;

public class LacosRep_exFor_2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int x, num, par=0, impar=0;

        for (x=1;x<=10;x++) 
        {
            System.out.print("Digite o "+x+"º número: ");
            num = ler.nextInt();

            if(num%2==0) 
            {
                par++;
            } else 
            	{
                	impar++;
            	}
        }
        System.out.println("Foram digitados "+par+" numeros pares e "+impar+" ímpares!");
    }
}