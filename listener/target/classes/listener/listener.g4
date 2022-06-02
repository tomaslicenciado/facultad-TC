grammar listener;

@header {
    package listener;
}

fragment DIGITO : [0-9] ;
fragment LETRA : [A-Za-z] ;

LA : '{' ;
LC : '}' ;
PA : '(' ;
PC : ')' ;
CA : '[' ;
CC : ']' ;
COMA : ',' ;
PYCOMA : ';' ;
SUMA : '+' ;
RESTA : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;
AND : '&&' ;
OR : '||' ;
IF : 'if' ;
CMP : '==' | '<' | '>' | '>=' | '<=' | '!=' ;
VCHAR : '\'' ('\\'? LETRA)? '\'' ;
FOR : 'for' ;
INT : 'int' ;
CHAR : 'char' ;
ELSE : 'else' ;
DOUBLE : 'double' ;
WHILE : 'while' ;
VOID : 'void' ;
STRING : 'string' ;
RETURN : 'return' ;
ENTERO : DIGITO+ ;
DOBLE : ENTERO '.' DIGITO DIGITO? ;
ID : ( LETRA | '_' ) ( LETRA | DIGITO | '_' )* ;
VSTRING : '"' ( '\\"' | . )*? '"' ;
BCOMENTARIO : '/*' .*? '*/' -> skip;
COMENTARIO : '//' .*? ('\n' | '\r') -> skip;
PRAGMA : '#' .*? ('\n' | '\r') -> skip;
WS : [ \t\n\r] -> skip ;
OTRO : . ;
//0
si : opciones EOF ;
//1
opciones : funcion opciones | asignacion PYCOMA opciones | declaraciones PYCOMA opciones | ;
//2
funcion : dec_func PYCOMA | def_func ; 	
//3
dec_func : tipo ID PA parametros PC ;
//4
parametros : parametro p_lista ;
//5
parametro : tipo | tipo ID | ;
//6
tipo : t_simple | puntero ;
//7
t_simple : INT | DOUBLE | CHAR | VOID ;
//8
puntero : t_simple MULT | t_simple CA CC;
//9
p_lista : COMA parametros | ;
//10
def_func : tipo ID PA params PC bloque ;
//11
params : tipo ID defp_lista | VOID defp_lista | ;
//12
defp_lista : COMA params | ;
//13
bloque : LA instrucciones LC ;
//14
instrucciones : instruccion instrucciones | ;
//15
instruccion : inst_simple PYCOMA | est_control | ireturn PYCOMA ;
//16
inst_simple : declaraciones | asignacion | operaciones | dec_func ;
//17
declaraciones: tipo declaracion d_lista ;
//18
declaracion : ID | asignacion ;
//19
d_lista : COMA declaracion d_lista | ;
//20
asignacion : ID '=' operaciones ;
//21
operaciones : opal operaciones | ;
//22
opal : negacion relacional logic ;
//23
negacion : '!' | ;
//24
logic : AND opal | OR opal | ;
//25
relacional : PA opal PC | opar rel ;
//26
rel : CMP opar | ;
//27
opar : term operacion ;
//28
term : ovalor mult ;
//29
mult : MULT term | DIV term | MOD term | ;
//30
ovalor : valor | PA opar PC ;
//31
valor : llam_func | ID | numero | VCHAR | VSTRING ;
//32
numero : ENTERO | DOBLE ;
//33
llam_func : ID PA argumentos PC ;
//34
argumentos : argumento a_lista | ;
//35
argumento : asignacion | operaciones ;
//36
a_lista : COMA argumentos | ;
//37
ireturn : RETURN operaciones | RETURN;
//38
est_control : iwhile | iif | ifor ;
//39
iwhile : WHILE PA argumentos PC acciones ;
//40
acciones : asignacion PYCOMA | operaciones PYCOMA | bloque | ;
//41
iif : IF PA argumentos PC acciones ielse ;
//42
ielse : ELSE iif | ELSE acciones | ;
//43
ifor : FOR PA comienzos_f PYCOMA argumentos PYCOMA argumentos PC acciones ;
//44
comienzos_f : opcion cf_lista | ;
//45
opcion : tipo declaracion | argumento ;
//46
cf_lista : COMA opcion cf_lista | ;
//47
operacion : SUMA opar | RESTA opar | ;