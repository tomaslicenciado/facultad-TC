grammar programa;

@header {
    package programa;
}

fragment DIGITO : [0-9] ;
fragment LETRA : [A-Za-z] ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
INT : 'int' ;
DOUBLE : 'double' ;
ASIGNACION : ID '=' (ID | DIGITO);
TIPO : (INT | DOUBLE) ;


WS : [ \t\n\r] -> skip ;
OTRO : . ;

prog : OTRO EOF ;