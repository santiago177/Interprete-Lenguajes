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
		TOKEN_COMA=19, LIMPIAR=20, FINSUBALGORITMO=21, QUE=22, BORRAR=23, TOKEN_MENOR=24, 
		TOKEN_MUL=25, CASO=26, TOKEN_IGUAL=27, TOKEN_MENOS=28, TECLA=29, ENTERO=30, 
		PASO=31, ENTONCES=32, SINO=33, MINUTOS=34, SUBALGORITMO=35, ESPERAR=36, 
		REAL=37, SEGUN=38, FINPARA=39, TOKEN_MENOR_IGUAL=40, TOKEN_MAS=41, TOKEN_COR_IZQ=42, 
		SUBPROCESO=43, LEER=44, PARA=45, FINFUNCION=46, TOKEN_ASIG=47, OTRO=48, 
		FUNCION=49, FINSUBPROCESO=50, ESCRIBIR=51, FINALGORITMO=52, SEGUNDOS=53, 
		TOKEN_POT=54, SI=55, CADENA=56, TOKEN_PAR_DER=57, TOKEN_DIF=58, CON=59, 
		ALGORITMO=60, TOKEN_MOD=61, MIENTRAS=62, NUMERICO=63, TOKEN_Y=64, TOKEN_PYC=65, 
		CARACTER=66, HASTA=67, TOKEN_O=68, MILISEGUNDOS=69, FALSO=70, TOKEN_COR_DER=71, 
		NUMERO=72, LOGICO=73, TOKEN_DOSP=74, PANTALLA=75, TOKEN_REAL=76, FINSI=77, 
		TOKEN_ENTERO=78, TOKEN_CADENA=79, ID=80, WS=81;
	public static final int
		RULE_s = 0, RULE_subprl = 1, RULE_proc = 2, RULE_subproc = 3, RULE_endproc = 4, 
		RULE_endsubproc = 5, RULE_block = 6, RULE_l5 = 7, RULE_storcom = 8, RULE_subpr = 9, 
		RULE_ret = 10, RULE_t1 = 11, RULE_args = 12, RULE_argl = 13, RULE_l10 = 14, 
		RULE_t2 = 15, RULE_statement = 16, RULE_com = 17, RULE_comid = 18, RULE_write = 19, 
		RULE_l3 = 20, RULE_read = 21, RULE_asigcall = 22, RULE_t4 = 23, RULE_call = 24, 
		RULE_opexpr = 25, RULE_array = 26, RULE_l2 = 27, RULE_exprl = 28, RULE_stif = 29, 
		RULE_elif = 30, RULE_stfor = 31, RULE_step = 32, RULE_stwhile = 33, RULE_dowhile = 34, 
		RULE_stswitch = 35, RULE_casel = 36, RULE_stdefault = 37, RULE_l4 = 38, 
		RULE_def = 39, RULE_idorv = 40, RULE_t8 = 41, RULE_l1 = 42, RULE_oasig = 43, 
		RULE_idxorv = 44, RULE_t9 = 45, RULE_asig = 46, RULE_cls = 47, RULE_clean = 48, 
		RULE_nwait = 49, RULE_t3 = 50, RULE_time = 51, RULE_expr = 52, RULE_t7 = 53, 
		RULE_parexpr = 54, RULE_t6 = 55, RULE_tok = 56, RULE_t5 = 57, RULE_cor = 58, 
		RULE_op = 59, RULE_unop = 60, RULE_tipo = 61;
	public static final String[] ruleNames = {
		"s", "subprl", "proc", "subproc", "endproc", "endsubproc", "block", "l5", 
		"storcom", "subpr", "ret", "t1", "args", "argl", "l10", "t2", "statement", 
		"com", "comid", "write", "l3", "read", "asigcall", "t4", "call", "opexpr", 
		"array", "l2", "exprl", "stif", "elif", "stfor", "step", "stwhile", "dowhile", 
		"stswitch", "casel", "stdefault", "l4", "def", "idorv", "t8", "l1", "oasig", 
		"idxorv", "t9", "asig", "cls", "clean", "nwait", "t3", "time", "expr", 
		"t7", "parexpr", "t6", "tok", "t5", "cor", "op", "unop", "tipo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'de'", "'hacer'", "'texto'", "'>='", "'finmientras'", "'finsegun'", 
		"'modo'", "'finproceso'", "'('", "'repetir'", null, "'definir'", "'como'", 
		"'/'", "'>'", "'proceso'", "'verdadero'", "'dimension'", "','", "'limpiar'", 
		"'finsubalgoritmo'", "'que'", "'borrar'", "'<'", "'*'", "'caso'", "'='", 
		"'-'", "'tecla'", "'entero'", "'paso'", "'entonces'", "'sino'", "'minutos'", 
		"'subalgoritmo'", "'esperar'", "'real'", "'segun'", "'finpara'", "'<='", 
		"'+'", "'['", "'subproceso'", "'leer'", "'para'", "'finfuncion'", "'<-'", 
		"'otro'", "'funcion'", "'finsubproceso'", "'escribir'", "'finalgoritmo'", 
		"'segundos'", "'^'", "'si'", "'cadena'", "')'", "'<>'", "'con'", "'algoritmo'", 
		"'token_mod'", "'mientras'", "'numerico'", null, "';'", "'caracter'", 
		"'hasta'", null, "'milisegundos'", "'falso'", "']'", "'numero'", "'logico'", 
		"':'", "'pantalla'", "'token_real'", "'finsi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DE", "HACER", "TEXTO", "TOKEN_MAYOR_IGUAL", "FINMIENTRAS", "FINSEGUN", 
		"MODO", "FINPROCESO", "TOKEN_PAR_IZQ", "REPETIR", "TOKEN_NEG", "DEFINIR", 
		"COMO", "TOKEN_DIV", "TOKEN_MAYOR", "PROCESO", "VERDADERO", "DIMENSION", 
		"TOKEN_COMA", "LIMPIAR", "FINSUBALGORITMO", "QUE", "BORRAR", "TOKEN_MENOR", 
		"TOKEN_MUL", "CASO", "TOKEN_IGUAL", "TOKEN_MENOS", "TECLA", "ENTERO", 
		"PASO", "ENTONCES", "SINO", "MINUTOS", "SUBALGORITMO", "ESPERAR", "REAL", 
		"SEGUN", "FINPARA", "TOKEN_MENOR_IGUAL", "TOKEN_MAS", "TOKEN_COR_IZQ", 
		"SUBPROCESO", "LEER", "PARA", "FINFUNCION", "TOKEN_ASIG", "OTRO", "FUNCION", 
		"FINSUBPROCESO", "ESCRIBIR", "FINALGORITMO", "SEGUNDOS", "TOKEN_POT", 
		"SI", "CADENA", "TOKEN_PAR_DER", "TOKEN_DIF", "CON", "ALGORITMO", "TOKEN_MOD", 
		"MIENTRAS", "NUMERICO", "TOKEN_Y", "TOKEN_PYC", "CARACTER", "HASTA", "TOKEN_O", 
		"MILISEGUNDOS", "FALSO", "TOKEN_COR_DER", "NUMERO", "LOGICO", "TOKEN_DOSP", 
		"PANTALLA", "TOKEN_REAL", "FINSI", "TOKEN_ENTERO", "TOKEN_CADENA", "ID", 
		"WS"
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
			setState(124);
			subprl();
			setState(125);
			proc();
			setState(126);
			match(ID);
			setState(127);
			block();
			setState(128);
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
			setState(134);
			switch (_input.LA(1)) {
			case SUBALGORITMO:
			case SUBPROCESO:
			case FUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				subpr();
				setState(131);
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
			setState(136);
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
			setState(138);
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
			setState(140);
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
			setState(142);
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
			setState(148);
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
			case BORRAR:
			case ESPERAR:
			case SEGUN:
			case LEER:
			case PARA:
			case ESCRIBIR:
			case SI:
			case MIENTRAS:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				storcom();
				setState(146);
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
			setState(154);
			switch (_input.LA(1)) {
			case REPETIR:
			case DEFINIR:
			case DIMENSION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUN:
			case LEER:
			case PARA:
			case ESCRIBIR:
			case SI:
			case MIENTRAS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				storcom();
				setState(151);
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
			setState(158);
			switch (_input.LA(1)) {
			case REPETIR:
			case SEGUN:
			case PARA:
			case SI:
			case MIENTRAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				statement();
				}
				break;
			case DEFINIR:
			case DIMENSION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case LEER:
			case ESCRIBIR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
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
		public List<TerminalNode> ID() { return getTokens(PSeintParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PSeintParser.ID, i);
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
		public TerminalNode TOKEN_ASIG() { return getToken(PSeintParser.TOKEN_ASIG, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			subproc();
			setState(161);
			match(ID);
			setState(164);
			_la = _input.LA(1);
			if (_la==TOKEN_ASIG) {
				{
				setState(162);
				match(TOKEN_ASIG);
				setState(163);
				match(ID);
				}
			}

			setState(166);
			args();
			setState(167);
			block();
			setState(168);
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
			setState(170);
			match(ID);
			setState(171);
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
			setState(176);
			switch (_input.LA(1)) {
			case TOKEN_ASIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(TOKEN_ASIG);
				setState(174);
				match(ID);
				}
				break;
			case EOF:
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
			setState(181);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(TOKEN_PAR_IZQ);
				setState(179);
				t2();
				}
				break;
			case REPETIR:
			case DEFINIR:
			case DIMENSION:
			case LIMPIAR:
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
			case ID:
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
		public L10Context l10() {
			return getRuleContext(L10Context.class,0);
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
			setState(183);
			match(ID);
			setState(184);
			l10();
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

	public static class L10Context extends ParserRuleContext {
		public TerminalNode TOKEN_COMA() { return getToken(PSeintParser.TOKEN_COMA, 0); }
		public TerminalNode ID() { return getToken(PSeintParser.ID, 0); }
		public L10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterL10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitL10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitL10(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L10Context l10() throws RecognitionException {
		L10Context _localctx = new L10Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_l10);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(TOKEN_COMA);
				setState(187);
				match(ID);
				}
				break;
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
		enterRule(_localctx, 30, RULE_t2);
		try {
			setState(195);
			switch (_input.LA(1)) {
			case TOKEN_PAR_DER:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(TOKEN_PAR_DER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				argl();
				setState(193);
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
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				stif();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				stwhile();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				dowhile();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				stswitch();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
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
		enterRule(_localctx, 34, RULE_com);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			comid();
			setState(205);
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
		enterRule(_localctx, 36, RULE_comid);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				def();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				asigcall();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				write();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				read();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				array();
				}
				break;
			case LIMPIAR:
			case BORRAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				cls();
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ESCRIBIR);
			setState(217);
			expr();
			setState(218);
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
		enterRule(_localctx, 40, RULE_l3);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(TOKEN_COMA);
				setState(221);
				expr();
				setState(222);
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
		enterRule(_localctx, 42, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LEER);
			setState(228);
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
		enterRule(_localctx, 44, RULE_asigcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ID);
			setState(231);
			t9();
			setState(232);
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
		enterRule(_localctx, 46, RULE_t4);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				call();
				}
				break;
			case TOKEN_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
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
		enterRule(_localctx, 48, RULE_call);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(TOKEN_PAR_IZQ);
				setState(239);
				opexpr();
				setState(240);
				l3();
				setState(241);
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
			case ID:
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
		enterRule(_localctx, 50, RULE_opexpr);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
			case TOKEN_NEG:
			case VERDADERO:
			case TOKEN_MENOS:
			case FALSO:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
			case TOKEN_CADENA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
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
		enterRule(_localctx, 52, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(DIMENSION);
			setState(251);
			match(ID);
			setState(252);
			match(TOKEN_COR_IZQ);
			setState(253);
			expr();
			setState(254);
			exprl();
			setState(255);
			match(TOKEN_COR_DER);
			setState(256);
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
		enterRule(_localctx, 54, RULE_l2);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(TOKEN_COMA);
				setState(259);
				match(ID);
				setState(260);
				match(TOKEN_COR_IZQ);
				setState(261);
				expr();
				setState(262);
				exprl();
				setState(263);
				match(TOKEN_COR_DER);
				setState(264);
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
		enterRule(_localctx, 56, RULE_exprl);
		try {
			setState(272);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(TOKEN_COMA);
				setState(270);
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
		enterRule(_localctx, 58, RULE_stif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(SI);
			setState(275);
			expr();
			setState(276);
			match(ENTONCES);
			setState(277);
			block();
			setState(278);
			elif();
			setState(279);
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
		enterRule(_localctx, 60, RULE_elif);
		try {
			setState(284);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(SINO);
				setState(282);
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
		enterRule(_localctx, 62, RULE_stfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(PARA);
			setState(287);
			oasig();
			setState(288);
			match(HASTA);
			setState(289);
			expr();
			setState(290);
			step();
			setState(291);
			match(HACER);
			setState(292);
			block();
			setState(293);
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
		enterRule(_localctx, 64, RULE_step);
		try {
			setState(299);
			switch (_input.LA(1)) {
			case CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(CON);
				setState(296);
				match(PASO);
				setState(297);
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
		enterRule(_localctx, 66, RULE_stwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(MIENTRAS);
			setState(302);
			expr();
			setState(303);
			match(HACER);
			setState(304);
			block();
			setState(305);
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
		enterRule(_localctx, 68, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(REPETIR);
			setState(308);
			block();
			setState(309);
			match(HASTA);
			setState(310);
			match(QUE);
			setState(311);
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
		enterRule(_localctx, 70, RULE_stswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(SEGUN);
			setState(314);
			expr();
			setState(315);
			match(HACER);
			setState(316);
			casel();
			setState(317);
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
		enterRule(_localctx, 72, RULE_casel);
		try {
			setState(327);
			switch (_input.LA(1)) {
			case FINSEGUN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(CASO);
				setState(321);
				expr();
				setState(322);
				match(TOKEN_DOSP);
				setState(323);
				block();
				setState(324);
				l4();
				setState(325);
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
		enterRule(_localctx, 74, RULE_stdefault);
		try {
			setState(335);
			switch (_input.LA(1)) {
			case DE:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(DE);
				setState(330);
				match(OTRO);
				setState(331);
				match(MODO);
				setState(332);
				match(TOKEN_DOSP);
				setState(333);
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
		enterRule(_localctx, 76, RULE_l4);
		try {
			setState(344);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(CASO);
				setState(338);
				expr();
				setState(339);
				match(TOKEN_DOSP);
				setState(340);
				block();
				setState(341);
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
		enterRule(_localctx, 78, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(DEFINIR);
			setState(347);
			idorv();
			setState(348);
			match(COMO);
			setState(349);
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
		enterRule(_localctx, 80, RULE_idorv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ID);
			setState(352);
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
		enterRule(_localctx, 82, RULE_t8);
		try {
			setState(358);
			switch (_input.LA(1)) {
			case COMO:
			case TOKEN_COMA:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				l1();
				}
				break;
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				cor();
				setState(356);
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
		enterRule(_localctx, 84, RULE_l1);
		try {
			setState(363);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(TOKEN_COMA);
				setState(361);
				idorv();
				}
				break;
			case COMO:
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
		enterRule(_localctx, 86, RULE_oasig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			idxorv();
			setState(366);
			match(TOKEN_ASIG);
			setState(367);
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
		enterRule(_localctx, 88, RULE_idxorv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(ID);
			setState(370);
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
		enterRule(_localctx, 90, RULE_t9);
		try {
			setState(374);
			switch (_input.LA(1)) {
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
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
		enterRule(_localctx, 92, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(TOKEN_ASIG);
			setState(377);
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
		enterRule(_localctx, 94, RULE_cls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			clean();
			setState(380);
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
		enterRule(_localctx, 96, RULE_clean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		enterRule(_localctx, 98, RULE_nwait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(ESPERAR);
			setState(385);
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
		enterRule(_localctx, 100, RULE_t3);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case TECLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(TECLA);
				}
				break;
			case TOKEN_PAR_IZQ:
			case TOKEN_NEG:
			case VERDADERO:
			case TOKEN_MENOS:
			case FALSO:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
			case TOKEN_CADENA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				expr();
				setState(389);
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
		enterRule(_localctx, 102, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (MINUTOS - 34)) | (1L << (SEGUNDOS - 34)) | (1L << (MILISEGUNDOS - 34)))) != 0)) ) {
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
		enterRule(_localctx, 104, RULE_expr);
		try {
			setState(401);
			switch (_input.LA(1)) {
			case TOKEN_NEG:
			case VERDADERO:
			case TOKEN_MENOS:
			case FALSO:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
			case TOKEN_CADENA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				tok();
				setState(396);
				t7();
				}
				break;
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				parexpr();
				setState(399);
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
		enterRule(_localctx, 106, RULE_t7);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				op();
				setState(404);
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
		enterRule(_localctx, 108, RULE_parexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(TOKEN_PAR_IZQ);
			setState(410);
			expr();
			setState(411);
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
		enterRule(_localctx, 110, RULE_t6);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				op();
				setState(414);
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
		enterRule(_localctx, 112, RULE_tok);
		try {
			setState(429);
			switch (_input.LA(1)) {
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(TOKEN_REAL);
				}
				break;
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(TOKEN_ENTERO);
				}
				break;
			case TOKEN_CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(TOKEN_CADENA);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				match(ID);
				setState(423);
				t5();
				}
				break;
			case VERDADERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				match(VERDADERO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 6);
				{
				setState(425);
				match(FALSO);
				}
				break;
			case TOKEN_NEG:
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 7);
				{
				setState(426);
				unop();
				setState(427);
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
		enterRule(_localctx, 114, RULE_t5);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
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
		enterRule(_localctx, 116, RULE_cor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(TOKEN_COR_IZQ);
			setState(437);
			expr();
			setState(438);
			exprl();
			setState(439);
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
		enterRule(_localctx, 118, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_DIV) | (1L << TOKEN_MAYOR) | (1L << TOKEN_COMA) | (1L << TOKEN_MENOR) | (1L << TOKEN_MUL) | (1L << TOKEN_IGUAL) | (1L << TOKEN_MENOS) | (1L << TOKEN_MENOR_IGUAL) | (1L << TOKEN_MAS) | (1L << TOKEN_POT) | (1L << TOKEN_DIF) | (1L << TOKEN_MOD))) != 0) || _la==TOKEN_Y || _la==TOKEN_O) ) {
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
		enterRule(_localctx, 120, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		enterRule(_localctx, 122, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXTO) | (1L << ENTERO) | (1L << REAL) | (1L << CADENA) | (1L << NUMERICO))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CARACTER - 66)) | (1L << (NUMERO - 66)) | (1L << (LOGICO - 66)))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u01c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0089\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\t\3\t\3\t"+
		"\3\t\5\t\u009d\n\t\3\n\3\n\5\n\u00a1\n\n\3\13\3\13\3\13\3\13\5\13\u00a7"+
		"\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00b3\n\r\3\16\3"+
		"\16\3\16\5\16\u00b8\n\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00c0\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00c6\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00cd"+
		"\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d9\n\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00e4\n\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u00ef\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u00f7\n\32\3\33\3\33\5\33\u00fb\n\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u010e\n\35\3\36\3\36\3\36\5\36\u0113\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \5 \u011f\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\5\"\u012e\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u014a\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0152"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u015b\n(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3"+
		"+\3+\5+\u0169\n+\3,\3,\3,\5,\u016e\n,\3-\3-\3-\3-\3.\3.\3.\3/\3/\5/\u0179"+
		"\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\5\64\u018a\n\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0194\n\66\3\67\3\67\3\67\3\67\5\67\u019a\n\67\38\38\38\38\39\39\39\3"+
		"9\59\u01a4\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u01b0\n:\3;\3;\3;\5;\u01b5"+
		"\n;\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3?\2\2@\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"\2\13\4\2\22\22>>\5\2%%--\63\63\4\2\n\n\66\66\5\2\27\27\60\60\64\64\4"+
		"\2\26\26\31\31\5\2$$\67\67GG\r\2\6\6\20\21\25\25\32\33\35\36*+88<<??B"+
		"BFF\4\2\r\r\36\36\t\2\5\5  \'\'::AADDJK\u01b0\2~\3\2\2\2\4\u0088\3\2\2"+
		"\2\6\u008a\3\2\2\2\b\u008c\3\2\2\2\n\u008e\3\2\2\2\f\u0090\3\2\2\2\16"+
		"\u0096\3\2\2\2\20\u009c\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00ac"+
		"\3\2\2\2\30\u00b2\3\2\2\2\32\u00b7\3\2\2\2\34\u00b9\3\2\2\2\36\u00bf\3"+
		"\2\2\2 \u00c5\3\2\2\2\"\u00cc\3\2\2\2$\u00ce\3\2\2\2&\u00d8\3\2\2\2(\u00da"+
		"\3\2\2\2*\u00e3\3\2\2\2,\u00e5\3\2\2\2.\u00e8\3\2\2\2\60\u00ee\3\2\2\2"+
		"\62\u00f6\3\2\2\2\64\u00fa\3\2\2\2\66\u00fc\3\2\2\28\u010d\3\2\2\2:\u0112"+
		"\3\2\2\2<\u0114\3\2\2\2>\u011e\3\2\2\2@\u0120\3\2\2\2B\u012d\3\2\2\2D"+
		"\u012f\3\2\2\2F\u0135\3\2\2\2H\u013b\3\2\2\2J\u0149\3\2\2\2L\u0151\3\2"+
		"\2\2N\u015a\3\2\2\2P\u015c\3\2\2\2R\u0161\3\2\2\2T\u0168\3\2\2\2V\u016d"+
		"\3\2\2\2X\u016f\3\2\2\2Z\u0173\3\2\2\2\\\u0178\3\2\2\2^\u017a\3\2\2\2"+
		"`\u017d\3\2\2\2b\u0180\3\2\2\2d\u0182\3\2\2\2f\u0189\3\2\2\2h\u018b\3"+
		"\2\2\2j\u0193\3\2\2\2l\u0199\3\2\2\2n\u019b\3\2\2\2p\u01a3\3\2\2\2r\u01af"+
		"\3\2\2\2t\u01b4\3\2\2\2v\u01b6\3\2\2\2x\u01bb\3\2\2\2z\u01bd\3\2\2\2|"+
		"\u01bf\3\2\2\2~\177\5\4\3\2\177\u0080\5\6\4\2\u0080\u0081\7R\2\2\u0081"+
		"\u0082\5\16\b\2\u0082\u0083\5\n\6\2\u0083\3\3\2\2\2\u0084\u0085\5\24\13"+
		"\2\u0085\u0086\5\4\3\2\u0086\u0089\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0084"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\5\3\2\2\2\u008a\u008b\t\2\2\2\u008b"+
		"\7\3\2\2\2\u008c\u008d\t\3\2\2\u008d\t\3\2\2\2\u008e\u008f\t\4\2\2\u008f"+
		"\13\3\2\2\2\u0090\u0091\t\5\2\2\u0091\r\3\2\2\2\u0092\u0097\3\2\2\2\u0093"+
		"\u0094\5\22\n\2\u0094\u0095\5\20\t\2\u0095\u0097\3\2\2\2\u0096\u0092\3"+
		"\2\2\2\u0096\u0093\3\2\2\2\u0097\17\3\2\2\2\u0098\u0099\5\22\n\2\u0099"+
		"\u009a\5\20\t\2\u009a\u009d\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u0098\3"+
		"\2\2\2\u009c\u009b\3\2\2\2\u009d\21\3\2\2\2\u009e\u00a1\5\"\22\2\u009f"+
		"\u00a1\5$\23\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\23\3\2\2"+
		"\2\u00a2\u00a3\5\b\5\2\u00a3\u00a6\7R\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a7"+
		"\7R\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\5\32\16\2\u00a9\u00aa\5\16\b\2\u00aa\u00ab\5\f\7\2\u00ab\25\3\2"+
		"\2\2\u00ac\u00ad\7R\2\2\u00ad\u00ae\5\30\r\2\u00ae\27\3\2\2\2\u00af\u00b0"+
		"\7\61\2\2\u00b0\u00b3\7R\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7\13\2\2\u00b5\u00b8\5 \21"+
		"\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\33"+
		"\3\2\2\2\u00b9\u00ba\7R\2\2\u00ba\u00bb\5\36\20\2\u00bb\35\3\2\2\2\u00bc"+
		"\u00bd\7\25\2\2\u00bd\u00c0\7R\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3\2"+
		"\2\2\u00bf\u00be\3\2\2\2\u00c0\37\3\2\2\2\u00c1\u00c6\7;\2\2\u00c2\u00c3"+
		"\5\34\17\2\u00c3\u00c4\7;\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2"+
		"\u00c5\u00c2\3\2\2\2\u00c6!\3\2\2\2\u00c7\u00cd\5<\37\2\u00c8\u00cd\5"+
		"D#\2\u00c9\u00cd\5F$\2\u00ca\u00cd\5H%\2\u00cb\u00cd\5@!\2\u00cc\u00c7"+
		"\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd#\3\2\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0\7C\2\2\u00d0"+
		"%\3\2\2\2\u00d1\u00d9\5P)\2\u00d2\u00d9\5.\30\2\u00d3\u00d9\5(\25\2\u00d4"+
		"\u00d9\5,\27\2\u00d5\u00d9\5\66\34\2\u00d6\u00d9\5`\61\2\u00d7\u00d9\5"+
		"d\63\2\u00d8\u00d1\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8"+
		"\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\'\3\2\2\2\u00da\u00db\7\65\2\2\u00db\u00dc\5j\66\2\u00dc\u00dd"+
		"\5*\26\2\u00dd)\3\2\2\2\u00de\u00df\7\25\2\2\u00df\u00e0\5j\66\2\u00e0"+
		"\u00e1\5*\26\2\u00e1\u00e4\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3\2"+
		"\2\2\u00e3\u00e2\3\2\2\2\u00e4+\3\2\2\2\u00e5\u00e6\7.\2\2\u00e6\u00e7"+
		"\5R*\2\u00e7-\3\2\2\2\u00e8\u00e9\7R\2\2\u00e9\u00ea\5\\/\2\u00ea\u00eb"+
		"\5\60\31\2\u00eb/\3\2\2\2\u00ec\u00ef\5\62\32\2\u00ed\u00ef\5^\60\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\61\3\2\2\2\u00f0\u00f1\7\13\2"+
		"\2\u00f1\u00f2\5\64\33\2\u00f2\u00f3\5*\26\2\u00f3\u00f4\7;\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\63\3\2\2\2\u00f8\u00fb\5j\66\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\65\3\2\2\2\u00fc\u00fd\7\24\2\2\u00fd"+
		"\u00fe\7R\2\2\u00fe\u00ff\7,\2\2\u00ff\u0100\5j\66\2\u0100\u0101\5:\36"+
		"\2\u0101\u0102\7I\2\2\u0102\u0103\58\35\2\u0103\67\3\2\2\2\u0104\u0105"+
		"\7\25\2\2\u0105\u0106\7R\2\2\u0106\u0107\7,\2\2\u0107\u0108\5j\66\2\u0108"+
		"\u0109\5:\36\2\u0109\u010a\7I\2\2\u010a\u010b\58\35\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"9\3\2\2\2\u010f\u0110\7\25\2\2\u0110\u0113\5j\66\2\u0111\u0113\3\2\2\2"+
		"\u0112\u010f\3\2\2\2\u0112\u0111\3\2\2\2\u0113;\3\2\2\2\u0114\u0115\7"+
		"9\2\2\u0115\u0116\5j\66\2\u0116\u0117\7\"\2\2\u0117\u0118\5\16\b\2\u0118"+
		"\u0119\5> \2\u0119\u011a\7O\2\2\u011a=\3\2\2\2\u011b\u011c\7#\2\2\u011c"+
		"\u011f\5\16\b\2\u011d\u011f\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011d\3"+
		"\2\2\2\u011f?\3\2\2\2\u0120\u0121\7/\2\2\u0121\u0122\5X-\2\u0122\u0123"+
		"\7E\2\2\u0123\u0124\5j\66\2\u0124\u0125\5B\"\2\u0125\u0126\7\4\2\2\u0126"+
		"\u0127\5\16\b\2\u0127\u0128\7)\2\2\u0128A\3\2\2\2\u0129\u012a\7=\2\2\u012a"+
		"\u012b\7!\2\2\u012b\u012e\5j\66\2\u012c\u012e\3\2\2\2\u012d\u0129\3\2"+
		"\2\2\u012d\u012c\3\2\2\2\u012eC\3\2\2\2\u012f\u0130\7@\2\2\u0130\u0131"+
		"\5j\66\2\u0131\u0132\7\4\2\2\u0132\u0133\5\16\b\2\u0133\u0134\7\7\2\2"+
		"\u0134E\3\2\2\2\u0135\u0136\7\f\2\2\u0136\u0137\5\16\b\2\u0137\u0138\7"+
		"E\2\2\u0138\u0139\7\30\2\2\u0139\u013a\5j\66\2\u013aG\3\2\2\2\u013b\u013c"+
		"\7(\2\2\u013c\u013d\5j\66\2\u013d\u013e\7\4\2\2\u013e\u013f\5J&\2\u013f"+
		"\u0140\7\b\2\2\u0140I\3\2\2\2\u0141\u014a\3\2\2\2\u0142\u0143\7\34\2\2"+
		"\u0143\u0144\5j\66\2\u0144\u0145\7L\2\2\u0145\u0146\5\16\b\2\u0146\u0147"+
		"\5N(\2\u0147\u0148\5L\'\2\u0148\u014a\3\2\2\2\u0149\u0141\3\2\2\2\u0149"+
		"\u0142\3\2\2\2\u014aK\3\2\2\2\u014b\u014c\7\3\2\2\u014c\u014d\7\62\2\2"+
		"\u014d\u014e\7\t\2\2\u014e\u014f\7L\2\2\u014f\u0152\5\16\b\2\u0150\u0152"+
		"\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u0150\3\2\2\2\u0152M\3\2\2\2\u0153"+
		"\u0154\7\34\2\2\u0154\u0155\5j\66\2\u0155\u0156\7L\2\2\u0156\u0157\5\16"+
		"\b\2\u0157\u0158\5N(\2\u0158\u015b\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0153"+
		"\3\2\2\2\u015a\u0159\3\2\2\2\u015bO\3\2\2\2\u015c\u015d\7\16\2\2\u015d"+
		"\u015e\5R*\2\u015e\u015f\7\17\2\2\u015f\u0160\5|?\2\u0160Q\3\2\2\2\u0161"+
		"\u0162\7R\2\2\u0162\u0163\5T+\2\u0163S\3\2\2\2\u0164\u0169\5V,\2\u0165"+
		"\u0166\5v<\2\u0166\u0167\5V,\2\u0167\u0169\3\2\2\2\u0168\u0164\3\2\2\2"+
		"\u0168\u0165\3\2\2\2\u0169U\3\2\2\2\u016a\u016b\7\25\2\2\u016b\u016e\5"+
		"R*\2\u016c\u016e\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016c\3\2\2\2\u016e"+
		"W\3\2\2\2\u016f\u0170\5Z.\2\u0170\u0171\7\61\2\2\u0171\u0172\5j\66\2\u0172"+
		"Y\3\2\2\2\u0173\u0174\7R\2\2\u0174\u0175\5\\/\2\u0175[\3\2\2\2\u0176\u0179"+
		"\5v<\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179"+
		"]\3\2\2\2\u017a\u017b\7\61\2\2\u017b\u017c\5j\66\2\u017c_\3\2\2\2\u017d"+
		"\u017e\5b\62\2\u017e\u017f\7M\2\2\u017fa\3\2\2\2\u0180\u0181\t\6\2\2\u0181"+
		"c\3\2\2\2\u0182\u0183\7&\2\2\u0183\u0184\5f\64\2\u0184e\3\2\2\2\u0185"+
		"\u018a\7\37\2\2\u0186\u0187\5j\66\2\u0187\u0188\5h\65\2\u0188\u018a\3"+
		"\2\2\2\u0189\u0185\3\2\2\2\u0189\u0186\3\2\2\2\u018ag\3\2\2\2\u018b\u018c"+
		"\t\7\2\2\u018ci\3\2\2\2\u018d\u018e\5r:\2\u018e\u018f\5l\67\2\u018f\u0194"+
		"\3\2\2\2\u0190\u0191\5n8\2\u0191\u0192\5p9\2\u0192\u0194\3\2\2\2\u0193"+
		"\u018d\3\2\2\2\u0193\u0190\3\2\2\2\u0194k\3\2\2\2\u0195\u0196\5x=\2\u0196"+
		"\u0197\5j\66\2\u0197\u019a\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0195\3\2"+
		"\2\2\u0199\u0198\3\2\2\2\u019am\3\2\2\2\u019b\u019c\7\13\2\2\u019c\u019d"+
		"\5j\66\2\u019d\u019e\7;\2\2\u019eo\3\2\2\2\u019f\u01a0\5x=\2\u01a0\u01a1"+
		"\5j\66\2\u01a1\u01a4\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3"+
		"\u01a2\3\2\2\2\u01a4q\3\2\2\2\u01a5\u01b0\7N\2\2\u01a6\u01b0\7P\2\2\u01a7"+
		"\u01b0\7Q\2\2\u01a8\u01a9\7R\2\2\u01a9\u01b0\5t;\2\u01aa\u01b0\7\23\2"+
		"\2\u01ab\u01b0\7H\2\2\u01ac\u01ad\5z>\2\u01ad\u01ae\5r:\2\u01ae\u01b0"+
		"\3\2\2\2\u01af\u01a5\3\2\2\2\u01af\u01a6\3\2\2\2\u01af\u01a7\3\2\2\2\u01af"+
		"\u01a8\3\2\2\2\u01af\u01aa\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01ac\3\2"+
		"\2\2\u01b0s\3\2\2\2\u01b1\u01b5\5\62\32\2\u01b2\u01b5\5v<\2\u01b3\u01b5"+
		"\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5"+
		"u\3\2\2\2\u01b6\u01b7\7,\2\2\u01b7\u01b8\5j\66\2\u01b8\u01b9\5:\36\2\u01b9"+
		"\u01ba\7I\2\2\u01baw\3\2\2\2\u01bb\u01bc\t\b\2\2\u01bcy\3\2\2\2\u01bd"+
		"\u01be\t\t\2\2\u01be{\3\2\2\2\u01bf\u01c0\t\n\2\2\u01c0}\3\2\2\2!\u0088"+
		"\u0096\u009c\u00a0\u00a6\u00b2\u00b7\u00bf\u00c5\u00cc\u00d8\u00e3\u00ee"+
		"\u00f6\u00fa\u010d\u0112\u011e\u012d\u0149\u0151\u015a\u0168\u016d\u0178"+
		"\u0189\u0193\u0199\u01a3\u01af\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}