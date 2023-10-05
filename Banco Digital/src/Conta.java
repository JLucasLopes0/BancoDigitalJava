public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 0001;

    private static int SEQUENCIAL = 1;

    protected int agencia;

    protected int numero;

    protected double saldo;

    public Conta() { 
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        //Depois, é interessante que eu estude esses conteúdos dos println.
    }
}
