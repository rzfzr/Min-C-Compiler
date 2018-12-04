/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar grammarC;

@header {
package parser;
}

// Monoline comment ab  out a parser rule
prog            : stmt+
                ;


ifstmt          : IF '(' cond ')' block                                         #ifStmt
                | IF '(' cond ')' b1=block ELSE b2=block                        #ifStmtElse
                ;
                  

cond: expr relop expr
    ;

//exemplo do livro de compiladores
expr            : expr '+' term                                                 #exprPlus
                | expr '-' term                                                 #exprMin
                | expr term                                                     #exprH
                | term                                                          #exprTerm
                ;

term            : term '*' fact                                                 #termMult
                | term '/' fact                                                 #termDiv
                | fact                                                          #termFact
                ;


fact: '(' expr ')' #expr2par
        | NUM #exprNum
        | ID #exprId
        | STRING # exprStr
        | CHARC #exprChar
        | booleanb #exprBool
;

booleanb : TRUE   #exprTrue
          | FALSE  #exprFalse
          ;  

  

relop           : '>'
                | '<'
                | '>='
                | '<='
                | '=='
                | '!='
                ;

block   : stmt?  #blockSingle
        | '{' stmt* '}'  #blockCompose
        ;

stmt            : ifstmt #stmtIf //OK
                | attr EOL #stmtAttr //OK
                | dec EOL #stmrDec //OK
                |whilee  #stmtWhile //OK
                |foor  #stmtFor //OK
                ;


whilee : WHILE B_EXPR cond E_EXPR block;

foor : FOR B_EXPR forzin EOL cond EOL attr E_EXPR block;



forzin  : attr
        | dec  
        ;


attr:  ID '=' expr #attrSimple
    |  ID '-' '-' #attrMinuMinus
    | ID '+' '+' #attrPlusPlus
    ;



dec   :  type ID                                                       #declSimple
      | type '*' ID                                                   #declPointer
      | type ID '[' expr ']'                                          #declArray
      | type ID '=' expr                                              #declVSimple
      | type '*' ID '=' expr                                          #declValuePointer
      | CHAR ID '[' expr? ']' '=' STRING                                 #declArrayS
;

type: INT
    |CHAR
    | DOUBLE
    |STRING
    ;

INT     : 'int';
DOUBLE  : 'double';
CHAR    : 'char';
SUM     : '+';
DIV     : '/';
MULT    : '*';
MINUS   : '-';
TRUE    : 'true';
FALSE   : 'false';
EQUALS  : '=';
B_EXPR  : '(';
E_EXPR  : ')';
SWITCH  : 'switch';
CASE    : 'case';
M_IGUAL : '<=';
Ma_IGUAL : '>=';
MAIOR    :'>';
MENOR    :'<';
EEQUALS  : '==';
DIF     : '!=';
WHILE   : 'while';
IF      : 'if';
DO      : 'do';
FOR     : 'for';
BREAK   : 'break';
DEFAULT : 'default';
CHARC   : '\''.'\'';
NUM     : [0-9]+ ;
ID      : [_a-zA-Z][_a-zA-Z0-9]*;
STRING  : '"'(~["\\\r\n])*'"';
ELSE    : 'else';
PRINTF   : 'printf';
SCANF    : 'scanf';
B_BLOCK : '{';
E_BLOCK : '}';
EOL     : ';';
WS      : [ \t\n] -> skip;