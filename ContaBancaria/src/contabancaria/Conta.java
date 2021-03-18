
package contabancaria;

public class Conta {
    ///atributos que todo conta tem
 
    int numero;
    String dono;
    double saldo;
    double limite;
 
    //método que saca uma determinada quantidade.
    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
 
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }//fim do método saca.

    //método que deposita uma quantia.
    void deposita(double valor) {
        this.saldo += valor; //ou this.saldo = saldo + valor;
        // *soma quantidade ao valor antigo do saldo
        // e guarda no próprio saldo.
    }//fim do método deposita.
}//fim da classe Conta.
