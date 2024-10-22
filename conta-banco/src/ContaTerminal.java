import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o seu primeiro Nome");
        String nome = scanner.next();

        System.out.println("Digite o seu segundo Nome");
        String nomeSegundo = scanner.next();

        String nomeCompleto = nome.concat(" " + nomeSegundo);

       
        System.out.println("Por favor, digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println ("Por favor, informe a sua agencia");
        String agencia = scanner.next();

        System.out.println("Informe o seu Saldo");
        Double saldo = scanner.nextDouble();


        System.out.print("Olá "+nomeCompleto+" obrigado por criar uma conta em nosso banco, sua agência é  "+agencia+" conta "+numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
    
}
