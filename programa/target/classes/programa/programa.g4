//Propiedad y autoría de Tomás Ferreyra

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
COMA : ',' ;
PYCOMA : ';' ;
INT : 'int' ;
DOUBLE : 'double' ;
NINT : DIGITO+ ;
NDOUBLE : NINT '.' DIGITO DIGITO? ;
CMP : '==' | '<' | '>' | '>=' | '<=' | '!=' ;
ID : ( LETRA | '_' ) ( LETRA | DIGITO | '_' )* ;
WS : [ \t\n\r] -> skip ;
OTRO : . ;


prog : instrucciones EOF ;

instrucciones : instruccion instrucciones
                |
                ;

instruccion : inst_simple

            | bloque
            | iwhile instruccion
            ;

inst_simple : asignacion PYCOMA
            | declaracion PYCOMA

            ;

asignacion : ID '=' valor ;

declaracion : tipo vaoas lista ;

lista : COMA vaoas lista
       |
       ;

//vaoas = VAriable O ASignacion 
vaoas : ID | asignacion ;

bloque : LA instrucciones LC ;

iwhile : 'while' PA comp PC ;


comp : CMP valor ;

valor : ID | numero ;

numero : NINT | NDOUBLE ;

tipo : INT | DOUBLE ;

