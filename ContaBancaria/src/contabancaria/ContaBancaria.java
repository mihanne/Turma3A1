package contabancaria;

 public class ContaBancaria {
    public static void main(String[] args) {
        // TODO code application logic here
    //criando a conta
        //variável minha conta do tipo conta.
        Conta minhaConta;
        minhaConta = new Conta(); //ou pode ser tbm Conta minhaConta = new Conta();
         
        //alterando os valores de minhaConta.
        minhaConta.dono = "Renato";
        minhaConta.saldo = 500;
       
        //verificar saldo atual
        System.out.println("Saldo atual é: ");
         System.out.printf("\n%.2f\n",minhaConta.saldo);
         
        //saca quanto quiser 
        minhaConta.saca(100);
        System.out.println(minhaConta.saldo);
         
        //deposita xxx reais
        minhaConta.deposita(200);
        System.out.println("Saldo de conta bancaria");
        System.out.println(minhaConta.saldo);
                 
    }
    }

