import java.util.Locale;
import java.util.Scanner;

public class prova2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int ht, opçao;
		float vh;
		char sn;
		do {
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			ht = sc.nextInt();
			while (ht < 0) {
				System.out.print("Horas trabalhadas: ");
				ht = sc.nextInt();
			}
			System.out.print("Valor por hora: ");
			vh = sc.nextFloat();
			while (vh < 0) {
				System.out.print("Valor por hora: ");
				vh = sc.nextFloat();
			}
			System.out.print("Digitar outro (S/N)? ");
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
			
		} while(opçao>4);
		
		System.out.println();
			if(opçao==4) {
				System.out.printf("FIM DO PROGRAMA");
			}
		// fim do menu
sc.close();

		
	}
}



