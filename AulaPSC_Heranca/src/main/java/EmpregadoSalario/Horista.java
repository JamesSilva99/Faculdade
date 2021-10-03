/*
Crie a classe Horista que estende Empregado. 
A classe tem o atributo inteiro HorasTrabalhadas e double ValorHora. 
Inicialize estes atributos no construtor via parâmetros e NÃO crie os gets e os sets. 
Sobreponha o método salário para retornar HorasTrabalhadas * ValorHora. 
Altere o main da classe TesteEmpregado para instanciar um Horista.
 */
package EmpregadoSalario;

public class Horista extends Empregado{
    
    int HorasTrabalhadas;
    double ValorHora;
    
    public Horista(String nome, int horasTrabalhadas, double valorHora){
        super(nome);
        this.HorasTrabalhadas = horasTrabalhadas;
        this.ValorHora = valorHora;        
    }
    public double salario(){
        return HorasTrabalhadas * ValorHora;
    }
    
}
