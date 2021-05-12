/* Pacote para o Analisador Léxico */
package codigo;
import static codigo.Tokens.*;
%%
%class Lexer  /* Classe a ser criada com o  mesmo nome do arquivo vazio  */
%type Tokens  /* Definição  dos tokens como uma expressão regular */
L=[a-zA-Z]+   /* Conjunto de uma ou mais  Letras */
D=[0-9]+      /* Conjunto de um ou  mais dígitos */
ESPACO=[ ,\t,\r,\n]+  /* Conjunto de caracteres "espaço", "tabulação", "retorno de carro" e "pula linha" */
%{
    public String lexema;
%}
%%
/* Definição  das palavras Reservadas  - Colocar aqui todas as palavras reservadas */
extends |
int |
string |
constructor |
read |
return |
super |
if |
else |
for |
new |
null |
break |
this |
print |


for {lexema=yytext(); return RESERVADA;}
{ESPACO} {/*Ignore*/}    
"//".* {/*Ignore*/}      
"=" {return ATRIBUICAO;}   
"==" {return IGUAL;}       
"!=" {return DIFERENTE;}      
"+" {return SOMA;}       
"-" {return SUBTRACAO;}       
"*" {return MULTIPLICACAO;}       
"/" {return DIVISAO;}      
"<" {return MENOR;}       
">" {return MAIOR;}       
"<=" {return MENOR_IGUAL;}       
"=<" {return IGUAL_MENOR;}       
">=" {return MAIOR_IGUAL;}       
"=>" {return IGUAL_MAIOR;}       
";" {return PONTO_E_VIRGULA;}  
"(" {return ABRE_PARENTESES;}  
")" {return FECHA_PARENTESES;}
"{" {return ABRE_CHAVES;}  
"}" {return FECHA_CHAVES;}  
"[" {return ABRE_VETOR;} 
"]" {return FECHA_VETOR;} 
"%" {return RESTO_DIVISAO;}  
"&" {return E_COMERCIAL;}  
"." {return PONTO;}  
"," {lexema=yytext();return VIRGULA;}  
"++" {return INCREMENTO;}  
"--" {return INCREMENTO;}  
"|" {return PIPE;}  
"\\" {lexema=yytext();return BARRA_INVERTIDA;} 
"~" {return TIL;}  
"#" {return HASHTAG;}  
"`" {return CRASE;}  
"_" {return UNDERLINE;}  
"@" {return ARROBA;}  
"!" {return EXCLAMACAO;}  
"..." {return RETICENCIAS;}  
{L}({L}|{D})* {lexema=yytext(); return IDENTIFICADOR;}   /* Definição de Identificador */
{D}+ {lexema=yytext(); return INT_CONSTANTE;}            /* Definição de inteiros */
("'".*"'" |"\"".*"\"") {lexema=yytext(); return STRING_CONSTANTE;}  /* Definição de cadeia de caracteres (strings) */
 . {return ERROR;}    /* Caso nenhum dos tokens elexemas acima, erro */
