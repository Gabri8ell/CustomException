package CustomException;

public class Main {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        int resultado;

        for(int i = 0; i < denominador.length; i++){
            try{
                if(numerador[i] %2 != 0){
                    throw new DivisaoNaoExataException("Divisão não exata", numerador[i], denominador[i]);
                }
                resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }catch (DivisaoNaoExataException e){
                System.out.println(e.getMessage());
            }catch(ArithmeticException e){
                System.out.println("Impossível dividir por 0");
                e.getCause();
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Não existe valor na posição [" + i + "] do vetor numerador");
                e.getStackTrace();
            }
        }
    }
}
