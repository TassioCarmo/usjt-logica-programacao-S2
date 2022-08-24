package br.com.usjt.menezes.aula13;

public class Desconto {

    private double percentualDeDesconto;

    public Desconto(double percentualDeDesconto) {
        setPercentualDeDesconto(percentualDeDesconto);
    }

    public double getPercentualDeDesconto() {
        return percentualDeDesconto;
    }

    public void setPercentualDeDesconto(double percentualDeDesconto) {
        if(percentualDeDesconto<0 || percentualDeDesconto > 100){
            System.out.println("error percentual de desconto invalido");
        }else {
            this.percentualDeDesconto = percentualDeDesconto;
        }
    }

    public double calculaDesconto(double valor){
        double valorDesconto;
        return  valorDesconto = valor*(getPercentualDeDesconto()/100);
    }
}
