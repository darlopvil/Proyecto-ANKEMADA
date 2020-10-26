// Analizador sintáctico lenguaje expr
parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: codigo EOF;

codigo: variables  subprogramas ;

//#######        VARIABLES    #################
variables: VARIABLES (decl_vars)*;

decl_vars: vars DP tipo PyC;

vars: IDENT (COMA vars)?; 

tipo: NUM | LOG | SEQ PA tipo PC;

//##########    SUBPROGRAMAS    #################
subprogramas: SUBPROGRAMAS (funcion | procedimiento)*;
//-----------FUNCIONES--------------
funcion : FUNCION cuerpo ;

cuerpo: IDENT PA (params)? PC DEV PA params PC; //puede tener conjunto vacio de entrada
                                                //NO puede tener conjunto vacio de salida
params: tipo_func IDENT (COMA params)?;

tipo_func: NUM | LOG | SEQ ;  //Podemos usar tipo_func o tipo , pero tipo necesita que
                             // el inpunt sea de la forma SEQ(tipo)

//---------PROCEDIMIENTOS----------------
procedimiento: PROCEDIMIENTO encabezado_proc variables FPROCEDIMIENTO;

encabezado_proc: IDENT PA params PC; //Usamos params que ya esta definido, pero no tiene dev como la funcion

