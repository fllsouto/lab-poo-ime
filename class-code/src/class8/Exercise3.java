package class8;

/**
 * Created by fsouto on 05/05/16.
 */
public class Exercise3 {
    public static void main(String args[]) {
        Conta c1 = new Conta("Alex", 1000.0);
        Conta c2 = new Conta("Fellipe", 1500.0);
        double valor1 = 1700.00;
        double valor2 = -100.0;
        double valor3 = 500.0;

        System.out.println("Status da transferência de R$: " + valor1 + " :" + Conta.transfereDinheiro(c2, c1, valor1) + "\n");
        System.out.println("Status da transferência de R$: " + valor2 + " :" + Conta.transfereDinheiro(c2, c1, valor2) + "\n");
        System.out.println("Status da transferência de R$: " + valor3 + " :" + Conta.transfereDinheiro(c2, c1, valor3) + "\n");

        c1.inativaConta();
//        c1.sacaDinheiro(500.0);
    }
}

class Conta {
    private String name;
    private Double saldo;
    private Boolean contaAtiva;

    public Conta(String name, Double saldo) {
        this.name = name;
        this.saldo = saldo;
        this.contaAtiva = true;
    }

    public Boolean depositaDinheiro(Double valor) throws RuntimeException{
        if(!this.contaAtiva)
            throw new ContaInativaException("Conta inativa para realizar operações");

        if(valor < 0) {
            throw new DepositaDinheiroException("Valor de deposito precisa ser maior que zero\nDepósito R$:" + valor + "\nSaldo RS: " + this.saldo);
        } else {
            this.saldo += valor;
            return true;
        }
    }

    public Boolean sacaDinheiro(Double valor) throws RuntimeException{
        if(!this.contaAtiva)
            throw new ContaInativaException("Conta inativa para realizar operações");

        if(this.saldo < valor) {
            throw new SacaDinheiroException("Valor de saque precisa ser menor ou igual ao saldo\nSaque R$:" + valor + "\nSaldo RS: " + this.saldo );
        } else {
            this.saldo -= valor;
            return true;
        }

    }

    public static Boolean transfereDinheiro(Conta origem, Conta destino, double valor) {
        double saldoInicialOrigem = origem.getSaldo();
        double saldoInicialDestino = destino.getSaldo();

        try {
            origem.sacaDinheiro(valor);
            destino.depositaDinheiro(valor);
        } catch (SacaDinheiroException e) {
            System.out.println("Erro ao sacar dinheiro");
            System.out.println("Error type: " + e.toString());
        } catch (DepositaDinheiroException e) {
            System.out.println("Erro ao depositar dinheiro");
            System.out.println("Error type: " + e.toString());
        } finally {
            if(saldoInicialOrigem - valor == origem.getSaldo() && saldoInicialDestino + valor == destino.getSaldo()) {
                System.out.println("Transação realizada com sucesso!");
                return true;
            } else
                System.out.println("A transação não pode ser realiza! Entre em contato com sua Agência.");
        }
        return false;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public Boolean inativaConta() {
        Boolean statusInicial = this.contaAtiva;
        if(statusInicial) {
            this.contaAtiva = false;
        }
        return statusInicial;
    }
}

class DepositaDinheiroException extends RuntimeException{

    public DepositaDinheiroException(String errorMessage) {
        super(errorMessage);
    }
}

class SacaDinheiroException extends RuntimeException{

    public SacaDinheiroException(String errorMessage) {
        super(errorMessage);
    }
}

class ContaInativaException extends RuntimeException{

    public ContaInativaException(String errorMessage) {
        super(errorMessage);
    }
}


