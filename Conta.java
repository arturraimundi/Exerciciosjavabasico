import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        String nome = input.nextLine();
        System.out.println("Qual seu tipo de conta?(Corrente ou Poupança)");
        String tipoDeConta = input.nextLine();
        double saldo = 0;

        System.out.println("+++++++++++++++++++++++");
        System.out.println("nome:"+ nome);
        System.out.println("Conta:"+tipoDeConta);
        System.out.println("Saldo:"+ saldo+"R$");
        System.out.println("+++++++++++++++++++++++");


        int decidir;
        double mover;

        while(true){
            System.out.println("1 - Consultar conta");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir Saldo");
            System.out.println("4 - Sair");
            decidir = input.nextInt();

            if(decidir == 1){

                System.out.println("+++++++++++++++++++++++");
                System.out.println("nome:"+ nome);
                System.out.println("Conta" +" "+ tipoDeConta);
                System.out.println("Saldo:"+ saldo+"R$");
                System.out.println("+++++++++++++++++++++++");
            } else if (decidir == 2) {
                System.out.println("+++++++++++++++++++++++");
                System.out.println("Valor a ser recebido");
                System.out.println("+++++++++++++++++++++++");
                mover = input.nextDouble();
                System.out.println("+++++++++++++++++++++++");
                System.out.println("código para pagamento: 43dcD912mj3z1");
                System.out.println("+++++++++++++++++++++++");
                saldo += mover;
            } else if (decidir == 3) {
                System.out.println("+++++++++++++++++++++++");
                System.out.println("Valor a ser pago");
                System.out.println("+++++++++++++++++++++++");
                mover = input.nextDouble();
                if(mover<=saldo){
                    saldo -= mover;
                }
                else{
                    System.out.println("O valor a ser tranferido é maior que o saldo da conta.");
                }
            }else if (decidir == 4){
                break;
            }
            else{
                System.out.println("+++++++++++++++++++++++");
                System.out.println("Número incorreto");
                System.out.println("+++++++++++++++++++++++");
            }


        }



    }
}
