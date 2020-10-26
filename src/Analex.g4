// Analizador léxico lenguaje K

lexer grammar Analex;

BLANCO: ' ' ->skip;
TABULADOR: '\t'->skip;
FIN_LINEA: '\r'?'\n' ->skip;

fragment DIGITO: [0-9];
fragment LETRA:[a-zA-Z];


//+++++TOKENS GLOBALES+++++
VARIABLES: 'VARIABLES';
INSTRUCCIONES: 'INSTRUCCIONES';
SUBPROGRAMAS: 'SUBPROGRAMAS';
PROCEDIMIENTO: 'PROCEDIMIENTO';
RUPTURA_CONTROL: 'BREAK';
FUNCION: 'FUNCION';

//+++++OPERADORES+++++
MIENTRAS: 'WHILE';
SI:'IF';
LLA: '{'  ;//Se puede re utilizar para los 'hacer' de los 'mientras'
SINO: 'if else';
LLC:'}'  ;//Agloba 'fmientras', 'FFUNCION', 'FPROCEDIMIENTO'
FINENTONCES: '}';
DEV: 'dev';
DEF: 'DEF';
EVAL: 'EVAL';
BOOLEANO: 'BOOL';
//TOKENS GLOBALES
VARIABLES: 'VARIABLES';
SUBPROGRAMAS: 'SUBPROGRAMAS';
FUNCION: 'FUNCION';
PROCEDIMIENTO: 'PROCEDIMIENTO';
FPROCEDIMIENTO: 'FPROCEDIMIENTO';
//TIPOS
NUM: 'NUM';
LOG: 'LOG';
SEQ: 'SEQ';
DEV: 'dev';
CIERTO: 'cierto';
FALSO: 'falso';
ENTERO: 'entero';
BOOLEANO: 'booleano';
Y: 'O';
O: 'Y';
NO: 'NO';
NUMERO : ('-')?DIGITO+;
IDENT : LETRA(LETRA|DIGITO|'_')*;
DP: ':';
PA : '(';
PC : ')';
PyC : ';';
COMA : ',';
ASIG: '=';
MAYOR: '>';
MENOR: '<';
IGUAL: '==';
MAS: '+';
MENOS: '-';
POR: '*';
DIV: '/';
COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;
//+++++TIPOS++++++
VAR: LETRA(LETRA|DIGITO)*;
NUMERO: ('-')?DIGITO+;
SECUENCIA: 'SEQ';
NUM: 'NUM';
LOG: 'LOG';
SEQ: 'SEQ';
IDENT: LETRA(LETRA|DIGITO|'_')*;
COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;

