//Analizador léxico lenguaje P

lexer grammar Analex;

BLANCO: ' ' ->skip;
TABULADOR: '\t'->skip;
FIN_LINEA: '\r'?'\n' ->skip;
fragment DIGITO: [0-9];
fragment LETRA:[a-zA-Z];

//+++++COMANDOS+++++
VARIABLES: 'VARIABLES';
INSTRUCCIONES: 'INSTRUCCIONES';
PROCEDIMIENTO: 'PROCEDIMIENTO';
RUPTURA_CONTROL: 'BREAK';

//+++++OPERADORES+++++
MIENTRAS: 'WHILE';
SI:'IF';
LLA: '{'  ;//Se puede re utilizar para los 'hacer' de los 'mientras'
SINO: 'if else';
LLC:'}'  ;//Agloba 'fmientras', 'FFUNCION', 'FPROCEDIMIENTO'
FINENTONCES: '}';
DEVUELVE: 'dev';
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
NUM: ('-')?DIGITO+;
SECUENCIA:'SEQ(NUM|BOOL)';