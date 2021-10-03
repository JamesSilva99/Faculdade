/*
Crie a classe Mensalista que estende Empregado. 
A classe tem o atributo double salário. 
Inicialize estes atributos no construtor via parâmentros e NÃO crie gets e os sets. 
Sobreponha o método salário para retornar o salário. 
Altere o main da classe Teste Empregado para instanciar um Mensalista.
 */
package EmpregadoSalario;

public class Mensalista extends Empregado{
    
    double salario;
    
    public Mensalista(String nome, double salario){
        super(nome);
        this.salario = salario;
    }
    public double salario(){
        return salario = salario;
    }
}
