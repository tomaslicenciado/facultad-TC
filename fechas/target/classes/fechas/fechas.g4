grammar fechas;

@header {
    package fechas;
}

fragment DIGITO : [0-9];
fragment ANIO : [123] DIGITO DIGITO DIGITO;

//Definir una Expresión Regular para capturar fechas correspondientes a los meses pares (formato DD/MM/YYYY).
//Contemplamos el mes de febrero
FEBRERO : ('0'[1-9] | '1'DIGITO | '2'[0-8])'/02/'ANIO;
//Contemplamos los meses pares de 30 días
FECHA30 : ('0'[1-9] | [12]DIGITO | '30') '/' ('0'[46]) '/' (ANIO);
//contemplamos los meses pares de 31 días
FECHA31 : ('0'[1-9] | [12]DIGITO | '3'[01]) '/' ('08' | '1'[02]) '/' (ANIO);
//Definir una Expresión Regular para capturar horas correspondientes a las horas entre las 08:00 y las 12:59 (formato HH:MM).
HORA1 : ('0'[89] | '1'[012])':'([0-5]DIGITO);
//Definir una Expresión Regular para capturar horas correspondientes a las horas entre las 18:30 y las 21:30 (formato HH:MM).
HORA2 : ('18:'[345]DIGITO)|(('19'|'20')':'([0-5]DIGITO))|('21:'[012]DIGITO)|'21:30';

OTRO : . -> skip;

s : FEBRERO {System.out.println("FEBRERO ->" + $FEBRERO.getText() + "<--"); } s
    | FECHA30 {System.out.println("FECHA30 ->" + $FECHA30.getText() + "<--"); } s
    | FECHA31 {System.out.println("FECHA31 ->" + $FECHA31.getText() + "<--"); } s
    | HORA1 {System.out.println("HORA1 ->" + $HORA1.getText() + "<--"); } s
    | HORA2 {System.out.println("HORA2 ->" + $HORA2.getText() + "<--"); } s
    | EOF
;
