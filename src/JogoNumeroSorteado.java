import java.util.Random;
import java.util.Scanner;

public class JogoNumeroSorteado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int sort = r.nextInt(50);

		int cont = 0;
		int usuario = -1;

		while (usuario != sort) {

			System.out.print("Digite um n�mero entre 1 e 50:\n");
			usuario = sc.nextInt();

			if (usuario > sort) {

				System.out.print("O n�mero da tentativa � maior!!\n");
				cont++;
			}

			else if (usuario < sort) {

				System.out.print("O n�mero da tentativa � menor!!\n");
				cont++;
			}

			else {

				System.out.print("Grande Jogada, Parab�ns!!\n");

				cont++;

				System.out.print("Voc� teve: " + cont + " tentativas!!\n");

			}

		}

	}

}
