public class Classe {

    int tprestacoes, qtdepaga;
    double valoratualp, tpago, saldodevedor;

    public int getTprestacoes() {
        int Tprestacoes = tprestacoes;
        return tprestacoes;
    }

    public int getQtdepaga() {
        int Qtdepaga = qtdepaga;
        return qtdepaga;
    }

    public double getValoratualp() {
        double Valoratualp = valoratualp;
        return valoratualp;
    }

    public double getTpago() {
        double Tpago = qtdepaga * valoratualp;
        return Tpago;
    }

    public double getSaldodevedor() {
        double Saldodevedor = tprestacoes * valoratualp - tpago;
        return Saldodevedor;
    }
}
