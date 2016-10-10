// Generated from PSeint.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSeintParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DE=1, HACER=2, TEXTO=3, TOKEN_MAYOR_IGUAL=4, FINMIENTRAS=5, FINSEGUN=6, 
		MODO=7, FINPROCESO=8, TOKEN_PAR_IZQ=9, REPETIR=10, TOKEN_NEG=11, DEFINIR=12, 
		COMO=13, TOKEN_DIV=14, TOKEN_MAYOR=15, PROCESO=16, VERDADERO=17, DIMENSION=18, 
		TOKEN_COMA=19, LIMPIAR=20, ID=21, FINSUBALGORITMO=22, TOKEN_CADENA=23, 
		QUE=24, BORRAR=25, TOKEN_MENOR=26, TOKEN_MUL=27, CASO=28, TOKEN_IGUAL=29, 
		TOKEN_MENOS=30, TECLA=31, ENTERO=32, PASO=33, ENTONCES=34, SINO=35, MINUTOS=36, 
		TOKEN_ENTERO=37, SUBALGORITMO=38, ESPERAR=39, REAL=40, SEGUN=41, FINPARA=42, 
		TOKEN_MENOR_IGUAL=43, TOKEN_MAS=44, TOKEN_COR_IZQ=45, SUBPROCESO=46, LEER=47, 
		PARA=48, FINFUNCION=49, TOKEN_ASIG=50, OTRO=51, FUNCION=52, FINSUBPROCESO=53, 
		ESCRIBIR=54, FINALGORITMO=55, SEGUNDOS=56, TOKEN_POT=57, SI=58, CADENA=59, 
		TOKEN_PAR_DER=60, TOKEN_DIF=61, CON=62, ALGORITMO=63, TOKEN_MOD=64, MIENTRAS=65, 
		NUMERICO=66, TOKEN_Y=67, TOKEN_PYC=68, CARACTER=69, HASTA=70, TOKEN_O=71, 
		MILISEGUNDOS=72, FALSO=73, TOKEN_COR_DER=74, NUMERO=75, LOGICO=76, TOKEN_DOSP=77, 
		PANTALLA=78, TOKEN_REAL=79, FINSI=80, WS=81;
	public static final int
		RULE_s = 0, RULE_subprl = 1, RULE_proc = 2, RULE_subproc = 3, RULE_endproc = 4, 
		RULE_endsubproc = 5, RULE_block = 6, RULE_l5 = 7, RULE_storcom = 8, RULE_subpr = 9, 
		RULE_ret = 10, RULE_t1 = 11, RULE_args = 12, RULE_argl = 13, RULE_t2 = 14, 
		RULE_statement = 15, RULE_com = 16, RULE_comid = 17, RULE_write = 18, 
		RULE_l3 = 19, RULE_read = 20, RULE_asigcall = 21, RULE_t4 = 22, RULE_call = 23, 
		RULE_opexpr = 24, RULE_array = 25, RULE_l2 = 26, RULE_exprl = 27, RULE_stif = 28, 
		RULE_elif = 29, RULE_stfor = 30, RULE_step = 31, RULE_stwhile = 32, RULE_dowhile = 33, 
		RULE_stswitch = 34, RULE_casel = 35, RULE_stdefault = 36, RULE_l4 = 37, 
		RULE_def = 38, RULE_idorv = 39, RULE_t8 = 40, RULE_l1 = 41, RULE_oasig = 42, 
		RULE_idxorv = 43, RULE_t9 = 44, RULE_asig = 45, RULE_cls = 46, RULE_clean = 47, 
		RULE_nwait = 48, RULE_t3 = 49, RULE_time = 50, RULE_expr = 51, RULE_t7 = 52, 
		RULE_parexpr = 53, RULE_t6 = 54, RULE_tok = 55, RULE_t5 = 56, RULE_cor = 57, 
		RULE_op = 58, RULE_unop = 59, RULE_tipo = 60;
	public static final String[] ruleNames = {
		"s", "subprl", "proc", "subproc", "endproc", "endsubproc", "block", "l5", 
		"storcom", "subpr", "ret", "t1", "args", "argl", "t2", "statement", "com", 
		"comid", "write", "l3", "read", "asigcall", "t4", "call", "opexpr", "array", 
		"l2", "exprl", "stif", "elif", "stfor", "step", "stwhile", "dowhile", 
		"stswitch", "casel", "stdefault", "l4", "def", "idorv", "t8", "l1", "oasig", 
		"idxorv", "t9", "asig", "cls", "clean", "nwait", "t3", "time", "expr", 
		"t7", "parexpr", "t6", "tok", "t5", "cor", "op", "unop", "tipo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'de'", "'hacer'", "'texto'", "'token_mayor_igual'", "'finmientras'", 
		"'finsegun'", "'modo'", "'finproceso'", "'token_par_izq'", "'repetir'", 
		"'token_neg'", "'definir'", "'como'", "'token_div'", "'token_mayor'", 
		"'proceso'", "'verdadero'", "'dimension'", "'token_coma'", "'limpiar'", 
		null, "'finsubalgoritmo'", null, "'que'", "'borrar'", "'token_menor'", 
		"'token_mul'", "'caso'", "'token_igual'", "'token_menos'", "'tecla'", 
		"'entero'", "'paso'", "'entonces'", "'sino'", "'minutos'", null, "'subalgoritmo'", 
		"'esperar'", "'real'", "'segun'", "'finpara'", "'token_menor_igual'", 
		"'token_mas'", "'token_cor_izq'", "'subproceso'", "'leer'", "'para'", 
		"'finfuncion'", "'token_asig'", "'otro'", "'funcion'", "'finsubproceso'", 
		"'escribir'", "'finalgoritmo'", "'segundos'", "'token_pot'", "'si'", "'cadena'", 
		"'token_par_der'", "'token_dif'", "'con'", "'algoritmo'", "'token_mod'", 
		"'mientras'", "'numerico'", "'token_y'", "'token_pyc'", "'caracter'", 
		"'hasta'", "'token_o'", "'milisegundos'", "'falso'", "'token_cor_der'", 
		"'numero'", "'logico'", "'token_dosp'", "'pantalla'", "'token_real'", 
		"'finsi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DE", "HACER", "TEXTO", "TOKEN_MAYOR_IGUAL", "FINMIENTRAS", "FINSEGUN", 
		"MODO", "FINPROCESO", "TOKEN_PAR_IZQ", "REPETIR", "TOKEN_NEG", "DEFINIR", 
		"COMO", "TOKEN_DIV", "TOKEN_MAYOR", "PROCESO", "VERDADERO", "DIMENSION", 
		"TOKEN_COMA", "LIMPIAR", "ID", "FINSUBALGORITMO", "TOKEN_CADENA", "QUE", 
		"BORRAR", "TOKEN_MENOR", "TOKEN_MUL", "CASO", "TOKEN_IGUAL", "TOKEN_MENOS", 
		"TECLA", "ENTERO", "PASO", "ENTONCES", "SINO", "MINUTOS", "TOKEN_ENTERO", 
		"SUBALGORITMO", "ESPERAR", "REAL", "SEGUN", "FINPARA", "TOKEN_MENOR_IGUAL", 
		"TOKEN_MAS", "TOKEN_COR_IZQ", "SUBPROCESO", "LEER", "PARA", "FINFUNCION", 
		"TOKEN_ASIG", "OTRO", "FUNCION", "FINSUBPROCESO", "ESCRIBIR", "FINALGORITMO", 
		"SEGUNDOS", "TOKEN_POT", "SI", "CADENA", "TOKEN_PAR_DER", "TOKEN_DIF", 
		"CON", "ALGORITMO", "TOKEN_MOD", "MIENTRAS", "NUMERICO", "TOKEN_Y", "TOKEN_PYC", 
		"CARACTER", "HASTA", "TOKEN_O", "MILISEGUNDOS", "FALSO", "TOKEN_COR_DER", 
		"NUMERO", "LOGICO", "TOKEN_DOSP", "PANTALLA", "TOKEN_REAL", "FINSI", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PSeint.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSeintParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public SubprlContext subprl() {
			return getRuleContext(SubprlContext.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EndprocContext endproc() {
			return getRuleContext(EndprocContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			subprl();
			setState(123);
			proc();
			setState(124);
			match(ID);
			setState(125);
			block();
			setState(126);
			endproc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubprlContext extends ParserRuleContext {
		public SubprContext subpr() {
			return getRuleContext(SubprContext.class,0);
		}
		public SubprlContext subprl() {
			return getRuleContext(SubprlContext.class,0);
		}
		public SubprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterSubprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitSubprl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitSubprl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprlContext subprl() throws RecognitionException {
		SubprlContext _localctx = new SubprlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subprl);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case SUBALGORITMO:
			case SUBPROCESO:
			case FUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				subpr();
				setState(129);
				subprl();
				}
				break;
			case PROCESO:
			case ALGORITMO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode PROCESO() { return getToken(PSeintParser.PROCESO, 0); }
		public TerminalNode ALGORITMO() { return getToken(PSeintParser.ALGORITMO, 0); }
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==PROCESO || _la==ALGORITMO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubprocContext extends ParserRuleContext {
		public TerminalNode SUBPROCESO() { return getToken(PSeintParser.SUBPROCESO, 0); }
		public TerminalNode SUBALGORITMO() { return getToken(PSeintParser.SUBALGORITMO, 0); }
		public TerminalNode FUNCION() { return getToken(PSeintParser.FUNCION, 0); }
		public SubprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterSubproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitSubproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitSubproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprocContext subproc() throws RecognitionException {
		SubprocContext _localctx = new SubprocContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subproc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBALGORITMO) | (1L << SUBPROCESO) | (1L << FUNCION))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndprocContext extends ParserRuleContext {
		public TerminalNode FINPROCESO() { return getToken(PSeintParser.FINPROCESO, 0); }
		public TerminalNode FINALGORITMO() { return getToken(PSeintParser.FINALGORITMO, 0); }
		public EndprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterEndproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitEndproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitEndproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndprocContext endproc() throws RecognitionException {
		EndprocContext _localctx = new EndprocContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_endproc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==FINPROCESO || _la==FINALGORITMO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndsubprocContext extends ParserRuleContext {
		public TerminalNode FINSUBPROCESO() { return getToken(PSeintParser.FINSUBPROCESO, 0); }
		public TerminalNode FINSUBALGORITMO() { return getToken(PSeintParser.FINSUBALGORITMO, 0); }
		public TerminalNode FINFUNCION() { return getToken(PSeintParser.FINFUNCION, 0); }
		public EndsubprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endsubproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterEndsubproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitEndsubproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitEndsubproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndsubprocContext endsubproc() throws RecognitionException {
		EndsubprocContext _localctx = new EndsubprocContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endsubproc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINSUBALGORITMO) | (1L << FINFUNCION) | (1L << FINSUBPROCESO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StorcomContext storcom() {
			return getRuleContext(StorcomContext.class,0);
		}
		public L5Context l5() {
			return getRuleContext(L5Context.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case DE:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPROCESO:
			case FINSUBALGORITMO:
			case CASO:
			case SINO:
			case FINPARA:
			case FINFUNCION:
			case FINSUBPROCESO:
			case FINALGORITMO:
			case HASTA:
			case FINSI:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case REPETIR:
			case DEFINIR:
			case DIMENSION:
			case LIMPIAR:
			case ID:
			case BORRAR:
			case ESPERAR:
			case SEGUN:
			case LEER:
			case PARA:
			case ESCRIBIR:
			case SI:
			case MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				storcom();
				setState(144);
				l5();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L5Context extends ParserRuleContext {
		public StorcomContext storcom() {
			return getRuleContext(StorcomContext.class,0);
		}
		public L5Context l5() {
			return getRuleContext(L5Context.class,0);
		}
		public L5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterL5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitL5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitL5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L5Context l5() throws RecognitionException {
		L5Context _localctx = new L5Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_l5);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case REPETIR:
			case DEFINIR:
			case DIMENSION:
			case LIMPIAR:
			case ID:
			case BORRAR:
			case ESPERAR:
			case SEGUN:
			case LEER:
			case PARA:
			case ESCRIBIR:
			case SI:
			case MIENTRAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				storcom();
				setState(149);
				l5();
				}
				break;
			case DE:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPROCESO:
			case FINSUBALGORITMO:
			case CASO:
			case SINO:
			case FINPARA:
			case FINFUNCION:
			case FINSUBPROCESO:
			case FINALGORITMO:
			case HASTA:
			case FINSI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorcomContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public StorcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterStorcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitStorcom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitStorcom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorcomContext storcom() throws RecognitionException {
		StorcomContext _localctx = new StorcomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_storcom);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case REPETIR:
			case SEGUN:
			case PARA:
			case SI:
			case MIENTRAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				statement();
				}
				break;
			case DEFINIR:
			case DIMENSION:
			case LIMPIAR:
			case ID:
			case BORRAR:
			case ESPERAR:
			case LEER:
			case ESCRIBIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				com();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubprContext extends ParserRuleContext {
		public SubprocContext subproc() {
			return getRuleContext(SubprocContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EndsubprocContext endsubproc() {
			return getRuleContext(EndsubprocContext.class,0);
		}
		public SubprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterSubpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitSubpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitSubpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprContext subpr() throws RecognitionException {
		SubprContext _localctx = new SubprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			subproc();
			setState(159);
			ret();
			setState(160);
			args();
			setState(161);
			block();
			setState(162);
			endsubproc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public T1Context t1() {
			return getRuleContext(T1Context.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
			setState(165);
			t1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T1Context extends ParserRuleContext {
		public TerminalNode TOKEN_ASIG() { return getToken(PSeintParser.TOKEN_ASIG, 0); }
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public T1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitT1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T1Context t1() throws RecognitionException {
		T1Context _localctx = new T1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_t1);
		try {
			setState(170);
			switch (_input.LA(1)) {
			case TOKEN_ASIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(TOKEN_ASIG);
				setState(168);
				match(ID);
				}
				break;
			case TOKEN_PAR_IZQ:
			case REPETIR:
			case DEFINIR:
			case DIMENSION:
			case LIMPIAR:
			case ID:
			case FINSUBALGORITMO:
			case BORRAR:
			case ESPERAR:
			case SEGUN:
			case LEER:
			case PARA:
			case FINFUNCION:
			case FINSUBPROCESO:
			case ESCRIBIR:
			case SI:
			case MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(PSeintParser.TOKEN_PAR_IZQ, 0); }
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_args);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(TOKEN_PAR_IZQ);
				setState(173);
				t2();
				}
				break;
			case REPETIR:
			case DEFINIR:
			case DIMENSION:
			case LIMPIAR:
			case ID:
			case FINSUBALGORITMO:
			case BORRAR:
			case ESPERAR:
			case SEGUN:
			case LEER:
			case PARA:
			case FINFUNCION:
			case FINSUBPROCESO:
			case ESCRIBIR:
			case SI:
			case MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArglContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public L1Context l1() {
			return getRuleContext(L1Context.class,0);
		}
		public ArglContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterArgl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitArgl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitArgl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglContext argl() throws RecognitionException {
		ArglContext _localctx = new ArglContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			l1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T2Context extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_DER() { return getToken(PSeintParser.TOKEN_PAR_DER, 0); }
		public ArglContext argl() {
			return getRuleContext(ArglContext.class,0);
		}
		public T2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterT2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitT2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitT2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T2Context t2() throws RecognitionException {
		T2Context _localctx = new T2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_t2);
		try {
			setState(184);
			switch (_input.LA(1)) {
			case TOKEN_PAR_DER:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(TOKEN_PAR_DER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				argl();
				setState(182);
				match(TOKEN_PAR_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StifContext stif() {
			return getRuleContext(StifContext.class,0);
		}
		public StwhileContext stwhile() {
			return getRuleContext(StwhileContext.class,0);
		}
		public DowhileContext dowhile() {
			return getRuleContext(DowhileContext.class,0);
		}
		public StswitchContext stswitch() {
			return getRuleContext(StswitchContext.class,0);
		}
		public StforContext stfor() {
			return getRuleContext(StforContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				stif();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				stwhile();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				dowhile();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				stswitch();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				stfor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComContext extends ParserRuleContext {
		public ComidContext comid() {
			return getRuleContext(ComidContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(PSeintParser.TOKEN_PYC, 0); }
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_com);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			comid();
			setState(194);
			match(TOKEN_PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComidContext extends ParserRuleContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public AsigcallContext asigcall() {
			return getRuleContext(AsigcallContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ClsContext cls() {
			return getRuleContext(ClsContext.class,0);
		}
		public NwaitContext nwait() {
			return getRuleContext(NwaitContext.class,0);
		}
		public ComidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterComid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitComid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitComid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComidContext comid() throws RecognitionException {
		ComidContext _localctx = new ComidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comid);
		try {
			setState(203);
			switch (_input.LA(1)) {
			case DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				def();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				asigcall();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				write();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				read();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				array();
				}
				break;
			case LIMPIAR:
			case BORRAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				cls();
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				nwait();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(PSeintParser.ESCRIBIR, 0); }
		public TerminalNode TOKEN_ENTERO() { return getToken(PSeintParser.TOKEN_ENTERO, 0); }
		public L3Context l3() {
			return getRuleContext(L3Context.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ESCRIBIR);
			setState(206);
			match(TOKEN_ENTERO);
			setState(207);
			l3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L3Context extends ParserRuleContext {
		public TerminalNode TOKEN_COMA() { return getToken(PSeintParser.TOKEN_COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public L3Context l3() {
			return getRuleContext(L3Context.class,0);
		}
		public L3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterL3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitL3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitL3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L3Context l3() throws RecognitionException {
		L3Context _localctx = new L3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_l3);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(TOKEN_COMA);
				setState(210);
				expr();
				setState(211);
				l3();
				}
				break;
			case TOKEN_PAR_DER:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(PSeintParser.LEER, 0); }
		public IdorvContext idorv() {
			return getRuleContext(IdorvContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LEER);
			setState(217);
			idorv();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsigcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public T9Context t9() {
			return getRuleContext(T9Context.class,0);
		}
		public T4Context t4() {
			return getRuleContext(T4Context.class,0);
		}
		public AsigcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterAsigcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitAsigcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitAsigcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigcallContext asigcall() throws RecognitionException {
		AsigcallContext _localctx = new AsigcallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asigcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ID);
			setState(220);
			t9();
			setState(221);
			t4();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T4Context extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public T4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterT4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitT4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitT4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T4Context t4() throws RecognitionException {
		T4Context _localctx = new T4Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_t4);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				call();
				}
				break;
			case TOKEN_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				asig();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(PSeintParser.TOKEN_PAR_IZQ, 0); }
		public OpexprContext opexpr() {
			return getRuleContext(OpexprContext.class,0);
		}
		public L3Context l3() {
			return getRuleContext(L3Context.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(PSeintParser.TOKEN_PAR_DER, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_call);
		try {
			setState(233);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(TOKEN_PAR_IZQ);
				setState(228);
				opexpr();
				setState(229);
				l3();
				setState(230);
				match(TOKEN_PAR_DER);
				}
				break;
			case DE:
			case HACER:
			case TOKEN_MAYOR_IGUAL:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPROCESO:
			case REPETIR:
			case DEFINIR:
			case TOKEN_DIV:
			case TOKEN_MAYOR:
			case DIMENSION:
			case TOKEN_COMA:
			case LIMPIAR:
			case ID:
			case FINSUBALGORITMO:
			case BORRAR:
			case TOKEN_MENOR:
			case TOKEN_MUL:
			case CASO:
			case TOKEN_IGUAL:
			case TOKEN_MENOS:
			case ENTONCES:
			case SINO:
			case MINUTOS:
			case ESPERAR:
			case SEGUN:
			case FINPARA:
			case TOKEN_MENOR_IGUAL:
			case TOKEN_MAS:
			case LEER:
			case PARA:
			case FINFUNCION:
			case FINSUBPROCESO:
			case ESCRIBIR:
			case FINALGORITMO:
			case SEGUNDOS:
			case TOKEN_POT:
			case SI:
			case TOKEN_PAR_DER:
			case TOKEN_DIF:
			case CON:
			case TOKEN_MOD:
			case MIENTRAS:
			case TOKEN_Y:
			case TOKEN_PYC:
			case HASTA:
			case TOKEN_O:
			case MILISEGUNDOS:
			case TOKEN_COR_DER:
			case TOKEN_DOSP:
			case FINSI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterOpexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitOpexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitOpexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpexprContext opexpr() throws RecognitionException {
		OpexprContext _localctx = new OpexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opexpr);
		try {
			setState(237);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
			case TOKEN_NEG:
			case VERDADERO:
			case ID:
			case TOKEN_CADENA:
			case TOKEN_MENOS:
			case TOKEN_ENTERO:
			case FALSO:
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				expr();
				}
				break;
			case TOKEN_COMA:
			case TOKEN_PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(PSeintParser.DIMENSION, 0); }
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public TerminalNode TOKEN_COR_IZQ() { return getToken(PSeintParser.TOKEN_COR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlContext exprl() {
			return getRuleContext(ExprlContext.class,0);
		}
		public TerminalNode TOKEN_COR_DER() { return getToken(PSeintParser.TOKEN_COR_DER, 0); }
		public L2Context l2() {
			return getRuleContext(L2Context.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DIMENSION);
			setState(240);
			match(ID);
			setState(241);
			match(TOKEN_COR_IZQ);
			setState(242);
			expr();
			setState(243);
			exprl();
			setState(244);
			match(TOKEN_COR_DER);
			setState(245);
			l2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L2Context extends ParserRuleContext {
		public TerminalNode TOKEN_COMA() { return getToken(PSeintParser.TOKEN_COMA, 0); }
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public TerminalNode TOKEN_COR_IZQ() { return getToken(PSeintParser.TOKEN_COR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlContext exprl() {
			return getRuleContext(ExprlContext.class,0);
		}
		public TerminalNode TOKEN_COR_DER() { return getToken(PSeintParser.TOKEN_COR_DER, 0); }
		public L2Context l2() {
			return getRuleContext(L2Context.class,0);
		}
		public L2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterL2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitL2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitL2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L2Context l2() throws RecognitionException {
		L2Context _localctx = new L2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_l2);
		try {
			setState(256);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(TOKEN_COMA);
				setState(248);
				match(ID);
				setState(249);
				match(TOKEN_COR_IZQ);
				setState(250);
				expr();
				setState(251);
				exprl();
				setState(252);
				match(TOKEN_COR_DER);
				setState(253);
				l2();
				}
				break;
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprlContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMA() { return getToken(PSeintParser.TOKEN_COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitExprl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitExprl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprl);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(TOKEN_COMA);
				setState(259);
				expr();
				}
				break;
			case TOKEN_COR_DER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StifContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PSeintParser.SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(PSeintParser.ENTONCES, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifContext elif() {
			return getRuleContext(ElifContext.class,0);
		}
		public TerminalNode FINSI() { return getToken(PSeintParser.FINSI, 0); }
		public StifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterStif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitStif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitStif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StifContext stif() throws RecognitionException {
		StifContext _localctx = new StifContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(SI);
			setState(264);
			expr();
			setState(265);
			match(ENTONCES);
			setState(266);
			block();
			setState(267);
			elif();
			setState(268);
			match(FINSI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(PSeintParser.SINO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elif);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(SINO);
				setState(271);
				block();
				}
				break;
			case FINSI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StforContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PSeintParser.PARA, 0); }
		public OasigContext oasig() {
			return getRuleContext(OasigContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(PSeintParser.HASTA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PSeintParser.HACER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FINPARA() { return getToken(PSeintParser.FINPARA, 0); }
		public StforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterStfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitStfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitStfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StforContext stfor() throws RecognitionException {
		StforContext _localctx = new StforContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(PARA);
			setState(276);
			oasig();
			setState(277);
			match(HASTA);
			setState(278);
			expr();
			setState(279);
			step();
			setState(280);
			match(HACER);
			setState(281);
			block();
			setState(282);
			match(FINPARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(PSeintParser.CON, 0); }
		public TerminalNode PASO() { return getToken(PSeintParser.PASO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_step);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(CON);
				setState(285);
				match(PASO);
				setState(286);
				expr();
				}
				break;
			case HACER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StwhileContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PSeintParser.MIENTRAS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PSeintParser.HACER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FINMIENTRAS() { return getToken(PSeintParser.FINMIENTRAS, 0); }
		public StwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterStwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitStwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitStwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StwhileContext stwhile() throws RecognitionException {
		StwhileContext _localctx = new StwhileContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(MIENTRAS);
			setState(291);
			expr();
			setState(292);
			match(HACER);
			setState(293);
			block();
			setState(294);
			match(FINMIENTRAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DowhileContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(PSeintParser.REPETIR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(PSeintParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(PSeintParser.QUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(REPETIR);
			setState(297);
			block();
			setState(298);
			match(HASTA);
			setState(299);
			match(QUE);
			setState(300);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StswitchContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(PSeintParser.SEGUN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PSeintParser.HACER, 0); }
		public CaselContext casel() {
			return getRuleContext(CaselContext.class,0);
		}
		public TerminalNode FINSEGUN() { return getToken(PSeintParser.FINSEGUN, 0); }
		public StswitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stswitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterStswitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitStswitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitStswitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StswitchContext stswitch() throws RecognitionException {
		StswitchContext _localctx = new StswitchContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(SEGUN);
			setState(303);
			expr();
			setState(304);
			match(HACER);
			setState(305);
			casel();
			setState(306);
			match(FINSEGUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaselContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PSeintParser.CASO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_DOSP() { return getToken(PSeintParser.TOKEN_DOSP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public L4Context l4() {
			return getRuleContext(L4Context.class,0);
		}
		public StdefaultContext stdefault() {
			return getRuleContext(StdefaultContext.class,0);
		}
		public CaselContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterCasel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitCasel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitCasel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaselContext casel() throws RecognitionException {
		CaselContext _localctx = new CaselContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_casel);
		try {
			setState(316);
			switch (_input.LA(1)) {
			case FINSEGUN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(CASO);
				setState(310);
				expr();
				setState(311);
				match(TOKEN_DOSP);
				setState(312);
				block();
				setState(313);
				l4();
				setState(314);
				stdefault();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StdefaultContext extends ParserRuleContext {
		public TerminalNode DE() { return getToken(PSeintParser.DE, 0); }
		public TerminalNode OTRO() { return getToken(PSeintParser.OTRO, 0); }
		public TerminalNode MODO() { return getToken(PSeintParser.MODO, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(PSeintParser.TOKEN_DOSP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StdefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterStdefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitStdefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitStdefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StdefaultContext stdefault() throws RecognitionException {
		StdefaultContext _localctx = new StdefaultContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stdefault);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case DE:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(DE);
				setState(319);
				match(OTRO);
				setState(320);
				match(MODO);
				setState(321);
				match(TOKEN_DOSP);
				setState(322);
				block();
				}
				break;
			case FINSEGUN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L4Context extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PSeintParser.CASO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_DOSP() { return getToken(PSeintParser.TOKEN_DOSP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public L4Context l4() {
			return getRuleContext(L4Context.class,0);
		}
		public L4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterL4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitL4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitL4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L4Context l4() throws RecognitionException {
		L4Context _localctx = new L4Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_l4);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(CASO);
				setState(327);
				expr();
				setState(328);
				match(TOKEN_DOSP);
				setState(329);
				block();
				setState(330);
				l4();
				}
				break;
			case DE:
			case FINSEGUN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(PSeintParser.DEFINIR, 0); }
		public IdorvContext idorv() {
			return getRuleContext(IdorvContext.class,0);
		}
		public TerminalNode COMO() { return getToken(PSeintParser.COMO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(DEFINIR);
			setState(336);
			idorv();
			setState(337);
			match(COMO);
			setState(338);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdorvContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public T8Context t8() {
			return getRuleContext(T8Context.class,0);
		}
		public IdorvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idorv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterIdorv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitIdorv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitIdorv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdorvContext idorv() throws RecognitionException {
		IdorvContext _localctx = new IdorvContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_idorv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ID);
			setState(341);
			t8();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T8Context extends ParserRuleContext {
		public L1Context l1() {
			return getRuleContext(L1Context.class,0);
		}
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public T8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterT8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitT8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitT8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T8Context t8() throws RecognitionException {
		T8Context _localctx = new T8Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_t8);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case COMO:
			case TOKEN_COMA:
			case TOKEN_PAR_DER:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				l1();
				}
				break;
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				cor();
				setState(345);
				l1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L1Context extends ParserRuleContext {
		public TerminalNode TOKEN_COMA() { return getToken(PSeintParser.TOKEN_COMA, 0); }
		public IdorvContext idorv() {
			return getRuleContext(IdorvContext.class,0);
		}
		public L1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterL1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitL1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitL1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L1Context l1() throws RecognitionException {
		L1Context _localctx = new L1Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_l1);
		try {
			setState(352);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(TOKEN_COMA);
				setState(350);
				idorv();
				}
				break;
			case COMO:
			case TOKEN_PAR_DER:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OasigContext extends ParserRuleContext {
		public IdxorvContext idxorv() {
			return getRuleContext(IdxorvContext.class,0);
		}
		public TerminalNode TOKEN_ASIG() { return getToken(PSeintParser.TOKEN_ASIG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OasigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oasig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterOasig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitOasig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitOasig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OasigContext oasig() throws RecognitionException {
		OasigContext _localctx = new OasigContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_oasig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			idxorv();
			setState(355);
			match(TOKEN_ASIG);
			setState(356);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdxorvContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public T9Context t9() {
			return getRuleContext(T9Context.class,0);
		}
		public IdxorvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idxorv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterIdxorv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitIdxorv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitIdxorv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdxorvContext idxorv() throws RecognitionException {
		IdxorvContext _localctx = new IdxorvContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_idxorv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ID);
			setState(359);
			t9();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T9Context extends ParserRuleContext {
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public T9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterT9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitT9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitT9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T9Context t9() throws RecognitionException {
		T9Context _localctx = new T9Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_t9);
		try {
			setState(363);
			switch (_input.LA(1)) {
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				cor();
				}
				break;
			case TOKEN_PAR_IZQ:
			case TOKEN_ASIG:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsigContext extends ParserRuleContext {
		public TerminalNode TOKEN_ASIG() { return getToken(PSeintParser.TOKEN_ASIG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(TOKEN_ASIG);
			setState(366);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClsContext extends ParserRuleContext {
		public CleanContext clean() {
			return getRuleContext(CleanContext.class,0);
		}
		public TerminalNode PANTALLA() { return getToken(PSeintParser.PANTALLA, 0); }
		public ClsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterCls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitCls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitCls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsContext cls() throws RecognitionException {
		ClsContext _localctx = new ClsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_cls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			clean();
			setState(369);
			match(PANTALLA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CleanContext extends ParserRuleContext {
		public TerminalNode BORRAR() { return getToken(PSeintParser.BORRAR, 0); }
		public TerminalNode LIMPIAR() { return getToken(PSeintParser.LIMPIAR, 0); }
		public CleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterClean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitClean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitClean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CleanContext clean() throws RecognitionException {
		CleanContext _localctx = new CleanContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_clean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !(_la==LIMPIAR || _la==BORRAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NwaitContext extends ParserRuleContext {
		public TerminalNode ESPERAR() { return getToken(PSeintParser.ESPERAR, 0); }
		public T3Context t3() {
			return getRuleContext(T3Context.class,0);
		}
		public NwaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nwait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterNwait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitNwait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitNwait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NwaitContext nwait() throws RecognitionException {
		NwaitContext _localctx = new NwaitContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nwait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(ESPERAR);
			setState(374);
			t3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T3Context extends ParserRuleContext {
		public TerminalNode TECLA() { return getToken(PSeintParser.TECLA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public T3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterT3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitT3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitT3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T3Context t3() throws RecognitionException {
		T3Context _localctx = new T3Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_t3);
		try {
			setState(380);
			switch (_input.LA(1)) {
			case TECLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(TECLA);
				}
				break;
			case TOKEN_PAR_IZQ:
			case TOKEN_NEG:
			case VERDADERO:
			case ID:
			case TOKEN_CADENA:
			case TOKEN_MENOS:
			case TOKEN_ENTERO:
			case FALSO:
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				expr();
				setState(378);
				time();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode MINUTOS() { return getToken(PSeintParser.MINUTOS, 0); }
		public TerminalNode SEGUNDOS() { return getToken(PSeintParser.SEGUNDOS, 0); }
		public TerminalNode MILISEGUNDOS() { return getToken(PSeintParser.MILISEGUNDOS, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (MINUTOS - 36)) | (1L << (SEGUNDOS - 36)) | (1L << (MILISEGUNDOS - 36)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TokContext tok() {
			return getRuleContext(TokContext.class,0);
		}
		public T7Context t7() {
			return getRuleContext(T7Context.class,0);
		}
		public ParexprContext parexpr() {
			return getRuleContext(ParexprContext.class,0);
		}
		public T6Context t6() {
			return getRuleContext(T6Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expr);
		try {
			setState(390);
			switch (_input.LA(1)) {
			case TOKEN_NEG:
			case VERDADERO:
			case ID:
			case TOKEN_CADENA:
			case TOKEN_MENOS:
			case TOKEN_ENTERO:
			case FALSO:
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				tok();
				setState(385);
				t7();
				}
				break;
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				parexpr();
				setState(388);
				t6();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T7Context extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public T7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterT7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitT7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitT7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T7Context t7() throws RecognitionException {
		T7Context _localctx = new T7Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_t7);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				op();
				setState(393);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParexprContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(PSeintParser.TOKEN_PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(PSeintParser.TOKEN_PAR_DER, 0); }
		public ParexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterParexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitParexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitParexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParexprContext parexpr() throws RecognitionException {
		ParexprContext _localctx = new ParexprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_parexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(TOKEN_PAR_IZQ);
			setState(399);
			expr();
			setState(400);
			match(TOKEN_PAR_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T6Context extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public T6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterT6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitT6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitT6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T6Context t6() throws RecognitionException {
		T6Context _localctx = new T6Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_t6);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				op();
				setState(403);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokContext extends ParserRuleContext {
		public TerminalNode TOKEN_REAL() { return getToken(PSeintParser.TOKEN_REAL, 0); }
		public TerminalNode TOKEN_ENTERO() { return getToken(PSeintParser.TOKEN_ENTERO, 0); }
		public TerminalNode TOKEN_CADENA() { return getToken(PSeintParser.TOKEN_CADENA, 0); }
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public T5Context t5() {
			return getRuleContext(T5Context.class,0);
		}
		public TerminalNode VERDADERO() { return getToken(PSeintParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(PSeintParser.FALSO, 0); }
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public TokContext tok() {
			return getRuleContext(TokContext.class,0);
		}
		public TokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokContext tok() throws RecognitionException {
		TokContext _localctx = new TokContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tok);
		try {
			setState(418);
			switch (_input.LA(1)) {
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(TOKEN_REAL);
				}
				break;
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(TOKEN_ENTERO);
				}
				break;
			case TOKEN_CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				match(TOKEN_CADENA);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				match(ID);
				setState(412);
				t5();
				}
				break;
			case VERDADERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				match(VERDADERO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				match(FALSO);
				}
				break;
			case TOKEN_NEG:
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 7);
				{
				setState(415);
				unop();
				setState(416);
				tok();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T5Context extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public T5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterT5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitT5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitT5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T5Context t5() throws RecognitionException {
		T5Context _localctx = new T5Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_t5);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				cor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorContext extends ParserRuleContext {
		public TerminalNode TOKEN_COR_IZQ() { return getToken(PSeintParser.TOKEN_COR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlContext exprl() {
			return getRuleContext(ExprlContext.class,0);
		}
		public TerminalNode TOKEN_COR_DER() { return getToken(PSeintParser.TOKEN_COR_DER, 0); }
		public CorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterCor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitCor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitCor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorContext cor() throws RecognitionException {
		CorContext _localctx = new CorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(TOKEN_COR_IZQ);
			setState(426);
			expr();
			setState(427);
			exprl();
			setState(428);
			match(TOKEN_COR_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode TOKEN_IGUAL() { return getToken(PSeintParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIF() { return getToken(PSeintParser.TOKEN_DIF, 0); }
		public TerminalNode TOKEN_MENOR() { return getToken(PSeintParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MAYOR() { return getToken(PSeintParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(PSeintParser.TOKEN_MENOR_IGUAL, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(PSeintParser.TOKEN_MAYOR_IGUAL, 0); }
		public TerminalNode TOKEN_MAS() { return getToken(PSeintParser.TOKEN_MAS, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(PSeintParser.TOKEN_MENOS, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(PSeintParser.TOKEN_DIV, 0); }
		public TerminalNode TOKEN_MUL() { return getToken(PSeintParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_MOD() { return getToken(PSeintParser.TOKEN_MOD, 0); }
		public TerminalNode TOKEN_O() { return getToken(PSeintParser.TOKEN_O, 0); }
		public TerminalNode TOKEN_Y() { return getToken(PSeintParser.TOKEN_Y, 0); }
		public TerminalNode TOKEN_COMA() { return getToken(PSeintParser.TOKEN_COMA, 0); }
		public TerminalNode TOKEN_POT() { return getToken(PSeintParser.TOKEN_POT, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_DIV) | (1L << TOKEN_MAYOR) | (1L << TOKEN_COMA) | (1L << TOKEN_MENOR) | (1L << TOKEN_MUL) | (1L << TOKEN_IGUAL) | (1L << TOKEN_MENOS) | (1L << TOKEN_MENOR_IGUAL) | (1L << TOKEN_MAS) | (1L << TOKEN_POT) | (1L << TOKEN_DIF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TOKEN_MOD - 64)) | (1L << (TOKEN_Y - 64)) | (1L << (TOKEN_O - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnopContext extends ParserRuleContext {
		public TerminalNode TOKEN_NEG() { return getToken(PSeintParser.TOKEN_NEG, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(PSeintParser.TOKEN_MENOS, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitUnop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitUnop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_NEG || _la==TOKEN_MENOS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(PSeintParser.REAL, 0); }
		public TerminalNode TEXTO() { return getToken(PSeintParser.TEXTO, 0); }
		public TerminalNode NUMERICO() { return getToken(PSeintParser.NUMERICO, 0); }
		public TerminalNode LOGICO() { return getToken(PSeintParser.LOGICO, 0); }
		public TerminalNode NUMERO() { return getToken(PSeintParser.NUMERO, 0); }
		public TerminalNode CADENA() { return getToken(PSeintParser.CADENA, 0); }
		public TerminalNode ENTERO() { return getToken(PSeintParser.ENTERO, 0); }
		public TerminalNode CARACTER() { return getToken(PSeintParser.CARACTER, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXTO) | (1L << ENTERO) | (1L << REAL) | (1L << CADENA))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NUMERICO - 66)) | (1L << (CARACTER - 66)) | (1L << (NUMERO - 66)) | (1L << (LOGICO - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u01b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0087\n\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0095\n\b\3\t\3\t\3\t\3\t\5"+
		"\t\u009b\n\t\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3\16\5\16\u00b2\n\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\5\20\u00bb\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00c2\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00ce\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d9\n"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00e4\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u00ec\n\31\3\32\3\32\5\32\u00f0\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0103\n\34\3\35\3\35\3\35\5\35\u0108\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u0114\n\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\5!\u0123\n!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u013f\n%\3&\3"+
		"&\3&\3&\3&\3&\5&\u0147\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0150\n\'\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\5*\u015e\n*\3+\3+\3+\5+\u0163\n+\3"+
		",\3,\3,\3,\3-\3-\3-\3.\3.\5.\u016e\n.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u017f\n\63\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u0189\n\65\3\66\3\66\3\66\3\66\5\66\u018f\n"+
		"\66\3\67\3\67\3\67\3\67\38\38\38\38\58\u0199\n8\39\39\39\39\39\39\39\3"+
		"9\39\39\59\u01a5\n9\3:\3:\3:\5:\u01aa\n:\3;\3;\3;\3;\3;\3<\3<\3=\3=\3"+
		">\3>\3>\2\2?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\13\4\2\22\22AA\5\2((\60\60\66"+
		"\66\4\2\n\n99\5\2\30\30\63\63\67\67\4\2\26\26\33\33\5\2&&::JJ\r\2\6\6"+
		"\20\21\25\25\34\35\37 -.;;??BBEEII\4\2\r\r  \t\2\5\5\"\"**==DDGGMN\u01a4"+
		"\2|\3\2\2\2\4\u0086\3\2\2\2\6\u0088\3\2\2\2\b\u008a\3\2\2\2\n\u008c\3"+
		"\2\2\2\f\u008e\3\2\2\2\16\u0094\3\2\2\2\20\u009a\3\2\2\2\22\u009e\3\2"+
		"\2\2\24\u00a0\3\2\2\2\26\u00a6\3\2\2\2\30\u00ac\3\2\2\2\32\u00b1\3\2\2"+
		"\2\34\u00b3\3\2\2\2\36\u00ba\3\2\2\2 \u00c1\3\2\2\2\"\u00c3\3\2\2\2$\u00cd"+
		"\3\2\2\2&\u00cf\3\2\2\2(\u00d8\3\2\2\2*\u00da\3\2\2\2,\u00dd\3\2\2\2."+
		"\u00e3\3\2\2\2\60\u00eb\3\2\2\2\62\u00ef\3\2\2\2\64\u00f1\3\2\2\2\66\u0102"+
		"\3\2\2\28\u0107\3\2\2\2:\u0109\3\2\2\2<\u0113\3\2\2\2>\u0115\3\2\2\2@"+
		"\u0122\3\2\2\2B\u0124\3\2\2\2D\u012a\3\2\2\2F\u0130\3\2\2\2H\u013e\3\2"+
		"\2\2J\u0146\3\2\2\2L\u014f\3\2\2\2N\u0151\3\2\2\2P\u0156\3\2\2\2R\u015d"+
		"\3\2\2\2T\u0162\3\2\2\2V\u0164\3\2\2\2X\u0168\3\2\2\2Z\u016d\3\2\2\2\\"+
		"\u016f\3\2\2\2^\u0172\3\2\2\2`\u0175\3\2\2\2b\u0177\3\2\2\2d\u017e\3\2"+
		"\2\2f\u0180\3\2\2\2h\u0188\3\2\2\2j\u018e\3\2\2\2l\u0190\3\2\2\2n\u0198"+
		"\3\2\2\2p\u01a4\3\2\2\2r\u01a9\3\2\2\2t\u01ab\3\2\2\2v\u01b0\3\2\2\2x"+
		"\u01b2\3\2\2\2z\u01b4\3\2\2\2|}\5\4\3\2}~\5\6\4\2~\177\7\27\2\2\177\u0080"+
		"\5\16\b\2\u0080\u0081\5\n\6\2\u0081\3\3\2\2\2\u0082\u0083\5\24\13\2\u0083"+
		"\u0084\5\4\3\2\u0084\u0087\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0082\3\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\5\3\2\2\2\u0088\u0089\t\2\2\2\u0089\7\3"+
		"\2\2\2\u008a\u008b\t\3\2\2\u008b\t\3\2\2\2\u008c\u008d\t\4\2\2\u008d\13"+
		"\3\2\2\2\u008e\u008f\t\5\2\2\u008f\r\3\2\2\2\u0090\u0095\3\2\2\2\u0091"+
		"\u0092\5\22\n\2\u0092\u0093\5\20\t\2\u0093\u0095\3\2\2\2\u0094\u0090\3"+
		"\2\2\2\u0094\u0091\3\2\2\2\u0095\17\3\2\2\2\u0096\u0097\5\22\n\2\u0097"+
		"\u0098\5\20\t\2\u0098\u009b\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3"+
		"\2\2\2\u009a\u0099\3\2\2\2\u009b\21\3\2\2\2\u009c\u009f\5 \21\2\u009d"+
		"\u009f\5\"\22\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\23\3\2\2"+
		"\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\5\32\16\2\u00a3"+
		"\u00a4\5\16\b\2\u00a4\u00a5\5\f\7\2\u00a5\25\3\2\2\2\u00a6\u00a7\7\27"+
		"\2\2\u00a7\u00a8\5\30\r\2\u00a8\27\3\2\2\2\u00a9\u00aa\7\64\2\2\u00aa"+
		"\u00ad\7\27\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\31\3\2\2\2\u00ae\u00af\7\13\2\2\u00af\u00b2\5\36\20\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\33\3\2\2"+
		"\2\u00b3\u00b4\7\27\2\2\u00b4\u00b5\5T+\2\u00b5\35\3\2\2\2\u00b6\u00bb"+
		"\7>\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\7>\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\37\3\2\2\2\u00bc\u00c2\5:\36"+
		"\2\u00bd\u00c2\5B\"\2\u00be\u00c2\5D#\2\u00bf\u00c2\5F$\2\u00c0\u00c2"+
		"\5> \2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2!\3\2\2\2\u00c3\u00c4\5$\23\2"+
		"\u00c4\u00c5\7F\2\2\u00c5#\3\2\2\2\u00c6\u00ce\5N(\2\u00c7\u00ce\5,\27"+
		"\2\u00c8\u00ce\5&\24\2\u00c9\u00ce\5*\26\2\u00ca\u00ce\5\64\33\2\u00cb"+
		"\u00ce\5^\60\2\u00cc\u00ce\5b\62\2\u00cd\u00c6\3\2\2\2\u00cd\u00c7\3\2"+
		"\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce%\3\2\2\2\u00cf\u00d0\78\2\2\u00d0"+
		"\u00d1\7\'\2\2\u00d1\u00d2\5(\25\2\u00d2\'\3\2\2\2\u00d3\u00d4\7\25\2"+
		"\2\u00d4\u00d5\5h\65\2\u00d5\u00d6\5(\25\2\u00d6\u00d9\3\2\2\2\u00d7\u00d9"+
		"\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9)\3\2\2\2\u00da"+
		"\u00db\7\61\2\2\u00db\u00dc\5P)\2\u00dc+\3\2\2\2\u00dd\u00de\7\27\2\2"+
		"\u00de\u00df\5Z.\2\u00df\u00e0\5.\30\2\u00e0-\3\2\2\2\u00e1\u00e4\5\60"+
		"\31\2\u00e2\u00e4\5\\/\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"/\3\2\2\2\u00e5\u00e6\7\13\2\2\u00e6\u00e7\5\62\32\2\u00e7\u00e8\5(\25"+
		"\2\u00e8\u00e9\7>\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e5"+
		"\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\61\3\2\2\2\u00ed\u00f0\5h\65\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\63\3\2\2"+
		"\2\u00f1\u00f2\7\24\2\2\u00f2\u00f3\7\27\2\2\u00f3\u00f4\7/\2\2\u00f4"+
		"\u00f5\5h\65\2\u00f5\u00f6\58\35\2\u00f6\u00f7\7L\2\2\u00f7\u00f8\5\66"+
		"\34\2\u00f8\65\3\2\2\2\u00f9\u00fa\7\25\2\2\u00fa\u00fb\7\27\2\2\u00fb"+
		"\u00fc\7/\2\2\u00fc\u00fd\5h\65\2\u00fd\u00fe\58\35\2\u00fe\u00ff\7L\2"+
		"\2\u00ff\u0100\5\66\34\2\u0100\u0103\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00f9\3\2\2\2\u0102\u0101\3\2\2\2\u0103\67\3\2\2\2\u0104\u0105\7\25\2"+
		"\2\u0105\u0108\5h\65\2\u0106\u0108\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0106"+
		"\3\2\2\2\u01089\3\2\2\2\u0109\u010a\7<\2\2\u010a\u010b\5h\65\2\u010b\u010c"+
		"\7$\2\2\u010c\u010d\5\16\b\2\u010d\u010e\5<\37\2\u010e\u010f\7R\2\2\u010f"+
		";\3\2\2\2\u0110\u0111\7%\2\2\u0111\u0114\5\16\b\2\u0112\u0114\3\2\2\2"+
		"\u0113\u0110\3\2\2\2\u0113\u0112\3\2\2\2\u0114=\3\2\2\2\u0115\u0116\7"+
		"\62\2\2\u0116\u0117\5V,\2\u0117\u0118\7H\2\2\u0118\u0119\5h\65\2\u0119"+
		"\u011a\5@!\2\u011a\u011b\7\4\2\2\u011b\u011c\5\16\b\2\u011c\u011d\7,\2"+
		"\2\u011d?\3\2\2\2\u011e\u011f\7@\2\2\u011f\u0120\7#\2\2\u0120\u0123\5"+
		"h\65\2\u0121\u0123\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"A\3\2\2\2\u0124\u0125\7C\2\2\u0125\u0126\5h\65\2\u0126\u0127\7\4\2\2\u0127"+
		"\u0128\5\16\b\2\u0128\u0129\7\7\2\2\u0129C\3\2\2\2\u012a\u012b\7\f\2\2"+
		"\u012b\u012c\5\16\b\2\u012c\u012d\7H\2\2\u012d\u012e\7\32\2\2\u012e\u012f"+
		"\5h\65\2\u012fE\3\2\2\2\u0130\u0131\7+\2\2\u0131\u0132\5h\65\2\u0132\u0133"+
		"\7\4\2\2\u0133\u0134\5H%\2\u0134\u0135\7\b\2\2\u0135G\3\2\2\2\u0136\u013f"+
		"\3\2\2\2\u0137\u0138\7\36\2\2\u0138\u0139\5h\65\2\u0139\u013a\7O\2\2\u013a"+
		"\u013b\5\16\b\2\u013b\u013c\5L\'\2\u013c\u013d\5J&\2\u013d\u013f\3\2\2"+
		"\2\u013e\u0136\3\2\2\2\u013e\u0137\3\2\2\2\u013fI\3\2\2\2\u0140\u0141"+
		"\7\3\2\2\u0141\u0142\7\65\2\2\u0142\u0143\7\t\2\2\u0143\u0144\7O\2\2\u0144"+
		"\u0147\5\16\b\2\u0145\u0147\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0145\3"+
		"\2\2\2\u0147K\3\2\2\2\u0148\u0149\7\36\2\2\u0149\u014a\5h\65\2\u014a\u014b"+
		"\7O\2\2\u014b\u014c\5\16\b\2\u014c\u014d\5L\'\2\u014d\u0150\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u0148\3\2\2\2\u014f\u014e\3\2\2\2\u0150M\3\2\2\2"+
		"\u0151\u0152\7\16\2\2\u0152\u0153\5P)\2\u0153\u0154\7\17\2\2\u0154\u0155"+
		"\5z>\2\u0155O\3\2\2\2\u0156\u0157\7\27\2\2\u0157\u0158\5R*\2\u0158Q\3"+
		"\2\2\2\u0159\u015e\5T+\2\u015a\u015b\5t;\2\u015b\u015c\5T+\2\u015c\u015e"+
		"\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015a\3\2\2\2\u015eS\3\2\2\2\u015f"+
		"\u0160\7\25\2\2\u0160\u0163\5P)\2\u0161\u0163\3\2\2\2\u0162\u015f\3\2"+
		"\2\2\u0162\u0161\3\2\2\2\u0163U\3\2\2\2\u0164\u0165\5X-\2\u0165\u0166"+
		"\7\64\2\2\u0166\u0167\5h\65\2\u0167W\3\2\2\2\u0168\u0169\7\27\2\2\u0169"+
		"\u016a\5Z.\2\u016aY\3\2\2\2\u016b\u016e\5t;\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e[\3\2\2\2\u016f\u0170\7\64\2\2"+
		"\u0170\u0171\5h\65\2\u0171]\3\2\2\2\u0172\u0173\5`\61\2\u0173\u0174\7"+
		"P\2\2\u0174_\3\2\2\2\u0175\u0176\t\6\2\2\u0176a\3\2\2\2\u0177\u0178\7"+
		")\2\2\u0178\u0179\5d\63\2\u0179c\3\2\2\2\u017a\u017f\7!\2\2\u017b\u017c"+
		"\5h\65\2\u017c\u017d\5f\64\2\u017d\u017f\3\2\2\2\u017e\u017a\3\2\2\2\u017e"+
		"\u017b\3\2\2\2\u017fe\3\2\2\2\u0180\u0181\t\7\2\2\u0181g\3\2\2\2\u0182"+
		"\u0183\5p9\2\u0183\u0184\5j\66\2\u0184\u0189\3\2\2\2\u0185\u0186\5l\67"+
		"\2\u0186\u0187\5n8\2\u0187\u0189\3\2\2\2\u0188\u0182\3\2\2\2\u0188\u0185"+
		"\3\2\2\2\u0189i\3\2\2\2\u018a\u018b\5v<\2\u018b\u018c\5h\65\2\u018c\u018f"+
		"\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018d\3\2\2\2\u018f"+
		"k\3\2\2\2\u0190\u0191\7\13\2\2\u0191\u0192\5h\65\2\u0192\u0193\7>\2\2"+
		"\u0193m\3\2\2\2\u0194\u0195\5v<\2\u0195\u0196\5h\65\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0199\3\2\2\2\u0198\u0194\3\2\2\2\u0198\u0197\3\2\2\2\u0199"+
		"o\3\2\2\2\u019a\u01a5\7Q\2\2\u019b\u01a5\7\'\2\2\u019c\u01a5\7\31\2\2"+
		"\u019d\u019e\7\27\2\2\u019e\u01a5\5r:\2\u019f\u01a5\7\23\2\2\u01a0\u01a5"+
		"\7K\2\2\u01a1\u01a2\5x=\2\u01a2\u01a3\5p9\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u019a\3\2\2\2\u01a4\u019b\3\2\2\2\u01a4\u019c\3\2\2\2\u01a4\u019d\3\2"+
		"\2\2\u01a4\u019f\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a5"+
		"q\3\2\2\2\u01a6\u01aa\5\60\31\2\u01a7\u01aa\5t;\2\u01a8\u01aa\3\2\2\2"+
		"\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aas\3"+
		"\2\2\2\u01ab\u01ac\7/\2\2\u01ac\u01ad\5h\65\2\u01ad\u01ae\58\35\2\u01ae"+
		"\u01af\7L\2\2\u01afu\3\2\2\2\u01b0\u01b1\t\b\2\2\u01b1w\3\2\2\2\u01b2"+
		"\u01b3\t\t\2\2\u01b3y\3\2\2\2\u01b4\u01b5\t\n\2\2\u01b5{\3\2\2\2\37\u0086"+
		"\u0094\u009a\u009e\u00ac\u00b1\u00ba\u00c1\u00cd\u00d8\u00e3\u00eb\u00ef"+
		"\u0102\u0107\u0113\u0122\u013e\u0146\u014f\u015d\u0162\u016d\u017e\u0188"+
		"\u018e\u0198\u01a4\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}