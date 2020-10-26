// Generated from C:/Users/Manuel/OneDrive/Documentos/Grado Ing Informatica/4º/PL2020/PROCESADORES DE LENGUAJES/Proyecto-ANKEMADA/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(Anasint.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(Anasint.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Anasint.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Anasint.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 */
	void enterDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 */
	void exitDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(Anasint.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(Anasint.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Anasint.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Anasint.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 */
	void enterSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 */
	void exitSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(Anasint.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(Anasint.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(Anasint.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(Anasint.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Anasint.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Anasint.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo_func}.
	 * @param ctx the parse tree
	 */
	void enterTipo_func(Anasint.Tipo_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo_func}.
	 * @param ctx the parse tree
	 */
	void exitTipo_func(Anasint.Tipo_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#encabezado_proc}.
	 * @param ctx the parse tree
	 */
	void enterEncabezado_proc(Anasint.Encabezado_procContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#encabezado_proc}.
	 * @param ctx the parse tree
	 */
	void exitEncabezado_proc(Anasint.Encabezado_procContext ctx);
}