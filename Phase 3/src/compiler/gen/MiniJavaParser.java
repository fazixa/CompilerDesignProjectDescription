package compiler.gen;// Generated from /home/najme/uni/intellij projects/cool_coompiler/src/MiniJava.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, AND=23, LT=24, PLUS=25, 
		MINUS=26, TIMES=27, POWER=28, NOT=29, LSB=30, RSB=31, DOTLENGTH=32, LP=33, 
		RP=34, RETURN=35, EQ=36, Final=37, BooleanLiteral=38, IntegerLiteral=39, 
		NullLiteral=40, Identifier=41, String=42, Override=43, WS=44, MULTILINE_COMMENT=45, 
		LINE_COMMENT=46;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_mainMethod = 2, RULE_classDeclaration = 3, 
		RULE_interfaceDeclaration = 4, RULE_interfaceMethodDeclaration = 5, RULE_fieldDeclaration = 6, 
		RULE_localDeclaration = 7, RULE_methodDeclaration = 8, RULE_parameterList = 9, 
		RULE_parameter = 10, RULE_methodBody = 11, RULE_type = 12, RULE_javaType = 13, 
		RULE_returnType = 14, RULE_accessModifier = 15, RULE_statement = 16, RULE_ifBlock = 17, 
		RULE_elseBlock = 18, RULE_whileBlock = 19, RULE_expression = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainClass", "mainMethod", "classDeclaration", "interfaceDeclaration", 
			"interfaceMethodDeclaration", "fieldDeclaration", "localDeclaration", 
			"methodDeclaration", "parameterList", "parameter", "methodBody", "type", 
			"javaType", "returnType", "accessModifier", "statement", "ifBlock", "elseBlock", 
			"whileBlock", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'public'", "'static'", "'void'", "'main'", 
			"'extends'", "'implements'", "','", "'interface'", "';'", "'boolean'", 
			"'int'", "'private'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'.'", "'new'", "'this'", "'&&'", "'<'", "'+'", "'-'", "'*'", "'**'", 
			"'!'", "'['", "']'", "'.length'", "'('", "')'", "'return'", "'='", "'final'", 
			null, null, "'null'", null, null, "'@Override'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "AND", 
			"LT", "PLUS", "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", "DOTLENGTH", 
			"LP", "RP", "RETURN", "EQ", "Final", "BooleanLiteral", "IntegerLiteral", 
			"NullLiteral", "Identifier", "String", "Override", "WS", "MULTILINE_COMMENT", 
			"LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(42);
			mainClass();
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__10) {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(43);
					classDeclaration();
					}
					break;
				case T__10:
					{
					setState(44);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public Token className;
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			((MainClassContext)_localctx).className = match(Identifier);
			setState(54);
			match(T__1);
			setState(55);
			mainMethod();
			setState(56);
			match(T__2);
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

	public static class MainMethodContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(MiniJavaParser.LP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode RP() { return getToken(MiniJavaParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterMainMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitMainMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__3);
			setState(59);
			match(T__4);
			setState(60);
			match(T__5);
			setState(61);
			match(T__6);
			setState(62);
			match(LP);
			setState(63);
			type();
			setState(64);
			match(Identifier);
			setState(65);
			match(RP);
			setState(66);
			match(T__1);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << NullLiteral) | (1L << Identifier) | (1L << String))) != 0)) {
				{
				{
				setState(67);
				statement();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__2);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token parentName;
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__0);
			setState(76);
			((ClassDeclarationContext)_localctx).className = match(Identifier);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(77);
				match(T__7);
				setState(78);
				((ClassDeclarationContext)_localctx).parentName = match(Identifier);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(81);
				match(T__8);
				setState(82);
				match(Identifier);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(83);
					match(T__9);
					setState(84);
					match(Identifier);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
			match(T__1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					fieldDeclaration();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Identifier) | (1L << Override))) != 0)) {
				{
				{
				setState(99);
				methodDeclaration();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__2);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public Token interfaceName;
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<InterfaceMethodDeclarationContext> interfaceMethodDeclaration() {
			return getRuleContexts(InterfaceMethodDeclarationContext.class);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration(int i) {
			return getRuleContext(InterfaceMethodDeclarationContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interfaceDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__10);
			setState(108);
			((InterfaceDeclarationContext)_localctx).interfaceName = match(Identifier);
			setState(109);
			match(T__1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					fieldDeclaration();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Identifier))) != 0)) {
				{
				{
				setState(116);
				interfaceMethodDeclaration();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__2);
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public Token methodName;
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode LP() { return getToken(MiniJavaParser.LP, 0); }
		public TerminalNode RP() { return getToken(MiniJavaParser.RP, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__14) {
				{
				setState(124);
				accessModifier();
				}
			}

			setState(127);
			returnType();
			setState(128);
			((InterfaceMethodDeclarationContext)_localctx).methodName = match(Identifier);
			setState(129);
			match(LP);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << Identifier))) != 0)) {
				{
				setState(130);
				parameterList();
				}
			}

			setState(133);
			match(RP);
			setState(134);
			match(T__11);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public Token fieldName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode Final() { return getToken(MiniJavaParser.Final, 0); }
		public TerminalNode EQ() { return getToken(MiniJavaParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__14) {
				{
				setState(136);
				accessModifier();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final) {
				{
				setState(139);
				match(Final);
				}
			}

			setState(142);
			type();
			setState(143);
			((FieldDeclarationContext)_localctx).fieldName = match(Identifier);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(144);
				match(EQ);
				setState(145);
				expression(0);
				}
			}

			setState(148);
			match(T__11);
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

	public static class LocalDeclarationContext extends ParserRuleContext {
		public Token verName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterLocalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitLocalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			type();
			setState(151);
			((LocalDeclarationContext)_localctx).verName = match(Identifier);
			setState(152);
			match(T__11);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token methodName;
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode LP() { return getToken(MiniJavaParser.LP, 0); }
		public TerminalNode RP() { return getToken(MiniJavaParser.RP, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode Override() { return getToken(MiniJavaParser.Override, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Override) {
				{
				setState(154);
				match(Override);
				}
			}

			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__14) {
				{
				setState(157);
				accessModifier();
				}
			}

			setState(160);
			returnType();
			setState(161);
			((MethodDeclarationContext)_localctx).methodName = match(Identifier);
			setState(162);
			match(LP);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << Identifier))) != 0)) {
				{
				setState(163);
				parameterList();
				}
			}

			setState(166);
			match(RP);
			setState(167);
			match(T__1);
			setState(168);
			methodBody();
			setState(169);
			match(T__2);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			parameter();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(172);
				match(T__9);
				setState(173);
				parameter();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			type();
			setState(180);
			match(Identifier);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << NullLiteral) | (1L << Identifier) | (1L << String))) != 0)) {
				{
				{
				setState(182);
				statement();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(188);
				match(RETURN);
				setState(189);
				expression(0);
				setState(190);
				match(T__11);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public JavaTypeContext javaType() {
			return getRuleContext(JavaTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LSB() { return getToken(MiniJavaParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MiniJavaParser.RSB, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				{
				setState(194);
				javaType();
				}
				break;
			case Identifier:
				{
				setState(195);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(198);
				match(LSB);
				setState(199);
				match(RSB);
				}
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

	public static class JavaTypeContext extends ParserRuleContext {
		public JavaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaType; }
	 
		public JavaTypeContext() { }
		public void copyFrom(JavaTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanTypeContext extends JavaTypeContext {
		public BooleanTypeContext(JavaTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends JavaTypeContext {
		public IntTypeContext(JavaTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaTypeContext javaType() throws RecognitionException {
		JavaTypeContext _localctx = new JavaTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_javaType);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__13);
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnType);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				type();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__5);
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

	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(MiniJavaParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(MiniJavaParser.RP, 0); }
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(MiniJavaParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(MiniJavaParser.RP, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalVarDeclarationContext extends StatementContext {
		public LocalDeclarationContext localDeclaration() {
			return getRuleContext(LocalDeclarationContext.class,0);
		}
		public LocalVarDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterLocalVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitLocalVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLocalVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(MiniJavaParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(MiniJavaParser.RP, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfElseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableAssignmentStatementContext extends StatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MiniJavaParser.EQ, 0); }
		public VariableAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressioncallContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressioncallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterExpressioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitExpressioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressioncall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignmentStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LSB() { return getToken(MiniJavaParser.LSB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSB() { return getToken(MiniJavaParser.RSB, 0); }
		public TerminalNode EQ() { return getToken(MiniJavaParser.EQ, 0); }
		public ArrayAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterArrayAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitArrayAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NestedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterNestedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitNestedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNestedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new NestedStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__1);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << NullLiteral) | (1L << Identifier) | (1L << String))) != 0)) {
					{
					{
					setState(213);
					statement();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__15);
				setState(221);
				match(LP);
				setState(222);
				expression(0);
				setState(223);
				match(RP);
				setState(224);
				ifBlock();
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(225);
					match(T__16);
					setState(226);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(T__17);
				setState(230);
				match(LP);
				setState(231);
				expression(0);
				setState(232);
				match(RP);
				setState(233);
				whileBlock();
				}
				break;
			case 4:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(T__18);
				setState(236);
				match(LP);
				setState(237);
				expression(0);
				setState(238);
				match(RP);
				setState(239);
				match(T__11);
				}
				break;
			case 5:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				expression(0);
				setState(242);
				match(EQ);
				setState(243);
				expression(0);
				setState(244);
				match(T__11);
				}
				break;
			case 6:
				_localctx = new ArrayAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				match(Identifier);
				setState(247);
				match(LSB);
				setState(248);
				expression(0);
				setState(249);
				match(RSB);
				setState(250);
				match(EQ);
				setState(251);
				expression(0);
				setState(252);
				match(T__11);
				}
				break;
			case 7:
				_localctx = new LocalVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				localDeclaration();
				}
				break;
			case 8:
				_localctx = new ExpressioncallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				expression(0);
				setState(256);
				match(T__11);
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

	public static class IfBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			statement();
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

	public static class ElseBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			statement();
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

	public static class WhileBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			statement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LtExpressionContext extends ExpressionContext {
		public ExpressionContext l;
		public ExpressionContext r;
		public TerminalNode LT() { return getToken(MiniJavaParser.LT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterLtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitLtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectInstantiationExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LP() { return getToken(MiniJavaParser.LP, 0); }
		public TerminalNode RP() { return getToken(MiniJavaParser.RP, 0); }
		public ObjectInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterObjectInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitObjectInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitObjectInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayInstantiationExpressionContext extends ExpressionContext {
		public TerminalNode LSB() { return getToken(MiniJavaParser.LSB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSB() { return getToken(MiniJavaParser.RSB, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ArrayInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterArrayInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitArrayInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExpressionContext extends ExpressionContext {
		public ExpressionContext l;
		public ExpressionContext r;
		public TerminalNode POWER() { return getToken(MiniJavaParser.POWER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitPowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LP() { return getToken(MiniJavaParser.LP, 0); }
		public TerminalNode RP() { return getToken(MiniJavaParser.RP, 0); }
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(MiniJavaParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLitExpressionContext extends ExpressionContext {
		public TerminalNode BooleanLiteral() { return getToken(MiniJavaParser.BooleanLiteral, 0); }
		public BooleanLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterBooleanLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitBooleanLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBooleanLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LP() { return getToken(MiniJavaParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(MiniJavaParser.RP, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLitExpressionContext extends ExpressionContext {
		public TerminalNode IntegerLiteral() { return getToken(MiniJavaParser.IntegerLiteral, 0); }
		public IntLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterIntLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitIntLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLitExpressionContext extends ExpressionContext {
		public TerminalNode String() { return getToken(MiniJavaParser.String, 0); }
		public StringLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterStringLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitStringLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStringLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLitExpressionContext extends ExpressionContext {
		public TerminalNode NullLiteral() { return getToken(MiniJavaParser.NullLiteral, 0); }
		public NullLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterNullLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitNullLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNullLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext l;
		public ExpressionContext r;
		public TerminalNode AND() { return getToken(MiniJavaParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LSB() { return getToken(MiniJavaParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MiniJavaParser.RSB, 0); }
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public ExpressionContext l;
		public ExpressionContext r;
		public TerminalNode PLUS() { return getToken(MiniJavaParser.PLUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public FieldCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterFieldCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitFieldCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLengthExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOTLENGTH() { return getToken(MiniJavaParser.DOTLENGTH, 0); }
		public ArrayLengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterArrayLengthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitArrayLengthExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayLengthExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntarrayInstantiationExpressionContext extends ExpressionContext {
		public List<TerminalNode> IntegerLiteral() { return getTokens(MiniJavaParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(MiniJavaParser.IntegerLiteral, i);
		}
		public IntarrayInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterIntarrayInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitIntarrayInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntarrayInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends ExpressionContext {
		public ExpressionContext l;
		public ExpressionContext r;
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends ExpressionContext {
		public ExpressionContext l;
		public ExpressionContext r;
		public TerminalNode TIMES() { return getToken(MiniJavaParser.TIMES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener) ((MiniJavaListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(267);
				match(NOT);
				setState(268);
				expression(17);
				}
				break;
			case 2:
				{
				_localctx = new ArrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(T__20);
				setState(270);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << Identifier))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(271);
				match(LSB);
				setState(272);
				expression(0);
				setState(273);
				match(RSB);
				}
				break;
			case 3:
				{
				_localctx = new IntarrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(T__1);
				setState(276);
				match(IntegerLiteral);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(277);
					match(T__9);
					setState(278);
					match(IntegerLiteral);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new ObjectInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(T__20);
				setState(286);
				match(Identifier);
				setState(287);
				match(LP);
				setState(288);
				match(RP);
				}
				break;
			case 5:
				{
				_localctx = new IntLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(IntegerLiteral);
				}
				break;
			case 6:
				{
				_localctx = new BooleanLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(BooleanLiteral);
				}
				break;
			case 7:
				{
				_localctx = new NullLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(NullLiteral);
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new StringLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				match(String);
				}
				break;
			case 10:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				match(T__21);
				}
				break;
			case 11:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(LP);
				setState(296);
				expression(0);
				setState(297);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(344);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new PowExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PowExpressionContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(302);
						match(POWER);
						setState(303);
						((PowExpressionContext)_localctx).r = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MulExpressionContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(305);
						match(TIMES);
						setState(306);
						((MulExpressionContext)_localctx).r = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(308);
						match(PLUS);
						setState(309);
						((AddExpressionContext)_localctx).r = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((SubExpressionContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(311);
						match(MINUS);
						setState(312);
						((SubExpressionContext)_localctx).r = expression(11);
						}
						break;
					case 5:
						{
						_localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LtExpressionContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(314);
						match(LT);
						setState(315);
						((LtExpressionContext)_localctx).r = expression(10);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(317);
						match(AND);
						setState(318);
						((AndExpressionContext)_localctx).r = expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(320);
						match(LSB);
						setState(321);
						((ArrayAccessExpressionContext)_localctx).index = expression(0);
						setState(322);
						match(RSB);
						}
						break;
					case 8:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(325);
						match(DOTLENGTH);
						}
						break;
					case 9:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(327);
						match(T__19);
						setState(328);
						match(Identifier);
						setState(329);
						match(LP);
						setState(338);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__20) | (1L << T__21) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << NullLiteral) | (1L << Identifier) | (1L << String))) != 0)) {
							{
							setState(330);
							expression(0);
							setState(335);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__9) {
								{
								{
								setState(331);
								match(T__9);
								setState(332);
								expression(0);
								}
								}
								setState(337);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(340);
						match(RP);
						}
						break;
					case 10:
						{
						_localctx = new FieldCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(342);
						match(T__19);
						setState(343);
						match(Identifier);
						}
						break;
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 21);
		case 7:
			return precpred(_ctx, 20);
		case 8:
			return precpred(_ctx, 19);
		case 9:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0160\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5R\n\5"+
		"\3\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\5\5]\n\5\3\5\3\5\7\5a\n\5\f\5"+
		"\16\5d\13\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6r\n"+
		"\6\f\6\16\6u\13\6\3\6\7\6x\n\6\f\6\16\6{\13\6\3\6\3\6\3\7\5\7\u0080\n"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0086\n\7\3\7\3\7\3\7\3\b\5\b\u008c\n\b\3\b\5\b"+
		"\u008f\n\b\3\b\3\b\3\b\3\b\5\b\u0095\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\5"+
		"\n\u009e\n\n\3\n\5\n\u00a1\n\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\3\f\3"+
		"\f\3\f\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3\r\3\r\3\r\3\r\5\r\u00c3"+
		"\n\r\3\16\3\16\5\16\u00c7\n\16\3\16\3\16\5\16\u00cb\n\16\3\17\3\17\5\17"+
		"\u00cf\n\17\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\22\3\22\7\22\u00d9\n"+
		"\22\f\22\16\22\u00dc\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00e6\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0105\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011a\n\26"+
		"\f\26\16\26\u011d\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u012e\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0150\n\26\f\26\16\26\u0153\13\26\5\26\u0155\n\26\3\26\3\26\3\26\3\26"+
		"\7\26\u015b\n\26\f\26\16\26\u015e\13\26\3\26\2\3*\27\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*\2\4\4\2\6\6\21\21\4\2\17\20++\2\u0183\2,"+
		"\3\2\2\2\4\66\3\2\2\2\6<\3\2\2\2\bM\3\2\2\2\nm\3\2\2\2\f\177\3\2\2\2\16"+
		"\u008b\3\2\2\2\20\u0098\3\2\2\2\22\u009d\3\2\2\2\24\u00ad\3\2\2\2\26\u00b5"+
		"\3\2\2\2\30\u00bb\3\2\2\2\32\u00c6\3\2\2\2\34\u00ce\3\2\2\2\36\u00d2\3"+
		"\2\2\2 \u00d4\3\2\2\2\"\u0104\3\2\2\2$\u0106\3\2\2\2&\u0108\3\2\2\2(\u010a"+
		"\3\2\2\2*\u012d\3\2\2\2,\61\5\4\3\2-\60\5\b\5\2.\60\5\n\6\2/-\3\2\2\2"+
		"/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61"+
		"\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7\3\2\2\678\7+\2\289\7\4\2\2"+
		"9:\5\6\4\2:;\7\5\2\2;\5\3\2\2\2<=\7\6\2\2=>\7\7\2\2>?\7\b\2\2?@\7\t\2"+
		"\2@A\7#\2\2AB\5\32\16\2BC\7+\2\2CD\7$\2\2DH\7\4\2\2EG\5\"\22\2FE\3\2\2"+
		"\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\5\2\2L\7\3\2"+
		"\2\2MN\7\3\2\2NQ\7+\2\2OP\7\n\2\2PR\7+\2\2QO\3\2\2\2QR\3\2\2\2R\\\3\2"+
		"\2\2ST\7\13\2\2TY\7+\2\2UV\7\f\2\2VX\7+\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\S\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^b\7"+
		"\4\2\2_a\5\16\b\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3\2\2\2db"+
		"\3\2\2\2eg\5\22\n\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2"+
		"jh\3\2\2\2kl\7\5\2\2l\t\3\2\2\2mn\7\r\2\2no\7+\2\2os\7\4\2\2pr\5\16\b"+
		"\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2ty\3\2\2\2us\3\2\2\2vx\5\f\7"+
		"\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\5\2"+
		"\2}\13\3\2\2\2~\u0080\5 \21\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\5\36\20\2\u0082\u0083\7+\2\2\u0083\u0085\7#\2\2\u0084"+
		"\u0086\5\24\13\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\7$\2\2\u0088\u0089\7\16\2\2\u0089\r\3\2\2\2\u008a\u008c"+
		"\5 \21\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008f\7\'\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\5\32\16\2\u0091\u0094\7+\2\2\u0092\u0093\7&\2\2\u0093"+
		"\u0095\5*\26\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7\16\2\2\u0097\17\3\2\2\2\u0098\u0099\5\32\16\2\u0099"+
		"\u009a\7+\2\2\u009a\u009b\7\16\2\2\u009b\21\3\2\2\2\u009c\u009e\7-\2\2"+
		"\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1"+
		"\5 \21\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\5\36\20\2\u00a3\u00a4\7+\2\2\u00a4\u00a6\7#\2\2\u00a5\u00a7\5\24"+
		"\13\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7$\2\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\5"+
		"\2\2\u00ac\23\3\2\2\2\u00ad\u00b2\5\26\f\2\u00ae\u00af\7\f\2\2\u00af\u00b1"+
		"\5\26\f\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\25\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6"+
		"\5\32\16\2\u00b6\u00b7\7+\2\2\u00b7\27\3\2\2\2\u00b8\u00ba\5\"\22\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00c2\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7%\2\2\u00bf"+
		"\u00c0\5*\26\2\u00c0\u00c1\7\16\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00be\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c7\5\34\17\2\u00c5"+
		"\u00c7\7+\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c9\7 \2\2\u00c9\u00cb\7!\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\33\3\2\2\2\u00cc\u00cf\7\17\2\2\u00cd\u00cf\7\20\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00d3\5\32\16"+
		"\2\u00d1\u00d3\7\b\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\37"+
		"\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5!\3\2\2\2\u00d6\u00da\7\4\2\2\u00d7"+
		"\u00d9\5\"\22\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u0105\7\5\2\2\u00de\u00df\7\22\2\2\u00df\u00e0\7#\2\2\u00e0\u00e1\5*"+
		"\26\2\u00e1\u00e2\7$\2\2\u00e2\u00e5\5$\23\2\u00e3\u00e4\7\23\2\2\u00e4"+
		"\u00e6\5&\24\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u0105\3\2"+
		"\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\5*\26\2\u00ea"+
		"\u00eb\7$\2\2\u00eb\u00ec\5(\25\2\u00ec\u0105\3\2\2\2\u00ed\u00ee\7\25"+
		"\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\5*\26\2\u00f0\u00f1\7$\2\2\u00f1\u00f2"+
		"\7\16\2\2\u00f2\u0105\3\2\2\2\u00f3\u00f4\5*\26\2\u00f4\u00f5\7&\2\2\u00f5"+
		"\u00f6\5*\26\2\u00f6\u00f7\7\16\2\2\u00f7\u0105\3\2\2\2\u00f8\u00f9\7"+
		"+\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fb\5*\26\2\u00fb\u00fc\7!\2\2\u00fc"+
		"\u00fd\7&\2\2\u00fd\u00fe\5*\26\2\u00fe\u00ff\7\16\2\2\u00ff\u0105\3\2"+
		"\2\2\u0100\u0105\5\20\t\2\u0101\u0102\5*\26\2\u0102\u0103\7\16\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u00d6\3\2\2\2\u0104\u00de\3\2\2\2\u0104\u00e7\3\2"+
		"\2\2\u0104\u00ed\3\2\2\2\u0104\u00f3\3\2\2\2\u0104\u00f8\3\2\2\2\u0104"+
		"\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0105#\3\2\2\2\u0106\u0107\5\"\22\2"+
		"\u0107%\3\2\2\2\u0108\u0109\5\"\22\2\u0109\'\3\2\2\2\u010a\u010b\5\"\22"+
		"\2\u010b)\3\2\2\2\u010c\u010d\b\26\1\2\u010d\u010e\7\37\2\2\u010e\u012e"+
		"\5*\26\23\u010f\u0110\7\27\2\2\u0110\u0111\t\3\2\2\u0111\u0112\7 \2\2"+
		"\u0112\u0113\5*\26\2\u0113\u0114\7!\2\2\u0114\u012e\3\2\2\2\u0115\u0116"+
		"\7\4\2\2\u0116\u011b\7)\2\2\u0117\u0118\7\f\2\2\u0118\u011a\7)\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u012e\7\5\2\2\u011f"+
		"\u0120\7\27\2\2\u0120\u0121\7+\2\2\u0121\u0122\7#\2\2\u0122\u012e\7$\2"+
		"\2\u0123\u012e\7)\2\2\u0124\u012e\7(\2\2\u0125\u012e\7*\2\2\u0126\u012e"+
		"\7+\2\2\u0127\u012e\7,\2\2\u0128\u012e\7\30\2\2\u0129\u012a\7#\2\2\u012a"+
		"\u012b\5*\26\2\u012b\u012c\7$\2\2\u012c\u012e\3\2\2\2\u012d\u010c\3\2"+
		"\2\2\u012d\u010f\3\2\2\2\u012d\u0115\3\2\2\2\u012d\u011f\3\2\2\2\u012d"+
		"\u0123\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u0126\3\2"+
		"\2\2\u012d\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012e"+
		"\u015c\3\2\2\2\u012f\u0130\f\17\2\2\u0130\u0131\7\36\2\2\u0131\u015b\5"+
		"*\26\20\u0132\u0133\f\16\2\2\u0133\u0134\7\35\2\2\u0134\u015b\5*\26\17"+
		"\u0135\u0136\f\r\2\2\u0136\u0137\7\33\2\2\u0137\u015b\5*\26\16\u0138\u0139"+
		"\f\f\2\2\u0139\u013a\7\34\2\2\u013a\u015b\5*\26\r\u013b\u013c\f\13\2\2"+
		"\u013c\u013d\7\32\2\2\u013d\u015b\5*\26\f\u013e\u013f\f\n\2\2\u013f\u0140"+
		"\7\31\2\2\u0140\u015b\5*\26\13\u0141\u0142\f\27\2\2\u0142\u0143\7 \2\2"+
		"\u0143\u0144\5*\26\2\u0144\u0145\7!\2\2\u0145\u015b\3\2\2\2\u0146\u0147"+
		"\f\26\2\2\u0147\u015b\7\"\2\2\u0148\u0149\f\25\2\2\u0149\u014a\7\26\2"+
		"\2\u014a\u014b\7+\2\2\u014b\u0154\7#\2\2\u014c\u0151\5*\26\2\u014d\u014e"+
		"\7\f\2\2\u014e\u0150\5*\26\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u014c\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u015b\7$\2\2\u0157\u0158\f\24\2\2\u0158\u0159\7\26\2\2\u0159\u015b\7"+
		"+\2\2\u015a\u012f\3\2\2\2\u015a\u0132\3\2\2\2\u015a\u0135\3\2\2\2\u015a"+
		"\u0138\3\2\2\2\u015a\u013b\3\2\2\2\u015a\u013e\3\2\2\2\u015a\u0141\3\2"+
		"\2\2\u015a\u0146\3\2\2\2\u015a\u0148\3\2\2\2\u015a\u0157\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d+\3\2\2\2"+
		"\u015e\u015c\3\2\2\2$/\61HQY\\bhsy\177\u0085\u008b\u008e\u0094\u009d\u00a0"+
		"\u00a6\u00b2\u00bb\u00c2\u00c6\u00ca\u00ce\u00d2\u00da\u00e5\u0104\u011b"+
		"\u012d\u0151\u0154\u015a\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}