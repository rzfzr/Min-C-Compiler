// Generated from /home/rzfzr/Desktop/GitGud/Min-C-Compiler/Mini C/grammar/parser/grammarC.g4 by ANTLR 4.6

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammarCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammarCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammarCParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(grammarCParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(grammarCParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(grammarCParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(grammarCParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(grammarCParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(grammarCParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(grammarCParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(grammarCParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(grammarCParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(grammarCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(grammarCParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(grammarCParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(grammarCParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(grammarCParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(grammarCParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(grammarCParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(grammarCParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(grammarCParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(grammarCParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(grammarCParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(grammarCParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(grammarCParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(grammarCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(grammarCParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(grammarCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(grammarCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(grammarCParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(grammarCParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(grammarCParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(grammarCParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(grammarCParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(grammarCParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(grammarCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(grammarCParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(grammarCParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(grammarCParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(grammarCParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(grammarCParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(grammarCParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(grammarCParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(grammarCParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(grammarCParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(grammarCParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(grammarCParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(grammarCParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(grammarCParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(grammarCParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(grammarCParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(grammarCParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(grammarCParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(grammarCParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(grammarCParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(grammarCParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(grammarCParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(grammarCParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(grammarCParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(grammarCParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(grammarCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(grammarCParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(grammarCParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(grammarCParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(grammarCParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(grammarCParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(grammarCParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(grammarCParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(grammarCParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(grammarCParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(grammarCParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(grammarCParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(grammarCParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(grammarCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(grammarCParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(grammarCParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(grammarCParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(grammarCParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(grammarCParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(grammarCParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(grammarCParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(grammarCParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(grammarCParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(grammarCParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(grammarCParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(grammarCParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(grammarCParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(grammarCParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(grammarCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(grammarCParser.DeclarationListContext ctx);
}