/*Considerando que para um consórcio, sabe-se o número total de prestações, a quantidade de prestações pagas
e o valor atual da prestação, escreva um algoritmo que determine o total pago pelo consorciado e o saldo
devedor.*/

public class Principal {
    public static void  main(String[] args){

        Classe classe = new Classe();

        classe.tprestacoes = 10;
        classe.qtdepaga = 4;
        classe.valoratualp = 540.9;
        classe.tpago = classe.getTpago();
        classe.saldodevedor = classe.getSaldodevedor();

        System.out.println("Total de prestações --> " + classe.getTprestacoes());
        System.out.println("Qtde de prestações pagas --> " + classe.getQtdepaga());
        System.out.println("Valor da prestação --> " + classe.getValoratualp());
        System.out.println("Total pago --> " + classe.getTpago());
        System.out.println("Saldo devedor --> " + classe.getSaldodevedor());
    }
}
