import java.awt.*;

public class Inicio extends Main {

    public int principal(){

        System.out.print("\nQual questao Java da 17 a 25 voce quer testar?\n");

        System.out.print("17.Diferenciar dentre 3 números, qual é o maior e qual é o menor \n" +
                         "18.Escreva um programa que leia 10 números\n" +
                         "19.Calcular se um número é ou não primo\n"+
                         "20.Informar se um número inteiro está ou não dentro de um intervalo de 2 número digitado\n"+
                         "21.Faça um programa que peça ao usuário um número entre 12 e 20.\n"+
                         "22. Leia uma temperatura a qual o usuário irá o Valor e a escala atual: (Fahrenheit, Celsius, Kelvin) e informar a escala para qual deseja converter\n"+
                         "23.Faça um programa que, para um número indeterminado de pessoas: leia a idade de cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser considerada\n"+
                         "24.Criar um programa que receba 3 notas de 3 alunos. Caso o aluno não obtenha nota superior a 6 na média entre a duas notas AV1 e AV2, inserir nota AV3 e substituir a menor entre Av1 e Av2, recalcular a média e mostrar o resultado da aprovação ou reprovação dos alunos\n"+
                         "25. Crie um programa que receba três valores (obrigatoriamente maiores que zero), representando as medidas dos três lados de um triângulo\n");
        System.out.print("\n\nDigite referente ao número da questão: \n");
        var escolha = ler.nextInt();

        if(escolha<17 || escolha>25){
            System.out.print("\n\nFora do range de questoes");
            principal();
        }

        return escolha;
    }
    public void Repetir(){

        System.out.print("\n\n1 - s\n2 - n\nDeseja testar outra função ?: ");
        var res = ler.nextInt();

        if(res!=2){
            Main.chamada();
        }
    }
}
