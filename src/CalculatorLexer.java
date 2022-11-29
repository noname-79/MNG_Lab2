// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT=1, POV=2, SQRT=3, INT=4, DOT=5, TIMES=6, DIV=7, PLUS=8, MINUS=9, 
		WS=10, MOD=11, COS=12, SIN=13, TAN=14, ACOS=15, ASIN=16, ATAN=17, LOG=18, 
		PI=19, E=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FLOAT", "POV", "SQRT", "INT", "DOT", "TIMES", "DIV", "PLUS", "MINUS", 
			"WS", "MOD", "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LOG", "PI", 
			"E"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'^'", "'P'", null, "'.'", "'*'", "'/'", "'+'", "'-'", null, 
			"'mod'", "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", "'log'", 
			"'PI'", "'E'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOAT", "POV", "SQRT", "INT", "DOT", "TIMES", "DIV", "PLUS", "MINUS", 
			"WS", "MOD", "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LOG", "PI", 
			"E"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\u0014w\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000+\b"+
		"\u0000\u000b\u0000\f\u0000,\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0004\u0003;\b\u0003\u000b\u0003\f\u0003<\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0004\tJ\b\t\u000b\t\f\tK\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001"+
		"\u0000\u0002\u0001\u000009\u0003\u0000\t\n\r\r  z\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0001*\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000"+
		"\u0000\u00057\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t"+
		">\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000\u0000\rB\u0001\u0000"+
		"\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000"+
		"\u0013I\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017S"+
		"\u0001\u0000\u0000\u0000\u0019W\u0001\u0000\u0000\u0000\u001b[\u0001\u0000"+
		"\u0000\u0000\u001d_\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000"+
		"!i\u0001\u0000\u0000\u0000#n\u0001\u0000\u0000\u0000%r\u0001\u0000\u0000"+
		"\u0000\'u\u0001\u0000\u0000\u0000)+\u0003\u0007\u0003\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.2\u0003\t\u0004\u0000/1\u0003"+
		"\u0007\u0003\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0002\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000056\u0005^\u0000\u00006\u0004\u0001"+
		"\u0000\u0000\u000078\u0005P\u0000\u00008\u0006\u0001\u0000\u0000\u0000"+
		"9;\u0007\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\b\u0001\u0000"+
		"\u0000\u0000>?\u0005.\u0000\u0000?\n\u0001\u0000\u0000\u0000@A\u0005*"+
		"\u0000\u0000A\f\u0001\u0000\u0000\u0000BC\u0005/\u0000\u0000C\u000e\u0001"+
		"\u0000\u0000\u0000DE\u0005+\u0000\u0000E\u0010\u0001\u0000\u0000\u0000"+
		"FG\u0005-\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HJ\u0007\u0001\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0006"+
		"\t\u0000\u0000N\u0014\u0001\u0000\u0000\u0000OP\u0005m\u0000\u0000PQ\u0005"+
		"o\u0000\u0000QR\u0005d\u0000\u0000R\u0016\u0001\u0000\u0000\u0000ST\u0005"+
		"c\u0000\u0000TU\u0005o\u0000\u0000UV\u0005s\u0000\u0000V\u0018\u0001\u0000"+
		"\u0000\u0000WX\u0005s\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005n\u0000"+
		"\u0000Z\u001a\u0001\u0000\u0000\u0000[\\\u0005t\u0000\u0000\\]\u0005a"+
		"\u0000\u0000]^\u0005n\u0000\u0000^\u001c\u0001\u0000\u0000\u0000_`\u0005"+
		"a\u0000\u0000`a\u0005c\u0000\u0000ab\u0005o\u0000\u0000bc\u0005s\u0000"+
		"\u0000c\u001e\u0001\u0000\u0000\u0000de\u0005a\u0000\u0000ef\u0005s\u0000"+
		"\u0000fg\u0005i\u0000\u0000gh\u0005n\u0000\u0000h \u0001\u0000\u0000\u0000"+
		"ij\u0005a\u0000\u0000jk\u0005t\u0000\u0000kl\u0005a\u0000\u0000lm\u0005"+
		"n\u0000\u0000m\"\u0001\u0000\u0000\u0000no\u0005l\u0000\u0000op\u0005"+
		"o\u0000\u0000pq\u0005g\u0000\u0000q$\u0001\u0000\u0000\u0000rs\u0005P"+
		"\u0000\u0000st\u0005I\u0000\u0000t&\u0001\u0000\u0000\u0000uv\u0005E\u0000"+
		"\u0000v(\u0001\u0000\u0000\u0000\u0005\u0000,2<K\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}