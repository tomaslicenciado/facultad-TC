/*
Consigna

Dado un archivo de entrada en lenguaje C, se debe generar como salida el Árbol
Sintáctico (ANTLR) correcto. Para lograr esto se debe construir un parser que tenga
como mínimo la implementación de los siguientes puntos:

* Reconocimiento de un bloque de código, que puede estar en cualquier parte del
código fuente, controlando balance de llaves.
* Verificación de:
    • declaraciones y asignaciones,
    • operaciones aritmeticológicas,
    • declaración/llamada a función.
* Verificación de las estructuras de control if, for y while.

Ante el primer error léxico o sintáctico el programa deberá terminar.

 */
grammar tp1;

@header {
    package tp1;
}

fragment DIGITO : [0-9] ;
fragment LETRA : [A-Za-z] ;

LA : '{' ;
LC : '}' ;
PA : '(' ;
PC : ')' ;
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
DOUBLE : 'double' ;
WHILE : 'while' ;
VOID : 'void' ;
RETURN : 'return' ;
ENTERO : DIGITO+ ;
DOBLE : ENTERO '.' DIGITO DIGITO? ;
ID : ( LETRA | '_' ) ( LETRA | DIGITO | '_' )* ;
STRING : '"' ( '\\"' | . )*? '"' ;
BCOMENTARIO : '/*' .*? '*/' -> skip;
COMENTARIO : '//' .*? ('\n' | '\r') -> skip;
WS : [ \t\n\r] -> skip;
OTRO : . ;


si : instrucciones EOF ;

instrucciones : instruccion instrucciones
                |
                ;

instruccion : inst_simple
            | bloque
            | iwhile instruccion
            | iif instruccion
            | ifor instruccion
            | decfuncion instruccion
            ;

inst_simple : asignacion PYCOMA
            | declaracion PYCOMA
            | llamfuncion PYCOMA
            ;

asignacion : ID '=' valor 
            | ID '=' llamfuncion;

declaracion : tipo vaoas lista ;

lista : COMA vaoas lista
       |
       ;

vaoas : ID | asignacion ; //vaoas = VAriable O ASignacion 

bloque : LA instrucciones LC ;

iwhile : WHILE PA operaciones PC ;

iif : IF PA operaciones PC ;

ifor : FOR PA operaciones PC ;

valor : ID | numero ;

numero : ENTERO | DOBLE ;

tipo : INT | DOUBLE | CHAR | VOID;

decfuncion : tipo ID PA vaoas lista PC ;

llamfuncion : ID PA vaoas lista PC ;


// ------------------    Operaciones aritmético-lógicas -----------------------
operaciones : opal operaciones
            |
            ;

opal : relacional logic;

logic : AND opal
      | OR opal
      |
      ;

relacional : opar rel
           | PA opal PC;

rel : CMP opar
    | 
    ;

opar : term operacion;

operacion : SUMA opar
          | RESTA opar
          |
          ;

term : ovalor mult ;

mult : MULT term
    | DIV term
    | MOD term
    |
    ;

ovalor : valor
      | PA opar PC
      ;