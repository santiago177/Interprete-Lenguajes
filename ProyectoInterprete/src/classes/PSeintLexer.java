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
		TOKEN_MENOS=1, DE=2, HACER=3, TEXTO=4, TOKEN_MAYOR_IGUAL=5, FINMIENTRAS=6, 
		FINSEGUN=7, MODO=8, FINPROCESO=9, TOKEN_PAR_IZQ=10, REPETIR=11, TOKEN_NEG=12, 
		DEFINIR=13, COMO=14, TOKEN_DIV=15, TOKEN_MAYOR=16, PROCESO=17, VERDADERO=18, 
		DIMENSION=19, TOKEN_COMA=20, LIMPIAR=21, FINSUBALGORITMO=22, QUE=23, BORRAR=24, 
		TOKEN_MENOR=25, TOKEN_MUL=26, CASO=27, TOKEN_IGUAL=28, TECLA=29, ENTERO=30, 
		PASO=31, ENTONCES=32, SINO=33, MINUTOS=34, SUBALGORITMO=35, ESPERAR=36, 
		REAL=37, SEGUN=38, FINPARA=39, TOKEN_MENOR_IGUAL=40, TOKEN_MAS=41, TOKEN_COR_IZQ=42, 
		SUBPROCESO=43, LEER=44, PARA=45, FINFUNCION=46, TOKEN_ASIG=47, OTRO=48, 
		FUNCION=49, FINSUBPROCESO=50, ESCRIBIR=51, FINALGORITMO=52, SEGUNDOS=53, 
		TOKEN_POT=54, SI=55, CADENA=56, TOKEN_PAR_DER=57, TOKEN_DIF=58, CON=59, 
		ALGORITMO=60, TOKEN_MOD=61, MIENTRAS=62, NUMERICO=63, TOKEN_Y=64, TOKEN_PYC=65, 
		CARACTER=66, HASTA=67, TOKEN_O=68, MILISEGUNDOS=69, FALSO=70, TOKEN_COR_DER=71, 
		NUMERO=72, LOGICO=73, TOKEN_DOSP=74, PANTALLA=75, FINSI=76, TOKEN_CADENA=77, 
		TOKEN_ENTERO=78, TOKEN_REAL=79, ID=80, WS=81;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TOKEN_MENOS", "DE", "HACER", "TEXTO", "TOKEN_MAYOR_IGUAL", "FINMIENTRAS", 
		"FINSEGUN", "MODO", "FINPROCESO", "TOKEN_PAR_IZQ", "REPETIR", "TOKEN_NEG", 
		"DEFINIR", "COMO", "TOKEN_DIV", "TOKEN_MAYOR", "PROCESO", "VERDADERO", 
		"DIMENSION", "TOKEN_COMA", "LIMPIAR", "FINSUBALGORITMO", "QUE", "BORRAR", 
		"TOKEN_MENOR", "TOKEN_MUL", "CASO", "TOKEN_IGUAL", "TECLA", "ENTERO", 
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

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", null, null, null, "'>='", null, null, null, null, "'('", 
		null, null, null, null, "'/'", "'>'", null, null, null, "','", null, null, 
		null, null, "'<'", "'*'", null, "'='", null, null, null, null, null, null, 
		null, null, null, null, null, "'<='", "'+'", "'['", null, null, null, 
		null, "'<-'", null, null, null, null, null, null, "'^'", null, null, "')'", 
		"'<>'", null, null, "'%'", null, null, null, "';'", null, null, null, 
		null, null, "']'", null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TOKEN_MENOS", "DE", "HACER", "TEXTO", "TOKEN_MAYOR_IGUAL", "FINMIENTRAS", 
		"FINSEGUN", "MODO", "FINPROCESO", "TOKEN_PAR_IZQ", "REPETIR", "TOKEN_NEG", 
		"DEFINIR", "COMO", "TOKEN_DIV", "TOKEN_MAYOR", "PROCESO", "VERDADERO", 
		"DIMENSION", "TOKEN_COMA", "LIMPIAR", "FINSUBALGORITMO", "QUE", "BORRAR", 
		"TOKEN_MENOR", "TOKEN_MUL", "CASO", "TOKEN_IGUAL", "TECLA", "ENTERO", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2S\u02a1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00ec"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36"+
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
		"\3=\3=\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3I\3I\3I"+
		"\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M"+
		"\3M\3M\3M\3M\3M\3N\3N\7N\u027d\nN\fN\16N\u0280\13N\3N\3N\3O\6O\u0285\n"+
		"O\rO\16O\u0286\3P\6P\u028a\nP\rP\16P\u028b\3P\3P\6P\u0290\nP\rP\16P\u0291"+
		"\3Q\3Q\7Q\u0296\nQ\fQ\16Q\u0299\13Q\3R\6R\u029c\nR\rR\16R\u029d\3R\3R"+
		"\2\2S\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\3\2\37\4\2FFff\4\2GGgg\4\2JJjj\4\2CCcc\4\2EEee\4\2TTtt\4\2VV"+
		"vv\4\2ZZzz\4\2QQqq\4\2HHhh\4\2KKkk\4\2PPpp\4\2OOoo\4\2UUuu\4\2IIii\4\2"+
		"WWww\4\2RRrr\4\2XXxx\4\2NNnn\4\2DDdd\4\2SSss\4\2(({{\4\2qq~~\4\2$$))\3"+
		"\2\62;\3\2\60\60\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u02a7\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2\2\5\u00a7\3\2\2\2\7\u00aa"+
		"\3\2\2\2\t\u00b0\3\2\2\2\13\u00b6\3\2\2\2\r\u00b9\3\2\2\2\17\u00c5\3\2"+
		"\2\2\21\u00ce\3\2\2\2\23\u00d3\3\2\2\2\25\u00de\3\2\2\2\27\u00e0\3\2\2"+
		"\2\31\u00eb\3\2\2\2\33\u00ed\3\2\2\2\35\u00f5\3\2\2\2\37\u00fa\3\2\2\2"+
		"!\u00fc\3\2\2\2#\u00fe\3\2\2\2%\u0106\3\2\2\2\'\u0110\3\2\2\2)\u011a\3"+
		"\2\2\2+\u011c\3\2\2\2-\u0124\3\2\2\2/\u0134\3\2\2\2\61\u0138\3\2\2\2\63"+
		"\u013f\3\2\2\2\65\u0141\3\2\2\2\67\u0143\3\2\2\29\u0148\3\2\2\2;\u014a"+
		"\3\2\2\2=\u0150\3\2\2\2?\u0157\3\2\2\2A\u015c\3\2\2\2C\u0165\3\2\2\2E"+
		"\u016a\3\2\2\2G\u0172\3\2\2\2I\u017f\3\2\2\2K\u0187\3\2\2\2M\u018c\3\2"+
		"\2\2O\u0192\3\2\2\2Q\u019a\3\2\2\2S\u019d\3\2\2\2U\u019f\3\2\2\2W\u01a1"+
		"\3\2\2\2Y\u01ac\3\2\2\2[\u01b1\3\2\2\2]\u01b6\3\2\2\2_\u01c1\3\2\2\2a"+
		"\u01c4\3\2\2\2c\u01c9\3\2\2\2e\u01d1\3\2\2\2g\u01df\3\2\2\2i\u01e8\3\2"+
		"\2\2k\u01f5\3\2\2\2m\u01fe\3\2\2\2o\u0200\3\2\2\2q\u0203\3\2\2\2s\u020a"+
		"\3\2\2\2u\u020c\3\2\2\2w\u020f\3\2\2\2y\u0213\3\2\2\2{\u021d\3\2\2\2}"+
		"\u021f\3\2\2\2\177\u0228\3\2\2\2\u0081\u0231\3\2\2\2\u0083\u0233\3\2\2"+
		"\2\u0085\u0235\3\2\2\2\u0087\u023e\3\2\2\2\u0089\u0244\3\2\2\2\u008b\u0246"+
		"\3\2\2\2\u008d\u0253\3\2\2\2\u008f\u0259\3\2\2\2\u0091\u025b\3\2\2\2\u0093"+
		"\u0262\3\2\2\2\u0095\u0269\3\2\2\2\u0097\u026b\3\2\2\2\u0099\u0274\3\2"+
		"\2\2\u009b\u027a\3\2\2\2\u009d\u0284\3\2\2\2\u009f\u0289\3\2\2\2\u00a1"+
		"\u0293\3\2\2\2\u00a3\u029b\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\4\3\2\2\2"+
		"\u00a7\u00a8\t\2\2\2\u00a8\u00a9\t\3\2\2\u00a9\6\3\2\2\2\u00aa\u00ab\t"+
		"\4\2\2\u00ab\u00ac\t\5\2\2\u00ac\u00ad\t\6\2\2\u00ad\u00ae\t\3\2\2\u00ae"+
		"\u00af\t\7\2\2\u00af\b\3\2\2\2\u00b0\u00b1\t\b\2\2\u00b1\u00b2\t\3\2\2"+
		"\u00b2\u00b3\t\t\2\2\u00b3\u00b4\t\b\2\2\u00b4\u00b5\t\n\2\2\u00b5\n\3"+
		"\2\2\2\u00b6\u00b7\7@\2\2\u00b7\u00b8\7?\2\2\u00b8\f\3\2\2\2\u00b9\u00ba"+
		"\t\13\2\2\u00ba\u00bb\t\f\2\2\u00bb\u00bc\t\r\2\2\u00bc\u00bd\t\16\2\2"+
		"\u00bd\u00be\t\f\2\2\u00be\u00bf\t\3\2\2\u00bf\u00c0\t\r\2\2\u00c0\u00c1"+
		"\t\b\2\2\u00c1\u00c2\t\7\2\2\u00c2\u00c3\t\5\2\2\u00c3\u00c4\t\17\2\2"+
		"\u00c4\16\3\2\2\2\u00c5\u00c6\t\13\2\2\u00c6\u00c7\t\f\2\2\u00c7\u00c8"+
		"\t\r\2\2\u00c8\u00c9\t\17\2\2\u00c9\u00ca\t\3\2\2\u00ca\u00cb\t\20\2\2"+
		"\u00cb\u00cc\t\21\2\2\u00cc\u00cd\t\r\2\2\u00cd\20\3\2\2\2\u00ce\u00cf"+
		"\t\16\2\2\u00cf\u00d0\t\n\2\2\u00d0\u00d1\t\2\2\2\u00d1\u00d2\t\n\2\2"+
		"\u00d2\22\3\2\2\2\u00d3\u00d4\t\13\2\2\u00d4\u00d5\t\f\2\2\u00d5\u00d6"+
		"\t\r\2\2\u00d6\u00d7\t\22\2\2\u00d7\u00d8\t\7\2\2\u00d8\u00d9\t\n\2\2"+
		"\u00d9\u00da\t\6\2\2\u00da\u00db\t\3\2\2\u00db\u00dc\t\17\2\2\u00dc\u00dd"+
		"\t\n\2\2\u00dd\24\3\2\2\2\u00de\u00df\7*\2\2\u00df\26\3\2\2\2\u00e0\u00e1"+
		"\t\7\2\2\u00e1\u00e2\t\3\2\2\u00e2\u00e3\t\22\2\2\u00e3\u00e4\t\3\2\2"+
		"\u00e4\u00e5\t\b\2\2\u00e5\u00e6\t\f\2\2\u00e6\u00e7\t\7\2\2\u00e7\30"+
		"\3\2\2\2\u00e8\u00ec\7\u0080\2\2\u00e9\u00ea\7p\2\2\u00ea\u00ec\7q\2\2"+
		"\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\32\3\2\2\2\u00ed\u00ee"+
		"\t\2\2\2\u00ee\u00ef\t\3\2\2\u00ef\u00f0\t\13\2\2\u00f0\u00f1\t\f\2\2"+
		"\u00f1\u00f2\t\r\2\2\u00f2\u00f3\t\f\2\2\u00f3\u00f4\t\7\2\2\u00f4\34"+
		"\3\2\2\2\u00f5\u00f6\t\6\2\2\u00f6\u00f7\t\n\2\2\u00f7\u00f8\t\16\2\2"+
		"\u00f8\u00f9\t\n\2\2\u00f9\36\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb \3\2"+
		"\2\2\u00fc\u00fd\7@\2\2\u00fd\"\3\2\2\2\u00fe\u00ff\t\22\2\2\u00ff\u0100"+
		"\t\7\2\2\u0100\u0101\t\n\2\2\u0101\u0102\t\6\2\2\u0102\u0103\t\3\2\2\u0103"+
		"\u0104\t\17\2\2\u0104\u0105\t\n\2\2\u0105$\3\2\2\2\u0106\u0107\t\23\2"+
		"\2\u0107\u0108\t\3\2\2\u0108\u0109\t\7\2\2\u0109\u010a\t\2\2\2\u010a\u010b"+
		"\t\5\2\2\u010b\u010c\t\2\2\2\u010c\u010d\t\3\2\2\u010d\u010e\t\7\2\2\u010e"+
		"\u010f\t\n\2\2\u010f&\3\2\2\2\u0110\u0111\t\2\2\2\u0111\u0112\t\f\2\2"+
		"\u0112\u0113\t\16\2\2\u0113\u0114\t\3\2\2\u0114\u0115\t\r\2\2\u0115\u0116"+
		"\t\17\2\2\u0116\u0117\t\f\2\2\u0117\u0118\t\n\2\2\u0118\u0119\t\r\2\2"+
		"\u0119(\3\2\2\2\u011a\u011b\7.\2\2\u011b*\3\2\2\2\u011c\u011d\t\24\2\2"+
		"\u011d\u011e\t\f\2\2\u011e\u011f\t\16\2\2\u011f\u0120\t\22\2\2\u0120\u0121"+
		"\t\f\2\2\u0121\u0122\t\5\2\2\u0122\u0123\t\7\2\2\u0123,\3\2\2\2\u0124"+
		"\u0125\t\13\2\2\u0125\u0126\t\f\2\2\u0126\u0127\t\r\2\2\u0127\u0128\t"+
		"\17\2\2\u0128\u0129\t\21\2\2\u0129\u012a\t\25\2\2\u012a\u012b\t\5\2\2"+
		"\u012b\u012c\t\24\2\2\u012c\u012d\t\20\2\2\u012d\u012e\t\n\2\2\u012e\u012f"+
		"\t\7\2\2\u012f\u0130\t\f\2\2\u0130\u0131\t\b\2\2\u0131\u0132\t\16\2\2"+
		"\u0132\u0133\t\n\2\2\u0133.\3\2\2\2\u0134\u0135\t\26\2\2\u0135\u0136\t"+
		"\21\2\2\u0136\u0137\t\3\2\2\u0137\60\3\2\2\2\u0138\u0139\t\25\2\2\u0139"+
		"\u013a\t\n\2\2\u013a\u013b\t\7\2\2\u013b\u013c\t\7\2\2\u013c\u013d\t\5"+
		"\2\2\u013d\u013e\t\7\2\2\u013e\62\3\2\2\2\u013f\u0140\7>\2\2\u0140\64"+
		"\3\2\2\2\u0141\u0142\7,\2\2\u0142\66\3\2\2\2\u0143\u0144\t\6\2\2\u0144"+
		"\u0145\t\5\2\2\u0145\u0146\t\17\2\2\u0146\u0147\t\n\2\2\u01478\3\2\2\2"+
		"\u0148\u0149\7?\2\2\u0149:\3\2\2\2\u014a\u014b\t\b\2\2\u014b\u014c\t\3"+
		"\2\2\u014c\u014d\t\6\2\2\u014d\u014e\t\24\2\2\u014e\u014f\t\5\2\2\u014f"+
		"<\3\2\2\2\u0150\u0151\t\3\2\2\u0151\u0152\t\r\2\2\u0152\u0153\t\b\2\2"+
		"\u0153\u0154\t\3\2\2\u0154\u0155\t\7\2\2\u0155\u0156\t\n\2\2\u0156>\3"+
		"\2\2\2\u0157\u0158\t\22\2\2\u0158\u0159\t\5\2\2\u0159\u015a\t\17\2\2\u015a"+
		"\u015b\t\n\2\2\u015b@\3\2\2\2\u015c\u015d\t\3\2\2\u015d\u015e\t\r\2\2"+
		"\u015e\u015f\t\b\2\2\u015f\u0160\t\n\2\2\u0160\u0161\t\r\2\2\u0161\u0162"+
		"\t\6\2\2\u0162\u0163\t\3\2\2\u0163\u0164\t\17\2\2\u0164B\3\2\2\2\u0165"+
		"\u0166\t\17\2\2\u0166\u0167\t\f\2\2\u0167\u0168\t\r\2\2\u0168\u0169\t"+
		"\n\2\2\u0169D\3\2\2\2\u016a\u016b\t\16\2\2\u016b\u016c\t\f\2\2\u016c\u016d"+
		"\t\r\2\2\u016d\u016e\t\21\2\2\u016e\u016f\t\b\2\2\u016f\u0170\t\n\2\2"+
		"\u0170\u0171\t\17\2\2\u0171F\3\2\2\2\u0172\u0173\t\17\2\2\u0173\u0174"+
		"\t\21\2\2\u0174\u0175\t\25\2\2\u0175\u0176\t\5\2\2\u0176\u0177\t\24\2"+
		"\2\u0177\u0178\t\20\2\2\u0178\u0179\t\n\2\2\u0179\u017a\t\7\2\2\u017a"+
		"\u017b\t\f\2\2\u017b\u017c\t\b\2\2\u017c\u017d\t\16\2\2\u017d\u017e\t"+
		"\n\2\2\u017eH\3\2\2\2\u017f\u0180\t\3\2\2\u0180\u0181\t\17\2\2\u0181\u0182"+
		"\t\22\2\2\u0182\u0183\t\3\2\2\u0183\u0184\t\7\2\2\u0184\u0185\t\5\2\2"+
		"\u0185\u0186\t\7\2\2\u0186J\3\2\2\2\u0187\u0188\t\7\2\2\u0188\u0189\t"+
		"\3\2\2\u0189\u018a\t\5\2\2\u018a\u018b\t\24\2\2\u018bL\3\2\2\2\u018c\u018d"+
		"\t\17\2\2\u018d\u018e\t\3\2\2\u018e\u018f\t\20\2\2\u018f\u0190\t\21\2"+
		"\2\u0190\u0191\t\r\2\2\u0191N\3\2\2\2\u0192\u0193\t\13\2\2\u0193\u0194"+
		"\t\f\2\2\u0194\u0195\t\r\2\2\u0195\u0196\t\22\2\2\u0196\u0197\t\5\2\2"+
		"\u0197\u0198\t\7\2\2\u0198\u0199\t\5\2\2\u0199P\3\2\2\2\u019a\u019b\7"+
		">\2\2\u019b\u019c\7?\2\2\u019cR\3\2\2\2\u019d\u019e\7-\2\2\u019eT\3\2"+
		"\2\2\u019f\u01a0\7]\2\2\u01a0V\3\2\2\2\u01a1\u01a2\t\17\2\2\u01a2\u01a3"+
		"\t\21\2\2\u01a3\u01a4\t\25\2\2\u01a4\u01a5\t\22\2\2\u01a5\u01a6\t\7\2"+
		"\2\u01a6\u01a7\t\n\2\2\u01a7\u01a8\t\6\2\2\u01a8\u01a9\t\3\2\2\u01a9\u01aa"+
		"\t\17\2\2\u01aa\u01ab\t\n\2\2\u01abX\3\2\2\2\u01ac\u01ad\t\24\2\2\u01ad"+
		"\u01ae\t\3\2\2\u01ae\u01af\t\3\2\2\u01af\u01b0\t\7\2\2\u01b0Z\3\2\2\2"+
		"\u01b1\u01b2\t\22\2\2\u01b2\u01b3\t\5\2\2\u01b3\u01b4\t\7\2\2\u01b4\u01b5"+
		"\t\5\2\2\u01b5\\\3\2\2\2\u01b6\u01b7\t\13\2\2\u01b7\u01b8\t\f\2\2\u01b8"+
		"\u01b9\t\r\2\2\u01b9\u01ba\t\13\2\2\u01ba\u01bb\t\21\2\2\u01bb\u01bc\t"+
		"\r\2\2\u01bc\u01bd\t\6\2\2\u01bd\u01be\t\f\2\2\u01be\u01bf\t\n\2\2\u01bf"+
		"\u01c0\t\r\2\2\u01c0^\3\2\2\2\u01c1\u01c2\7>\2\2\u01c2\u01c3\7/\2\2\u01c3"+
		"`\3\2\2\2\u01c4\u01c5\t\n\2\2\u01c5\u01c6\t\b\2\2\u01c6\u01c7\t\7\2\2"+
		"\u01c7\u01c8\t\n\2\2\u01c8b\3\2\2\2\u01c9\u01ca\t\13\2\2\u01ca\u01cb\t"+
		"\21\2\2\u01cb\u01cc\t\r\2\2\u01cc\u01cd\t\6\2\2\u01cd\u01ce\t\f\2\2\u01ce"+
		"\u01cf\t\n\2\2\u01cf\u01d0\t\r\2\2\u01d0d\3\2\2\2\u01d1\u01d2\t\13\2\2"+
		"\u01d2\u01d3\t\f\2\2\u01d3\u01d4\t\r\2\2\u01d4\u01d5\t\17\2\2\u01d5\u01d6"+
		"\t\21\2\2\u01d6\u01d7\t\25\2\2\u01d7\u01d8\t\22\2\2\u01d8\u01d9\t\7\2"+
		"\2\u01d9\u01da\t\n\2\2\u01da\u01db\t\6\2\2\u01db\u01dc\t\3\2\2\u01dc\u01dd"+
		"\t\17\2\2\u01dd\u01de\t\n\2\2\u01def\3\2\2\2\u01df\u01e0\t\3\2\2\u01e0"+
		"\u01e1\t\17\2\2\u01e1\u01e2\t\6\2\2\u01e2\u01e3\t\7\2\2\u01e3\u01e4\t"+
		"\f\2\2\u01e4\u01e5\t\25\2\2\u01e5\u01e6\t\f\2\2\u01e6\u01e7\t\7\2\2\u01e7"+
		"h\3\2\2\2\u01e8\u01e9\t\13\2\2\u01e9\u01ea\t\f\2\2\u01ea\u01eb\t\r\2\2"+
		"\u01eb\u01ec\t\5\2\2\u01ec\u01ed\t\24\2\2\u01ed\u01ee\t\20\2\2\u01ee\u01ef"+
		"\t\n\2\2\u01ef\u01f0\t\7\2\2\u01f0\u01f1\t\f\2\2\u01f1\u01f2\t\b\2\2\u01f2"+
		"\u01f3\t\16\2\2\u01f3\u01f4\t\n\2\2\u01f4j\3\2\2\2\u01f5\u01f6\t\17\2"+
		"\2\u01f6\u01f7\t\3\2\2\u01f7\u01f8\t\20\2\2\u01f8\u01f9\t\21\2\2\u01f9"+
		"\u01fa\t\r\2\2\u01fa\u01fb\t\2\2\2\u01fb\u01fc\t\n\2\2\u01fc\u01fd\t\17"+
		"\2\2\u01fdl\3\2\2\2\u01fe\u01ff\7`\2\2\u01ffn\3\2\2\2\u0200\u0201\t\17"+
		"\2\2\u0201\u0202\t\f\2\2\u0202p\3\2\2\2\u0203\u0204\t\6\2\2\u0204\u0205"+
		"\t\5\2\2\u0205\u0206\t\2\2\2\u0206\u0207\t\3\2\2\u0207\u0208\t\r\2\2\u0208"+
		"\u0209\t\5\2\2\u0209r\3\2\2\2\u020a\u020b\7+\2\2\u020bt\3\2\2\2\u020c"+
		"\u020d\7>\2\2\u020d\u020e\7@\2\2\u020ev\3\2\2\2\u020f\u0210\t\6\2\2\u0210"+
		"\u0211\t\n\2\2\u0211\u0212\t\r\2\2\u0212x\3\2\2\2\u0213\u0214\t\5\2\2"+
		"\u0214\u0215\t\24\2\2\u0215\u0216\t\20\2\2\u0216\u0217\t\n\2\2\u0217\u0218"+
		"\t\7\2\2\u0218\u0219\t\f\2\2\u0219\u021a\t\b\2\2\u021a\u021b\t\16\2\2"+
		"\u021b\u021c\t\n\2\2\u021cz\3\2\2\2\u021d\u021e\7\'\2\2\u021e|\3\2\2\2"+
		"\u021f\u0220\t\16\2\2\u0220\u0221\t\f\2\2\u0221\u0222\t\3\2\2\u0222\u0223"+
		"\t\r\2\2\u0223\u0224\t\b\2\2\u0224\u0225\t\7\2\2\u0225\u0226\t\5\2\2\u0226"+
		"\u0227\t\17\2\2\u0227~\3\2\2\2\u0228\u0229\t\r\2\2\u0229\u022a\t\21\2"+
		"\2\u022a\u022b\t\16\2\2\u022b\u022c\t\3\2\2\u022c\u022d\t\7\2\2\u022d"+
		"\u022e\t\f\2\2\u022e\u022f\t\6\2\2\u022f\u0230\t\n\2\2\u0230\u0080\3\2"+
		"\2\2\u0231\u0232\t\27\2\2\u0232\u0082\3\2\2\2\u0233\u0234\7=\2\2\u0234"+
		"\u0084\3\2\2\2\u0235\u0236\t\6\2\2\u0236\u0237\t\5\2\2\u0237\u0238\t\7"+
		"\2\2\u0238\u0239\t\5\2\2\u0239\u023a\t\6\2\2\u023a\u023b\t\b\2\2\u023b"+
		"\u023c\t\3\2\2\u023c\u023d\t\7\2\2\u023d\u0086\3\2\2\2\u023e\u023f\t\4"+
		"\2\2\u023f\u0240\t\5\2\2\u0240\u0241\t\17\2\2\u0241\u0242\t\b\2\2\u0242"+
		"\u0243\t\5\2\2\u0243\u0088\3\2\2\2\u0244\u0245\t\30\2\2\u0245\u008a\3"+
		"\2\2\2\u0246\u0247\t\16\2\2\u0247\u0248\t\f\2\2\u0248\u0249\t\24\2\2\u0249"+
		"\u024a\t\f\2\2\u024a\u024b\t\17\2\2\u024b\u024c\t\3\2\2\u024c\u024d\t"+
		"\20\2\2\u024d\u024e\t\21\2\2\u024e\u024f\t\r\2\2\u024f\u0250\t\2\2\2\u0250"+
		"\u0251\t\n\2\2\u0251\u0252\t\17\2\2\u0252\u008c\3\2\2\2\u0253\u0254\t"+
		"\13\2\2\u0254\u0255\t\5\2\2\u0255\u0256\t\24\2\2\u0256\u0257\t\17\2\2"+
		"\u0257\u0258\t\n\2\2\u0258\u008e\3\2\2\2\u0259\u025a\7_\2\2\u025a\u0090"+
		"\3\2\2\2\u025b\u025c\t\r\2\2\u025c\u025d\t\21\2\2\u025d\u025e\t\16\2\2"+
		"\u025e\u025f\t\3\2\2\u025f\u0260\t\7\2\2\u0260\u0261\t\n\2\2\u0261\u0092"+
		"\3\2\2\2\u0262\u0263\t\24\2\2\u0263\u0264\t\n\2\2\u0264\u0265\t\20\2\2"+
		"\u0265\u0266\t\f\2\2\u0266\u0267\t\6\2\2\u0267\u0268\t\n\2\2\u0268\u0094"+
		"\3\2\2\2\u0269\u026a\7<\2\2\u026a\u0096\3\2\2\2\u026b\u026c\t\22\2\2\u026c"+
		"\u026d\t\5\2\2\u026d\u026e\t\r\2\2\u026e\u026f\t\b\2\2\u026f\u0270\t\5"+
		"\2\2\u0270\u0271\t\24\2\2\u0271\u0272\t\24\2\2\u0272\u0273\t\5\2\2\u0273"+
		"\u0098\3\2\2\2\u0274\u0275\t\13\2\2\u0275\u0276\t\f\2\2\u0276\u0277\t"+
		"\r\2\2\u0277\u0278\t\17\2\2\u0278\u0279\t\f\2\2\u0279\u009a\3\2\2\2\u027a"+
		"\u027e\t\31\2\2\u027b\u027d\n\31\2\2\u027c\u027b\3\2\2\2\u027d\u0280\3"+
		"\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0281\u0282\t\31\2\2\u0282\u009c\3\2\2\2\u0283\u0285\t"+
		"\32\2\2\u0284\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0284\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u009e\3\2\2\2\u0288\u028a\t\32\2\2\u0289\u0288\3"+
		"\2\2\2\u028a\u028b\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028f\t\33\2\2\u028e\u0290\t\32\2\2\u028f\u028e\3"+
		"\2\2\2\u0290\u0291\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u00a0\3\2\2\2\u0293\u0297\t\34\2\2\u0294\u0296\t\35\2\2\u0295\u0294\3"+
		"\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u00a2\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029c\t\36\2\2\u029b\u029a\3"+
		"\2\2\2\u029c\u029d\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a0\bR\2\2\u02a0\u00a4\3\2\2\2\n\2\u00eb\u027e"+
		"\u0286\u028b\u0291\u0297\u029d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}