package EmpregadoSalario;

public class TesteEmpregado {
    
    public static void main(String[]args){
        
        Empregado empregado = new Empregado("James");
            System.out.println("================================================");
            System.out.println(empregado.nome);
            System.out.println(empregado.salario());
            System.out.println("================================================");

        Mensalista mensalista = new Mensalista("James", 2000);
            System.out.println(mensalista.nome);
            System.out.println(mensalista.salario());
            System.out.println("================================================");
            
        Comissionado comissionado = new Comissionado("James", 1861.50, 148.70);
            System.out.println(comissionado.nome);
            System.out.println(comissionado.salario());
            System.out.println("================================================");
            
        Horista horista = new Horista("James", 8, 8.60);
            System.out.println(horista.nome);
            System.out.println(horista.salario());
            System.out.println("================================================");
            
        Tarefeiro tarefeiro = new Tarefeiro("James", 5, 8.60);
            System.out.println(tarefeiro.nome);
            System.out.println(tarefeiro.salario());
            System.out.println("================================================");
    }
}
