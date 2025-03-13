
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefinho";
        meuFilme.anoDeLancamento = 2024;
        meuFilme.duracaoEmMinutos = 1800;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacao);
        System.out.println(meuFilme.pegaMedia());
    }
}