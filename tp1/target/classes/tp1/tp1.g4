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
WS : [ \t\n\r] -> skip;
OTRO : . ;


si : funciones EOF ;

	funciones : funcion funciones | ;
	
		funcion : dec_func | def_func ; 	
									
			dec_func : tipo ID PA parametros PC PYCOMA ;
			
				parametros : parametro p_lista ;
				
					parametro : tipo | tipo ID | ;

						tipo : t_simple | puntero ;

                            t_simple : INT | DOUBLE | CHAR | VOID ;
							
							puntero : t_simple '*' | t_simple CA CC;
					
					p_lista : COMA parametros | ;
			
			def_func : tipo ID PA params PC bloque ;
				
				params : tipo ID defp_lista | VOID defp_lista ;
					
					defp_lista : COMA params | ;
					
				bloque : LA instrucciones LC ;
		
					instrucciones : instruccion instrucciones | ;

						instruccion : inst_simple PYCOMA | inst_compuesta ;

							inst_simple : declaraciones | asignacion | operaciones | dec_func | ireturn ;

								declaraciones: tipo declaracion d_lista ;

									declaracion : ID | asignacion ;
									
									d_lista : COMA declaracion d_lista | ;
								
								asignacion : ID '=' operaciones ;
								
									operaciones : opal operaciones | ;
										
										opal : relacional logic ;
											
											logic : AND opal | OR opal | ;
										
											relacional : opar rel | PA opal PC ;
												
												rel : CMP opar | ;
												
												opar : term operaciones ;
													
													term : ovalor mult ;
													
														mult : MULT term | DIV term | MOD term | ;
														
														ovalor : valor | PA opar PC ;
														
															valor : llam_func | ID | numero | VCHAR | VSTRING ;
															
																numero : ENTERO | DOBLE ;
													
								llam_func : ID PA argumentos PC ;
								
									argumentos : argumento a_lista | ;
									
										argumento : asignacion | operaciones ;
									
										a_lista : COMA argumentos | ;
                                
                                ireturn : RETURN | RETURN PA operaciones PC | RETURN operaciones ;
							
							inst_compuesta : est_control ;
								
								est_control : iwhile | iif | ifor ;
									
									iwhile : WHILE PA argumentos PC acciones ;
										
										acciones : asignacion PYCOMA | operaciones PYCOMA | bloque | ;
									
									iif : IF PA argumentos PC acciones ielse ;
										
										ielse : ELSE iif | ELSE acciones | ;
									
									ifor : FOR PA comienzos_f PYCOMA argumentos PYCOMA argumentos PC acciones ;
										
										comienzos_f : opcion cf_lista | ;
											
											opcion : tipo declaracion | argumento ;
											
											cf_lista : COMA opcion cf_lista | ;