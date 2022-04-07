grammar programa;

@header {
    package programa;
}

fragment DIGITO : [0-9] ;
fragment LETRA : [A-Za-z] ;

LA : '{' ;
LC : '}' ;
PA : '(' ;
PC : ')' ;
INT : 'int' ;
DOUBLE : 'double' ;
COMP : '==' | '<' | '>' | '>=' | '<=' | '!=' ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

ASIGNACION : ID '=' (ID | DIGITO);
TIPO : INT | DOUBLE ;

WS : [ \t\n\r] -> skip ;
OTRO : . ;

prog : instrucciones EOF ;

instrucciones : instruccion instrucciones
                |
                ;

instruccion : inst_simple
            | bloque
            ;

inst_simple : ASIGNACION ';'
            | TIPO declaraciones ';'
            | iwhile
            ;

bloque : LA instrucciones LC ;

declaraciones : declaracion (',' declaraciones)* ;

declaracion : ID
            | ASIGNACION
            ;

iwhile : 'while' PA ID COMP ID PC ;