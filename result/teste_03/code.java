// Programa que implementa uma árvore de busca binária
class BinTree{    // Define o nó da árvore binária
class Data {   // Define uma classe aninhada do tipo Data (dia, mês, ano)
int dia, mes, ano;
constructor() // construtor 1, sem parâmetros
{
	ano = 1980; // inicializa em 1/1/1980
	mes = 1;
	dia = 1;
}

constructor(int d, int m, int a) // construtor 2, dia, mes e ano como parâmetros
{
	ano = a; 
	mes = m;
	dia = d;
}

int compara (Data d) // compara duas datas, retorna < 0, se menor, > 0 se maior e 0 se igual
{
	if (ano<d.ano) return -1;
if (ano>d.ano) return 1;
if (mes<d.mes) return -1
if (mes>d.mes) return 1;
if (dia<d.dia) return -1;
if (dia>d.dia) return 1;
return 0;
}

} // final da classe Data 

    // Variáveis da classe BinTree
    Data chave;    // chave de comparação
BinTreeesq, dir;   // referência para os filhos

constructor(Data d)
    {
        chave = d;
esq = null;
dir = null;
    }

int insert(Data d) // adiciona um elemento na árvore
{
int res;
      res = d.compara(chave) ;
if (res < 0)
        {
	if (esq != null)
	    return esq.insert(d);
	esq = new BinTree(d);
	return 1;
        }
        if (res > 0)
        {
	if (dir != null)
	    return dir.insert(d);
	dir = new BinTree(d);
	return 1;
        }
        return 0;
    }

int treeprint(int espaco) // imprime a árvore
{
        int i;

        if (esq != null) i = esq.treeprint(espaco+4);
        for(i=0; i<espaco; i=i+1)
		print (" ");
        print chave.dia+"/"+chave.mes+"/"+chave.ano+"\n";
  if (dir != null) i = dir.treeprint(espaco+4);
}

int start()  // Módulo principal da classe BinTree
{
BintTree t;
       	 int i, d, m, a;
Data dt;

      print "Digite o dia: "; read d;
print "Digite o mes:"; read m;
print "Digite o ano:"; read a;
dt = new Data (d, m, a);
      t = new BinTree(dt);
      for(i=0; i<10; i=i+1)
{
		print "Digite o dia: "; read d;
		print "Digite o mes:"; read m;
		print "Digite o ano:"; read a;
		dt = new Data (d, m, a);
		if (t.insert(dt) == 0)  print "Elemento já existe\n";
    	}
     	i = t.treeprint(0);
return 0;
   }
}
