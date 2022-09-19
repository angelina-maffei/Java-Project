public class CaixaEletronico {
    public static void main(String[] args) {
        Double saldo = 25.0;
        Double valorSolicitado = 17.0;

        if(valorSolicitado< saldo)
             saldo = saldo- valorSolicitado;
        else
        System.out.println("Salso Isulficiente")     

        System.out.println(saldo);
    }
}