/**
 * Resposta da pergunta do Exercício 3:
 * Você conseguirira entender o qcódigo que escrever sem documentá-lo? Justifique sua resposta.
 * Resposta: Acredito que conseguiria entender pois se trata de uma classe muito simples com nomes de métodos
 * bem escritos e intuitivos, porém se fosse uma classe maior com métodos mais complexos, acredito que a
 * documentação ajudaria muito a ler e entender o código
 *
 * Classe que simula métodos de somar, subtrair, multiplicar e dividir.
 */
public class Calculadora {

    /**
     * Método para realizar a soma de dois números inteiros
     *
     * @param a = número inteiro 1 para realizar a soma
     * @param b = número inteiro 2 para realizar a soma
     * @return resultado da soma entre os parâmetros
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Método para realizar a subtração de dois números inteiros
     *
     * @param a = Minuendo, é o número inicial, o valor maior que será subtraído.
     * @param b = Subtraendo, é o número que será retirado do minuendo.
     * @return Diferença, é o resultado da subtração.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Método para realizar a multiplicação de dois números inteiros
     *
     * @param a = número inteiro 1 para realizar a multiplicação
     * @param b = número inteiro 2 para realizar a multiplicação
     * @return Produto, é o resultado da multiplicação entre os parâmetros
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Método para realizar a divisão de dois números inteiros
     *
     * @param a = Dividendo, o número que está sendo dividido.
     * @param b = Divisor, o número pelo qual o dividendo está sendo dividido.
     * @return Quociente, o resultado da divisão.
     */
    public int dividir(int a, int b) {
        return a / b;
    }
}
