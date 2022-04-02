grammar parentesis;

@header {
    package parentesis;
}

PA : '(';
PC : ')';
CA : '[';
CC : ']';
LA : '{';
LC : '}';
OTRO : . -> skip;

si : s EOF;

s : PA s PC s
    | CA s CC s
    | LA s LC s
    |
;