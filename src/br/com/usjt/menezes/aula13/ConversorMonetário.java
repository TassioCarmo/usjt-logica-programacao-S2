package br.com.usjt.menezes.aula13;

public class ConversorMonetário {
    private double valorDeCompra;
    private double valorDeVenda;

    public ConversorMonetário(){
        setValorDeCompra(1);
        setValorDeVenda(1);
    }

    public ConversorMonetário(double valorDeCompra, double valorDeVenda) {
       setValorDeCompra(valorDeCompra);
        setValorDeVenda(valorDeVenda);
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        if(valorDeCompra<0){
            System.out.println("Erro");
        }else {
            this.valorDeCompra = valorDeCompra;
        }

    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        if (valorDeVenda<0){
            System.out.println("Erro");
        }else {
            this.valorDeVenda = valorDeVenda;
        }

    }

    public double venderDolar(double dolar){
        return getValorDeVenda()*dolar;
    }
    public double compraDolar(double dolar){
        return getValorDeCompra()*dolar;
    }

    @Override
    public String toString() {
        return "ConversorMonetário{" +
                "valorDeCompra=" + valorDeCompra +  "valorDeCompra=" +
                ", valorDeVenda=" + valorDeVenda +
                '}';
    }
}
