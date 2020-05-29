import java.util.Locale;
import java.util.Scanner;

public class prova2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int ht, opçao, httotal = 0;
		float vh, ct = 0, ct2 = 0, custototal = 0;
		char sn;
		do {
			System.out.printf("Nome: ");
			nome = sc.next();
			System.out.printf("Horas trabalhadas: ");
			ht = sc.nextInt();
			while (ht < 0) {
				System.out.printf("Horas trabalhadas: ");
				ht = sc.nextInt();
			}
			httotal = httotal + ht;
			System.out.printf("Valor por hora: ");
			vh = sc.nextFloat();
			while (vh < 0) {
				System.out.printf("Valor por hora: ");
				vh = sc.nextFloat();
			}
			ct = ht * vh;
			custototal = custototal + ct;
			System.out.printf("Digitar outro (S/N)? ");
			sn = sc.next().charAt(0);
			
			
		} while(sn == 'S');
		// menu
		
		do {
			System.out.println("MENU");
			System.out.println("1- Total de horas trabalhadas");
			System.out.println("2- Custo Total");
			System.out.println("3- Nome da pessoa que ganhou mais");
			System.out.println("4- Sair");
			System.out.print("Digite uma opção: ");
			opçao = sc.nextInt();
			
			System.out.println();
			if(opçao==4) {
				System.out.printf("FIM DO PROGRAMA");
			}
			else if(opçao==1) {
				System.out.println("Total de horas = " + httotal);
				System.out.println();
			}
			else if(opçao==2) {
				System.out.printf("Custo total = R$ %.2f", ct);
				System.out.println();
			}
		} while(opçao<4);
		
		
			
sc.close();

		
	}
}



