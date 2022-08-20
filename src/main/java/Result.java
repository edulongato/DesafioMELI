import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete a seguinte função para que ela retorne todos os números
     * de 4 dígitos, onde cada um é menor ou igual a <maxDigit>
     * e a soma dos digitos resulte em 21.
     * Exemplos com maxDigit=6: 3666, 4566
     *
     * Se nenhum for encontrado, o retorno é null.
     */

    public static List<Integer> calculation(int maxDigit) {
        List<Integer> sequencia = new ArrayList<>();

        for (int i = 1000; i < 10000; i++) {
            String string = String.valueOf(i);
            StringBuilder novaString = new StringBuilder();
            int somaDosDigitos = 0;

            for (Character numero : string.toCharArray()) { //Copia os caracteres nesta instância para uma matriz de caracteres Unicode.

                int digito = Integer.parseInt(numero.toString()); //O método toString() retorna a representação String.

                if (digito > maxDigit) {
                    novaString.append(maxDigit);
                    somaDosDigitos += maxDigit;
                } else {
                    novaString.append(digito);
                    somaDosDigitos += digito;
                }
            }

            int num = Integer.parseInt(novaString.toString());

            if (somaDosDigitos == 21 && !(sequencia.contains(num))) {
                sequencia.add(num);
            }
        }

        if (sequencia.size() > 0) {
            return sequencia;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        System.out.println(calculation(6));

    }

}


