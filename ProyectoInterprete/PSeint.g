grammar PSeint;

s : subprl proc ID block endproc ;
subprl : subpr subprl |  ;
proc : PROCESO | ALGORITMO ;
subproc : SUBPROCESO | SUBALGORITMO | FUNCION ;
endproc : FINPROCESO | FINALGORITMO ;
endsubproc : FINSUBPROCESO | FINSUBALGORITMO | FINFUNCION ;
block :  | storcom l5 ;
l5 : storcom l5 |  ;
storcom : statement | com ;
subpr : subproc ID (TOKEN_ASIG ID)? args block endsubproc ;
ret : ID t1 ;
t1 : TOKEN_ASIG ID |  ;
args : TOKEN_PAR_IZQ t2 |  ;
argl : ID l10 ;
l10 : TOKEN_COMA ID | ;
t2 : TOKEN_PAR_DER | argl TOKEN_PAR_DER ;
statement : stif | stwhile | dowhile | stswitch | stfor ;
com : comid TOKEN_PYC ;
comid : def | asigcall | write | read | array | cls | nwait ;
write : ESCRIBIR expr l3 ;
l3 : TOKEN_COMA expr l3 |  ;
read : LEER idorv ;
asigcall : ID t9 t4 ;
t4 : call | asig ;
call : TOKEN_PAR_IZQ opexpr l3 TOKEN_PAR_DER |  ;
opexpr : expr |  ;
array : DIMENSION ID TOKEN_COR_IZQ expr exprl TOKEN_COR_DER l2 ;
l2 : TOKEN_COMA ID TOKEN_COR_IZQ expr exprl TOKEN_COR_DER l2 |  ;
exprl : TOKEN_COMA expr |  ;
stif : SI expr ENTONCES block elif FINSI ;
elif : SINO block |  ;
stfor : PARA oasig HASTA expr step HACER block FINPARA ;
step : CON PASO expr |  ;
stwhile : MIENTRAS expr HACER block FINMIENTRAS ;
dowhile : REPETIR block HASTA QUE expr ;
stswitch : SEGUN expr HACER casel FINSEGUN ;
casel :  | CASO expr TOKEN_DOSP block l4 stdefault ;
stdefault : DE OTRO MODO TOKEN_DOSP block |  ;
l4 : CASO expr TOKEN_DOSP block l4 |  ;
def : DEFINIR idorv COMO tipo ;
idorv : ID t8 ;
t8 : l1 | cor l1 ;
l1 : TOKEN_COMA idorv |  ;
oasig : idxorv TOKEN_ASIG expr ;
idxorv : ID t9 ;
t9 : cor |  ;
asig : TOKEN_ASIG expr ;
cls : clean PANTALLA ;
clean : BORRAR | LIMPIAR ;
nwait : ESPERAR t3 ;
t3 : TECLA | expr time ;
time : MINUTOS | SEGUNDOS | MILISEGUNDOS ;
expr : tok t7 | parexpr t6 ;
t7 : op expr |  ;
parexpr : TOKEN_PAR_IZQ expr TOKEN_PAR_DER ;
t6 : op expr |  ;
tok : TOKEN_REAL | TOKEN_ENTERO | TOKEN_CADENA | ID t5 | VERDADERO | FALSO | unop tok ;
t5 : call | cor |  ;
cor : TOKEN_COR_IZQ expr exprl TOKEN_COR_DER ;
op : TOKEN_IGUAL | TOKEN_DIF | TOKEN_MENOR | TOKEN_MAYOR | TOKEN_MENOR_IGUAL | TOKEN_MAYOR_IGUAL | TOKEN_MAS | TOKEN_MENOS | TOKEN_DIV | TOKEN_MUL | TOKEN_MOD | TOKEN_O | TOKEN_Y | TOKEN_COMA | TOKEN_POT ;
unop : TOKEN_NEG | TOKEN_MENOS ;
tipo : REAL | TEXTO | NUMERICO | LOGICO | NUMERO | CADENA | ENTERO | CARACTER ;
DE : 'de';
HACER : 'hacer';
TEXTO : 'texto';
TOKEN_MAYOR_IGUAL : '>=';
FINMIENTRAS : 'finmientras';
FINSEGUN : 'finsegun';
MODO : 'modo';
FINPROCESO : 'finproceso';
TOKEN_PAR_IZQ : '(';
REPETIR : 'repetir';
TOKEN_NEG : ('~'|'no');
DEFINIR : 'definir';
COMO : 'como';
TOKEN_DIV : '/';
TOKEN_MAYOR : '>';
PROCESO : 'proceso';
VERDADERO : 'verdadero';
DIMENSION : 'dimension';
TOKEN_COMA : ',';
LIMPIAR : 'limpiar';
FINSUBALGORITMO : 'finsubalgoritmo';
QUE : 'que';
BORRAR : 'borrar';
TOKEN_MENOR : '<';
TOKEN_MUL : '*';
CASO : 'caso';
TOKEN_IGUAL : '=';
TOKEN_MENOS : '-';
TECLA : 'tecla';
ENTERO : 'entero';
PASO : 'paso';
ENTONCES : 'entonces';
SINO : 'sino';
MINUTOS : 'minutos';
SUBALGORITMO : 'subalgoritmo';
ESPERAR : 'esperar';
REAL : 'real';
SEGUN : 'segun';
FINPARA : 'finpara';
TOKEN_MENOR_IGUAL : '<=';
TOKEN_MAS : '+';
TOKEN_COR_IZQ : '[';
SUBPROCESO : 'subproceso';
LEER : 'leer';
PARA : 'para';
FINFUNCION : 'finfuncion';
TOKEN_ASIG : '<-';
OTRO : 'otro';
FUNCION : 'funcion';
FINSUBPROCESO : 'finsubproceso';
ESCRIBIR : 'escribir' ;
FINALGORITMO : 'finalgoritmo';
SEGUNDOS : 'segundos';
TOKEN_POT : '^';
SI : 'si';
CADENA : 'cadena';
TOKEN_PAR_DER : ')';
TOKEN_DIF : '<>';
CON : 'con';
ALGORITMO : 'algoritmo';
TOKEN_MOD : 'token_mod';
MIENTRAS : 'mientras';
NUMERICO : 'numerico';
TOKEN_Y : ('&'|'y');
TOKEN_PYC : ';';
CARACTER : 'caracter';
HASTA : 'hasta';
TOKEN_O : ('|'|'o');
MILISEGUNDOS : 'milisegundos';
FALSO : 'falso';
TOKEN_COR_DER : ']';
NUMERO : 'numero';
LOGICO : 'logico';
TOKEN_DOSP : ':';
PANTALLA : 'pantalla';
TOKEN_REAL : 'token_real';
FINSI : 'finsi';
TOKEN_ENTERO : [0-9]+ ;
TOKEN_CADENA : ['"]~['"]*['"];
ID : [a-zA-Z]+;
WS		: [ \t\r\n]+ -> skip ;