// Generated from PSeint.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSeintLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DE", "HACER", "TEXTO", "TOKEN_MAYOR_IGUAL", "FINMIENTRAS", "FINSEGUN", 
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


	public PSeintLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PSeint.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2S\u0377\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\6\26\u015f\n\26\r\26\16\26"+
		"\u0160\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\7\30\u0175\n\30\f\30\16\30\u0178\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3&\6&\u01e3\n&\r&\16&\u01e4\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3"+
		"J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3"+
		"L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\6"+
		"R\u0372\nR\rR\16R\u0373\3R\3R\2\2S\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\3\2\7\4\2C\\c|\3\2))\3\2c"+
		"|\3\2\62;\5\2\13\f\17\17\"\"\u037a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\3\u00a5\3\2\2\2\5\u00a8\3\2\2\2\7\u00ae\3\2\2\2\t\u00b4\3\2\2\2\13"+
		"\u00c6\3\2\2\2\r\u00d2\3\2\2\2\17\u00db\3\2\2\2\21\u00e0\3\2\2\2\23\u00eb"+
		"\3\2\2\2\25\u00f9\3\2\2\2\27\u0101\3\2\2\2\31\u010b\3\2\2\2\33\u0113\3"+
		"\2\2\2\35\u0118\3\2\2\2\37\u0122\3\2\2\2!\u012e\3\2\2\2#\u0136\3\2\2\2"+
		"%\u0140\3\2\2\2\'\u014a\3\2\2\2)\u0155\3\2\2\2+\u015e\3\2\2\2-\u0162\3"+
		"\2\2\2/\u0172\3\2\2\2\61\u017b\3\2\2\2\63\u017f\3\2\2\2\65\u0186\3\2\2"+
		"\2\67\u0192\3\2\2\29\u019c\3\2\2\2;\u01a1\3\2\2\2=\u01ad\3\2\2\2?\u01b9"+
		"\3\2\2\2A\u01bf\3\2\2\2C\u01c6\3\2\2\2E\u01cb\3\2\2\2G\u01d4\3\2\2\2I"+
		"\u01d9\3\2\2\2K\u01e2\3\2\2\2M\u01e6\3\2\2\2O\u01f3\3\2\2\2Q\u01fb\3\2"+
		"\2\2S\u0200\3\2\2\2U\u0206\3\2\2\2W\u020e\3\2\2\2Y\u0220\3\2\2\2[\u022a"+
		"\3\2\2\2]\u0238\3\2\2\2_\u0243\3\2\2\2a\u0248\3\2\2\2c\u024d\3\2\2\2e"+
		"\u0258\3\2\2\2g\u0263\3\2\2\2i\u0268\3\2\2\2k\u0270\3\2\2\2m\u027e\3\2"+
		"\2\2o\u0287\3\2\2\2q\u0294\3\2\2\2s\u029d\3\2\2\2u\u02a7\3\2\2\2w\u02aa"+
		"\3\2\2\2y\u02b1\3\2\2\2{\u02bf\3\2\2\2}\u02c9\3\2\2\2\177\u02cd\3\2\2"+
		"\2\u0081\u02d7\3\2\2\2\u0083\u02e1\3\2\2\2\u0085\u02ea\3\2\2\2\u0087\u02f3"+
		"\3\2\2\2\u0089\u02fb\3\2\2\2\u008b\u0305\3\2\2\2\u008d\u030e\3\2\2\2\u008f"+
		"\u0314\3\2\2\2\u0091\u031c\3\2\2\2\u0093\u0329\3\2\2\2\u0095\u032f\3\2"+
		"\2\2\u0097\u033d\3\2\2\2\u0099\u0344\3\2\2\2\u009b\u034b\3\2\2\2\u009d"+
		"\u0356\3\2\2\2\u009f\u035f\3\2\2\2\u00a1\u036a\3\2\2\2\u00a3\u0371\3\2"+
		"\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7g\2\2\u00a7\4\3\2\2\2\u00a8\u00a9"+
		"\7j\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\6\3\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7z\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7q\2\2\u00b3\b\3\2\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7m\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8\u00b9\7p\2\2\u00b9\u00ba\7a\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc"+
		"\7c\2\2\u00bc\u00bd\7{\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7a\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7i\2\2\u00c2\u00c3\7w\2\2"+
		"\u00c3\u00c4\7c\2\2\u00c4\u00c5\7n\2\2\u00c5\n\3\2\2\2\u00c6\u00c7\7h"+
		"\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb"+
		"\7k\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7u\2\2\u00d1\f\3\2\2\2\u00d2"+
		"\u00d3\7h\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7u\2\2"+
		"\u00d6\u00d7\7g\2\2\u00d7\u00d8\7i\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\16\3\2\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de"+
		"\7f\2\2\u00de\u00df\7q\2\2\u00df\20\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2"+
		"\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7t\2\2\u00e5"+
		"\u00e6\7q\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7u\2\2"+
		"\u00e9\u00ea\7q\2\2\u00ea\22\3\2\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7"+
		"q\2\2\u00ed\u00ee\7m\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7a\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7t\2\2\u00f4"+
		"\u00f5\7a\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7|\2\2\u00f7\u00f8\7s\2\2"+
		"\u00f8\24\3\2\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7"+
		"r\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100"+
		"\7t\2\2\u0100\26\3\2\2\2\u0101\u0102\7v\2\2\u0102\u0103\7q\2\2\u0103\u0104"+
		"\7m\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106\u0107\7a\2\2\u0107"+
		"\u0108\7p\2\2\u0108\u0109\7g\2\2\u0109\u010a\7i\2\2\u010a\30\3\2\2\2\u010b"+
		"\u010c\7f\2\2\u010c\u010d\7g\2\2\u010d\u010e\7h\2\2\u010e\u010f\7k\2\2"+
		"\u010f\u0110\7p\2\2\u0110\u0111\7k\2\2\u0111\u0112\7t\2\2\u0112\32\3\2"+
		"\2\2\u0113\u0114\7e\2\2\u0114\u0115\7q\2\2\u0115\u0116\7o\2\2\u0116\u0117"+
		"\7q\2\2\u0117\34\3\2\2\2\u0118\u0119\7v\2\2\u0119\u011a\7q\2\2\u011a\u011b"+
		"\7m\2\2\u011b\u011c\7g\2\2\u011c\u011d\7p\2\2\u011d\u011e\7a\2\2\u011e"+
		"\u011f\7f\2\2\u011f\u0120\7k\2\2\u0120\u0121\7x\2\2\u0121\36\3\2\2\2\u0122"+
		"\u0123\7v\2\2\u0123\u0124\7q\2\2\u0124\u0125\7m\2\2\u0125\u0126\7g\2\2"+
		"\u0126\u0127\7p\2\2\u0127\u0128\7a\2\2\u0128\u0129\7o\2\2\u0129\u012a"+
		"\7c\2\2\u012a\u012b\7{\2\2\u012b\u012c\7q\2\2\u012c\u012d\7t\2\2\u012d"+
		" \3\2\2\2\u012e\u012f\7r\2\2\u012f\u0130\7t\2\2\u0130\u0131\7q\2\2\u0131"+
		"\u0132\7e\2\2\u0132\u0133\7g\2\2\u0133\u0134\7u\2\2\u0134\u0135\7q\2\2"+
		"\u0135\"\3\2\2\2\u0136\u0137\7x\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t"+
		"\2\2\u0139\u013a\7f\2\2\u013a\u013b\7c\2\2\u013b\u013c\7f\2\2\u013c\u013d"+
		"\7g\2\2\u013d\u013e\7t\2\2\u013e\u013f\7q\2\2\u013f$\3\2\2\2\u0140\u0141"+
		"\7f\2\2\u0141\u0142\7k\2\2\u0142\u0143\7o\2\2\u0143\u0144\7g\2\2\u0144"+
		"\u0145\7p\2\2\u0145\u0146\7u\2\2\u0146\u0147\7k\2\2\u0147\u0148\7q\2\2"+
		"\u0148\u0149\7p\2\2\u0149&\3\2\2\2\u014a\u014b\7v\2\2\u014b\u014c\7q\2"+
		"\2\u014c\u014d\7m\2\2\u014d\u014e\7g\2\2\u014e\u014f\7p\2\2\u014f\u0150"+
		"\7a\2\2\u0150\u0151\7e\2\2\u0151\u0152\7q\2\2\u0152\u0153\7o\2\2\u0153"+
		"\u0154\7c\2\2\u0154(\3\2\2\2\u0155\u0156\7n\2\2\u0156\u0157\7k\2\2\u0157"+
		"\u0158\7o\2\2\u0158\u0159\7r\2\2\u0159\u015a\7k\2\2\u015a\u015b\7c\2\2"+
		"\u015b\u015c\7t\2\2\u015c*\3\2\2\2\u015d\u015f\t\2\2\2\u015e\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		",\3\2\2\2\u0162\u0163\7h\2\2\u0163\u0164\7k\2\2\u0164\u0165\7p\2\2\u0165"+
		"\u0166\7u\2\2\u0166\u0167\7w\2\2\u0167\u0168\7d\2\2\u0168\u0169\7c\2\2"+
		"\u0169\u016a\7n\2\2\u016a\u016b\7i\2\2\u016b\u016c\7q\2\2\u016c\u016d"+
		"\7t\2\2\u016d\u016e\7k\2\2\u016e\u016f\7v\2\2\u016f\u0170\7o\2\2\u0170"+
		"\u0171\7q\2\2\u0171.\3\2\2\2\u0172\u0176\t\3\2\2\u0173\u0175\t\4\2\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\t\3\2\2\u017a"+
		"\60\3\2\2\2\u017b\u017c\7s\2\2\u017c\u017d\7w\2\2\u017d\u017e\7g\2\2\u017e"+
		"\62\3\2\2\2\u017f\u0180\7d\2\2\u0180\u0181\7q\2\2\u0181\u0182\7t\2\2\u0182"+
		"\u0183\7t\2\2\u0183\u0184\7c\2\2\u0184\u0185\7t\2\2\u0185\64\3\2\2\2\u0186"+
		"\u0187\7v\2\2\u0187\u0188\7q\2\2\u0188\u0189\7m\2\2\u0189\u018a\7g\2\2"+
		"\u018a\u018b\7p\2\2\u018b\u018c\7a\2\2\u018c\u018d\7o\2\2\u018d\u018e"+
		"\7g\2\2\u018e\u018f\7p\2\2\u018f\u0190\7q\2\2\u0190\u0191\7t\2\2\u0191"+
		"\66\3\2\2\2\u0192\u0193\7v\2\2\u0193\u0194\7q\2\2\u0194\u0195\7m\2\2\u0195"+
		"\u0196\7g\2\2\u0196\u0197\7p\2\2\u0197\u0198\7a\2\2\u0198\u0199\7o\2\2"+
		"\u0199\u019a\7w\2\2\u019a\u019b\7n\2\2\u019b8\3\2\2\2\u019c\u019d\7e\2"+
		"\2\u019d\u019e\7c\2\2\u019e\u019f\7u\2\2\u019f\u01a0\7q\2\2\u01a0:\3\2"+
		"\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a4\7m\2\2\u01a4\u01a5"+
		"\7g\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a7\7a\2\2\u01a7\u01a8\7k\2\2\u01a8"+
		"\u01a9\7i\2\2\u01a9\u01aa\7w\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7n\2\2"+
		"\u01ac<\3\2\2\2\u01ad\u01ae\7v\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7m\2"+
		"\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7a\2\2\u01b3\u01b4"+
		"\7o\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7\7q\2\2\u01b7"+
		"\u01b8\7u\2\2\u01b8>\3\2\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb\7g\2\2\u01bb"+
		"\u01bc\7e\2\2\u01bc\u01bd\7n\2\2\u01bd\u01be\7c\2\2\u01be@\3\2\2\2\u01bf"+
		"\u01c0\7g\2\2\u01c0\u01c1\7p\2\2\u01c1\u01c2\7v\2\2\u01c2\u01c3\7g\2\2"+
		"\u01c3\u01c4\7t\2\2\u01c4\u01c5\7q\2\2\u01c5B\3\2\2\2\u01c6\u01c7\7r\2"+
		"\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7u\2\2\u01c9\u01ca\7q\2\2\u01caD\3\2"+
		"\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7p\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf"+
		"\7q\2\2\u01cf\u01d0\7p\2\2\u01d0\u01d1\7e\2\2\u01d1\u01d2\7g\2\2\u01d2"+
		"\u01d3\7u\2\2\u01d3F\3\2\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7k\2\2\u01d6"+
		"\u01d7\7p\2\2\u01d7\u01d8\7q\2\2\u01d8H\3\2\2\2\u01d9\u01da\7o\2\2\u01da"+
		"\u01db\7k\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7w\2\2\u01dd\u01de\7v\2\2"+
		"\u01de\u01df\7q\2\2\u01df\u01e0\7u\2\2\u01e0J\3\2\2\2\u01e1\u01e3\t\5"+
		"\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5L\3\2\2\2\u01e6\u01e7\7u\2\2\u01e7\u01e8\7w\2\2\u01e8"+
		"\u01e9\7d\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7n\2\2\u01eb\u01ec\7i\2\2"+
		"\u01ec\u01ed\7q\2\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0"+
		"\7v\2\2\u01f0\u01f1\7o\2\2\u01f1\u01f2\7q\2\2\u01f2N\3\2\2\2\u01f3\u01f4"+
		"\7g\2\2\u01f4\u01f5\7u\2\2\u01f5\u01f6\7r\2\2\u01f6\u01f7\7g\2\2\u01f7"+
		"\u01f8\7t\2\2\u01f8\u01f9\7c\2\2\u01f9\u01fa\7t\2\2\u01faP\3\2\2\2\u01fb"+
		"\u01fc\7t\2\2\u01fc\u01fd\7g\2\2\u01fd\u01fe\7c\2\2\u01fe\u01ff\7n\2\2"+
		"\u01ffR\3\2\2\2\u0200\u0201\7u\2\2\u0201\u0202\7g\2\2\u0202\u0203\7i\2"+
		"\2\u0203\u0204\7w\2\2\u0204\u0205\7p\2\2\u0205T\3\2\2\2\u0206\u0207\7"+
		"h\2\2\u0207\u0208\7k\2\2\u0208\u0209\7p\2\2\u0209\u020a\7r\2\2\u020a\u020b"+
		"\7c\2\2\u020b\u020c\7t\2\2\u020c\u020d\7c\2\2\u020dV\3\2\2\2\u020e\u020f"+
		"\7v\2\2\u020f\u0210\7q\2\2\u0210\u0211\7m\2\2\u0211\u0212\7g\2\2\u0212"+
		"\u0213\7p\2\2\u0213\u0214\7a\2\2\u0214\u0215\7o\2\2\u0215\u0216\7g\2\2"+
		"\u0216\u0217\7p\2\2\u0217\u0218\7q\2\2\u0218\u0219\7t\2\2\u0219\u021a"+
		"\7a\2\2\u021a\u021b\7k\2\2\u021b\u021c\7i\2\2\u021c\u021d\7w\2\2\u021d"+
		"\u021e\7c\2\2\u021e\u021f\7n\2\2\u021fX\3\2\2\2\u0220\u0221\7v\2\2\u0221"+
		"\u0222\7q\2\2\u0222\u0223\7m\2\2\u0223\u0224\7g\2\2\u0224\u0225\7p\2\2"+
		"\u0225\u0226\7a\2\2\u0226\u0227\7o\2\2\u0227\u0228\7c\2\2\u0228\u0229"+
		"\7u\2\2\u0229Z\3\2\2\2\u022a\u022b\7v\2\2\u022b\u022c\7q\2\2\u022c\u022d"+
		"\7m\2\2\u022d\u022e\7g\2\2\u022e\u022f\7p\2\2\u022f\u0230\7a\2\2\u0230"+
		"\u0231\7e\2\2\u0231\u0232\7q\2\2\u0232\u0233\7t\2\2\u0233\u0234\7a\2\2"+
		"\u0234\u0235\7k\2\2\u0235\u0236\7|\2\2\u0236\u0237\7s\2\2\u0237\\\3\2"+
		"\2\2\u0238\u0239\7u\2\2\u0239\u023a\7w\2\2\u023a\u023b\7d\2\2\u023b\u023c"+
		"\7r\2\2\u023c\u023d\7t\2\2\u023d\u023e\7q\2\2\u023e\u023f\7e\2\2\u023f"+
		"\u0240\7g\2\2\u0240\u0241\7u\2\2\u0241\u0242\7q\2\2\u0242^\3\2\2\2\u0243"+
		"\u0244\7n\2\2\u0244\u0245\7g\2\2\u0245\u0246\7g\2\2\u0246\u0247\7t\2\2"+
		"\u0247`\3\2\2\2\u0248\u0249\7r\2\2\u0249\u024a\7c\2\2\u024a\u024b\7t\2"+
		"\2\u024b\u024c\7c\2\2\u024cb\3\2\2\2\u024d\u024e\7h\2\2\u024e\u024f\7"+
		"k\2\2\u024f\u0250\7p\2\2\u0250\u0251\7h\2\2\u0251\u0252\7w\2\2\u0252\u0253"+
		"\7p\2\2\u0253\u0254\7e\2\2\u0254\u0255\7k\2\2\u0255\u0256\7q\2\2\u0256"+
		"\u0257\7p\2\2\u0257d\3\2\2\2\u0258\u0259\7v\2\2\u0259\u025a\7q\2\2\u025a"+
		"\u025b\7m\2\2\u025b\u025c\7g\2\2\u025c\u025d\7p\2\2\u025d\u025e\7a\2\2"+
		"\u025e\u025f\7c\2\2\u025f\u0260\7u\2\2\u0260\u0261\7k\2\2\u0261\u0262"+
		"\7i\2\2\u0262f\3\2\2\2\u0263\u0264\7q\2\2\u0264\u0265\7v\2\2\u0265\u0266"+
		"\7t\2\2\u0266\u0267\7q\2\2\u0267h\3\2\2\2\u0268\u0269\7h\2\2\u0269\u026a"+
		"\7w\2\2\u026a\u026b\7p\2\2\u026b\u026c\7e\2\2\u026c\u026d\7k\2\2\u026d"+
		"\u026e\7q\2\2\u026e\u026f\7p\2\2\u026fj\3\2\2\2\u0270\u0271\7h\2\2\u0271"+
		"\u0272\7k\2\2\u0272\u0273\7p\2\2\u0273\u0274\7u\2\2\u0274\u0275\7w\2\2"+
		"\u0275\u0276\7d\2\2\u0276\u0277\7r\2\2\u0277\u0278\7t\2\2\u0278\u0279"+
		"\7q\2\2\u0279\u027a\7e\2\2\u027a\u027b\7g\2\2\u027b\u027c\7u\2\2\u027c"+
		"\u027d\7q\2\2\u027dl\3\2\2\2\u027e\u027f\7g\2\2\u027f\u0280\7u\2\2\u0280"+
		"\u0281\7e\2\2\u0281\u0282\7t\2\2\u0282\u0283\7k\2\2\u0283\u0284\7d\2\2"+
		"\u0284\u0285\7k\2\2\u0285\u0286\7t\2\2\u0286n\3\2\2\2\u0287\u0288\7h\2"+
		"\2\u0288\u0289\7k\2\2\u0289\u028a\7p\2\2\u028a\u028b\7c\2\2\u028b\u028c"+
		"\7n\2\2\u028c\u028d\7i\2\2\u028d\u028e\7q\2\2\u028e\u028f\7t\2\2\u028f"+
		"\u0290\7k\2\2\u0290\u0291\7v\2\2\u0291\u0292\7o\2\2\u0292\u0293\7q\2\2"+
		"\u0293p\3\2\2\2\u0294\u0295\7u\2\2\u0295\u0296\7g\2\2\u0296\u0297\7i\2"+
		"\2\u0297\u0298\7w\2\2\u0298\u0299\7p\2\2\u0299\u029a\7f\2\2\u029a\u029b"+
		"\7q\2\2\u029b\u029c\7u\2\2\u029cr\3\2\2\2\u029d\u029e\7v\2\2\u029e\u029f"+
		"\7q\2\2\u029f\u02a0\7m\2\2\u02a0\u02a1\7g\2\2\u02a1\u02a2\7p\2\2\u02a2"+
		"\u02a3\7a\2\2\u02a3\u02a4\7r\2\2\u02a4\u02a5\7q\2\2\u02a5\u02a6\7v\2\2"+
		"\u02a6t\3\2\2\2\u02a7\u02a8\7u\2\2\u02a8\u02a9\7k\2\2\u02a9v\3\2\2\2\u02aa"+
		"\u02ab\7e\2\2\u02ab\u02ac\7c\2\2\u02ac\u02ad\7f\2\2\u02ad\u02ae\7g\2\2"+
		"\u02ae\u02af\7p\2\2\u02af\u02b0\7c\2\2\u02b0x\3\2\2\2\u02b1\u02b2\7v\2"+
		"\2\u02b2\u02b3\7q\2\2\u02b3\u02b4\7m\2\2\u02b4\u02b5\7g\2\2\u02b5\u02b6"+
		"\7p\2\2\u02b6\u02b7\7a\2\2\u02b7\u02b8\7r\2\2\u02b8\u02b9\7c\2\2\u02b9"+
		"\u02ba\7t\2\2\u02ba\u02bb\7a\2\2\u02bb\u02bc\7f\2\2\u02bc\u02bd\7g\2\2"+
		"\u02bd\u02be\7t\2\2\u02bez\3\2\2\2\u02bf\u02c0\7v\2\2\u02c0\u02c1\7q\2"+
		"\2\u02c1\u02c2\7m\2\2\u02c2\u02c3\7g\2\2\u02c3\u02c4\7p\2\2\u02c4\u02c5"+
		"\7a\2\2\u02c5\u02c6\7f\2\2\u02c6\u02c7\7k\2\2\u02c7\u02c8\7h\2\2\u02c8"+
		"|\3\2\2\2\u02c9\u02ca\7e\2\2\u02ca\u02cb\7q\2\2\u02cb\u02cc\7p\2\2\u02cc"+
		"~\3\2\2\2\u02cd\u02ce\7c\2\2\u02ce\u02cf\7n\2\2\u02cf\u02d0\7i\2\2\u02d0"+
		"\u02d1\7q\2\2\u02d1\u02d2\7t\2\2\u02d2\u02d3\7k\2\2\u02d3\u02d4\7v\2\2"+
		"\u02d4\u02d5\7o\2\2\u02d5\u02d6\7q\2\2\u02d6\u0080\3\2\2\2\u02d7\u02d8"+
		"\7v\2\2\u02d8\u02d9\7q\2\2\u02d9\u02da\7m\2\2\u02da\u02db\7g\2\2\u02db"+
		"\u02dc\7p\2\2\u02dc\u02dd\7a\2\2\u02dd\u02de\7o\2\2\u02de\u02df\7q\2\2"+
		"\u02df\u02e0\7f\2\2\u02e0\u0082\3\2\2\2\u02e1\u02e2\7o\2\2\u02e2\u02e3"+
		"\7k\2\2\u02e3\u02e4\7g\2\2\u02e4\u02e5\7p\2\2\u02e5\u02e6\7v\2\2\u02e6"+
		"\u02e7\7t\2\2\u02e7\u02e8\7c\2\2\u02e8\u02e9\7u\2\2\u02e9\u0084\3\2\2"+
		"\2\u02ea\u02eb\7p\2\2\u02eb\u02ec\7w\2\2\u02ec\u02ed\7o\2\2\u02ed\u02ee"+
		"\7g\2\2\u02ee\u02ef\7t\2\2\u02ef\u02f0\7k\2\2\u02f0\u02f1\7e\2\2\u02f1"+
		"\u02f2\7q\2\2\u02f2\u0086\3\2\2\2\u02f3\u02f4\7v\2\2\u02f4\u02f5\7q\2"+
		"\2\u02f5\u02f6\7m\2\2\u02f6\u02f7\7g\2\2\u02f7\u02f8\7p\2\2\u02f8\u02f9"+
		"\7a\2\2\u02f9\u02fa\7{\2\2\u02fa\u0088\3\2\2\2\u02fb\u02fc\7v\2\2\u02fc"+
		"\u02fd\7q\2\2\u02fd\u02fe\7m\2\2\u02fe\u02ff\7g\2\2\u02ff\u0300\7p\2\2"+
		"\u0300\u0301\7a\2\2\u0301\u0302\7r\2\2\u0302\u0303\7{\2\2\u0303\u0304"+
		"\7e\2\2\u0304\u008a\3\2\2\2\u0305\u0306\7e\2\2\u0306\u0307\7c\2\2\u0307"+
		"\u0308\7t\2\2\u0308\u0309\7c\2\2\u0309\u030a\7e\2\2\u030a\u030b\7v\2\2"+
		"\u030b\u030c\7g\2\2\u030c\u030d\7t\2\2\u030d\u008c\3\2\2\2\u030e\u030f"+
		"\7j\2\2\u030f\u0310\7c\2\2\u0310\u0311\7u\2\2\u0311\u0312\7v\2\2\u0312"+
		"\u0313\7c\2\2\u0313\u008e\3\2\2\2\u0314\u0315\7v\2\2\u0315\u0316\7q\2"+
		"\2\u0316\u0317\7m\2\2\u0317\u0318\7g\2\2\u0318\u0319\7p\2\2\u0319\u031a"+
		"\7a\2\2\u031a\u031b\7q\2\2\u031b\u0090\3\2\2\2\u031c\u031d\7o\2\2\u031d"+
		"\u031e\7k\2\2\u031e\u031f\7n\2\2\u031f\u0320\7k\2\2\u0320\u0321\7u\2\2"+
		"\u0321\u0322\7g\2\2\u0322\u0323\7i\2\2\u0323\u0324\7w\2\2\u0324\u0325"+
		"\7p\2\2\u0325\u0326\7f\2\2\u0326\u0327\7q\2\2\u0327\u0328\7u\2\2\u0328"+
		"\u0092\3\2\2\2\u0329\u032a\7h\2\2\u032a\u032b\7c\2\2\u032b\u032c\7n\2"+
		"\2\u032c\u032d\7u\2\2\u032d\u032e\7q\2\2\u032e\u0094\3\2\2\2\u032f\u0330"+
		"\7v\2\2\u0330\u0331\7q\2\2\u0331\u0332\7m\2\2\u0332\u0333\7g\2\2\u0333"+
		"\u0334\7p\2\2\u0334\u0335\7a\2\2\u0335\u0336\7e\2\2\u0336\u0337\7q\2\2"+
		"\u0337\u0338\7t\2\2\u0338\u0339\7a\2\2\u0339\u033a\7f\2\2\u033a\u033b"+
		"\7g\2\2\u033b\u033c\7t\2\2\u033c\u0096\3\2\2\2\u033d\u033e\7p\2\2\u033e"+
		"\u033f\7w\2\2\u033f\u0340\7o\2\2\u0340\u0341\7g\2\2\u0341\u0342\7t\2\2"+
		"\u0342\u0343\7q\2\2\u0343\u0098\3\2\2\2\u0344\u0345\7n\2\2\u0345\u0346"+
		"\7q\2\2\u0346\u0347\7i\2\2\u0347\u0348\7k\2\2\u0348\u0349\7e\2\2\u0349"+
		"\u034a\7q\2\2\u034a\u009a\3\2\2\2\u034b\u034c\7v\2\2\u034c\u034d\7q\2"+
		"\2\u034d\u034e\7m\2\2\u034e\u034f\7g\2\2\u034f\u0350\7p\2\2\u0350\u0351"+
		"\7a\2\2\u0351\u0352\7f\2\2\u0352\u0353\7q\2\2\u0353\u0354\7u\2\2\u0354"+
		"\u0355\7r\2\2\u0355\u009c\3\2\2\2\u0356\u0357\7r\2\2\u0357\u0358\7c\2"+
		"\2\u0358\u0359\7p\2\2\u0359\u035a\7v\2\2\u035a\u035b\7c\2\2\u035b\u035c"+
		"\7n\2\2\u035c\u035d\7n\2\2\u035d\u035e\7c\2\2\u035e\u009e\3\2\2\2\u035f"+
		"\u0360\7v\2\2\u0360\u0361\7q\2\2\u0361\u0362\7m\2\2\u0362\u0363\7g\2\2"+
		"\u0363\u0364\7p\2\2\u0364\u0365\7a\2\2\u0365\u0366\7t\2\2\u0366\u0367"+
		"\7g\2\2\u0367\u0368\7c\2\2\u0368\u0369\7n\2\2\u0369\u00a0\3\2\2\2\u036a"+
		"\u036b\7h\2\2\u036b\u036c\7k\2\2\u036c\u036d\7p\2\2\u036d\u036e\7u\2\2"+
		"\u036e\u036f\7k\2\2\u036f\u00a2\3\2\2\2\u0370\u0372\t\6\2\2\u0371\u0370"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0376\bR\2\2\u0376\u00a4\3\2\2\2\7\2\u0160\u0176"+
		"\u01e4\u0373\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}