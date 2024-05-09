package avaliacao;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para digitar a opção
        System.out.println("Digite a opcao (A, B ou C):");
        
     // Lendo a opção digitada pelo usuário e convertendo para minúsculas
        String opcao = scanner.nextLine().trim().toLowerCase(); 		        
        
        // Verificando a opção digitada e exibindo o conceito correspondente
        VerificadorAvaliacao.verificarOpcao(opcao);
        
        scanner.close(); // Fechando o scanner
    }
}
