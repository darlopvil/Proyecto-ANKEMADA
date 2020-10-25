// Generated from C:/Users/Manuel/OneDrive/Documentos/Grado Ing Informatica/4º/PL2020/PROCESADORES DE LENGUAJES/Proyecto-ANKEMADA/src\Analex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, SUBPROGRAMAS=5, NUM=6, 
		LOG=7, SEQ=8, CIERTO=9, FALSO=10, ENTERO=11, BOOLEANO=12, Y=13, O=14, 
		NO=15, NUMERO=16, IDENT=17, DP=18, PA=19, PC=20, PyC=21, COMA=22, ASIG=23, 
		MAYOR=24, MENOR=25, IGUAL=26, MAS=27, MENOS=28, POR=29, DIV=30, COMENTARIO_BLOQUE=31, 
		COMENTARIO_LINEA=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "VARIABLES", "SUBPROGRAMAS", 
			"NUM", "LOG", "SEQ", "CIERTO", "FALSO", "ENTERO", "BOOLEANO", "Y", "O", 
			"NO", "NUMERO", "IDENT", "DP", "PA", "PC", "PyC", "COMA", "ASIG", "MAYOR", 
			"MENOR", "IGUAL", "MAS", "MENOS", "POR", "DIV", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'VARIABLES'", "'SUBPROGRAMAS'", "'NUM'", 
			"'LOG'", "'SEQ'", "'cierto'", "'falso'", "'entero'", "'booleano'", "'O'", 
			"'Y'", "'NO'", null, null, "':'", "'('", "')'", "';'", "','", "'='", 
			"'>'", "'<'", "'=='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "VARIABLES", "SUBPROGRAMAS", 
			"NUM", "LOG", "SEQ", "CIERTO", "FALSO", "ENTERO", "BOOLEANO", "Y", "O", 
			"NO", "NUMERO", "IDENT", "DP", "PA", "PC", "PyC", "COMA", "ASIG", "MAYOR", 
			"MENOR", "IGUAL", "MAS", "MENOS", "POR", "DIV", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4Q\n\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\5\23\u00a3"+
		"\n\23\3\23\6\23\u00a6\n\23\r\23\16\23\u00a7\3\24\3\24\3\24\7\24\u00ad"+
		"\n\24\f\24\16\24\u00b0\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\7\"\u00d1\n\"\f\"\16\"\u00d4\13\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u00df\n#\f#\16#\u00e2\13#\3#\3#\3#\3#"+
		"\4\u00d2\u00e0\2$\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32"+
		"\67\339\34;\35=\36?\37A C!E\"\3\2\4\3\2\62;\4\2C\\c|\2\u00eb\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5K\3\2\2\2\7P\3\2\2\2\tV\3\2\2\2"+
		"\13X\3\2\2\2\rZ\3\2\2\2\17d\3\2\2\2\21q\3\2\2\2\23u\3\2\2\2\25y\3\2\2"+
		"\2\27}\3\2\2\2\31\u0084\3\2\2\2\33\u008a\3\2\2\2\35\u0091\3\2\2\2\37\u009a"+
		"\3\2\2\2!\u009c\3\2\2\2#\u009e\3\2\2\2%\u00a2\3\2\2\2\'\u00a9\3\2\2\2"+
		")\u00b1\3\2\2\2+\u00b3\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9"+
		"\3\2\2\2\63\u00bb\3\2\2\2\65\u00bd\3\2\2\2\67\u00bf\3\2\2\29\u00c1\3\2"+
		"\2\2;\u00c4\3\2\2\2=\u00c6\3\2\2\2?\u00c8\3\2\2\2A\u00ca\3\2\2\2C\u00cc"+
		"\3\2\2\2E\u00da\3\2\2\2GH\7\"\2\2HI\3\2\2\2IJ\b\2\2\2J\4\3\2\2\2KL\7\13"+
		"\2\2LM\3\2\2\2MN\b\3\2\2N\6\3\2\2\2OQ\7\17\2\2PO\3\2\2\2PQ\3\2\2\2QR\3"+
		"\2\2\2RS\7\f\2\2ST\3\2\2\2TU\b\4\2\2U\b\3\2\2\2VW\t\2\2\2W\n\3\2\2\2X"+
		"Y\t\3\2\2Y\f\3\2\2\2Z[\7X\2\2[\\\7C\2\2\\]\7T\2\2]^\7K\2\2^_\7C\2\2_`"+
		"\7D\2\2`a\7N\2\2ab\7G\2\2bc\7U\2\2c\16\3\2\2\2de\7U\2\2ef\7W\2\2fg\7D"+
		"\2\2gh\7R\2\2hi\7T\2\2ij\7Q\2\2jk\7I\2\2kl\7T\2\2lm\7C\2\2mn\7O\2\2no"+
		"\7C\2\2op\7U\2\2p\20\3\2\2\2qr\7P\2\2rs\7W\2\2st\7O\2\2t\22\3\2\2\2uv"+
		"\7N\2\2vw\7Q\2\2wx\7I\2\2x\24\3\2\2\2yz\7U\2\2z{\7G\2\2{|\7S\2\2|\26\3"+
		"\2\2\2}~\7e\2\2~\177\7k\2\2\177\u0080\7g\2\2\u0080\u0081\7t\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7q\2\2\u0083\30\3\2\2\2\u0084\u0085\7h\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7q\2\2"+
		"\u0089\32\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c\u008d\7"+
		"v\2\2\u008d\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f\u0090\7q\2\2\u0090\34"+
		"\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\7q\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\u0097\7c\2\2\u0097\u0098\7p\2\2"+
		"\u0098\u0099\7q\2\2\u0099\36\3\2\2\2\u009a\u009b\7Q\2\2\u009b \3\2\2\2"+
		"\u009c\u009d\7[\2\2\u009d\"\3\2\2\2\u009e\u009f\7P\2\2\u009f\u00a0\7Q"+
		"\2\2\u00a0$\3\2\2\2\u00a1\u00a3\7/\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\5\t\5\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8&\3\2\2\2"+
		"\u00a9\u00ae\5\13\6\2\u00aa\u00ad\5\13\6\2\u00ab\u00ad\5\t\5\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af(\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7<\2\2\u00b2"+
		"*\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6."+
		"\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7.\2\2\u00ba"+
		"\62\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7@\2\2\u00be"+
		"\66\3\2\2\2\u00bf\u00c0\7>\2\2\u00c08\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2"+
		"\u00c3\7?\2\2\u00c3:\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5<\3\2\2\2\u00c6\u00c7"+
		"\7/\2\2\u00c7>\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7"+
		"\61\2\2\u00cbB\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\7,\2\2\u00ce\u00d2"+
		"\3\2\2\2\u00cf\u00d1\13\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\b\"\2\2\u00d9D\3\2\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\7\61\2"+
		"\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\13\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\5\7\4\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\b#\2\2\u00e6F\3\2\2\2\n\2P\u00a2\u00a7\u00ac\u00ae\u00d2\u00e0"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}