package class6;

abstract class Veiculo {
    private double preco;
    public void set(double valor) {
        preco = valor;
    }
    public double get() {
        return preco;
    }
    abstract public void move();
    abstract public void tamanho();
}

class Carro extends Veiculo {
    public void move() {
        System.out.println("Por vias pavimentadas");
    }
    public void tamanho() {
        System.out.println("Entre 2 e 4 metros");
    }
}

class Aviao extends Veiculo {
    public void move() {
        System.out.println("Pelo ar");
    }
    public void tamanho() {
        System.out.println("Entre 4 e 200 metros");
    }
}

class TecoTeco extends Aviao {
    public void move() {
        System.out.println("Pelo ar, mas baixo");
    }
    public void tamanho() {
        System.out.println("Entre 4 e 6 metros");
    }
}

public class TestaVeiculos {
    public static void main(String [] argc) {
        Veiculo []v = new Veiculo[5]; //vetor com 5 veiculos
        v[0]=new Carro();
        v[1]=new Aviao();
        v[2]=new TecoTeco();
        v[3]=new Aviao();
        v[4]=new TecoTeco();

        v[0].set(20000);
        v[1].set(500000);
        v[2].set(150000);
        v[3].set(1000000);
        v[4].set(120000);

        for(int i=0;i<5;i++) {
            System.out.print("O veiculo "+i+" se move: ");
            v[i].move();
            System.out.println("Esse veículo custa certa de R$:" + v[i].get() + "\n");
        }
    }
}