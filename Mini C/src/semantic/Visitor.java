///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package semantic;
//
//import parser.grammarCBaseVisitor;
//import parser.grammarCParser;
//
//
///**
// *
// * @author Larissa
// */
//public class Visitor extends grammarCBaseVisitor<Object> {
//   
//
//    @Override
//    public Object visitCondIf(grammarCParser.CondIfContext ctx) {
//        Boolean cond = (Boolean) visit(ctx.condExpr());
//        if (cond) {
//            return visit(ctx.b1);
//        }
//        return null;
//    }
//
//    @Override 
//    public Object visitWhilex(grammarCParser.WhilexContext ctx) { 
//        Boolean cond = (Boolean) visit(ctx.condExpr());
//        while(cond){
//            visit(ctx.x);
//        }
//        return visit(ctx.x);
//    }
//
//    @Override
//    public Object visitForex(grammarCParser.ForexContext ctx) { 
//        Boolean cond = (Boolean) visit(ctx.condExpr());
//        while(cond){
//            cond = (Boolean) visit (ctx.condExpr());
//            visit (ctx.bl);
//            visit (ctx.at);
//        }
//        return 0d;
//    }
//    
//    @Override
//    public Object visitCondIfElse(grammarCParser.CondIfElseContext ctx) {
//        Boolean cond = (Boolean) visit(ctx.condExpr());
//        
//        if (cond) {
//            return visit(ctx.b1);
//        } else {
//            return visit(ctx.b2);
//        }
//    }
//
//
//    @Override
//    public Object visitCondRelOp(grammarCParser.CondRelOpContext ctx) {
//        Double a = (Double) visit(ctx.expr(0));
//        Double b = (Double) visit(ctx.expr(1));
//        
//        int op = ctx.relop.getType();
//        switch (op) {
//            case GrammarLexer.EQ:
//                return a.equals(b);
//            case GrammarLexer.LT:
//                return a < b;
//            case GrammarLexer.GT:
//                return a > b;
//            case GrammarLexer.LE:
//                return a <= b;
//            case GrammarLexer.GE:
//                return a >= b;
//        }
//        return null;
//    }
//
//    @Override
//    public Object visitCondExpresion(grammarCParser.CondExpresionContext ctx) {
//        Double d = (Double) visit(ctx.expr());
//        return d > 0;
//    }
//
//    @Override
//    public Object visitWriteSTR(grammarCParser.WriteSTRContext ctx) {
//        String val = ctx.STR().getText();
//        char aspas = '\0';
//        val = val.replace('"', aspas);
//        System.out.println(val);
//        return 0d;
//    }
//    @Override
//    public Object visitWritelnSTR(grammarCParser.WritelnSTRContext ctx){
//        String val = ctx.STR().getText();
//        char aspas = '\0';
//        val = val.replace('"', aspas);
//        System.out.println(val + "\n");
//        return 0d;
//    }
//
//    @Override
//    public Object visitWriteEXP(grammarCParser.WriteEXPContext ctx) {
//        Object o = visit(ctx.expr());
//        System.out.println(o);
//        return o;
//    }
//    @Override
//    public Object visitWritelnEXP(grammarCParser.WritelnEXPContext ctx){
//        Object o = visit(ctx.expr());
//        System.out.println(o + "\n");
//        return o;
//    }
//    @Override
//    public Object visitReadVar(grammarCParser.ReadVarContext ctx) {
//        Scanner s = new Scanner(System.in);
//        Object[] value = new Object[2];
//        value[1] = s.nextLine();
//        SymbolsTable.getInstance().addSymbol(ctx.ID().getText(), value);
//        return value;
//    }
//
//    @Override
//    public Object visitVarDeclaration(grammarCParser.VarDeclarationContext ctx) {
//        Object[] var = new Object[2];
//        var[0] = ctx.types().getText();
//        SymbolsTable.getInstance().addSymbol(ctx.ID().get(0).getText(), var);
//        return 0d;
//    }
//
//    @Override
//    public Object visitExprPlus(grammarCParser.ExprPlusContext ctx) {
//        Double a = (Double) visit(ctx.expr1());
//        Double b = (Double) visit(ctx.expr());
//        return a + b;
//    }
//
//    @Override
//    public Object visitExprMinus(grammarCParser.ExprMinusContext ctx) {
//        Double a = (Double) visit(ctx.expr1());
//        Double b = (Double) visit(ctx.expr());
//        return a - b;
//    }
//
//    @Override
//    public Object visitExpr1Empty(grammarCParser.Expr1EmptyContext ctx) {
//        return visit(ctx.expr1());
//    }
//
//    @Override
//    public Object visitExpr1Mult(grammarCParser.Expr1MultContext ctx) {
//        Double a = (Double) visit(ctx.expr2());
//        Double b = (Double) visit(ctx.expr());
//        return a * b;
//    }
//
//    @Override
//    public Object visitExpr1Div(grammarCParser.Expr1DivContext ctx) {
//        Double a = (Double) visit(ctx.expr2());
//        Double b = (Double) visit(ctx.expr());
//        return a / b;
//    }
//
//    @Override
//    public Object visitExpr2Empty(grammarCParser.Expr2EmptyContext ctx) {
//        return visit(ctx.expr2());
//    }
//
//    @Override
//    public Object visitExpr2Par(grammarCParser.Expr2ParContext ctx) {
//        return visit(ctx.expr());
//    }
//
//    @Override
//    public Object visitExpr2Num(grammarCParser.Expr2NumContext ctx) {
//        return Double.parseDouble(ctx.NUM().getText());
//    }
//
//    @Override
//    public Object visitExpr2Id(grammarCParser.Expr2IdContext ctx) {
//        return SymbolsTable.getInstance().getSymbol(ctx.ID().getText())[1];
//    }
//    
//    @Override public Object visitAttrExpr(grammarCParser.AttrExprContext ctx) {
//        if(SymbolsTable.getInstance().getSymbol(ctx.ID().getText()) != null){Object aux = visit(ctx.expr());
//        if(aux == null){aux = ctx.expr().getText();} 
//        Object[] var = SymbolsTable.getInstance().getSymbol(ctx.ID().getText());
//            if(var[0].equals("float")){
//                var[1] = Float.parseFloat(aux.toString());
//            }else if(var[0].equals("integer")){           
//                var[1] = (int)Double.parseDouble(aux.toString());
//            }
//            else if(var[0].equals("boolean")){
//                if(aux.toString().equals("true") || aux.toString().equals("false")){
//                    var[1] = aux;
//                }else{
//                    throw new ParseCancellationException("Esperava um booleano");
//                }
//            }else if(var[0].equals("string")){
//                if(aux.toString().startsWith("\"")){
//                    var[1] = aux;
//                }else{
//                    throw new ParseCancellationException("Esperava uma string");
//                }
//            }
//        }else{
//            throw new ParseCancellationException("Variavel inexistente");
//        }         
//    return 0;
//    }
//
//}
