/*
Crie a classe Tarefeiro que estende Empregado. 
A classe tem o atributo inteiro qtdeTarefas e double valorTarefa. 
Inicialize estes atributos no construtor via parâmetros e NÃO crie os gets e os sets. 
Sobreponha o método salário para retornar qtdeTarefas * ValorTarefa. 
Altere o main da classe TesteEmpregado para instanciar um Tarefeiro.
 */
package EmpregadoSalario;

public class Tarefeiro extends Empregado{
    
    int QtdeTarefas;
    double ValorTarefa;
    
    public Tarefeiro(String nome, int qtdeTarefas, double valorTarefa){
        super(nome);
        this.QtdeTarefas = qtdeTarefas;
        this.ValorTarefa = valorTarefa;
    }
    public double salario(){
        return QtdeTarefas * ValorTarefa;
    }    
}
