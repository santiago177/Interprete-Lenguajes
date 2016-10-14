// Generated from PSeint.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PSeintParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PSeintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PSeintParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(PSeintParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#subprl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprl(PSeintParser.SubprlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(PSeintParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#subproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproc(PSeintParser.SubprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#endproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndproc(PSeintParser.EndprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#endsubproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndsubproc(PSeintParser.EndsubprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PSeintParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#l5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL5(PSeintParser.L5Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#storcom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorcom(PSeintParser.StorcomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#subpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpr(PSeintParser.SubprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(PSeintParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#t1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT1(PSeintParser.T1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PSeintParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#argl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgl(PSeintParser.ArglContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#l10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL10(PSeintParser.L10Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#t2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT2(PSeintParser.T2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PSeintParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom(PSeintParser.ComContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#comid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComid(PSeintParser.ComidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(PSeintParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#l3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL3(PSeintParser.L3Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(PSeintParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#asigcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigcall(PSeintParser.AsigcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#t4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT4(PSeintParser.T4Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(PSeintParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#opexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpexpr(PSeintParser.OpexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#l11}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL11(PSeintParser.L11Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PSeintParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#l2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL2(PSeintParser.L2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#exprl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprl(PSeintParser.ExprlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#stif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStif(PSeintParser.StifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(PSeintParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#stfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStfor(PSeintParser.StforContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(PSeintParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#stwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStwhile(PSeintParser.StwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#dowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(PSeintParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#stswitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStswitch(PSeintParser.StswitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#casel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasel(PSeintParser.CaselContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#stdefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdefault(PSeintParser.StdefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#l4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL4(PSeintParser.L4Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(PSeintParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#idorv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdorv(PSeintParser.IdorvContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#t8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT8(PSeintParser.T8Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#l1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL1(PSeintParser.L1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#oasig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOasig(PSeintParser.OasigContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#idxorv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdxorv(PSeintParser.IdxorvContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#t9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT9(PSeintParser.T9Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(PSeintParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#cls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCls(PSeintParser.ClsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#clean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClean(PSeintParser.CleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#spwait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpwait(PSeintParser.SpwaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#t3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT3(PSeintParser.T3Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(PSeintParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PSeintParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#eA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEA(PSeintParser.EAContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#eB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEB(PSeintParser.EBContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#eC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEC(PSeintParser.ECContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#eD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitED(PSeintParser.EDContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#eE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEE(PSeintParser.EEContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#eF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEF(PSeintParser.EFContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#eG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEG(PSeintParser.EGContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#eH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEH(PSeintParser.EHContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#t7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT7(PSeintParser.T7Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#parexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(PSeintParser.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#t6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT6(PSeintParser.T6Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#tok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTok(PSeintParser.TokContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PSeintParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#t5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT5(PSeintParser.T5Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#cor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCor(PSeintParser.CorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(PSeintParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#unop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop(PSeintParser.UnopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeintParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PSeintParser.TipoContext ctx);
}