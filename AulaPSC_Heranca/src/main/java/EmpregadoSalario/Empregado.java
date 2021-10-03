/*
Crie a classe Empregado. 
A classe tem o atributo String nome. 
Inicialize este atributo no construtor via parâmentros e NÃO crie os gets e os sets. 
Crie o método salário que irá nos retornar um salário igual a 0. 
Crie o main da classe TesteEmpregado para instanciar um Empregado.
*/
package EmpregadoSalario;

public class Empregado {
    
    String nome;
        public Empregado(String nome){
            this.nome = nome;
        }
        public double salario(){
        return 0;
        }
    
}
