class Empregado {
	string cpf, nome; 
	int salario;	
	constructor(string a, string b, int c){
		cpf = a;
                nome = b;
		salario = c;		
	}
	     string getNome(){
                 return nome;
             }
             string setNome(string n){
                   nome = n;
                   return nome;
             }
             string getCpf(){
              	   return cpf;
             }
            string setCpf(string c){
                   cpf = c;
                   return cpf;
             }
             int getSalario(){
                    return salario;
             }
            int setSalario(int s){
		   if(s < 0){
		     return 0;
                   }
              	   salario = s;
                   return salario;
             }        

}
class Main{
         Empregado emp;
        int darAumento(){
            emp = new Empregado("Fulano","12345678",100);
            int salario; 
            salario = emp.getSalario();
	    int vintePorCento;
            vintePorCento = salario*20/100;
	    int salarioNovo;
            salarioNovo = salario + vintePorCento;
	    emp.setSalario(salarioNovo);
            return salarioNovo;	
          
        }
}
