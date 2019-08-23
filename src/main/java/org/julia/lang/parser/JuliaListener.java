// Generated from org/julia/lang/parser/Julia.g4 by ANTLR 4.5.1
package org.julia.lang.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuliaParser}.
 */
public interface JuliaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuliaParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(JuliaParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(JuliaParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementList}
	 * labeled alternative in {@link JuliaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(JuliaParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementList}
	 * labeled alternative in {@link JuliaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(JuliaParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSequence}
	 * labeled alternative in {@link JuliaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterStatementSequence(JuliaParser.StatementSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSequence}
	 * labeled alternative in {@link JuliaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitStatementSequence(JuliaParser.StatementSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUsingDirective(JuliaParser.UsingDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUsingDirective(JuliaParser.UsingDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportDirective(JuliaParser.ImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportDirective(JuliaParser.ImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleImportDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleImportDirective(JuliaParser.SimpleImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleImportDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleImportDirective(JuliaParser.SimpleImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importAllDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportAllDirective(JuliaParser.ImportAllDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importAllDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportAllDirective(JuliaParser.ImportAllDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExportDirective(JuliaParser.ExportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExportDirective(JuliaParser.ExportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mmoduleDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMmoduleDeclaration(JuliaParser.MmoduleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mmoduleDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMmoduleDeclaration(JuliaParser.MmoduleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ttypeDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTtypeDeclaration(JuliaParser.TtypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ttypeDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTtypeDeclaration(JuliaParser.TtypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ffunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFfunctionDeclaration(JuliaParser.FfunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ffunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFfunctionDeclaration(JuliaParser.FfunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mmacroDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMmacroDeclaration(JuliaParser.MmacroDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mmacroDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMmacroDeclaration(JuliaParser.MmacroDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(JuliaParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(JuliaParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidReturn}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVoidReturn(JuliaParser.VoidReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidReturn}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVoidReturn(JuliaParser.VoidReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JuliaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JuliaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(JuliaParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(JuliaParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JuliaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JuliaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JuliaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JuliaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JuliaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JuliaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quoteStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterQuoteStatement(JuliaParser.QuoteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quoteStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitQuoteStatement(JuliaParser.QuoteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JuliaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JuliaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code module}
	 * labeled alternative in {@link JuliaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModule(JuliaParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code module}
	 * labeled alternative in {@link JuliaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModule(JuliaParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bareModule}
	 * labeled alternative in {@link JuliaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBareModule(JuliaParser.BareModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bareModule}
	 * labeled alternative in {@link JuliaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBareModule(JuliaParser.BareModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaParser#macroDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMacroDeclaration(JuliaParser.MacroDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaParser#macroDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMacroDeclaration(JuliaParser.MacroDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tt}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTt(JuliaParser.TtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tt}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTt(JuliaParser.TtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(JuliaParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(JuliaParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code octal}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOctal(JuliaParser.OctalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code octal}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOctal(JuliaParser.OctalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constant}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConstant(JuliaParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConstant(JuliaParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrow}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrow(JuliaParser.ArrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrow}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrow(JuliaParser.ArrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTernaryConditional(JuliaParser.TernaryConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTernaryConditional(JuliaParser.TernaryConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicative}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(JuliaParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicative}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(JuliaParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterApplyFunction(JuliaParser.ApplyFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitApplyFunction(JuliaParser.ApplyFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveBlock}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveBlock(JuliaParser.PrimitiveBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveBlock}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveBlock(JuliaParser.PrimitiveBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseNot}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseNot(JuliaParser.BitwiseNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseNot}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseNot(JuliaParser.BitwiseNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coeffient}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCoeffient(JuliaParser.CoeffientContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coeffient}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCoeffient(JuliaParser.CoeffientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code character}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(JuliaParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code character}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(JuliaParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLambda(JuliaParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLambda(JuliaParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dollarExp}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDollarExp(JuliaParser.DollarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dollarExp}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDollarExp(JuliaParser.DollarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLet(JuliaParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLet(JuliaParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterHex(JuliaParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitHex(JuliaParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(JuliaParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(JuliaParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ffloat32}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFfloat32(JuliaParser.Ffloat32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ffloat32}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFfloat32(JuliaParser.Ffloat32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exponent}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExponent(JuliaParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponent}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExponent(JuliaParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JuliaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JuliaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hexFloat}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterHexFloat(JuliaParser.HexFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hexFloat}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitHexFloat(JuliaParser.HexFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitShift}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBitShift(JuliaParser.BitShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitShift}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBitShift(JuliaParser.BitShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code implicitTuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterImplicitTuple(JuliaParser.ImplicitTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code implicitTuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitImplicitTuple(JuliaParser.ImplicitTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIn(JuliaParser.InContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIn(JuliaParser.InContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryCatch}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(JuliaParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryCatch}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(JuliaParser.TryCatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tbc1}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTbc1(JuliaParser.Tbc1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tbc1}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTbc1(JuliaParser.Tbc1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lazyOr}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLazyOr(JuliaParser.LazyOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lazyOr}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLazyOr(JuliaParser.LazyOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comprehension}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterComprehension(JuliaParser.ComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comprehension}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitComprehension(JuliaParser.ComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPlus(JuliaParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPlus(JuliaParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSequence(JuliaParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSequence(JuliaParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRegex(JuliaParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRegex(JuliaParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorSymbol}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOperatorSymbol(JuliaParser.OperatorSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorSymbol}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOperatorSymbol(JuliaParser.OperatorSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinary(JuliaParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinary(JuliaParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(JuliaParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(JuliaParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subType}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSubType(JuliaParser.SubTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subType}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSubType(JuliaParser.SubTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endLiteral}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEndLiteral(JuliaParser.EndLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endLiteral}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEndLiteral(JuliaParser.EndLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesised}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenthesised(JuliaParser.ParenthesisedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesised}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenthesised(JuliaParser.ParenthesisedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyTuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTuple(JuliaParser.EmptyTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyTuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTuple(JuliaParser.EmptyTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ff}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFf(JuliaParser.FfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ff}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFf(JuliaParser.FfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMinus(JuliaParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMinus(JuliaParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterString(JuliaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitString(JuliaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anonymousFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(JuliaParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anonymousFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(JuliaParser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDot(JuliaParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDot(JuliaParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code range}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRange(JuliaParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code range}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRange(JuliaParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code global}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(JuliaParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code global}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(JuliaParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code local}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLocal(JuliaParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code local}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLocal(JuliaParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTuple(JuliaParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTuple(JuliaParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(JuliaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(JuliaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code times}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTimes(JuliaParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code times}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTimes(JuliaParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aditive}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAditive(JuliaParser.AditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aditive}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAditive(JuliaParser.AditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lazyAnd}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLazyAnd(JuliaParser.LazyAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lazyAnd}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLazyAnd(JuliaParser.LazyAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rational}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRational(JuliaParser.RationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rational}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRational(JuliaParser.RationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ccall}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCcall(JuliaParser.CcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ccall}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCcall(JuliaParser.CcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNaryConditional(JuliaParser.NaryConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNaryConditional(JuliaParser.NaryConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyPrecedng}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterApplyPrecedng(JuliaParser.ApplyPrecedngContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyPrecedng}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitApplyPrecedng(JuliaParser.ApplyPrecedngContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JuliaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JuliaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInt(JuliaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInt(JuliaParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTypedExpression(JuliaParser.TypedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTypedExpression(JuliaParser.TypedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssignment(JuliaParser.SimpleAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssignment(JuliaParser.SimpleAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPlus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlus(JuliaParser.UnaryPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPlus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlus(JuliaParser.UnaryPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyOperator}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterApplyOperator(JuliaParser.ApplyOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyOperator}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitApplyOperator(JuliaParser.ApplyOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relational}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRelational(JuliaParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRelational(JuliaParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transpose}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTranspose(JuliaParser.TransposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transpose}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTranspose(JuliaParser.TransposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(JuliaParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(JuliaParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ffloat64}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFfloat64(JuliaParser.Ffloat64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ffloat64}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFfloat64(JuliaParser.Ffloat64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code macroInvoke}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMacroInvoke(JuliaParser.MacroInvokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code macroInvoke}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMacroInvoke(JuliaParser.MacroInvokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ttypeExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTtypeExpression(JuliaParser.TtypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ttypeExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTtypeExpression(JuliaParser.TtypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(JuliaParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(JuliaParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parametricType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterParametricType(JuliaParser.ParametricTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parametricType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitParametricType(JuliaParser.ParametricTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predefinedType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedType(JuliaParser.PredefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predefinedType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedType(JuliaParser.PredefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompactFunctionDeclaration(JuliaParser.CompactFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompactFunctionDeclaration(JuliaParser.CompactFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generalFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneralFunctionDeclaration(JuliaParser.GeneralFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generalFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneralFunctionDeclaration(JuliaParser.GeneralFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pparameters}
	 * labeled alternative in {@link JuliaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterPparameters(JuliaParser.PparametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pparameters}
	 * labeled alternative in {@link JuliaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitPparameters(JuliaParser.PparametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterNamedTypedParam(JuliaParser.NamedTypedParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitNamedTypedParam(JuliaParser.NamedTypedParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anonymousTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousTypedParam(JuliaParser.AnonymousTypedParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anonymousTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousTypedParam(JuliaParser.AnonymousTypedParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vararg}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterVararg(JuliaParser.VarargContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vararg}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitVararg(JuliaParser.VarargContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterNamedParam(JuliaParser.NamedParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitNamedParam(JuliaParser.NamedParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAlias}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(JuliaParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAlias}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(JuliaParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractType(JuliaParser.AbstractTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractType(JuliaParser.AbstractTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitsSubtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBitsSubtype(JuliaParser.BitsSubtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitsSubtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBitsSubtype(JuliaParser.BitsSubtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitsTtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBitsTtype(JuliaParser.BitsTtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitsTtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBitsTtype(JuliaParser.BitsTtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMutableTypeDeclaration(JuliaParser.MutableTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMutableTypeDeclaration(JuliaParser.MutableTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code immutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImmutableTypeDeclaration(JuliaParser.ImmutableTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code immutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImmutableTypeDeclaration(JuliaParser.ImmutableTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedFieldDeclaration(JuliaParser.TypedFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedFieldDeclaration(JuliaParser.TypedFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code untypedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUntypedFieldDeclaration(JuliaParser.UntypedFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code untypedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUntypedFieldDeclaration(JuliaParser.UntypedFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ttypeParameters}
	 * labeled alternative in {@link JuliaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTtypeParameters(JuliaParser.TtypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ttypeParameters}
	 * labeled alternative in {@link JuliaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTtypeParameters(JuliaParser.TtypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constrainedType}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterConstrainedType(JuliaParser.ConstrainedTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constrainedType}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitConstrainedType(JuliaParser.ConstrainedTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anonymousType}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousType(JuliaParser.AnonymousTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anonymousType}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousType(JuliaParser.AnonymousTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionType}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterExpressionType(JuliaParser.ExpressionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionType}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitExpressionType(JuliaParser.ExpressionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionName}
	 * labeled alternative in {@link JuliaParser#fnID}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(JuliaParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionName}
	 * labeled alternative in {@link JuliaParser#fnID}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(JuliaParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionSymbol}
	 * labeled alternative in {@link JuliaParser#fnID}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSymbol(JuliaParser.FunctionSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionSymbol}
	 * labeled alternative in {@link JuliaParser#fnID}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSymbol(JuliaParser.FunctionSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisedFnID}
	 * labeled alternative in {@link JuliaParser#fnID}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisedFnID(JuliaParser.ParenthesisedFnIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisedFnID}
	 * labeled alternative in {@link JuliaParser#fnID}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisedFnID(JuliaParser.ParenthesisedFnIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JuliaParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JuliaParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(JuliaParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(JuliaParser.NameContext ctx);
}