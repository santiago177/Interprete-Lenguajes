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
		NUMERO=72, LOGICO=73, TOKEN_DOSP=74, PANTALLA=75, FINSI=76, TOKEN_CADENA=77, 
		TOKEN_ENTERO=78, TOKEN_REAL=79, ID=80, WS=81;
	public static final int
		RULE_s = 0, RULE_subprl = 1, RULE_proc = 2, RULE_subproc = 3, RULE_endproc = 4, 
		RULE_endsubproc = 5, RULE_block = 6, RULE_l5 = 7, RULE_storcom = 8, RULE_subpr = 9, 
		RULE_ret = 10, RULE_t1 = 11, RULE_args = 12, RULE_argl = 13, RULE_l10 = 14, 
		RULE_t2 = 15, RULE_statement = 16, RULE_com = 17, RULE_comid = 18, RULE_write = 19, 
		RULE_l3 = 20, RULE_read = 21, RULE_asigcall = 22, RULE_t4 = 23, RULE_call = 24, 
		RULE_opexpr = 25, RULE_l11 = 26, RULE_array = 27, RULE_l2 = 28, RULE_exprl = 29, 
		RULE_stif = 30, RULE_elif = 31, RULE_stfor = 32, RULE_step = 33, RULE_stwhile = 34, 
		RULE_dowhile = 35, RULE_stswitch = 36, RULE_casel = 37, RULE_stdefault = 38, 
		RULE_l4 = 39, RULE_def = 40, RULE_idorv = 41, RULE_t8 = 42, RULE_l1 = 43, 
		RULE_oasig = 44, RULE_idxorv = 45, RULE_t9 = 46, RULE_asig = 47, RULE_cls = 48, 
		RULE_clean = 49, RULE_spwait = 50, RULE_t3 = 51, RULE_time = 52, RULE_expr = 53, 
		RULE_eA = 54, RULE_eB = 55, RULE_eC = 56, RULE_eD = 57, RULE_eE = 58, 
		RULE_eF = 59, RULE_eG = 60, RULE_eH = 61, RULE_t7 = 62, RULE_parexpr = 63, 
		RULE_t6 = 64, RULE_tok = 65, RULE_t5 = 66, RULE_cor = 67, RULE_op = 68, 
		RULE_unop = 69, RULE_tipo = 70;
	public static final String[] ruleNames = {
		"s", "subprl", "proc", "subproc", "endproc", "endsubproc", "block", "l5", 
		"storcom", "subpr", "ret", "t1", "args", "argl", "l10", "t2", "statement", 
		"com", "comid", "write", "l3", "read", "asigcall", "t4", "call", "opexpr", 
		"l11", "array", "l2", "exprl", "stif", "elif", "stfor", "step", "stwhile", 
		"dowhile", "stswitch", "casel", "stdefault", "l4", "def", "idorv", "t8", 
		"l1", "oasig", "idxorv", "t9", "asig", "cls", "clean", "spwait", "t3", 
		"time", "expr", "eA", "eB", "eC", "eD", "eE", "eF", "eG", "eH", "t7", 
		"parexpr", "t6", "tok", "t5", "cor", "op", "unop", "tipo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'>='", null, null, null, null, "'('", null, null, 
		null, null, "'/'", "'>'", null, null, null, "','", null, null, null, null, 
		"'<'", "'*'", null, "'='", "'-'", null, null, null, null, null, null, 
		null, null, null, null, null, "'<='", "'+'", "'['", null, null, null, 
		null, "'<-'", null, null, null, null, null, null, "'^'", null, null, "')'", 
		"'<>'", null, null, "'%'", null, null, null, "';'", null, null, null, 
		null, null, "']'", null, null, "':'"
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
		"PANTALLA", "FINSI", "TOKEN_CADENA", "TOKEN_ENTERO", "TOKEN_REAL", "ID", 
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
			setState(142);
			subprl();
			setState(143);
			proc();
			setState(144);
			match(ID);
			setState(145);
			block();
			setState(146);
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
			setState(152);
			switch (_input.LA(1)) {
			case SUBALGORITMO:
			case SUBPROCESO:
			case FUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				subpr();
				setState(149);
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
			setState(154);
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
			setState(156);
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
			setState(158);
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
			setState(160);
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
			setState(166);
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
				setState(163);
				storcom();
				setState(164);
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
			setState(172);
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
				setState(168);
				storcom();
				setState(169);
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
			setState(176);
			switch (_input.LA(1)) {
			case REPETIR:
			case SEGUN:
			case PARA:
			case SI:
			case MIENTRAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
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
				setState(175);
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
			setState(178);
			subproc();
			setState(179);
			match(ID);
			setState(182);
			_la = _input.LA(1);
			if (_la==TOKEN_ASIG) {
				{
				setState(180);
				match(TOKEN_ASIG);
				setState(181);
				match(ID);
				}
			}

			setState(184);
			args();
			setState(185);
			block();
			setState(186);
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
			setState(188);
			match(ID);
			setState(189);
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
			setState(194);
			switch (_input.LA(1)) {
			case TOKEN_ASIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(TOKEN_ASIG);
				setState(192);
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
			setState(199);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(TOKEN_PAR_IZQ);
				setState(197);
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
			setState(201);
			match(ID);
			setState(202);
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
			setState(207);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(TOKEN_COMA);
				setState(205);
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
			setState(213);
			switch (_input.LA(1)) {
			case TOKEN_PAR_DER:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(TOKEN_PAR_DER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				argl();
				setState(211);
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
			setState(220);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				stif();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				stwhile();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				dowhile();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				stswitch();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
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
			setState(222);
			comid();
			setState(223);
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
		public SpwaitContext spwait() {
			return getRuleContext(SpwaitContext.class,0);
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
			setState(232);
			switch (_input.LA(1)) {
			case DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				def();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				asigcall();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				write();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				read();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				array();
				}
				break;
			case LIMPIAR:
			case BORRAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				cls();
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				spwait();
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
			setState(234);
			match(ESCRIBIR);
			setState(235);
			expr(0);
			setState(236);
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
			setState(243);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(TOKEN_COMA);
				setState(239);
				expr(0);
				setState(240);
				l3();
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
			setState(245);
			match(LEER);
			setState(246);
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
			setState(248);
			match(ID);
			setState(249);
			t9();
			setState(250);
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
			setState(254);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				call();
				}
				break;
			case TOKEN_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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
		public L11Context l11() {
			return getRuleContext(L11Context.class,0);
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(TOKEN_PAR_IZQ);
				setState(257);
				opexpr();
				setState(258);
				l11();
				setState(259);
				match(TOKEN_PAR_DER);
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
			setState(266);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
			case TOKEN_NEG:
			case VERDADERO:
			case TOKEN_MENOS:
			case FALSO:
			case TOKEN_CADENA:
			case TOKEN_ENTERO:
			case TOKEN_REAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				expr(0);
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

	public static class L11Context extends ParserRuleContext {
		public TerminalNode TOKEN_COMA() { return getToken(PSeintParser.TOKEN_COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public L11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l11; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterL11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitL11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitL11(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L11Context l11() throws RecognitionException {
		L11Context _localctx = new L11Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_l11);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(TOKEN_COMA);
				setState(269);
				expr(0);
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
		enterRule(_localctx, 54, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(DIMENSION);
			setState(274);
			match(ID);
			setState(275);
			match(TOKEN_COR_IZQ);
			setState(276);
			expr(0);
			setState(277);
			exprl();
			setState(278);
			match(TOKEN_COR_DER);
			setState(279);
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
		enterRule(_localctx, 56, RULE_l2);
		try {
			setState(290);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(TOKEN_COMA);
				setState(282);
				match(ID);
				setState(283);
				match(TOKEN_COR_IZQ);
				setState(284);
				expr(0);
				setState(285);
				exprl();
				setState(286);
				match(TOKEN_COR_DER);
				setState(287);
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
		enterRule(_localctx, 58, RULE_exprl);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(TOKEN_COMA);
				setState(293);
				expr(0);
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
		enterRule(_localctx, 60, RULE_stif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(SI);
			setState(298);
			expr(0);
			setState(299);
			match(ENTONCES);
			setState(300);
			block();
			setState(301);
			elif();
			setState(302);
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
		enterRule(_localctx, 62, RULE_elif);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(SINO);
				setState(305);
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
		enterRule(_localctx, 64, RULE_stfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(PARA);
			setState(310);
			oasig();
			setState(311);
			match(HASTA);
			setState(312);
			expr(0);
			setState(313);
			step();
			setState(314);
			match(HACER);
			setState(315);
			block();
			setState(316);
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
		enterRule(_localctx, 66, RULE_step);
		try {
			setState(322);
			switch (_input.LA(1)) {
			case CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(CON);
				setState(319);
				match(PASO);
				setState(320);
				expr(0);
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
		enterRule(_localctx, 68, RULE_stwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(MIENTRAS);
			setState(325);
			expr(0);
			setState(326);
			match(HACER);
			setState(327);
			block();
			setState(328);
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
		enterRule(_localctx, 70, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(REPETIR);
			setState(331);
			block();
			setState(332);
			match(HASTA);
			setState(333);
			match(QUE);
			setState(334);
			expr(0);
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
		enterRule(_localctx, 72, RULE_stswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(SEGUN);
			setState(337);
			expr(0);
			setState(338);
			match(HACER);
			setState(339);
			casel();
			setState(340);
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
		enterRule(_localctx, 74, RULE_casel);
		try {
			setState(350);
			switch (_input.LA(1)) {
			case FINSEGUN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(CASO);
				setState(344);
				expr(0);
				setState(345);
				match(TOKEN_DOSP);
				setState(346);
				block();
				setState(347);
				l4();
				setState(348);
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
		enterRule(_localctx, 76, RULE_stdefault);
		try {
			setState(358);
			switch (_input.LA(1)) {
			case DE:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(DE);
				setState(353);
				match(OTRO);
				setState(354);
				match(MODO);
				setState(355);
				match(TOKEN_DOSP);
				setState(356);
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
		enterRule(_localctx, 78, RULE_l4);
		try {
			setState(367);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(CASO);
				setState(361);
				expr(0);
				setState(362);
				match(TOKEN_DOSP);
				setState(363);
				block();
				setState(364);
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
		enterRule(_localctx, 80, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(DEFINIR);
			setState(370);
			idorv();
			setState(371);
			match(COMO);
			setState(372);
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
		enterRule(_localctx, 82, RULE_idorv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ID);
			setState(375);
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
		enterRule(_localctx, 84, RULE_t8);
		try {
			setState(381);
			switch (_input.LA(1)) {
			case COMO:
			case TOKEN_COMA:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				l1();
				}
				break;
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				cor();
				setState(379);
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
		enterRule(_localctx, 86, RULE_l1);
		try {
			setState(386);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(TOKEN_COMA);
				setState(384);
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
		enterRule(_localctx, 88, RULE_oasig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			idxorv();
			setState(389);
			match(TOKEN_ASIG);
			setState(390);
			expr(0);
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
		enterRule(_localctx, 90, RULE_idxorv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(ID);
			setState(393);
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
		enterRule(_localctx, 92, RULE_t9);
		try {
			setState(397);
			switch (_input.LA(1)) {
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
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
		enterRule(_localctx, 94, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(TOKEN_ASIG);
			setState(400);
			expr(0);
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
		enterRule(_localctx, 96, RULE_cls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			clean();
			setState(403);
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
		enterRule(_localctx, 98, RULE_clean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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

	public static class SpwaitContext extends ParserRuleContext {
		public TerminalNode ESPERAR() { return getToken(PSeintParser.ESPERAR, 0); }
		public T3Context t3() {
			return getRuleContext(T3Context.class,0);
		}
		public SpwaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spwait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterSpwait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitSpwait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitSpwait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpwaitContext spwait() throws RecognitionException {
		SpwaitContext _localctx = new SpwaitContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_spwait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(ESPERAR);
			setState(408);
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
		enterRule(_localctx, 102, RULE_t3);
		try {
			setState(414);
			switch (_input.LA(1)) {
			case TECLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(TECLA);
				}
				break;
			case TOKEN_PAR_IZQ:
			case TOKEN_NEG:
			case VERDADERO:
			case TOKEN_MENOS:
			case FALSO:
			case TOKEN_CADENA:
			case TOKEN_ENTERO:
			case TOKEN_REAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				expr(0);
				setState(412);
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
		enterRule(_localctx, 104, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
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
		public EAContext eA() {
			return getRuleContext(EAContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_O() { return getToken(PSeintParser.TOKEN_O, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(419);
			eA(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(421);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(422);
					match(TOKEN_O);
					setState(423);
					eA(0);
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EAContext extends ParserRuleContext {
		public EBContext eB() {
			return getRuleContext(EBContext.class,0);
		}
		public EAContext eA() {
			return getRuleContext(EAContext.class,0);
		}
		public TerminalNode TOKEN_Y() { return getToken(PSeintParser.TOKEN_Y, 0); }
		public EAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterEA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitEA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitEA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EAContext eA() throws RecognitionException {
		return eA(0);
	}

	private EAContext eA(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EAContext _localctx = new EAContext(_ctx, _parentState);
		EAContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_eA, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(430);
			eB(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EAContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eA);
					setState(432);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(433);
					match(TOKEN_Y);
					setState(434);
					eB(0);
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EBContext extends ParserRuleContext {
		public ECContext eC() {
			return getRuleContext(ECContext.class,0);
		}
		public EBContext eB() {
			return getRuleContext(EBContext.class,0);
		}
		public TerminalNode TOKEN_IGUAL() { return getToken(PSeintParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIF() { return getToken(PSeintParser.TOKEN_DIF, 0); }
		public EBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterEB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitEB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitEB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EBContext eB() throws RecognitionException {
		return eB(0);
	}

	private EBContext eB(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EBContext _localctx = new EBContext(_ctx, _parentState);
		EBContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_eB, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(441);
			eC(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(449);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new EBContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eB);
						setState(443);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(444);
						match(TOKEN_IGUAL);
						setState(445);
						eC(0);
						}
						break;
					case 2:
						{
						_localctx = new EBContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eB);
						setState(446);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(447);
						match(TOKEN_DIF);
						setState(448);
						eC(0);
						}
						break;
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ECContext extends ParserRuleContext {
		public EDContext eD() {
			return getRuleContext(EDContext.class,0);
		}
		public ECContext eC() {
			return getRuleContext(ECContext.class,0);
		}
		public TerminalNode TOKEN_MENOR() { return getToken(PSeintParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(PSeintParser.TOKEN_MENOR_IGUAL, 0); }
		public TerminalNode TOKEN_MAYOR() { return getToken(PSeintParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(PSeintParser.TOKEN_MAYOR_IGUAL, 0); }
		public ECContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterEC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitEC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitEC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ECContext eC() throws RecognitionException {
		return eC(0);
	}

	private ECContext eC(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ECContext _localctx = new ECContext(_ctx, _parentState);
		ECContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_eC, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(455);
			eD(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ECContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eC);
						setState(457);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(458);
						match(TOKEN_MENOR);
						setState(459);
						eD(0);
						}
						break;
					case 2:
						{
						_localctx = new ECContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eC);
						setState(460);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(461);
						match(TOKEN_MENOR_IGUAL);
						setState(462);
						eD(0);
						}
						break;
					case 3:
						{
						_localctx = new ECContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eC);
						setState(463);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(464);
						match(TOKEN_MAYOR);
						setState(465);
						eD(0);
						}
						break;
					case 4:
						{
						_localctx = new ECContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eC);
						setState(466);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(467);
						match(TOKEN_MAYOR_IGUAL);
						setState(468);
						eD(0);
						}
						break;
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EDContext extends ParserRuleContext {
		public TerminalNode TOKEN_MENOS() { return getToken(PSeintParser.TOKEN_MENOS, 0); }
		public EEContext eE() {
			return getRuleContext(EEContext.class,0);
		}
		public EDContext eD() {
			return getRuleContext(EDContext.class,0);
		}
		public TerminalNode TOKEN_MAS() { return getToken(PSeintParser.TOKEN_MAS, 0); }
		public EDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterED(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitED(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitED(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EDContext eD() throws RecognitionException {
		return eD(0);
	}

	private EDContext eD(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EDContext _localctx = new EDContext(_ctx, _parentState);
		EDContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_eD, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(475);
				match(TOKEN_MENOS);
				setState(476);
				eE(0);
				}
				break;
			case 2:
				{
				setState(477);
				eE(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EDContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eD);
					setState(480);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(481);
					match(TOKEN_MAS);
					setState(482);
					eE(0);
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EEContext extends ParserRuleContext {
		public EFContext eF() {
			return getRuleContext(EFContext.class,0);
		}
		public EEContext eE() {
			return getRuleContext(EEContext.class,0);
		}
		public TerminalNode TOKEN_MUL() { return getToken(PSeintParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(PSeintParser.TOKEN_DIV, 0); }
		public TerminalNode TOKEN_MOD() { return getToken(PSeintParser.TOKEN_MOD, 0); }
		public EEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterEE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitEE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitEE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EEContext eE() throws RecognitionException {
		return eE(0);
	}

	private EEContext eE(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EEContext _localctx = new EEContext(_ctx, _parentState);
		EEContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_eE, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(489);
			eF(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(500);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new EEContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eE);
						setState(491);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(492);
						match(TOKEN_MUL);
						setState(493);
						eF(0);
						}
						break;
					case 2:
						{
						_localctx = new EEContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eE);
						setState(494);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(495);
						match(TOKEN_DIV);
						setState(496);
						eF(0);
						}
						break;
					case 3:
						{
						_localctx = new EEContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eE);
						setState(497);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(498);
						match(TOKEN_MOD);
						setState(499);
						eF(0);
						}
						break;
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EFContext extends ParserRuleContext {
		public EGContext eG() {
			return getRuleContext(EGContext.class,0);
		}
		public EFContext eF() {
			return getRuleContext(EFContext.class,0);
		}
		public TerminalNode TOKEN_POT() { return getToken(PSeintParser.TOKEN_POT, 0); }
		public EFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterEF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitEF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitEF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EFContext eF() throws RecognitionException {
		return eF(0);
	}

	private EFContext eF(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EFContext _localctx = new EFContext(_ctx, _parentState);
		EFContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_eF, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(506);
			eG();
			}
			_ctx.stop = _input.LT(-1);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EFContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eF);
					setState(508);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(509);
					match(TOKEN_POT);
					setState(510);
					eG();
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EGContext extends ParserRuleContext {
		public TerminalNode TOKEN_NEG() { return getToken(PSeintParser.TOKEN_NEG, 0); }
		public EGContext eG() {
			return getRuleContext(EGContext.class,0);
		}
		public EHContext eH() {
			return getRuleContext(EHContext.class,0);
		}
		public EGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterEG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitEG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitEG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGContext eG() throws RecognitionException {
		EGContext _localctx = new EGContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_eG);
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(TOKEN_NEG);
				setState(517);
				eG();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				eH();
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

	public static class EHContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(PSeintParser.TOKEN_PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(PSeintParser.TOKEN_PAR_DER, 0); }
		public TokContext tok() {
			return getRuleContext(TokContext.class,0);
		}
		public EHContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eH; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).enterEH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeintListener ) ((PSeintListener)listener).exitEH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeintVisitor ) return ((PSeintVisitor<? extends T>)visitor).visitEH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EHContext eH() throws RecognitionException {
		EHContext _localctx = new EHContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_eH);
		try {
			setState(526);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(TOKEN_PAR_IZQ);
				setState(522);
				expr(0);
				setState(523);
				match(TOKEN_PAR_DER);
				}
				break;
			case TOKEN_NEG:
			case VERDADERO:
			case TOKEN_MENOS:
			case FALSO:
			case TOKEN_CADENA:
			case TOKEN_ENTERO:
			case TOKEN_REAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
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
		enterRule(_localctx, 124, RULE_t7);
		try {
			setState(532);
			switch (_input.LA(1)) {
			case TOKEN_MAYOR_IGUAL:
			case TOKEN_DIV:
			case TOKEN_MAYOR:
			case TOKEN_COMA:
			case TOKEN_MENOR:
			case TOKEN_MUL:
			case TOKEN_IGUAL:
			case TOKEN_MENOS:
			case TOKEN_MENOR_IGUAL:
			case TOKEN_MAS:
			case TOKEN_POT:
			case TOKEN_DIF:
			case TOKEN_MOD:
			case TOKEN_Y:
			case TOKEN_O:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				op();
				setState(529);
				expr(0);
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
		enterRule(_localctx, 126, RULE_parexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(TOKEN_PAR_IZQ);
			setState(535);
			expr(0);
			setState(536);
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
		enterRule(_localctx, 128, RULE_t6);
		try {
			setState(542);
			switch (_input.LA(1)) {
			case TOKEN_MAYOR_IGUAL:
			case TOKEN_DIV:
			case TOKEN_MAYOR:
			case TOKEN_COMA:
			case TOKEN_MENOR:
			case TOKEN_MUL:
			case TOKEN_IGUAL:
			case TOKEN_MENOS:
			case TOKEN_MENOR_IGUAL:
			case TOKEN_MAS:
			case TOKEN_POT:
			case TOKEN_DIF:
			case TOKEN_MOD:
			case TOKEN_Y:
			case TOKEN_O:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				op();
				setState(539);
				expr(0);
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
		enterRule(_localctx, 130, RULE_tok);
		try {
			setState(554);
			switch (_input.LA(1)) {
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(TOKEN_REAL);
				}
				break;
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(TOKEN_ENTERO);
				}
				break;
			case TOKEN_CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				match(TOKEN_CADENA);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				match(ID);
				setState(548);
				t5();
				}
				break;
			case VERDADERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
				match(VERDADERO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				match(FALSO);
				}
				break;
			case TOKEN_NEG:
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 7);
				{
				setState(551);
				unop();
				setState(552);
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
		enterRule(_localctx, 132, RULE_t5);
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
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
		enterRule(_localctx, 134, RULE_cor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(TOKEN_COR_IZQ);
			setState(562);
			expr(0);
			setState(563);
			exprl();
			setState(564);
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
		enterRule(_localctx, 136, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		enterRule(_localctx, 138, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		enterRule(_localctx, 140, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 53:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 54:
			return eA_sempred((EAContext)_localctx, predIndex);
		case 55:
			return eB_sempred((EBContext)_localctx, predIndex);
		case 56:
			return eC_sempred((ECContext)_localctx, predIndex);
		case 57:
			return eD_sempred((EDContext)_localctx, predIndex);
		case 58:
			return eE_sempred((EEContext)_localctx, predIndex);
		case 59:
			return eF_sempred((EFContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean eA_sempred(EAContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean eB_sempred(EBContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean eC_sempred(ECContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean eD_sempred(EDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean eE_sempred(EEContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean eF_sempred(EFContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u023f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u009b\n\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00a9\n\b\3\t\3\t\3\t\3\t\5\t\u00af\n"+
		"\t\3\n\3\n\5\n\u00b3\n\n\3\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00c5\n\r\3\16\3\16\3\16\5\16\u00ca"+
		"\n\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21"+
		"\5\21\u00d8\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00df\n\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00eb\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00f6\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\5\31\u0101\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0109\n\32\3\33\3\33\5\33\u010d\n\33\3\34\3\34\3\34\5\34\u0112\n\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0125\n\36\3\37\3\37\3\37\5\37\u012a\n\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\5!\u0136\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\5#\u0145\n#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0161\n\'\3(\3(\3(\3(\3"+
		"(\3(\5(\u0169\n(\3)\3)\3)\3)\3)\3)\3)\5)\u0172\n)\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3,\3,\3,\3,\5,\u0180\n,\3-\3-\3-\5-\u0185\n-\3.\3.\3.\3.\3/\3/\3"+
		"/\3\60\3\60\5\60\u0190\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u01a1\n\65\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u01ab\n\67\f\67\16\67\u01ae\13\67\38\38\38\3"+
		"8\38\38\78\u01b6\n8\f8\168\u01b9\138\39\39\39\39\39\39\39\39\39\79\u01c4"+
		"\n9\f9\169\u01c7\139\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\7:\u01d8"+
		"\n:\f:\16:\u01db\13:\3;\3;\3;\3;\5;\u01e1\n;\3;\3;\3;\7;\u01e6\n;\f;\16"+
		";\u01e9\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u01f7\n<\f<\16<\u01fa"+
		"\13<\3=\3=\3=\3=\3=\3=\7=\u0202\n=\f=\16=\u0205\13=\3>\3>\3>\5>\u020a"+
		"\n>\3?\3?\3?\3?\3?\5?\u0211\n?\3@\3@\3@\3@\5@\u0217\n@\3A\3A\3A\3A\3B"+
		"\3B\3B\3B\5B\u0221\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u022d\nC\3D\3D"+
		"\3D\5D\u0232\nD\3E\3E\3E\3E\3E\3F\3F\3G\3G\3H\3H\3H\2\tlnprtvxI\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\2\13\4\2\22\22>>\5\2%%--\63\63\4\2\n\n\66\66\5\2\27\27\60\60\64\64\4"+
		"\2\26\26\31\31\5\2$$\67\67GG\r\2\6\6\20\21\25\25\32\33\35\36*+88<<??B"+
		"BFF\4\2\r\r\36\36\t\2\5\5  \'\'::AADDJK\u0234\2\u0090\3\2\2\2\4\u009a"+
		"\3\2\2\2\6\u009c\3\2\2\2\b\u009e\3\2\2\2\n\u00a0\3\2\2\2\f\u00a2\3\2\2"+
		"\2\16\u00a8\3\2\2\2\20\u00ae\3\2\2\2\22\u00b2\3\2\2\2\24\u00b4\3\2\2\2"+
		"\26\u00be\3\2\2\2\30\u00c4\3\2\2\2\32\u00c9\3\2\2\2\34\u00cb\3\2\2\2\36"+
		"\u00d1\3\2\2\2 \u00d7\3\2\2\2\"\u00de\3\2\2\2$\u00e0\3\2\2\2&\u00ea\3"+
		"\2\2\2(\u00ec\3\2\2\2*\u00f5\3\2\2\2,\u00f7\3\2\2\2.\u00fa\3\2\2\2\60"+
		"\u0100\3\2\2\2\62\u0108\3\2\2\2\64\u010c\3\2\2\2\66\u0111\3\2\2\28\u0113"+
		"\3\2\2\2:\u0124\3\2\2\2<\u0129\3\2\2\2>\u012b\3\2\2\2@\u0135\3\2\2\2B"+
		"\u0137\3\2\2\2D\u0144\3\2\2\2F\u0146\3\2\2\2H\u014c\3\2\2\2J\u0152\3\2"+
		"\2\2L\u0160\3\2\2\2N\u0168\3\2\2\2P\u0171\3\2\2\2R\u0173\3\2\2\2T\u0178"+
		"\3\2\2\2V\u017f\3\2\2\2X\u0184\3\2\2\2Z\u0186\3\2\2\2\\\u018a\3\2\2\2"+
		"^\u018f\3\2\2\2`\u0191\3\2\2\2b\u0194\3\2\2\2d\u0197\3\2\2\2f\u0199\3"+
		"\2\2\2h\u01a0\3\2\2\2j\u01a2\3\2\2\2l\u01a4\3\2\2\2n\u01af\3\2\2\2p\u01ba"+
		"\3\2\2\2r\u01c8\3\2\2\2t\u01e0\3\2\2\2v\u01ea\3\2\2\2x\u01fb\3\2\2\2z"+
		"\u0209\3\2\2\2|\u0210\3\2\2\2~\u0216\3\2\2\2\u0080\u0218\3\2\2\2\u0082"+
		"\u0220\3\2\2\2\u0084\u022c\3\2\2\2\u0086\u0231\3\2\2\2\u0088\u0233\3\2"+
		"\2\2\u008a\u0238\3\2\2\2\u008c\u023a\3\2\2\2\u008e\u023c\3\2\2\2\u0090"+
		"\u0091\5\4\3\2\u0091\u0092\5\6\4\2\u0092\u0093\7R\2\2\u0093\u0094\5\16"+
		"\b\2\u0094\u0095\5\n\6\2\u0095\3\3\2\2\2\u0096\u0097\5\24\13\2\u0097\u0098"+
		"\5\4\3\2\u0098\u009b\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\5\3\2\2\2\u009c\u009d\t\2\2\2\u009d\7\3\2\2\2\u009e"+
		"\u009f\t\3\2\2\u009f\t\3\2\2\2\u00a0\u00a1\t\4\2\2\u00a1\13\3\2\2\2\u00a2"+
		"\u00a3\t\5\2\2\u00a3\r\3\2\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a6\5\22\n"+
		"\2\u00a6\u00a7\5\20\t\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac\5\20"+
		"\t\2\u00ac\u00af\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00b3\5\"\22\2\u00b1\u00b3\5$\23"+
		"\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b5"+
		"\5\b\5\2\u00b5\u00b8\7R\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b9\7R\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\5\32"+
		"\16\2\u00bb\u00bc\5\16\b\2\u00bc\u00bd\5\f\7\2\u00bd\25\3\2\2\2\u00be"+
		"\u00bf\7R\2\2\u00bf\u00c0\5\30\r\2\u00c0\27\3\2\2\2\u00c1\u00c2\7\61\2"+
		"\2\u00c2\u00c5\7R\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\31\3\2\2\2\u00c6\u00c7\7\13\2\2\u00c7\u00ca\5 \21\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\33\3\2\2"+
		"\2\u00cb\u00cc\7R\2\2\u00cc\u00cd\5\36\20\2\u00cd\35\3\2\2\2\u00ce\u00cf"+
		"\7\25\2\2\u00cf\u00d2\7R\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\37\3\2\2\2\u00d3\u00d8\7;\2\2\u00d4\u00d5\5\34\17"+
		"\2\u00d5\u00d6\7;\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4"+
		"\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00df\5> \2\u00da\u00df\5F$\2\u00db\u00df"+
		"\5H%\2\u00dc\u00df\5J&\2\u00dd\u00df\5B\"\2\u00de\u00d9\3\2\2\2\u00de"+
		"\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df#\3\2\2\2\u00e0\u00e1\5&\24\2\u00e1\u00e2\7C\2\2\u00e2%\3\2"+
		"\2\2\u00e3\u00eb\5R*\2\u00e4\u00eb\5.\30\2\u00e5\u00eb\5(\25\2\u00e6\u00eb"+
		"\5,\27\2\u00e7\u00eb\58\35\2\u00e8\u00eb\5b\62\2\u00e9\u00eb\5f\64\2\u00ea"+
		"\u00e3\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2"+
		"\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\'\3\2\2\2\u00ec\u00ed\7\65\2\2\u00ed\u00ee\5l\67\2\u00ee\u00ef\5*\26"+
		"\2\u00ef)\3\2\2\2\u00f0\u00f1\7\25\2\2\u00f1\u00f2\5l\67\2\u00f2\u00f3"+
		"\5*\26\2\u00f3\u00f6\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6+\3\2\2\2\u00f7\u00f8\7.\2\2\u00f8\u00f9\5T+\2\u00f9"+
		"-\3\2\2\2\u00fa\u00fb\7R\2\2\u00fb\u00fc\5^\60\2\u00fc\u00fd\5\60\31\2"+
		"\u00fd/\3\2\2\2\u00fe\u0101\5\62\32\2\u00ff\u0101\5`\61\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\61\3\2\2\2\u0102\u0103\7\13\2\2\u0103"+
		"\u0104\5\64\33\2\u0104\u0105\5\66\34\2\u0105\u0106\7;\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\63\3\2\2\2\u010a\u010d\5l\67\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2"+
		"\2\u010c\u010b\3\2\2\2\u010d\65\3\2\2\2\u010e\u010f\7\25\2\2\u010f\u0112"+
		"\5l\67\2\u0110\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\67\3\2\2\2\u0113\u0114\7\24\2\2\u0114\u0115\7R\2\2\u0115\u0116\7,\2\2"+
		"\u0116\u0117\5l\67\2\u0117\u0118\5<\37\2\u0118\u0119\7I\2\2\u0119\u011a"+
		"\5:\36\2\u011a9\3\2\2\2\u011b\u011c\7\25\2\2\u011c\u011d\7R\2\2\u011d"+
		"\u011e\7,\2\2\u011e\u011f\5l\67\2\u011f\u0120\5<\37\2\u0120\u0121\7I\2"+
		"\2\u0121\u0122\5:\36\2\u0122\u0125\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u011b"+
		"\3\2\2\2\u0124\u0123\3\2\2\2\u0125;\3\2\2\2\u0126\u0127\7\25\2\2\u0127"+
		"\u012a\5l\67\2\u0128\u012a\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012a=\3\2\2\2\u012b\u012c\79\2\2\u012c\u012d\5l\67\2\u012d\u012e"+
		"\7\"\2\2\u012e\u012f\5\16\b\2\u012f\u0130\5@!\2\u0130\u0131\7N\2\2\u0131"+
		"?\3\2\2\2\u0132\u0133\7#\2\2\u0133\u0136\5\16\b\2\u0134\u0136\3\2\2\2"+
		"\u0135\u0132\3\2\2\2\u0135\u0134\3\2\2\2\u0136A\3\2\2\2\u0137\u0138\7"+
		"/\2\2\u0138\u0139\5Z.\2\u0139\u013a\7E\2\2\u013a\u013b\5l\67\2\u013b\u013c"+
		"\5D#\2\u013c\u013d\7\4\2\2\u013d\u013e\5\16\b\2\u013e\u013f\7)\2\2\u013f"+
		"C\3\2\2\2\u0140\u0141\7=\2\2\u0141\u0142\7!\2\2\u0142\u0145\5l\67\2\u0143"+
		"\u0145\3\2\2\2\u0144\u0140\3\2\2\2\u0144\u0143\3\2\2\2\u0145E\3\2\2\2"+
		"\u0146\u0147\7@\2\2\u0147\u0148\5l\67\2\u0148\u0149\7\4\2\2\u0149\u014a"+
		"\5\16\b\2\u014a\u014b\7\7\2\2\u014bG\3\2\2\2\u014c\u014d\7\f\2\2\u014d"+
		"\u014e\5\16\b\2\u014e\u014f\7E\2\2\u014f\u0150\7\30\2\2\u0150\u0151\5"+
		"l\67\2\u0151I\3\2\2\2\u0152\u0153\7(\2\2\u0153\u0154\5l\67\2\u0154\u0155"+
		"\7\4\2\2\u0155\u0156\5L\'\2\u0156\u0157\7\b\2\2\u0157K\3\2\2\2\u0158\u0161"+
		"\3\2\2\2\u0159\u015a\7\34\2\2\u015a\u015b\5l\67\2\u015b\u015c\7L\2\2\u015c"+
		"\u015d\5\16\b\2\u015d\u015e\5P)\2\u015e\u015f\5N(\2\u015f\u0161\3\2\2"+
		"\2\u0160\u0158\3\2\2\2\u0160\u0159\3\2\2\2\u0161M\3\2\2\2\u0162\u0163"+
		"\7\3\2\2\u0163\u0164\7\62\2\2\u0164\u0165\7\t\2\2\u0165\u0166\7L\2\2\u0166"+
		"\u0169\5\16\b\2\u0167\u0169\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0167\3"+
		"\2\2\2\u0169O\3\2\2\2\u016a\u016b\7\34\2\2\u016b\u016c\5l\67\2\u016c\u016d"+
		"\7L\2\2\u016d\u016e\5\16\b\2\u016e\u016f\5P)\2\u016f\u0172\3\2\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u016a\3\2\2\2\u0171\u0170\3\2\2\2\u0172Q\3\2\2\2"+
		"\u0173\u0174\7\16\2\2\u0174\u0175\5T+\2\u0175\u0176\7\17\2\2\u0176\u0177"+
		"\5\u008eH\2\u0177S\3\2\2\2\u0178\u0179\7R\2\2\u0179\u017a\5V,\2\u017a"+
		"U\3\2\2\2\u017b\u0180\5X-\2\u017c\u017d\5\u0088E\2\u017d\u017e\5X-\2\u017e"+
		"\u0180\3\2\2\2\u017f\u017b\3\2\2\2\u017f\u017c\3\2\2\2\u0180W\3\2\2\2"+
		"\u0181\u0182\7\25\2\2\u0182\u0185\5T+\2\u0183\u0185\3\2\2\2\u0184\u0181"+
		"\3\2\2\2\u0184\u0183\3\2\2\2\u0185Y\3\2\2\2\u0186\u0187\5\\/\2\u0187\u0188"+
		"\7\61\2\2\u0188\u0189\5l\67\2\u0189[\3\2\2\2\u018a\u018b\7R\2\2\u018b"+
		"\u018c\5^\60\2\u018c]\3\2\2\2\u018d\u0190\5\u0088E\2\u018e\u0190\3\2\2"+
		"\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190_\3\2\2\2\u0191\u0192"+
		"\7\61\2\2\u0192\u0193\5l\67\2\u0193a\3\2\2\2\u0194\u0195\5d\63\2\u0195"+
		"\u0196\7M\2\2\u0196c\3\2\2\2\u0197\u0198\t\6\2\2\u0198e\3\2\2\2\u0199"+
		"\u019a\7&\2\2\u019a\u019b\5h\65\2\u019bg\3\2\2\2\u019c\u01a1\7\37\2\2"+
		"\u019d\u019e\5l\67\2\u019e\u019f\5j\66\2\u019f\u01a1\3\2\2\2\u01a0\u019c"+
		"\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1i\3\2\2\2\u01a2\u01a3\t\7\2\2\u01a3"+
		"k\3\2\2\2\u01a4\u01a5\b\67\1\2\u01a5\u01a6\5n8\2\u01a6\u01ac\3\2\2\2\u01a7"+
		"\u01a8\f\4\2\2\u01a8\u01a9\7F\2\2\u01a9\u01ab\5n8\2\u01aa\u01a7\3\2\2"+
		"\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01adm"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\b8\1\2\u01b0\u01b1\5p9\2\u01b1"+
		"\u01b7\3\2\2\2\u01b2\u01b3\f\4\2\2\u01b3\u01b4\7B\2\2\u01b4\u01b6\5p9"+
		"\2\u01b5\u01b2\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8o\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\b9\1\2\u01bb\u01bc"+
		"\5r:\2\u01bc\u01c5\3\2\2\2\u01bd\u01be\f\5\2\2\u01be\u01bf\7\35\2\2\u01bf"+
		"\u01c4\5r:\2\u01c0\u01c1\f\4\2\2\u01c1\u01c2\7<\2\2\u01c2\u01c4\5r:\2"+
		"\u01c3\u01bd\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6q\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c9\b:\1\2\u01c9\u01ca\5t;\2\u01ca\u01d9\3\2\2\2\u01cb\u01cc\f\7\2"+
		"\2\u01cc\u01cd\7\32\2\2\u01cd\u01d8\5t;\2\u01ce\u01cf\f\6\2\2\u01cf\u01d0"+
		"\7*\2\2\u01d0\u01d8\5t;\2\u01d1\u01d2\f\5\2\2\u01d2\u01d3\7\21\2\2\u01d3"+
		"\u01d8\5t;\2\u01d4\u01d5\f\4\2\2\u01d5\u01d6\7\6\2\2\u01d6\u01d8\5t;\2"+
		"\u01d7\u01cb\3\2\2\2\u01d7\u01ce\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d4"+
		"\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"s\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\b;\1\2\u01dd\u01de\7\36\2\2"+
		"\u01de\u01e1\5v<\2\u01df\u01e1\5v<\2\u01e0\u01dc\3\2\2\2\u01e0\u01df\3"+
		"\2\2\2\u01e1\u01e7\3\2\2\2\u01e2\u01e3\f\5\2\2\u01e3\u01e4\7+\2\2\u01e4"+
		"\u01e6\5v<\2\u01e5\u01e2\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2"+
		"\2\u01e7\u01e8\3\2\2\2\u01e8u\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb"+
		"\b<\1\2\u01eb\u01ec\5x=\2\u01ec\u01f8\3\2\2\2\u01ed\u01ee\f\6\2\2\u01ee"+
		"\u01ef\7\33\2\2\u01ef\u01f7\5x=\2\u01f0\u01f1\f\5\2\2\u01f1\u01f2\7\20"+
		"\2\2\u01f2\u01f7\5x=\2\u01f3\u01f4\f\4\2\2\u01f4\u01f5\7?\2\2\u01f5\u01f7"+
		"\5x=\2\u01f6\u01ed\3\2\2\2\u01f6\u01f0\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f7"+
		"\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9w\3\2\2\2"+
		"\u01fa\u01f8\3\2\2\2\u01fb\u01fc\b=\1\2\u01fc\u01fd\5z>\2\u01fd\u0203"+
		"\3\2\2\2\u01fe\u01ff\f\4\2\2\u01ff\u0200\78\2\2\u0200\u0202\5z>\2\u0201"+
		"\u01fe\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204y\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7\r\2\2\u0207\u020a"+
		"\5z>\2\u0208\u020a\5|?\2\u0209\u0206\3\2\2\2\u0209\u0208\3\2\2\2\u020a"+
		"{\3\2\2\2\u020b\u020c\7\13\2\2\u020c\u020d\5l\67\2\u020d\u020e\7;\2\2"+
		"\u020e\u0211\3\2\2\2\u020f\u0211\5\u0084C\2\u0210\u020b\3\2\2\2\u0210"+
		"\u020f\3\2\2\2\u0211}\3\2\2\2\u0212\u0213\5\u008aF\2\u0213\u0214\5l\67"+
		"\2\u0214\u0217\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0212\3\2\2\2\u0216\u0215"+
		"\3\2\2\2\u0217\177\3\2\2\2\u0218\u0219\7\13\2\2\u0219\u021a\5l\67\2\u021a"+
		"\u021b\7;\2\2\u021b\u0081\3\2\2\2\u021c\u021d\5\u008aF\2\u021d\u021e\5"+
		"l\67\2\u021e\u0221\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021c\3\2\2\2\u0220"+
		"\u021f\3\2\2\2\u0221\u0083\3\2\2\2\u0222\u022d\7Q\2\2\u0223\u022d\7P\2"+
		"\2\u0224\u022d\7O\2\2\u0225\u0226\7R\2\2\u0226\u022d\5\u0086D\2\u0227"+
		"\u022d\7\23\2\2\u0228\u022d\7H\2\2\u0229\u022a\5\u008cG\2\u022a\u022b"+
		"\5\u0084C\2\u022b\u022d\3\2\2\2\u022c\u0222\3\2\2\2\u022c\u0223\3\2\2"+
		"\2\u022c\u0224\3\2\2\2\u022c\u0225\3\2\2\2\u022c\u0227\3\2\2\2\u022c\u0228"+
		"\3\2\2\2\u022c\u0229\3\2\2\2\u022d\u0085\3\2\2\2\u022e\u0232\5\62\32\2"+
		"\u022f\u0232\5\u0088E\2\u0230\u0232\3\2\2\2\u0231\u022e\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u0087\3\2\2\2\u0233\u0234\7,"+
		"\2\2\u0234\u0235\5l\67\2\u0235\u0236\5<\37\2\u0236\u0237\7I\2\2\u0237"+
		"\u0089\3\2\2\2\u0238\u0239\t\b\2\2\u0239\u008b\3\2\2\2\u023a\u023b\t\t"+
		"\2\2\u023b\u008d\3\2\2\2\u023c\u023d\t\n\2\2\u023d\u008f\3\2\2\2.\u009a"+
		"\u00a8\u00ae\u00b2\u00b8\u00c4\u00c9\u00d1\u00d7\u00de\u00ea\u00f5\u0100"+
		"\u0108\u010c\u0111\u0124\u0129\u0135\u0144\u0160\u0168\u0171\u017f\u0184"+
		"\u018f\u01a0\u01ac\u01b7\u01c3\u01c5\u01d7\u01d9\u01e0\u01e7\u01f6\u01f8"+
		"\u0203\u0209\u0210\u0216\u0220\u022c\u0231";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}