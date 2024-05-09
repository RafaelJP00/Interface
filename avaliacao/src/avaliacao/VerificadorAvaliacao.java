package avaliacao;

public class VerificadorAvaliacao implements avaliacao {
	public static void verificarOpcao(String opcao) {
        String conceito;
        String descricao;
        
        // Estrutura de decisão para verificar a opção digitada
        switch (opcao) {
            case "a":
                conceito = "A";
                descricao = a;
                break;
            case "b":
                conceito = "B";
                descricao = b;
                break;
            case "c":
                conceito = "C";
                descricao = c;
                break;
            default:
                conceito = "Opcao invalida!";
                descricao = "";
        }
        
        // Imprimindo na tela o conceito e sua descrição
        System.out.println("Conceito: " + conceito + "  " + descricao);
    
}

}
