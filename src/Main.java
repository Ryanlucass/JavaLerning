import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);
    //private static int _tamanho;

    public static void main(String[] args) {
        chamada();
    }

    public static void chamada(){
        int[] numbersq17 = new int[3];
        int[] numbersq18 = new int[10];


        Inicio t1 = new Inicio();

        var escolha = t1.principal();

        switch (escolha) {
            case 17:
                Q17(numbersq17);
                t1.Repetir();
                break;
            case 18:
                Q18(numbersq18);
                t1.Repetir();
                break;
            case 19:
                Q19();
                t1.Repetir();
                break;
            case 20:
                Q20();
                t1.Repetir();
                break;
            case 21:
                Q21();
                t1.Repetir();
                break;
            case 22:
                Q22();
                t1.Repetir();
                break;
            case 23:
                Q23();
                t1.Repetir();
                break;
            case 24:
                Q24 questao24 = new Q24();
                questao24.Alunoestacio();
                t1.Repetir();
                break;
            case 25:
                Q25 questao25 = new Q25();
                questao25.FuncTriangulo();
                t1.Repetir();
                break;
        }
    }

    public static void Q17(int[] numbers){

        //qual é o maior, qual é o menor dentre 3 números;
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("\n Digite o %dª número: ", i + 1);
            numbers[i] = ler.nextInt();
        }

        maior = numbers[0]; //123
        menor = numbers[0]; //123 //5

        for (int i = 0; i < 3; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
            } else if (numbers[i] < menor) {
                menor = numbers[i];
            }
        }

        System.out.printf("\n O maior é: %d", maior);
        System.out.printf("\n O menor é: %d", menor);
    }

    public static void Q18(int[] numbers) {
        //Escrevendo o maior e o menor valor lido

        int maior, menor, total = 0;
        float media = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("\n Digite o %dª número: ", i + 1);
            numbers[i] = ler.nextInt();
            total += numbers[i];
        }

        maior = numbers[0]; //123
        menor = numbers[0]; //123 //5

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
            } else if (numbers[i] < menor) {
                menor = numbers[i];
            }
        }

        media = total / 10;

        System.out.printf("\n O maior é: %d", maior);
        System.out.printf("\n O menor é: %d", menor);
        System.out.printf("\n O total é: %d", total);
        System.out.printf("\n A média é: %.2f", media);
        //somando os valores

    }

    public static void Q19() {

        int div = 0;

        System.out.print("Digite um número inteiro: ");
        int numero = ler.nextInt();

        if (numero <= 0) {
            System.out.print("\n Não é primo, Digite um número acima de 0");
        }

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                div++;
            }
        }

        if (div == 2) {
            System.out.printf("O número %d é primo!", numero);
        } else {
            System.out.printf("O número %d não é primo!", numero);
        }

    }
    private static void Q20(){

        int num = 0;

        System.out.print("Digite o número do primeiro intervalo:");
        num = ler.nextInt();

        if (num >= 10 && num <= 20) {
            System.out.printf("parabéns, o número %d está dentro do intervalo", num);
        }
        else{
            Main.Q20();
        }

    }
    private static void Q21() {


        System.out.print("\nDigite um número entre 12 e 20: ");
        int numero = ler.nextInt();

        if(numero >= 12 && numero <= 20 ){
            System.out.printf("parabéns, o número %d está dentro do intervalo\n",numero);
        }

        if(!(numero >=12 && numero<=20)){
            System.out.print("\nEntrada inválida");
            Main.Q21();
        }

    }

    public static void Q22(){

        int conversao =0;

        System.out.printf("Digite: 1 Celcius;  2 Fahrenheit;  3 Kelvin;  \n");
        int escala = ler.nextInt();

        System.out.printf("Digite o valor da escala atual:  \n");
        double valorescala = ler.nextFloat();


        if(escala == 1){
            System.out.printf("\nOpções: \nDigite: 1 Celcius para Fahrenheit\n 2 Celcius para Kelvin;\n");
            conversao = ler.nextInt();
        }
        if(escala == 2){
            System.out.print("\nOpções: \nDigite: 3 Fahrenheit para celcius\n");
            conversao = ler.nextInt();
        }
        if(escala == 3){
            System.out.print("\nOpções: \nDigite: 4 Kelvin para Fahrenheit\n 5 Kelvin para Celcius; \n");
            conversao = ler.nextInt();
        }



        Main.Q22Complemento(conversao,valorescala);
    }
    public static void Q22Complemento(int conversao, double valorescala){

        double valorconver = 0;

        switch (conversao){
            case 1:
                //celcius para Fahrenheit
                valorconver = (valorescala * 1.8) + 32;
                System.out.printf("A conversão fica: %.2f Fahrenheit", valorconver);
                break;
            case 2:
                //celcius para kelvin
                valorconver = valorescala + 273.15;
                System.out.printf("A conversão fica: %.2f kelvin", valorconver);
                break;
            case 3:
                //Fahrenheit para celcius
                valorconver = (valorescala - 32)/1.8;
                System.out.printf("A conversão fica: %.2f celcius", valorconver);
                break;
            case 4:
                //Kelvin para Fahrenheit
                valorconver = 1.8*(valorescala - 273.15) + 32;
                System.out.printf("A conversão fica: %.2f Fahrenheit", valorconver);
                break;
            case 5:
                //Kelvin para Celcius
                valorconver = valorescala - 273.15;
                System.out.printf("A conversão fica: %.2f celcius", valorconver);
                break;
            default:
                System.out.print("Opção inválida");
                break;
        }

    }

    public static void Q23(){
        int rep = 0;
        int media = 0;
        int total = 0;
        int maior = 0;
        int menor = 0;

        List<Integer> listaInteiros = new ArrayList<Integer>();

        while(rep < 1){
            System.out.print("Digite a idade da pessoa: ");
            listaInteiros.add(ler.nextInt());
            if(listaInteiros.contains(0)){
                rep++;
            }
        }
        //maior e menor
        maior = listaInteiros.get(0);
        menor = listaInteiros.get(0);

        //idade média do grupo

        for (Integer i: listaInteiros) {
            total += i;

            if(i> maior){
                maior = i;
            }
            else if(i < menor && i !=0){
                menor = i;
            }
        }

        //idade média do grupo
        media = total/ (listaInteiros.size()-1);

        System.out.printf("\nO numero de pessaso eh:  %d", listaInteiros.size()-1);
        System.out.printf("\nA idade media do grupo eh:  %d", media);
        System.out.printf("\nA pessoa com a maior idade tem: %d", maior);
        System.out.printf("\nA pessoa com a menor idade tem: %d", menor);

    }
}