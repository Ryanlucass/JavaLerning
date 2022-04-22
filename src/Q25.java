import java.util.ArrayList;
import java.util.List;

public class Q25 extends Main{

    //private double[] _Triangulo = new double[3];
    private List<Double> _Triangulo = new ArrayList<>();

    public void FuncTriangulo(){

        for(int i = 0; i < 3; i++){
            System.out.print("Digite um número: ");
           var valor =  ler.nextDouble();
           var result = VerificaZero(valor);

           if(!result){ //0
               System.out.print("digite um número maior que 0.\n");
               --i;
           }
           else{
               //_Triangulo[i] = valor;
               _Triangulo.add(valor);
           }
        }

       var result = IsTriangulo(_Triangulo);

       if(result != null){
          var texto = WichTriangulo(result);
          System.out.print("O valor eh um triangulo :"+ texto);
       }
       else{
           System.out.print("O valor não eh referente a um triangulo");
       }
    }

    public boolean VerificaZero(double valor){
        return valor != 0;
    }

    public List<Double> IsTriangulo(List<Double> input){
        //um lado não pode ser maior do que a soma dos outros dois

        double total = 0;

        var maior = Maior(input);

        input.remove(maior);

        //somar os outros dois valores do array
        for(double i : input){
            total += i;
        }

        if(maior > total){
            return null;
        }else{
            input.add(maior);
            return  input;
        }

    }
    public static double Maior(List<Double> numbers){

        double maior;

        maior = numbers.get(0);

        for(Double i: numbers){
            if(i > maior){
                maior = i;
            }
        }
        return maior;
    }

    public String WichTriangulo(List<Double> triangulo){
        int t = 0;
        //verifica se é Equilátero

        var valor01 = triangulo.get(0);
        var valor02 = triangulo.get(1);
        var valor03 = triangulo.get(2);

       if (valor01.equals(valor02) && valor02.equals(valor03)){
           return "Equilatero";
       };

       if((valor01.equals(valor02) || valor02.equals(valor03)) || valor01.equals(valor03)){
           return "Isosceles";
       }

       return "Escaleno";
    }


}
