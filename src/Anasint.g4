// Analizador sintáctico lenguaje expr
parser grammar Anasint;
options{
 tokenVocab=Analex;
}
programa: codigo EOF;

codigo: variables subprogramas ;

//#######      VARIABLES    #################
variables: VARIABLES (decl_vars)*;

decl_vars: vars DP tipo PyC;

vars: IDENT (COMA vars)?;

tipo: NUM | LOG | SEQ PA tipo PC;

//########################################
subprogramas: SUBPROGRAMAS (funcion | procedimiento)*;

funcion: FUNCION IDENT param DEV ret ;

param: ' ';



procedimiento: ' ';