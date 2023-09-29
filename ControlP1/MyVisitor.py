from PrimeraParteVisitor import PrimeraParteVisitor
from PrimeraParteParser import PrimeraParteParser
from turtle import *

class MyVisitor(PrimeraParteVisitor):
    def __init__(self):
        self.memory = {}

    def visitMod(self, ctx):
        value = self.visit(ctx.modo())
        print(value)
        return 0
<<<<<<< HEAD
    
    def visitMod(self, ctx):
        value = self.visit(ctx.modo())
        print(value)
        return 0
=======
>>>>>>> 7483039019a702f260c0e1e044ebd4ebb7e8ccaf
    
    def visitDib(self, ctx):
        value = self.visit(ctx.puntero())
        print(value)
        return 0
    
    def visitINT(self, ctx):
        return ctx.INT().getText()

    def visitAsignMod(self, ctx):
        if ctx.op.type == PrimeraParteParser.ENC:
            pendown()
            return 0
        else:
            penup()
            return 0
<<<<<<< HEAD
    
    def visitAsignMod(self, ctx):
        if ctx.op.type == PrimeraParteParser.ENC:
            pendown()
            return 0
        else:
            penup()
            return 0
=======
>>>>>>> 7483039019a702f260c0e1e044ebd4ebb7e8ccaf
    
    def visitPos(self, ctx):
        coordX = int(self.visit(ctx.puntero(0)))
        coordY = int(self.visit(ctx.puntero(1)))
        hideturtle()
        setpos(coordX,coordY)
        return 0
    
        
    
