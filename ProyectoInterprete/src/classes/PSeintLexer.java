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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DE", "HACER", "TEXTO", "TOKEN_MAYOR_IGUAL", "FINMIENTRAS", "FINSEGUN", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2S\u02a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00ea\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38"+
		"\38\39\39\39\39\39\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D"+
		"\3D\3D\3D\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G"+
		"\3G\3G\3G\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N"+
		"\3N\3O\6O\u028f\nO\rO\16O\u0290\3P\3P\7P\u0295\nP\fP\16P\u0298\13P\3P"+
		"\3P\3Q\6Q\u029d\nQ\rQ\16Q\u029e\3R\6R\u02a2\nR\rR\16R\u02a3\3R\3R\2\2"+
		"S\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\3\2\b\4\2(({{\4\2qq~~\3\2\62;\4\2$$))\4\2C\\c|\5\2\13\f\17\17"+
		"\"\"\u02ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2\2\5\u00a8"+
		"\3\2\2\2\7\u00ae\3\2\2\2\t\u00b4\3\2\2\2\13\u00b7\3\2\2\2\r\u00c3\3\2"+
		"\2\2\17\u00cc\3\2\2\2\21\u00d1\3\2\2\2\23\u00dc\3\2\2\2\25\u00de\3\2\2"+
		"\2\27\u00e9\3\2\2\2\31\u00eb\3\2\2\2\33\u00f3\3\2\2\2\35\u00f8\3\2\2\2"+
		"\37\u00fa\3\2\2\2!\u00fc\3\2\2\2#\u0104\3\2\2\2%\u010e\3\2\2\2\'\u0118"+
		"\3\2\2\2)\u011a\3\2\2\2+\u0122\3\2\2\2-\u0132\3\2\2\2/\u0136\3\2\2\2\61"+
		"\u013d\3\2\2\2\63\u013f\3\2\2\2\65\u0141\3\2\2\2\67\u0146\3\2\2\29\u0148"+
		"\3\2\2\2;\u014a\3\2\2\2=\u0150\3\2\2\2?\u0157\3\2\2\2A\u015c\3\2\2\2C"+
		"\u0165\3\2\2\2E\u016a\3\2\2\2G\u0172\3\2\2\2I\u017f\3\2\2\2K\u0187\3\2"+
		"\2\2M\u018c\3\2\2\2O\u0192\3\2\2\2Q\u019a\3\2\2\2S\u019d\3\2\2\2U\u019f"+
		"\3\2\2\2W\u01a1\3\2\2\2Y\u01ac\3\2\2\2[\u01b1\3\2\2\2]\u01b6\3\2\2\2_"+
		"\u01c1\3\2\2\2a\u01c4\3\2\2\2c\u01c9\3\2\2\2e\u01d1\3\2\2\2g\u01df\3\2"+
		"\2\2i\u01e8\3\2\2\2k\u01f5\3\2\2\2m\u01fe\3\2\2\2o\u0200\3\2\2\2q\u0203"+
		"\3\2\2\2s\u020a\3\2\2\2u\u020c\3\2\2\2w\u020f\3\2\2\2y\u0213\3\2\2\2{"+
		"\u021d\3\2\2\2}\u0227\3\2\2\2\177\u0230\3\2\2\2\u0081\u0239\3\2\2\2\u0083"+
		"\u023b\3\2\2\2\u0085\u023d\3\2\2\2\u0087\u0246\3\2\2\2\u0089\u024c\3\2"+
		"\2\2\u008b\u024e\3\2\2\2\u008d\u025b\3\2\2\2\u008f\u0261\3\2\2\2\u0091"+
		"\u0263\3\2\2\2\u0093\u026a\3\2\2\2\u0095\u0271\3\2\2\2\u0097\u0273\3\2"+
		"\2\2\u0099\u027c\3\2\2\2\u009b\u0287\3\2\2\2\u009d\u028e\3\2\2\2\u009f"+
		"\u0292\3\2\2\2\u00a1\u029c\3\2\2\2\u00a3\u02a1\3\2\2\2\u00a5\u00a6\7f"+
		"\2\2\u00a6\u00a7\7g\2\2\u00a7\4\3\2\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		"\6\3\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7z\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\u00b3\7q\2\2\u00b3\b\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5"+
		"\u00b6\7?\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\u00c2\7u\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7i\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7p\2\2\u00cb\16\3\2\2\2\u00cc"+
		"\u00cd\7o\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7q\2\2"+
		"\u00d0\20\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7"+
		"p\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7e\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7q\2\2\u00db"+
		"\22\3\2\2\2\u00dc\u00dd\7*\2\2\u00dd\24\3\2\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2\2"+
		"\u00e3\u00e4\7k\2\2\u00e4\u00e5\7t\2\2\u00e5\26\3\2\2\2\u00e6\u00ea\7"+
		"\u0080\2\2\u00e7\u00e8\7p\2\2\u00e8\u00ea\7q\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\30\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed\u00ee\7h\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7k\2\2\u00f1\u00f2\7t\2\2\u00f2\32\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5"+
		"\7q\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7q\2\2\u00f7\34\3\2\2\2\u00f8\u00f9"+
		"\7\61\2\2\u00f9\36\3\2\2\2\u00fa\u00fb\7@\2\2\u00fb \3\2\2\2\u00fc\u00fd"+
		"\7r\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7e\2\2\u0100"+
		"\u0101\7g\2\2\u0101\u0102\7u\2\2\u0102\u0103\7q\2\2\u0103\"\3\2\2\2\u0104"+
		"\u0105\7x\2\2\u0105\u0106\7g\2\2\u0106\u0107\7t\2\2\u0107\u0108\7f\2\2"+
		"\u0108\u0109\7c\2\2\u0109\u010a\7f\2\2\u010a\u010b\7g\2\2\u010b\u010c"+
		"\7t\2\2\u010c\u010d\7q\2\2\u010d$\3\2\2\2\u010e\u010f\7f\2\2\u010f\u0110"+
		"\7k\2\2\u0110\u0111\7o\2\2\u0111\u0112\7g\2\2\u0112\u0113\7p\2\2\u0113"+
		"\u0114\7u\2\2\u0114\u0115\7k\2\2\u0115\u0116\7q\2\2\u0116\u0117\7p\2\2"+
		"\u0117&\3\2\2\2\u0118\u0119\7.\2\2\u0119(\3\2\2\2\u011a\u011b\7n\2\2\u011b"+
		"\u011c\7k\2\2\u011c\u011d\7o\2\2\u011d\u011e\7r\2\2\u011e\u011f\7k\2\2"+
		"\u011f\u0120\7c\2\2\u0120\u0121\7t\2\2\u0121*\3\2\2\2\u0122\u0123\7h\2"+
		"\2\u0123\u0124\7k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7u\2\2\u0126\u0127"+
		"\7w\2\2\u0127\u0128\7d\2\2\u0128\u0129\7c\2\2\u0129\u012a\7n\2\2\u012a"+
		"\u012b\7i\2\2\u012b\u012c\7q\2\2\u012c\u012d\7t\2\2\u012d\u012e\7k\2\2"+
		"\u012e\u012f\7v\2\2\u012f\u0130\7o\2\2\u0130\u0131\7q\2\2\u0131,\3\2\2"+
		"\2\u0132\u0133\7s\2\2\u0133\u0134\7w\2\2\u0134\u0135\7g\2\2\u0135.\3\2"+
		"\2\2\u0136\u0137\7d\2\2\u0137\u0138\7q\2\2\u0138\u0139\7t\2\2\u0139\u013a"+
		"\7t\2\2\u013a\u013b\7c\2\2\u013b\u013c\7t\2\2\u013c\60\3\2\2\2\u013d\u013e"+
		"\7>\2\2\u013e\62\3\2\2\2\u013f\u0140\7,\2\2\u0140\64\3\2\2\2\u0141\u0142"+
		"\7e\2\2\u0142\u0143\7c\2\2\u0143\u0144\7u\2\2\u0144\u0145\7q\2\2\u0145"+
		"\66\3\2\2\2\u0146\u0147\7?\2\2\u01478\3\2\2\2\u0148\u0149\7/\2\2\u0149"+
		":\3\2\2\2\u014a\u014b\7v\2\2\u014b\u014c\7g\2\2\u014c\u014d\7e\2\2\u014d"+
		"\u014e\7n\2\2\u014e\u014f\7c\2\2\u014f<\3\2\2\2\u0150\u0151\7g\2\2\u0151"+
		"\u0152\7p\2\2\u0152\u0153\7v\2\2\u0153\u0154\7g\2\2\u0154\u0155\7t\2\2"+
		"\u0155\u0156\7q\2\2\u0156>\3\2\2\2\u0157\u0158\7r\2\2\u0158\u0159\7c\2"+
		"\2\u0159\u015a\7u\2\2\u015a\u015b\7q\2\2\u015b@\3\2\2\2\u015c\u015d\7"+
		"g\2\2\u015d\u015e\7p\2\2\u015e\u015f\7v\2\2\u015f\u0160\7q\2\2\u0160\u0161"+
		"\7p\2\2\u0161\u0162\7e\2\2\u0162\u0163\7g\2\2\u0163\u0164\7u\2\2\u0164"+
		"B\3\2\2\2\u0165\u0166\7u\2\2\u0166\u0167\7k\2\2\u0167\u0168\7p\2\2\u0168"+
		"\u0169\7q\2\2\u0169D\3\2\2\2\u016a\u016b\7o\2\2\u016b\u016c\7k\2\2\u016c"+
		"\u016d\7p\2\2\u016d\u016e\7w\2\2\u016e\u016f\7v\2\2\u016f\u0170\7q\2\2"+
		"\u0170\u0171\7u\2\2\u0171F\3\2\2\2\u0172\u0173\7u\2\2\u0173\u0174\7w\2"+
		"\2\u0174\u0175\7d\2\2\u0175\u0176\7c\2\2\u0176\u0177\7n\2\2\u0177\u0178"+
		"\7i\2\2\u0178\u0179\7q\2\2\u0179\u017a\7t\2\2\u017a\u017b\7k\2\2\u017b"+
		"\u017c\7v\2\2\u017c\u017d\7o\2\2\u017d\u017e\7q\2\2\u017eH\3\2\2\2\u017f"+
		"\u0180\7g\2\2\u0180\u0181\7u\2\2\u0181\u0182\7r\2\2\u0182\u0183\7g\2\2"+
		"\u0183\u0184\7t\2\2\u0184\u0185\7c\2\2\u0185\u0186\7t\2\2\u0186J\3\2\2"+
		"\2\u0187\u0188\7t\2\2\u0188\u0189\7g\2\2\u0189\u018a\7c\2\2\u018a\u018b"+
		"\7n\2\2\u018bL\3\2\2\2\u018c\u018d\7u\2\2\u018d\u018e\7g\2\2\u018e\u018f"+
		"\7i\2\2\u018f\u0190\7w\2\2\u0190\u0191\7p\2\2\u0191N\3\2\2\2\u0192\u0193"+
		"\7h\2\2\u0193\u0194\7k\2\2\u0194\u0195\7p\2\2\u0195\u0196\7r\2\2\u0196"+
		"\u0197\7c\2\2\u0197\u0198\7t\2\2\u0198\u0199\7c\2\2\u0199P\3\2\2\2\u019a"+
		"\u019b\7>\2\2\u019b\u019c\7?\2\2\u019cR\3\2\2\2\u019d\u019e\7-\2\2\u019e"+
		"T\3\2\2\2\u019f\u01a0\7]\2\2\u01a0V\3\2\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3"+
		"\7w\2\2\u01a3\u01a4\7d\2\2\u01a4\u01a5\7r\2\2\u01a5\u01a6\7t\2\2\u01a6"+
		"\u01a7\7q\2\2\u01a7\u01a8\7e\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7u\2\2"+
		"\u01aa\u01ab\7q\2\2\u01abX\3\2\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7g\2"+
		"\2\u01ae\u01af\7g\2\2\u01af\u01b0\7t\2\2\u01b0Z\3\2\2\2\u01b1\u01b2\7"+
		"r\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7c\2\2\u01b5\\"+
		"\3\2\2\2\u01b6\u01b7\7h\2\2\u01b7\u01b8\7k\2\2\u01b8\u01b9\7p\2\2\u01b9"+
		"\u01ba\7h\2\2\u01ba\u01bb\7w\2\2\u01bb\u01bc\7p\2\2\u01bc\u01bd\7e\2\2"+
		"\u01bd\u01be\7k\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0\7p\2\2\u01c0^\3\2\2"+
		"\2\u01c1\u01c2\7>\2\2\u01c2\u01c3\7/\2\2\u01c3`\3\2\2\2\u01c4\u01c5\7"+
		"q\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7q\2\2\u01c8b"+
		"\3\2\2\2\u01c9\u01ca\7h\2\2\u01ca\u01cb\7w\2\2\u01cb\u01cc\7p\2\2\u01cc"+
		"\u01cd\7e\2\2\u01cd\u01ce\7k\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0\7p\2\2"+
		"\u01d0d\3\2\2\2\u01d1\u01d2\7h\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4\7p\2"+
		"\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7w\2\2\u01d6\u01d7\7d\2\2\u01d7\u01d8"+
		"\7r\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7e\2\2\u01db"+
		"\u01dc\7g\2\2\u01dc\u01dd\7u\2\2\u01dd\u01de\7q\2\2\u01def\3\2\2\2\u01df"+
		"\u01e0\7g\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7e\2\2\u01e2\u01e3\7t\2\2"+
		"\u01e3\u01e4\7k\2\2\u01e4\u01e5\7d\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7"+
		"\7t\2\2\u01e7h\3\2\2\2\u01e8\u01e9\7h\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb"+
		"\7p\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7n\2\2\u01ed\u01ee\7i\2\2\u01ee"+
		"\u01ef\7q\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2\7v\2\2"+
		"\u01f2\u01f3\7o\2\2\u01f3\u01f4\7q\2\2\u01f4j\3\2\2\2\u01f5\u01f6\7u\2"+
		"\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7i\2\2\u01f8\u01f9\7w\2\2\u01f9\u01fa"+
		"\7p\2\2\u01fa\u01fb\7f\2\2\u01fb\u01fc\7q\2\2\u01fc\u01fd\7u\2\2\u01fd"+
		"l\3\2\2\2\u01fe\u01ff\7`\2\2\u01ffn\3\2\2\2\u0200\u0201\7u\2\2\u0201\u0202"+
		"\7k\2\2\u0202p\3\2\2\2\u0203\u0204\7e\2\2\u0204\u0205\7c\2\2\u0205\u0206"+
		"\7f\2\2\u0206\u0207\7g\2\2\u0207\u0208\7p\2\2\u0208\u0209\7c\2\2\u0209"+
		"r\3\2\2\2\u020a\u020b\7+\2\2\u020bt\3\2\2\2\u020c\u020d\7>\2\2\u020d\u020e"+
		"\7@\2\2\u020ev\3\2\2\2\u020f\u0210\7e\2\2\u0210\u0211\7q\2\2\u0211\u0212"+
		"\7p\2\2\u0212x\3\2\2\2\u0213\u0214\7c\2\2\u0214\u0215\7n\2\2\u0215\u0216"+
		"\7i\2\2\u0216\u0217\7q\2\2\u0217\u0218\7t\2\2\u0218\u0219\7k\2\2\u0219"+
		"\u021a\7v\2\2\u021a\u021b\7o\2\2\u021b\u021c\7q\2\2\u021cz\3\2\2\2\u021d"+
		"\u021e\7v\2\2\u021e\u021f\7q\2\2\u021f\u0220\7m\2\2\u0220\u0221\7g\2\2"+
		"\u0221\u0222\7p\2\2\u0222\u0223\7a\2\2\u0223\u0224\7o\2\2\u0224\u0225"+
		"\7q\2\2\u0225\u0226\7f\2\2\u0226|\3\2\2\2\u0227\u0228\7o\2\2\u0228\u0229"+
		"\7k\2\2\u0229\u022a\7g\2\2\u022a\u022b\7p\2\2\u022b\u022c\7v\2\2\u022c"+
		"\u022d\7t\2\2\u022d\u022e\7c\2\2\u022e\u022f\7u\2\2\u022f~\3\2\2\2\u0230"+
		"\u0231\7p\2\2\u0231\u0232\7w\2\2\u0232\u0233\7o\2\2\u0233\u0234\7g\2\2"+
		"\u0234\u0235\7t\2\2\u0235\u0236\7k\2\2\u0236\u0237\7e\2\2\u0237\u0238"+
		"\7q\2\2\u0238\u0080\3\2\2\2\u0239\u023a\t\2\2\2\u023a\u0082\3\2\2\2\u023b"+
		"\u023c\7=\2\2\u023c\u0084\3\2\2\2\u023d\u023e\7e\2\2\u023e\u023f\7c\2"+
		"\2\u023f\u0240\7t\2\2\u0240\u0241\7c\2\2\u0241\u0242\7e\2\2\u0242\u0243"+
		"\7v\2\2\u0243\u0244\7g\2\2\u0244\u0245\7t\2\2\u0245\u0086\3\2\2\2\u0246"+
		"\u0247\7j\2\2\u0247\u0248\7c\2\2\u0248\u0249\7u\2\2\u0249\u024a\7v\2\2"+
		"\u024a\u024b\7c\2\2\u024b\u0088\3\2\2\2\u024c\u024d\t\3\2\2\u024d\u008a"+
		"\3\2\2\2\u024e\u024f\7o\2\2\u024f\u0250\7k\2\2\u0250\u0251\7n\2\2\u0251"+
		"\u0252\7k\2\2\u0252\u0253\7u\2\2\u0253\u0254\7g\2\2\u0254\u0255\7i\2\2"+
		"\u0255\u0256\7w\2\2\u0256\u0257\7p\2\2\u0257\u0258\7f\2\2\u0258\u0259"+
		"\7q\2\2\u0259\u025a\7u\2\2\u025a\u008c\3\2\2\2\u025b\u025c\7h\2\2\u025c"+
		"\u025d\7c\2\2\u025d\u025e\7n\2\2\u025e\u025f\7u\2\2\u025f\u0260\7q\2\2"+
		"\u0260\u008e\3\2\2\2\u0261\u0262\7_\2\2\u0262\u0090\3\2\2\2\u0263\u0264"+
		"\7p\2\2\u0264\u0265\7w\2\2\u0265\u0266\7o\2\2\u0266\u0267\7g\2\2\u0267"+
		"\u0268\7t\2\2\u0268\u0269\7q\2\2\u0269\u0092\3\2\2\2\u026a\u026b\7n\2"+
		"\2\u026b\u026c\7q\2\2\u026c\u026d\7i\2\2\u026d\u026e\7k\2\2\u026e\u026f"+
		"\7e\2\2\u026f\u0270\7q\2\2\u0270\u0094\3\2\2\2\u0271\u0272\7<\2\2\u0272"+
		"\u0096\3\2\2\2\u0273\u0274\7r\2\2\u0274\u0275\7c\2\2\u0275\u0276\7p\2"+
		"\2\u0276\u0277\7v\2\2\u0277\u0278\7c\2\2\u0278\u0279\7n\2\2\u0279\u027a"+
		"\7n\2\2\u027a\u027b\7c\2\2\u027b\u0098\3\2\2\2\u027c\u027d\7v\2\2\u027d"+
		"\u027e\7q\2\2\u027e\u027f\7m\2\2\u027f\u0280\7g\2\2\u0280\u0281\7p\2\2"+
		"\u0281\u0282\7a\2\2\u0282\u0283\7t\2\2\u0283\u0284\7g\2\2\u0284\u0285"+
		"\7c\2\2\u0285\u0286\7n\2\2\u0286\u009a\3\2\2\2\u0287\u0288\7h\2\2\u0288"+
		"\u0289\7k\2\2\u0289\u028a\7p\2\2\u028a\u028b\7u\2\2\u028b\u028c\7k\2\2"+
		"\u028c\u009c\3\2\2\2\u028d\u028f\t\4\2\2\u028e\u028d\3\2\2\2\u028f\u0290"+
		"\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u009e\3\2\2\2\u0292"+
		"\u0296\t\5\2\2\u0293\u0295\n\5\2\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2"+
		"\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298"+
		"\u0296\3\2\2\2\u0299\u029a\t\5\2\2\u029a\u00a0\3\2\2\2\u029b\u029d\t\6"+
		"\2\2\u029c\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u00a2\3\2\2\2\u02a0\u02a2\t\7\2\2\u02a1\u02a0\3\2"+
		"\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02a6\bR\2\2\u02a6\u00a4\3\2\2\2\b\2\u00e9\u0290"+
		"\u0296\u029e\u02a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}