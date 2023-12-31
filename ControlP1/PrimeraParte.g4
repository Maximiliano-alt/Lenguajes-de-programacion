grammar PrimeraParte;

prog: dibujo+ ;

dibujo:   modo NEWLINE                                            # Mod
      |   puntero NEWLINE                                         # Dib
      |   NEWLINE                                                 # blank
      ;

modo: op=('encendido'|'apagado')                                  # AsignMod
    ;                                 

puntero: MOV '(' INT ',' INT ')'                                  # Pos
       ;

ENC :     'encendido' ;
APAG :    'apagado' ;
MOV:      'mover' ;
INT :   '-'? [0-9]+ ;
NEWLINE:  '\r'? '\n' ;
WS :      [ \t]+ -> skip ;
