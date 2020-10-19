// Generated from /home/kenny/IdeaProjects/Proyecto-ANKEMADA/src/Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, CIERTO=4, FALSO=5, ENTERO=6, BOOLEANO=7, 
		Y=8, O=9, NO=10, NUMERO=11, IDENT=12, PA=13, PC=14, PyC=15, COMA=16, ASIG=17, 
		MAYOR=18, MENOR=19, IGUAL=20, MAS=21, MENOS=22, POR=23, DIV=24, COMENTARIO_BLOQUE=25, 
		COMENTARIO_LINEA=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "CIERTO", "FALSO", 
			"ENTERO", "BOOLEANO", "Y", "O", "NO", "NUMERO", "IDENT", "PA", "PC", 
			"PyC", "COMA", "ASIG", "MAYOR", "MENOR", "IGUAL", "MAS", "MENOS", "POR", 
			"DIV", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'cierto'", "'falso'", "'entero'", "'booleano'", 
			"'O'", "'Y'", "'NO'", null, null, "'('", "')'", "';'", "','", "'='", 
			"'>'", "'<'", "'=='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "CIERTO", "FALSO", "ENTERO", 
			"BOOLEANO", "Y", "O", "NO", "NUMERO", "IDENT", "PA", "PC", "PyC", "COMA", 
			"ASIG", "MAYOR", "MENOR", "IGUAL", "MAS", "MENOS", "POR", "DIV", "COMENTARIO_BLOQUE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\5\16"+
		"t\n\16\3\16\6\16w\n\16\r\16\16\16x\3\17\3\17\3\17\7\17~\n\17\f\17\16\17"+
		"\u0081\13\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\5\34\u009e\n\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\7\35\u00a9\n\35\f\35\16\35\u00ac\13\35\3\35\3\35\3\35\3\35\3\u00aa\2"+
		"\36\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34\3"+
		"\2\4\3\2\62;\4\2C\\c|\2\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\3;\3\2\2\2\5?\3\2\2\2\7D\3\2\2\2\tJ\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17"+
		"U\3\2\2\2\21[\3\2\2\2\23b\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2"+
		"\33s\3\2\2\2\35z\3\2\2\2\37\u0082\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2"+
		"\2%\u0088\3\2\2\2\'\u008a\3\2\2\2)\u008c\3\2\2\2+\u008e\3\2\2\2-\u0090"+
		"\3\2\2\2/\u0093\3\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2"+
		"\2\2\67\u009b\3\2\2\29\u00a4\3\2\2\2;<\7\"\2\2<=\3\2\2\2=>\b\2\2\2>\4"+
		"\3\2\2\2?@\7\13\2\2@A\3\2\2\2AB\b\3\2\2B\6\3\2\2\2CE\7\17\2\2DC\3\2\2"+
		"\2DE\3\2\2\2EF\3\2\2\2FG\7\f\2\2GH\3\2\2\2HI\b\4\2\2I\b\3\2\2\2JK\t\2"+
		"\2\2K\n\3\2\2\2LM\t\3\2\2M\f\3\2\2\2NO\7e\2\2OP\7k\2\2PQ\7g\2\2QR\7t\2"+
		"\2RS\7v\2\2ST\7q\2\2T\16\3\2\2\2UV\7h\2\2VW\7c\2\2WX\7n\2\2XY\7u\2\2Y"+
		"Z\7q\2\2Z\20\3\2\2\2[\\\7g\2\2\\]\7p\2\2]^\7v\2\2^_\7g\2\2_`\7t\2\2`a"+
		"\7q\2\2a\22\3\2\2\2bc\7d\2\2cd\7q\2\2de\7q\2\2ef\7n\2\2fg\7g\2\2gh\7c"+
		"\2\2hi\7p\2\2ij\7q\2\2j\24\3\2\2\2kl\7Q\2\2l\26\3\2\2\2mn\7[\2\2n\30\3"+
		"\2\2\2op\7P\2\2pq\7Q\2\2q\32\3\2\2\2rt\7/\2\2sr\3\2\2\2st\3\2\2\2tv\3"+
		"\2\2\2uw\5\t\5\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\34\3\2\2\2z"+
		"\177\5\13\6\2{~\5\13\6\2|~\5\t\5\2}{\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2"+
		"\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\36\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\7*\2\2\u0083 \3\2\2\2\u0084\u0085\7+\2\2\u0085\"\3\2\2\2\u0086"+
		"\u0087\7=\2\2\u0087$\3\2\2\2\u0088\u0089\7.\2\2\u0089&\3\2\2\2\u008a\u008b"+
		"\7?\2\2\u008b(\3\2\2\2\u008c\u008d\7@\2\2\u008d*\3\2\2\2\u008e\u008f\7"+
		">\2\2\u008f,\3\2\2\2\u0090\u0091\7?\2\2\u0091\u0092\7?\2\2\u0092.\3\2"+
		"\2\2\u0093\u0094\7-\2\2\u0094\60\3\2\2\2\u0095\u0096\7/\2\2\u0096\62\3"+
		"\2\2\2\u0097\u0098\7,\2\2\u0098\64\3\2\2\2\u0099\u009a\7\61\2\2\u009a"+
		"\66\3\2\2\2\u009b\u009d\7\61\2\2\u009c\u009e\13\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7,\2\2\u00a0"+
		"\u00a1\7\61\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\34\2\2\u00a38\3\2\2"+
		"\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00aa\3\2\2\2\u00a7"+
		"\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\5\7\4\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\35\2\2\u00b0:\3\2\2\2"+
		"\n\2Dsx}\177\u009d\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}