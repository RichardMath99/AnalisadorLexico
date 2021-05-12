class Grafo {
     int mat[][], n;

     constructor (int m[],[] in n) {
         mat = m;
         n = num;
     }

     int vizinhos (int i, int j ) {
         if (mat[i][j] == 1) return 1
         return 0;
     }

      int [] listaVizinhos (int i) {
          int lista[] = new int[n]
          int j, tamLista;
          tamLista = 0;
          for( j=0; j < n;j=j+1 )
            if (mat[i][j] == 1) {
                lista[tam_Lista] = j;
                tamLista = tamLista + 1;
            };
           if(tamLista != n ) lista [tamLista] = -1;

         return lista;
     }

     int start () {
          int m[][], n, lista[], i, j;

          //leitura do total de vertices e da matriz adjacencia
          print "digite o número de vertices> "; read n;
          m[[][] = new int[n][n];
          for(i=0;i< n; i = i + 1 ){
                print "digite o elemento";
                print i;
                print "";
                print j;
                print ":";
                read m m[i][j];
          }
     }

    print "digite um vertice"; read v1;
    print "digite o outro vertice para verificar vizinhança:"; read v2;
    if(vizinhos (int i, int j)==1) print "os vertices sao vizinhos";
    else print "os vertices nao sao vizinhos"

    print "digite um vertice: "; read v1;
    lista = listaVizinhos(v1);
    print "os vertices vizinhos a";
    print v1;
    print "são ";
    for(i=0;i<n;i=i+1){
        if(lista[i] != -1){
            print lista[i];
            print "";
        }
        else return 0;

        return0;
    }

}

// fatorial

int factorial () {
    int i, fatorial, resultado;
    for (i = 1; i < fatorial; i++) {
        resultado *= i;
    }
}

print resultado;