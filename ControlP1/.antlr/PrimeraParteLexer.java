// Generated from c:/Users/josem/Documents/Lenguajes de Programacion/Control1LP/ControlP1/PrimeraParte.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PrimeraParteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ENC=4, APAG=5, MOV=6, INT=7, NEWLINE=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ENC", "APAG", "MOV", "INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'encendido'", "'apagado'", "'mover'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ENC", "APAG", "MOV", "INT", "NEWLINE", "WS"
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


	public PrimeraParteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrimeraParte.g4"; }

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
		"\u0004\u0000\tE\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u00063\b\u0006\u0001"+
		"\u0006\u0004\u00066\b\u0006\u000b\u0006\f\u00067\u0001\u0007\u0003\u0007"+
		";\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\b@\b\b\u000b\b\f\bA\u0001"+
		"\b\u0001\b\u0000\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000\u0002\u0001\u0000"+
		"09\u0002\u0000\t\t  H\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000"+
		"\u0000\u0000\u0003\u0015\u0001\u0000\u0000\u0000\u0005\u0017\u0001\u0000"+
		"\u0000\u0000\u0007\u0019\u0001\u0000\u0000\u0000\t#\u0001\u0000\u0000"+
		"\u0000\u000b+\u0001\u0000\u0000\u0000\r2\u0001\u0000\u0000\u0000\u000f"+
		":\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013\u0014\u0005"+
		"(\u0000\u0000\u0014\u0002\u0001\u0000\u0000\u0000\u0015\u0016\u0005,\u0000"+
		"\u0000\u0016\u0004\u0001\u0000\u0000\u0000\u0017\u0018\u0005)\u0000\u0000"+
		"\u0018\u0006\u0001\u0000\u0000\u0000\u0019\u001a\u0005e\u0000\u0000\u001a"+
		"\u001b\u0005n\u0000\u0000\u001b\u001c\u0005c\u0000\u0000\u001c\u001d\u0005"+
		"e\u0000\u0000\u001d\u001e\u0005n\u0000\u0000\u001e\u001f\u0005d\u0000"+
		"\u0000\u001f \u0005i\u0000\u0000 !\u0005d\u0000\u0000!\"\u0005o\u0000"+
		"\u0000\"\b\u0001\u0000\u0000\u0000#$\u0005a\u0000\u0000$%\u0005p\u0000"+
		"\u0000%&\u0005a\u0000\u0000&\'\u0005g\u0000\u0000\'(\u0005a\u0000\u0000"+
		"()\u0005d\u0000\u0000)*\u0005o\u0000\u0000*\n\u0001\u0000\u0000\u0000"+
		"+,\u0005m\u0000\u0000,-\u0005o\u0000\u0000-.\u0005v\u0000\u0000./\u0005"+
		"e\u0000\u0000/0\u0005r\u0000\u00000\f\u0001\u0000\u0000\u000013\u0005"+
		"-\u0000\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001"+
		"\u0000\u0000\u000046\u0007\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008\u000e\u0001\u0000\u0000\u00009;\u0005\r\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005"+
		"\n\u0000\u0000=\u0010\u0001\u0000\u0000\u0000>@\u0007\u0001\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0006\b\u0000"+
		"\u0000D\u0012\u0001\u0000\u0000\u0000\u0005\u000027:A\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}