# Generated from TerceraParte.g4 by ANTLR 4.13.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,12,85,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,1,0,1,1,1,
        1,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,
        4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,
        6,1,7,1,7,1,8,1,8,1,9,3,9,67,8,9,1,9,4,9,70,8,9,11,9,12,9,71,1,10,
        3,10,75,8,10,1,10,1,10,1,11,4,11,80,8,11,11,11,12,11,81,1,11,1,11,
        0,0,12,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,
        1,0,2,1,0,48,57,2,0,9,9,32,32,88,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,
        0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,
        0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,1,25,1,0,0,
        0,3,27,1,0,0,0,5,29,1,0,0,0,7,31,1,0,0,0,9,41,1,0,0,0,11,49,1,0,
        0,0,13,55,1,0,0,0,15,61,1,0,0,0,17,63,1,0,0,0,19,66,1,0,0,0,21,74,
        1,0,0,0,23,79,1,0,0,0,25,26,5,40,0,0,26,2,1,0,0,0,27,28,5,44,0,0,
        28,4,1,0,0,0,29,30,5,41,0,0,30,6,1,0,0,0,31,32,5,101,0,0,32,33,5,
        110,0,0,33,34,5,99,0,0,34,35,5,101,0,0,35,36,5,110,0,0,36,37,5,100,
        0,0,37,38,5,105,0,0,38,39,5,100,0,0,39,40,5,111,0,0,40,8,1,0,0,0,
        41,42,5,97,0,0,42,43,5,112,0,0,43,44,5,97,0,0,44,45,5,103,0,0,45,
        46,5,97,0,0,46,47,5,100,0,0,47,48,5,111,0,0,48,10,1,0,0,0,49,50,
        5,109,0,0,50,51,5,111,0,0,51,52,5,118,0,0,52,53,5,101,0,0,53,54,
        5,114,0,0,54,12,1,0,0,0,55,56,5,114,0,0,56,57,5,111,0,0,57,58,5,
        116,0,0,58,59,5,97,0,0,59,60,5,114,0,0,60,14,1,0,0,0,61,62,5,43,
        0,0,62,16,1,0,0,0,63,64,5,45,0,0,64,18,1,0,0,0,65,67,5,45,0,0,66,
        65,1,0,0,0,66,67,1,0,0,0,67,69,1,0,0,0,68,70,7,0,0,0,69,68,1,0,0,
        0,70,71,1,0,0,0,71,69,1,0,0,0,71,72,1,0,0,0,72,20,1,0,0,0,73,75,
        5,13,0,0,74,73,1,0,0,0,74,75,1,0,0,0,75,76,1,0,0,0,76,77,5,10,0,
        0,77,22,1,0,0,0,78,80,7,1,0,0,79,78,1,0,0,0,80,81,1,0,0,0,81,79,
        1,0,0,0,81,82,1,0,0,0,82,83,1,0,0,0,83,84,6,11,0,0,84,24,1,0,0,0,
        5,0,66,71,74,81,1,6,0,0
    ]

class TerceraParteLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    ENC = 4
    APAG = 5
    MOV = 6
    ROT = 7
    SUM = 8
    RES = 9
    INT = 10
    NEWLINE = 11
    WS = 12

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'('", "','", "')'", "'encendido'", "'apagado'", "'mover'", 
            "'rotar'", "'+'", "'-'" ]

    symbolicNames = [ "<INVALID>",
            "ENC", "APAG", "MOV", "ROT", "SUM", "RES", "INT", "NEWLINE", 
            "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "ENC", "APAG", "MOV", "ROT", "SUM", 
                  "RES", "INT", "NEWLINE", "WS" ]

    grammarFileName = "TerceraParte.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


