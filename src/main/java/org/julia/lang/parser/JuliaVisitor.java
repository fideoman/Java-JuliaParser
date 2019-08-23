// Generated from org/julia/lang/parser/Julia.g4 by ANTLR 4.5.1
package org.julia.lang.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JuliaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JuliaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JuliaParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(JuliaParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementList}
	 * labeled alternative in {@link JuliaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(JuliaParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSequence}
	 * labeled alternative in {@link JuliaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSequence(JuliaParser.StatementSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usingDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDirective(JuliaParser.UsingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDirective(JuliaParser.ImportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleImportDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleImportDirective(JuliaParser.SimpleImportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importAllDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAllDirective(JuliaParser.ImportAllDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportDirective}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDirective(JuliaParser.ExportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mmoduleDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMmoduleDeclaration(JuliaParser.MmoduleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ttypeDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtypeDeclaration(JuliaParser.TtypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ffunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFfunctionDeclaration(JuliaParser.FfunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mmacroDeclaration}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMmacroDeclaration(JuliaParser.MmacroDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(JuliaParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidReturn}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidReturn(JuliaParser.VoidReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JuliaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(JuliaParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JuliaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JuliaParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JuliaParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quoteStatement}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoteStatement(JuliaParser.QuoteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JuliaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code module}
	 * labeled alternative in {@link JuliaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(JuliaParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bareModule}
	 * labeled alternative in {@link JuliaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBareModule(JuliaParser.BareModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaParser#macroDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroDeclaration(JuliaParser.MacroDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tt}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTt(JuliaParser.TtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(JuliaParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code octal}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal(JuliaParser.OctalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(JuliaParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrow}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow(JuliaParser.ArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryConditional(JuliaParser.TernaryConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicative}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(JuliaParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyFunction(JuliaParser.ApplyFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveBlock}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveBlock(JuliaParser.PrimitiveBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseNot}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseNot(JuliaParser.BitwiseNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code coeffient}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoeffient(JuliaParser.CoeffientContext ctx);
	/**
	 * Visit a parse tree produced by the {@code character}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(JuliaParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(JuliaParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dollarExp}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollarExp(JuliaParser.DollarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(JuliaParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(JuliaParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration(JuliaParser.EnumerationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ffloat32}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFfloat32(JuliaParser.Ffloat32Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exponent}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(JuliaParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JuliaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hexFloat}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexFloat(JuliaParser.HexFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitShift}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitShift(JuliaParser.BitShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code implicitTuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitTuple(JuliaParser.ImplicitTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(JuliaParser.InContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryCatch}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(JuliaParser.TryCatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tbc1}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbc1(JuliaParser.Tbc1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lazyOr}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyOr(JuliaParser.LazyOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comprehension}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComprehension(JuliaParser.ComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(JuliaParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(JuliaParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(JuliaParser.RegexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operatorSymbol}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorSymbol(JuliaParser.OperatorSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(JuliaParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(JuliaParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subType}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubType(JuliaParser.SubTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code endLiteral}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndLiteral(JuliaParser.EndLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesised}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesised(JuliaParser.ParenthesisedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyTuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyTuple(JuliaParser.EmptyTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ff}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFf(JuliaParser.FfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(JuliaParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JuliaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonymousFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(JuliaParser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(JuliaParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code range}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(JuliaParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code global}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(JuliaParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code local}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal(JuliaParser.LocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(JuliaParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(JuliaParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code times}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes(JuliaParser.TimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aditive}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAditive(JuliaParser.AditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lazyAnd}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyAnd(JuliaParser.LazyAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rational}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRational(JuliaParser.RationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ccall}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCcall(JuliaParser.CcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaryConditional(JuliaParser.NaryConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyPrecedng}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyPrecedng(JuliaParser.ApplyPrecedngContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JuliaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(JuliaParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedExpression(JuliaParser.TypedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(JuliaParser.SimpleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryPlus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlus(JuliaParser.UnaryPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyOperator}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyOperator(JuliaParser.ApplyOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(JuliaParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transpose}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranspose(JuliaParser.TransposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(JuliaParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ffloat64}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFfloat64(JuliaParser.Ffloat64Context ctx);
	/**
	 * Visit a parse tree produced by the {@code macroInvoke}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroInvoke(JuliaParser.MacroInvokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ttypeExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtypeExpression(JuliaParser.TtypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(JuliaParser.UnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parametricType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametricType(JuliaParser.ParametricTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predefinedType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedType(JuliaParser.PredefinedTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compactFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactFunctionDeclaration(JuliaParser.CompactFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generalFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralFunctionDeclaration(JuliaParser.GeneralFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pparameters}
	 * labeled alternative in {@link JuliaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPparameters(JuliaParser.PparametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedTypedParam(JuliaParser.NamedTypedParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonymousTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousTypedParam(JuliaParser.AnonymousTypedParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vararg}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVararg(JuliaParser.VarargContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedParam(JuliaParser.NamedParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAlias}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlias(JuliaParser.TypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractType(JuliaParser.AbstractTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitsSubtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitsSubtype(JuliaParser.BitsSubtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitsTtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitsTtype(JuliaParser.BitsTtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutableTypeDeclaration(JuliaParser.MutableTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code immutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmutableTypeDeclaration(JuliaParser.ImmutableTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedFieldDeclaration(JuliaParser.TypedFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code untypedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntypedFieldDeclaration(JuliaParser.UntypedFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ttypeParameters}
	 * labeled alternative in {@link JuliaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtypeParameters(JuliaParser.TtypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constrainedType}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrainedType(JuliaParser.ConstrainedTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonymousType}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousType(JuliaParser.AnonymousTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionType}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionType(JuliaParser.ExpressionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionName}
	 * labeled alternative in {@link JuliaParser#fnID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(JuliaParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionSymbol}
	 * labeled alternative in {@link JuliaParser#fnID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSymbol(JuliaParser.FunctionSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisedFnID}
	 * labeled alternative in {@link JuliaParser#fnID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisedFnID(JuliaParser.ParenthesisedFnIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JuliaParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(JuliaParser.NameContext ctx);
}