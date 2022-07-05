package percent_per_country;

public class PercentPerCountry {
    public static void main(String[] args) {

        double sp = 67.83643;
        double rj = 36.67866;
        double mg = 29.22988;
        double ep = 27.16548;
        double outros = 19.84953;

        double total = sp + rj + mg + ep + outros;
        System.out.printf("Total é %.2f \n", total);

        double percentSp = sp / total * 100;
        double percentRj = rj / total * 100;
        double percentMg = mg / total * 100;
        double percentEp = ep / total * 100;
        double percentOutros = outros / total * 100;

        System.out.printf("Porcentagem de SP é: %.2f%% \n", percentSp);
        System.out.printf("Porcentagem de RJ é: %.2f%% \n", percentRj);
        System.out.printf("Porcentagem de MG é: %.2f%% \n", percentMg);
        System.out.printf("Porcentagem de EP é: %.2f%% \n", percentEp);
        System.out.printf("Porcentagem de Outros é: %.2f%% ", percentOutros);
    }
}
