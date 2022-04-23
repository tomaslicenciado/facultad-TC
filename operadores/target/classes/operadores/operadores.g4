grammar operadores;

@header {
  package operadores;
}

fragment DIGITO : [0-9] ;


SUMA : '+' ;
RESTA : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;
PA : '(' ;
PC : ')' ;
AND : '&&' ;
OR : '||' ;
CMP : '==' | '<' | '>' | '>=' | '<=' | '!=' ;
ENTERO : DIGITO+ ;

WS : [ \t\r\n] -> skip ;
OTRO : . ;

si : operaciones EOF ;

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

term : valor mult ;

mult : MULT term
    | DIV term
    | MOD term
    |
    ;

valor : ENTERO
      | PA opar PC
      ;
