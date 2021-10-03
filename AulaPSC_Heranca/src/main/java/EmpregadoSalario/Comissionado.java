/*
Crie a classe Comissionado que estende Mensalista. 
A classe tem o atributo double comissão. 
Inicialize estes atributos no construtor via parâmetros e NÃO crie os gets e os sets. 
Sobreponha o método salário para retornar o salário + comisão. 
Altere o main da classe TesteEmpregado para instanciar um Comissionado.
 */
package EmpregadoSalario;

public class Comissionado extends Mensalista{
    
    double comissao;
    
    public Comissionado(String nome, double salario, double comissao){
        super(nome, salario);
        this.comissao = comissao;
    }
    public double salario(){
        return super.salario() + comissao;
    }
    
}
