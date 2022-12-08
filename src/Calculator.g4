grammar Calculator;

expression
   : multiplyingExpression ((PLUS | MINUS) multiplyingExpression)* #expre
   ;

multiplyingExpression
   : powExpression ((TIMES | DIV) powExpression)* #multdivexpression
   ;

powExpression
   : defult_func (POV defult_func)* # powerexpression
   ;

defult_func
    :  funcname number *
    |  number
    ;

number
   : (MINUS(NUMBER)|(NUMBER))   # numbers
   ;

funcname
   : COS
   | TAN
   | SIN
   | ACOS
   | ATAN
   | ASIN
   | LOG
   | PI
   | SQRT
   ;

NUMBER:('0' .. '9')+ ('.' ('0' .. '9') +)? ;

POV: '^' ;
INT: [0-9]+ ;
DOT: '.';
TIMES: '*' ;
DIV: '/' ;
PLUS: '+' ;
MINUS: '-' ;
WS : [ \t\r\n]+ -> skip ;

SQRT: 'sqrt' ;
COS: 'cos';
SIN: 'sin';
TAN: 'tan';
ACOS: 'acos';
ASIN: 'asin';
ATAN: 'atan';
LOG: 'log';
PI : 'PI';
