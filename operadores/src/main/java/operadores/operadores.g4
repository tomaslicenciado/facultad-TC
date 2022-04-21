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

opal : term exp;

exp : SUMA term exp
    | RESTA term exp
    | 
    ;

term : factor t;

t : MULT factor t
  | DIV factor t
  | MOD factor t
  |
  ; 

factor : ENTERO
       | PA opal PC
       |
       ; 