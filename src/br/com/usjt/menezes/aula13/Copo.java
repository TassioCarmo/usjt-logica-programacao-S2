package br.com.usjt.menezes.aula13;

public class Copo {

    private double capacidade;

    public Copo() {
      setCapacidade(100);;
    }
    public Copo(double capacidade) {
        setCapacidade(capacidade);;
    }


    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade >= 0) {
            this.capacidade = capacidade;
        }else {
            System.out.println("Erro capacidade invalida");
        }
    }
    public int calculaNumeroDeCopos(int litros){
        int numeroCopos = (int) (litros/capacidade);
        return numeroCopos;
    }

}
