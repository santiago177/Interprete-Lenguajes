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
subpr : subproc ret args block endsubproc ;
ret : ID t1 ;
t1 : TOKEN_ASIG ID |  ;
args : TOKEN_PAR_IZQ t2 |  ;
argl : ID l1 ;
t2 : TOKEN_PAR_DER | argl TOKEN_PAR_DER ;
statement : stif | stwhile | dowhile | stswitch | stfor ;
com : comid TOKEN_PYC ;
comid : def | asigcall | write | read | array | cls | wait ;
write : ESCRIBIR TOKEN_ENTERO l3 ;
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
wait : ESPERAR t3 ;
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
TOKEN_MAYOR_IGUAL : 'token_mayor_igual';
FINMIENTRAS : 'finmientras';
FINSEGUN : 'finsegun';
MODO : 'modo';
FINPROCESO : 'finproceso';
TOKEN_PAR_IZQ : 'token_par_izq';
REPETIR : 'repetir';
TOKEN_NEG : 'token_neg';
DEFINIR : 'definir';
COMO : 'como';
TOKEN_DIV : 'token_div';
TOKEN_MAYOR : 'token_mayor';
PROCESO : 'proceso';
VERDADERO : 'verdadero';
DIMENSION : 'dimension';
TOKEN_COMA : 'token_coma';
LIMPIAR : 'limpiar';
ID : [a-zA-Z]+;
FINSUBALGORITMO : 'finsubalgoritmo';
TOKEN_CADENA : ['][a-z]*['];
QUE : 'que';
BORRAR : 'borrar';
TOKEN_MENOR : 'token_menor';
TOKEN_MUL : 'token_mul';
CASO : 'caso';
TOKEN_IGUAL : 'token_igual';
TOKEN_MENOS : 'token_menos';
TECLA : 'tecla';
ENTERO : 'entero';
PASO : 'paso';
ENTONCES : 'entonces';
SINO : 'sino';
MINUTOS : 'minutos';
TOKEN_ENTERO : [0-9]+ ;
SUBALGORITMO : 'subalgoritmo';
ESPERAR : 'esperar';
REAL : 'real';
SEGUN : 'segun';
FINPARA : 'finpara';
TOKEN_MENOR_IGUAL : 'token_menor_igual';
TOKEN_MAS : 'token_mas';
TOKEN_COR_IZQ : 'token_cor_izq';
SUBPROCESO : 'subproceso';
LEER : 'leer';
PARA : 'para';
FINFUNCION : 'finfuncion';
TOKEN_ASIG : 'token_asig';
OTRO : 'otro';
FUNCION : 'funcion';
FINSUBPROCESO : 'finsubproceso';
ESCRIBIR : 'escribir' ;
FINALGORITMO : 'finalgoritmo';
SEGUNDOS : 'segundos';
TOKEN_POT : 'token_pot';
SI : 'si';
CADENA : 'cadena';
TOKEN_PAR_DER : 'token_par_der';
TOKEN_DIF : 'token_dif';
CON : 'con';
ALGORITMO : 'algoritmo';
TOKEN_MOD : 'token_mod';
MIENTRAS : 'mientras';
NUMERICO : 'numerico';
TOKEN_Y : 'token_y';
TOKEN_PYC : 'token_pyc';
CARACTER : 'caracter';
HASTA : 'hasta';
TOKEN_O : 'token_o';
MILISEGUNDOS : 'milisegundos';
FALSO : 'falso';
TOKEN_COR_DER : 'token_cor_der';
NUMERO : 'numero';
LOGICO : 'logico';
TOKEN_DOSP : 'token_dosp';
PANTALLA : 'pantalla';
TOKEN_REAL : 'token_real';
FINSI : 'finsi';
WS		: [ \t\r\n]+ -> skip ;