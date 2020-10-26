//Analizador léxico lenguaje P

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
CIERTO: 'cierto';
FALSO:'falso';
BREAK: 'break';

//+++++SIMBOLOS+++++
DOS_PUNTOS: ':';
PyC:';';
COMA: ',';
MAS: '+';
MENOS:'-';
POR:'*';
IGUAL: '=';
ES_IGUAL: '==';
DESIGUALDAD: '!=';
MENOR_QUE:'<';
MENOR_O_IGUAL:'<=';
MAYOR_QUE :'>';
MAYOR_O_IGUAL:'>=';
CONJUNCION: '&&';
DISYUNCION: '||';
NEGACION: '!';
PA:'(';
PC:')';
CA: '[';
CC: ']';
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