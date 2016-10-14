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
comid : def | asigcall | write | read | array | cls | spwait ;
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
spwait : ESPERAR t3 ;
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
DE : [dD][eE];
HACER : [hH][aA][cC][eE][rR];
TEXTO : [tT][eE][xX][tT][oO];
TOKEN_MAYOR_IGUAL : '>=';
FINMIENTRAS : [fF][iI][nN][mM][iI][eE][nN][tT][rR][aA][sS];
FINSEGUN : [fF][iI][nN][sS][eE][gG][uU][nN];
MODO : [mM][oO][dD][oO];
FINPROCESO : [fF][iI][nN][pP][rR][oO][cC][eE][sS][oO];
TOKEN_PAR_IZQ : '(';
REPETIR : [rR][eE][pP][eE][tT][iI][rR];
TOKEN_NEG : ('~'|'no');
DEFINIR : [dD][eE][fF][iI][nN][iI][rR];
COMO : [cC][oO][mM][oO];
TOKEN_DIV : '/';
TOKEN_MAYOR : '>';
PROCESO : [pP][rR][oO][cC][eE][sS][oO];
VERDADERO : [vV][eE][rR][dD][aA][dD][eE][rR][oO];
DIMENSION : [dD][iI][mM][eE][nN][sS][iI][oO][nN];
TOKEN_COMA : ',';
LIMPIAR : [lL][iI][mM][pP][iI][aA][rR];
ID : [a-zA-Z]+;
FINSUBALGORITMO : [fF][iI][nN][sS][uU][bB][aA][lL][gG][oO][rR][iI][tT][mM][oO];
TOKEN_CADENA : ['"]~['"]*['"];
QUE : [qQ][uU][eE];
BORRAR : [bB][oO][rR][rR][aA][rR];
TOKEN_MENOR : '<';
TOKEN_MUL : '*';
CASO : [cC][aA][sS][oO];
TOKEN_IGUAL : '=';
TOKEN_MENOS : '-';
TECLA : [tT][eE][cC][lL][aA];
ENTERO : [eE][nN][tT][eE][rR][oO];
PASO : [pP][aA][sS][oO];
ENTONCES : [eE][nN][tT][oO][nN][cC][eE][sS];
SINO : [sS][iI][nN][oO];
MINUTOS : [mM][iI][nN][uU][tT][oO][sS];
TOKEN_ENTERO : [0-9]+ ;
SUBALGORITMO : [sS][uU][bB][aA][lL][gG][oO][rR][iI][tT][mM][oO];
ESPERAR : [eE][sS][pP][eE][rR][aA][rR];
REAL : [rR][eE][aA][lL];
SEGUN : [sS][eE][gG][uU][nN];
FINPARA : [fF][iI][nN][pP][aA][rR][aA];
TOKEN_MENOR_IGUAL : '<=';
TOKEN_MAS : '+';
TOKEN_COR_IZQ : '[';
SUBPROCESO : [sS][uU][bB][pP][rR][oO][cC][eE][sS][oO];
LEER : [lL][eE][eE][rR];
PARA : [pP][aA][rR][aA];
FINFUNCION : [fF][iI][nN][fF][uU][nN][cC][iI][oO][nN];
TOKEN_ASIG : '<-';
OTRO : [oO][tT][rR][oO];
FUNCION : [fF][uU][nN][cC][iI][oO][nN];
FINSUBPROCESO : [fF][iI][nN][sS][uU][bB][pP][rR][oO][cC][eE][sS][oO];
ESCRIBIR : [eE][sS][cC][rR][iI][bB][iI][rR];
FINALGORITMO : [fF][iI][nN][aA][lL][gG][oO][rR][iI][tT][mM][oO];
SEGUNDOS : [sS][eE][gG][uU][nN][dD][oO][sS];
TOKEN_POT : '^';
SI : [sS][iI];
CADENA : [cC][aA][dD][eE][nN][aA];
TOKEN_PAR_DER : ')';
TOKEN_DIF : '<>';
CON : [cC][oO][nN];
ALGORITMO : [aA][lL][gG][oO][rR][iI][tT][mM][oO];
TOKEN_MOD : '%'
MIENTRAS : [mM][iI][eE][nN][tT][rR][aA][sS];
NUMERICO : [nN][uU][mM][eE][rR][iI][cC][oO];
TOKEN_Y : ('&'|'y');
TOKEN_PYC : ';';
CARACTER : [cC][aA][rR][aA][cC][tT][eE][rR];
HASTA : [hH][aA][sS][tT][aA];
TOKEN_O : ('|'|'o');
MILISEGUNDOS : [mM][iI][lL][iI][sS][eE][gG][uU][nN][dD][oO][sS];
FALSO : [fF][aA][lL][sS][oO];
TOKEN_COR_DER : ']';
NUMERO : [nN][uU][mM][eE][rR][oO];
LOGICO : [lL][oO][gG][iI][cC][oO];
TOKEN_DOSP : ':';
PANTALLA : [pP][aA][nN][tT][aA][lL][lL][aA];
TOKEN_REAL : [0-9]+[.][0-9]+;
FINSI : [fF][iI][nN][sS][iI];
WS		: [ \t\r\n]+ -> skip ;