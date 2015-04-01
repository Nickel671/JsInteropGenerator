// Generated from WebIdl.g4 by ANTLR 4.5
package org.niklas.elemental.Elemental.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WebIdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, WS=62, COMMENT=63, Identifier=64, Integer=65, Other=66, 
		String=67, Float=68, JavaLetter=69, JavaLetterOrDigit=70;
	public static final int
		RULE_definitions = 0, RULE_definition = 1, RULE_callbackOrinterface1 = 2, 
		RULE_callbackRestOrinterface1 = 3, RULE_interface1 = 4, RULE_partial = 5, 
		RULE_partialdefinition = 6, RULE_interface1Members = 7, RULE_interface1Member = 8, 
		RULE_dictionary = 9, RULE_dictionaryMembers = 10, RULE_dictionaryMember = 11, 
		RULE_default1 = 12, RULE_default1Value = 13, RULE_exception = 14, RULE_exceptionMembers = 15, 
		RULE_inheritance = 16, RULE_enum1 = 17, RULE_enumValueList = 18, RULE_enumValues = 19, 
		RULE_callbackRest = 20, RULE_typedef = 21, RULE_implementsStatement = 22, 
		RULE_const1 = 23, RULE_constValue = 24, RULE_booleanLiteral = 25, RULE_floatLiteral = 26, 
		RULE_attributeOroperation = 27, RULE_stringifierattributeOroperation = 28, 
		RULE_attribute = 29, RULE_inherit = 30, RULE_readOnly = 31, RULE_operation = 32, 
		RULE_qualifiers = 33, RULE_specials = 34, RULE_special = 35, RULE_operationRest = 36, 
		RULE_optionalIdentifier = 37, RULE_argumentList = 38, RULE_arguments = 39, 
		RULE_argument = 40, RULE_optionalOrRequiredargument = 41, RULE_argumentName = 42, 
		RULE_ellipsis = 43, RULE_exceptionMember = 44, RULE_exceptionField = 45, 
		RULE_extendedattributeList = 46, RULE_extendedattributes = 47, RULE_extendedattribute = 48, 
		RULE_extendedattributeRest = 49, RULE_extendedattributeInner = 50, RULE_other = 51, 
		RULE_argumentNameKeyword = 52, RULE_otherOrComma = 53, RULE_type = 54, 
		RULE_singletype = 55, RULE_uniontype = 56, RULE_unionMembertype = 57, 
		RULE_unionMembertypes = 58, RULE_nonAnytype = 59, RULE_consttype = 60, 
		RULE_primitivetype = 61, RULE_unrestrictedfloattype = 62, RULE_floattype = 63, 
		RULE_unsignedintegertype = 64, RULE_integertype = 65, RULE_optionalLong = 66, 
		RULE_typeSuffix = 67, RULE_typeSuffixStartingWithArray = 68, RULE_null1 = 69, 
		RULE_returntype = 70, RULE_extendedattributeNoArgs = 71, RULE_extendedattributeArgList = 72, 
		RULE_extendedattributeIdent = 73, RULE_extendedattributeNamedArgList = 74;
	public static final String[] ruleNames = {
		"definitions", "definition", "callbackOrinterface1", "callbackRestOrinterface1", 
		"interface1", "partial", "partialdefinition", "interface1Members", "interface1Member", 
		"dictionary", "dictionaryMembers", "dictionaryMember", "default1", "default1Value", 
		"exception", "exceptionMembers", "inheritance", "enum1", "enumValueList", 
		"enumValues", "callbackRest", "typedef", "implementsStatement", "const1", 
		"constValue", "booleanLiteral", "floatLiteral", "attributeOroperation", 
		"stringifierattributeOroperation", "attribute", "inherit", "readOnly", 
		"operation", "qualifiers", "specials", "special", "operationRest", "optionalIdentifier", 
		"argumentList", "arguments", "argument", "optionalOrRequiredargument", 
		"argumentName", "ellipsis", "exceptionMember", "exceptionField", "extendedattributeList", 
		"extendedattributes", "extendedattribute", "extendedattributeRest", "extendedattributeInner", 
		"other", "argumentNameKeyword", "otherOrComma", "type", "singletype", 
		"uniontype", "unionMembertype", "unionMembertypes", "nonAnytype", "consttype", 
		"primitivetype", "unrestrictedfloattype", "floattype", "unsignedintegertype", 
		"integertype", "optionalLong", "typeSuffix", "typeSuffixStartingWithArray", 
		"null1", "returntype", "extendedattributeNoArgs", "extendedattributeArgList", 
		"extendedattributeIdent", "extendedattributeNamedArgList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'callback'", "'interface'", "'{'", "'}'", "';'", "'partial'", "'dictionary'", 
		"'='", "'[]'", "'exception'", "':'", "'enum'", "','", "'('", "')'", "'typedef'", 
		"'implements'", "'const'", "'null'", "'true'", "'false'", "'-'", "'Infinity'", 
		"'NaN'", "'stringifier'", "'jsonifier;'", "'attribute'", "'inherit'", 
		"'readonly'", "'static'", "'getter'", "'setter'", "'creator'", "'deleter'", 
		"'legacycaller'", "'optional'", "'...'", "'['", "']'", "'.'", "'<'", "'>'", 
		"'?'", "'Date'", "'DOMString'", "'any'", "'boolean'", "'byte'", "'double'", 
		"'Float'", "'long'", "'object'", "'octet'", "'or'", "'sequence'", "'short'", 
		"'unsigned'", "'void'", "'unrestricted'", "'<void>'", "'float'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "COMMENT", "Identifier", "Integer", "Other", "String", 
		"Float", "JavaLetter", "JavaLetterOrDigit"
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
	public String getGrammarFileName() { return "WebIdl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WebIdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DefinitionsContext extends ParserRuleContext {
		public ExtendedattributeListContext extendedattributeList() {
			return getRuleContext(ExtendedattributeListContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WebIdlParser.EOF, 0); }
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitDefinitions(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_definitions);
		try {
			setState(155);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__11:
			case T__15:
			case T__37:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				extendedattributeList();
				setState(151);
				definition();
				setState(152);
				definitions();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(EOF);
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

	public static class DefinitionContext extends ParserRuleContext {
		public CallbackOrinterface1Context callbackOrinterface1() {
			return getRuleContext(CallbackOrinterface1Context.class,0);
		}
		public PartialContext partial() {
			return getRuleContext(PartialContext.class,0);
		}
		public DictionaryContext dictionary() {
			return getRuleContext(DictionaryContext.class,0);
		}
		public ExceptionContext exception() {
			return getRuleContext(ExceptionContext.class,0);
		}
		public Enum1Context enum1() {
			return getRuleContext(Enum1Context.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public ImplementsStatementContext implementsStatement() {
			return getRuleContext(ImplementsStatementContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				callbackOrinterface1();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				partial();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				dictionary();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				exception();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				enum1();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				typedef();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				implementsStatement();
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

	public static class CallbackOrinterface1Context extends ParserRuleContext {
		public CallbackRestOrinterface1Context callbackRestOrinterface1() {
			return getRuleContext(CallbackRestOrinterface1Context.class,0);
		}
		public Interface1Context interface1() {
			return getRuleContext(Interface1Context.class,0);
		}
		public CallbackOrinterface1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackOrinterface1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterCallbackOrinterface1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitCallbackOrinterface1(this);
		}
	}

	public final CallbackOrinterface1Context callbackOrinterface1() throws RecognitionException {
		CallbackOrinterface1Context _localctx = new CallbackOrinterface1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_callbackOrinterface1);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__0);
				setState(167);
				callbackRestOrinterface1();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				interface1();
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

	public static class CallbackRestOrinterface1Context extends ParserRuleContext {
		public CallbackRestContext callbackRest() {
			return getRuleContext(CallbackRestContext.class,0);
		}
		public Interface1Context interface1() {
			return getRuleContext(Interface1Context.class,0);
		}
		public CallbackRestOrinterface1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackRestOrinterface1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterCallbackRestOrinterface1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitCallbackRestOrinterface1(this);
		}
	}

	public final CallbackRestOrinterface1Context callbackRestOrinterface1() throws RecognitionException {
		CallbackRestOrinterface1Context _localctx = new CallbackRestOrinterface1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_callbackRestOrinterface1);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				callbackRest();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				interface1();
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

	public static class Interface1Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public Interface1MembersContext interface1Members() {
			return getRuleContext(Interface1MembersContext.class,0);
		}
		public Interface1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterInterface1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitInterface1(this);
		}
	}

	public final Interface1Context interface1() throws RecognitionException {
		Interface1Context _localctx = new Interface1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_interface1);
		try {
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__1);
				setState(176);
				match(Identifier);
				setState(177);
				inheritance();
				setState(178);
				match(T__2);
				setState(179);
				interface1Members();
				setState(180);
				match(T__3);
				setState(181);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__1);
				setState(184);
				match(Identifier);
				setState(185);
				match(T__4);
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

	public static class PartialContext extends ParserRuleContext {
		public PartialdefinitionContext partialdefinition() {
			return getRuleContext(PartialdefinitionContext.class,0);
		}
		public PartialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterPartial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitPartial(this);
		}
	}

	public final PartialContext partial() throws RecognitionException {
		PartialContext _localctx = new PartialContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_partial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__5);
			setState(189);
			partialdefinition();
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

	public static class PartialdefinitionContext extends ParserRuleContext {
		public Interface1Context interface1() {
			return getRuleContext(Interface1Context.class,0);
		}
		public DictionaryContext dictionary() {
			return getRuleContext(DictionaryContext.class,0);
		}
		public PartialdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterPartialdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitPartialdefinition(this);
		}
	}

	public final PartialdefinitionContext partialdefinition() throws RecognitionException {
		PartialdefinitionContext _localctx = new PartialdefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_partialdefinition);
		try {
			setState(193);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				interface1();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				dictionary();
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

	public static class Interface1MembersContext extends ParserRuleContext {
		public ExtendedattributeListContext extendedattributeList() {
			return getRuleContext(ExtendedattributeListContext.class,0);
		}
		public Interface1MemberContext interface1Member() {
			return getRuleContext(Interface1MemberContext.class,0);
		}
		public Interface1MembersContext interface1Members() {
			return getRuleContext(Interface1MembersContext.class,0);
		}
		public Interface1MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface1Members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterInterface1Members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitInterface1Members(this);
		}
	}

	public final Interface1MembersContext interface1Members() throws RecognitionException {
		Interface1MembersContext _localctx = new Interface1MembersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interface1Members);
		try {
			setState(200);
			switch (_input.LA(1)) {
			case T__13:
			case T__17:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__37:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				extendedattributeList();
				setState(196);
				interface1Member();
				setState(197);
				interface1Members();
				}
				break;
			case T__3:
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

	public static class Interface1MemberContext extends ParserRuleContext {
		public Const1Context const1() {
			return getRuleContext(Const1Context.class,0);
		}
		public AttributeOroperationContext attributeOroperation() {
			return getRuleContext(AttributeOroperationContext.class,0);
		}
		public Interface1MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface1Member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterInterface1Member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitInterface1Member(this);
		}
	}

	public final Interface1MemberContext interface1Member() throws RecognitionException {
		Interface1MemberContext _localctx = new Interface1MemberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interface1Member);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				const1();
				}
				break;
			case T__13:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				attributeOroperation();
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

	public static class DictionaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public DictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitDictionary(this);
		}
	}

	public final DictionaryContext dictionary() throws RecognitionException {
		DictionaryContext _localctx = new DictionaryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__6);
			setState(207);
			match(Identifier);
			setState(208);
			inheritance();
			setState(209);
			match(T__2);
			setState(210);
			dictionaryMembers();
			setState(211);
			match(T__3);
			setState(212);
			match(T__4);
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

	public static class DictionaryMembersContext extends ParserRuleContext {
		public ExtendedattributeListContext extendedattributeList() {
			return getRuleContext(ExtendedattributeListContext.class,0);
		}
		public DictionaryMemberContext dictionaryMember() {
			return getRuleContext(DictionaryMemberContext.class,0);
		}
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public DictionaryMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterDictionaryMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitDictionaryMembers(this);
		}
	}

	public final DictionaryMembersContext dictionaryMembers() throws RecognitionException {
		DictionaryMembersContext _localctx = new DictionaryMembersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dictionaryMembers);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case T__13:
			case T__37:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				extendedattributeList();
				setState(215);
				dictionaryMember();
				setState(216);
				dictionaryMembers();
				}
				break;
			case T__3:
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

	public static class DictionaryMemberContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public Default1Context default1() {
			return getRuleContext(Default1Context.class,0);
		}
		public DictionaryMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterDictionaryMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitDictionaryMember(this);
		}
	}

	public final DictionaryMemberContext dictionaryMember() throws RecognitionException {
		DictionaryMemberContext _localctx = new DictionaryMemberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dictionaryMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			type();
			setState(222);
			match(Identifier);
			setState(223);
			default1();
			setState(224);
			match(T__4);
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

	public static class Default1Context extends ParserRuleContext {
		public Default1ValueContext default1Value() {
			return getRuleContext(Default1ValueContext.class,0);
		}
		public Default1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitDefault1(this);
		}
	}

	public final Default1Context default1() throws RecognitionException {
		Default1Context _localctx = new Default1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_default1);
		try {
			setState(229);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(T__7);
				setState(227);
				default1Value();
				}
				break;
			case T__4:
			case T__12:
			case T__14:
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

	public static class Default1ValueContext extends ParserRuleContext {
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public TerminalNode String() { return getToken(WebIdlParser.String, 0); }
		public Default1ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default1Value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterDefault1Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitDefault1Value(this);
		}
	}

	public final Default1ValueContext default1Value() throws RecognitionException {
		Default1ValueContext _localctx = new Default1ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_default1Value);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				constValue();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(T__8);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(String);
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

	public static class ExceptionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public ExceptionMembersContext exceptionMembers() {
			return getRuleContext(ExceptionMembersContext.class,0);
		}
		public ExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitException(this);
		}
	}

	public final ExceptionContext exception() throws RecognitionException {
		ExceptionContext _localctx = new ExceptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exception);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__9);
			setState(237);
			match(Identifier);
			setState(238);
			inheritance();
			setState(239);
			match(T__2);
			setState(240);
			exceptionMembers();
			setState(241);
			match(T__3);
			setState(242);
			match(T__4);
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

	public static class ExceptionMembersContext extends ParserRuleContext {
		public ExtendedattributeListContext extendedattributeList() {
			return getRuleContext(ExtendedattributeListContext.class,0);
		}
		public ExceptionMemberContext exceptionMember() {
			return getRuleContext(ExceptionMemberContext.class,0);
		}
		public ExceptionMembersContext exceptionMembers() {
			return getRuleContext(ExceptionMembersContext.class,0);
		}
		public ExceptionMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExceptionMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExceptionMembers(this);
		}
	}

	public final ExceptionMembersContext exceptionMembers() throws RecognitionException {
		ExceptionMembersContext _localctx = new ExceptionMembersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exceptionMembers);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case T__13:
			case T__17:
			case T__37:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				extendedattributeList();
				setState(245);
				exceptionMember();
				setState(246);
				exceptionMembers();
				}
				break;
			case T__3:
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

	public static class InheritanceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitInheritance(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inheritance);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(T__10);
				setState(252);
				match(Identifier);
				}
				break;
			case T__2:
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

	public static class Enum1Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public EnumValueListContext enumValueList() {
			return getRuleContext(EnumValueListContext.class,0);
		}
		public Enum1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterEnum1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitEnum1(this);
		}
	}

	public final Enum1Context enum1() throws RecognitionException {
		Enum1Context _localctx = new Enum1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_enum1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__11);
			setState(257);
			match(Identifier);
			setState(258);
			match(T__2);
			setState(259);
			enumValueList();
			setState(260);
			match(T__3);
			setState(261);
			match(T__4);
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

	public static class EnumValueListContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(WebIdlParser.String, 0); }
		public EnumValuesContext enumValues() {
			return getRuleContext(EnumValuesContext.class,0);
		}
		public EnumValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterEnumValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitEnumValueList(this);
		}
	}

	public final EnumValueListContext enumValueList() throws RecognitionException {
		EnumValueListContext _localctx = new EnumValueListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumValueList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(String);
			setState(264);
			enumValues();
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

	public static class EnumValuesContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(WebIdlParser.String, 0); }
		public EnumValuesContext enumValues() {
			return getRuleContext(EnumValuesContext.class,0);
		}
		public EnumValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterEnumValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitEnumValues(this);
		}
	}

	public final EnumValuesContext enumValues() throws RecognitionException {
		EnumValuesContext _localctx = new EnumValuesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumValues);
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__12);
				setState(267);
				match(String);
				setState(268);
				enumValues();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__12);
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

	public static class CallbackRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallbackRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterCallbackRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitCallbackRest(this);
		}
	}

	public final CallbackRestContext callbackRest() throws RecognitionException {
		CallbackRestContext _localctx = new CallbackRestContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_callbackRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(Identifier);
			setState(274);
			match(T__7);
			setState(275);
			returntype();
			setState(276);
			match(T__13);
			setState(277);
			argumentList();
			setState(278);
			match(T__14);
			setState(279);
			match(T__4);
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

	public static class TypedefContext extends ParserRuleContext {
		public ExtendedattributeListContext extendedattributeList() {
			return getRuleContext(ExtendedattributeListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitTypedef(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__15);
			setState(282);
			extendedattributeList();
			setState(283);
			type();
			setState(284);
			match(Identifier);
			setState(285);
			match(T__4);
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

	public static class ImplementsStatementContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(WebIdlParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(WebIdlParser.Identifier, i);
		}
		public ImplementsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterImplementsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitImplementsStatement(this);
		}
	}

	public final ImplementsStatementContext implementsStatement() throws RecognitionException {
		ImplementsStatementContext _localctx = new ImplementsStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_implementsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(Identifier);
			setState(288);
			match(T__16);
			setState(289);
			match(Identifier);
			setState(290);
			match(T__4);
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

	public static class Const1Context extends ParserRuleContext {
		public ConsttypeContext consttype() {
			return getRuleContext(ConsttypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public Const1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterConst1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitConst1(this);
		}
	}

	public final Const1Context const1() throws RecognitionException {
		Const1Context _localctx = new Const1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_const1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__17);
			setState(293);
			consttype();
			setState(294);
			match(Identifier);
			setState(295);
			match(T__7);
			setState(296);
			constValue();
			setState(297);
			match(T__4);
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

	public static class ConstValueContext extends ParserRuleContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode Integer() { return getToken(WebIdlParser.Integer, 0); }
		public ConstValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterConstValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitConstValue(this);
		}
	}

	public final ConstValueContext constValue() throws RecognitionException {
		ConstValueContext _localctx = new ConstValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constValue);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				booleanLiteral();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				floatLiteral();
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(Integer);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(T__18);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode Float() { return getToken(WebIdlParser.Float, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floatLiteral);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(Float);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T__21);
				setState(309);
				match(T__22);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(T__23);
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

	public static class AttributeOroperationContext extends ParserRuleContext {
		public StringifierattributeOroperationContext stringifierattributeOroperation() {
			return getRuleContext(StringifierattributeOroperationContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AttributeOroperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOroperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterAttributeOroperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitAttributeOroperation(this);
		}
	}

	public final AttributeOroperationContext attributeOroperation() throws RecognitionException {
		AttributeOroperationContext _localctx = new AttributeOroperationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attributeOroperation);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(T__24);
				setState(315);
				stringifierattributeOroperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(T__25);
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

	public static class StringifierattributeOroperationContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public StringifierattributeOroperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringifierattributeOroperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterStringifierattributeOroperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitStringifierattributeOroperation(this);
		}
	}

	public final StringifierattributeOroperationContext stringifierattributeOroperation() throws RecognitionException {
		StringifierattributeOroperationContext _localctx = new StringifierattributeOroperationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stringifierattributeOroperation);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				attribute();
				}
				break;
			case T__13:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				operationRest();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(T__4);
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

	public static class AttributeContext extends ParserRuleContext {
		public QualifiersContext qualifiers() {
			return getRuleContext(QualifiersContext.class,0);
		}
		public InheritContext inherit() {
			return getRuleContext(InheritContext.class,0);
		}
		public ReadOnlyContext readOnly() {
			return getRuleContext(ReadOnlyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			qualifiers();
			setState(327);
			inherit();
			setState(328);
			readOnly();
			setState(329);
			match(T__26);
			setState(330);
			type();
			setState(331);
			match(Identifier);
			setState(332);
			match(T__4);
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

	public static class InheritContext extends ParserRuleContext {
		public InheritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterInherit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitInherit(this);
		}
	}

	public final InheritContext inherit() throws RecognitionException {
		InheritContext _localctx = new InheritContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inherit);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(T__27);
				}
				break;
			case T__26:
			case T__28:
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

	public static class ReadOnlyContext extends ParserRuleContext {
		public ReadOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readOnly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterReadOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitReadOnly(this);
		}
	}

	public final ReadOnlyContext readOnly() throws RecognitionException {
		ReadOnlyContext _localctx = new ReadOnlyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_readOnly);
		try {
			setState(340);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(T__28);
				}
				break;
			case T__26:
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

	public static class OperationContext extends ParserRuleContext {
		public QualifiersContext qualifiers() {
			return getRuleContext(QualifiersContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			qualifiers();
			setState(343);
			operationRest();
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

	public static class QualifiersContext extends ParserRuleContext {
		public SpecialsContext specials() {
			return getRuleContext(SpecialsContext.class,0);
		}
		public QualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitQualifiers(this);
		}
	}

	public final QualifiersContext qualifiers() throws RecognitionException {
		QualifiersContext _localctx = new QualifiersContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_qualifiers);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(T__29);
				}
				break;
			case T__13:
			case T__26:
			case T__27:
			case T__28:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				specials();
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

	public static class SpecialsContext extends ParserRuleContext {
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public SpecialsContext specials() {
			return getRuleContext(SpecialsContext.class,0);
		}
		public SpecialsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specials; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterSpecials(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitSpecials(this);
		}
	}

	public final SpecialsContext specials() throws RecognitionException {
		SpecialsContext _localctx = new SpecialsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_specials);
		try {
			setState(353);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				special();
				setState(350);
				specials();
				}
				break;
			case T__13:
			case T__26:
			case T__27:
			case T__28:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case Identifier:
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

	public static class SpecialContext extends ParserRuleContext {
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitSpecial(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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

	public static class OperationRestContext extends ParserRuleContext {
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public OptionalIdentifierContext optionalIdentifier() {
			return getRuleContext(OptionalIdentifierContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public OperationRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterOperationRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitOperationRest(this);
		}
	}

	public final OperationRestContext operationRest() throws RecognitionException {
		OperationRestContext _localctx = new OperationRestContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operationRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			returntype();
			setState(358);
			optionalIdentifier();
			setState(359);
			match(T__13);
			setState(360);
			argumentList();
			setState(361);
			match(T__14);
			setState(362);
			match(T__4);
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

	public static class OptionalIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public OptionalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterOptionalIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitOptionalIdentifier(this);
		}
	}

	public final OptionalIdentifierContext optionalIdentifier() throws RecognitionException {
		OptionalIdentifierContext _localctx = new OptionalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_optionalIdentifier);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(Identifier);
				}
				break;
			case T__13:
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_argumentList);
		try {
			setState(372);
			switch (_input.LA(1)) {
			case T__13:
			case T__35:
			case T__37:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				argument();
				setState(369);
				arguments();
				}
				break;
			case T__14:
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arguments);
		try {
			setState(379);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__12);
				setState(375);
				argument();
				setState(376);
				arguments();
				}
				break;
			case T__14:
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExtendedattributeListContext extendedattributeList() {
			return getRuleContext(ExtendedattributeListContext.class,0);
		}
		public OptionalOrRequiredargumentContext optionalOrRequiredargument() {
			return getRuleContext(OptionalOrRequiredargumentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			extendedattributeList();
			setState(382);
			optionalOrRequiredargument();
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

	public static class OptionalOrRequiredargumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentNameContext argumentName() {
			return getRuleContext(ArgumentNameContext.class,0);
		}
		public Default1Context default1() {
			return getRuleContext(Default1Context.class,0);
		}
		public EllipsisContext ellipsis() {
			return getRuleContext(EllipsisContext.class,0);
		}
		public OptionalOrRequiredargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalOrRequiredargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterOptionalOrRequiredargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitOptionalOrRequiredargument(this);
		}
	}

	public final OptionalOrRequiredargumentContext optionalOrRequiredargument() throws RecognitionException {
		OptionalOrRequiredargumentContext _localctx = new OptionalOrRequiredargumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_optionalOrRequiredargument);
		try {
			setState(393);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(T__35);
				setState(385);
				type();
				setState(386);
				argumentName();
				setState(387);
				default1();
				}
				break;
			case T__13:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				type();
				setState(390);
				ellipsis();
				setState(391);
				argumentName();
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

	public static class ArgumentNameContext extends ParserRuleContext {
		public ArgumentNameKeywordContext argumentNameKeyword() {
			return getRuleContext(ArgumentNameKeywordContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitArgumentName(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_argumentName);
		try {
			setState(397);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__11:
			case T__15:
			case T__16:
			case T__17:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				argumentNameKeyword();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(Identifier);
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

	public static class EllipsisContext extends ParserRuleContext {
		public EllipsisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipsis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterEllipsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitEllipsis(this);
		}
	}

	public final EllipsisContext ellipsis() throws RecognitionException {
		EllipsisContext _localctx = new EllipsisContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ellipsis);
		try {
			setState(401);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(T__36);
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__11:
			case T__15:
			case T__16:
			case T__17:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__58:
			case Identifier:
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

	public static class ExceptionMemberContext extends ParserRuleContext {
		public Const1Context const1() {
			return getRuleContext(Const1Context.class,0);
		}
		public ExceptionFieldContext exceptionField() {
			return getRuleContext(ExceptionFieldContext.class,0);
		}
		public ExceptionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExceptionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExceptionMember(this);
		}
	}

	public final ExceptionMemberContext exceptionMember() throws RecognitionException {
		ExceptionMemberContext _localctx = new ExceptionMemberContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exceptionMember);
		try {
			setState(405);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				const1();
				}
				break;
			case T__13:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				exceptionField();
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

	public static class ExceptionFieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public ExceptionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExceptionField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExceptionField(this);
		}
	}

	public final ExceptionFieldContext exceptionField() throws RecognitionException {
		ExceptionFieldContext _localctx = new ExceptionFieldContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exceptionField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			type();
			setState(408);
			match(Identifier);
			setState(409);
			match(T__4);
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

	public static class ExtendedattributeListContext extends ParserRuleContext {
		public ExtendedattributeContext extendedattribute() {
			return getRuleContext(ExtendedattributeContext.class,0);
		}
		public ExtendedattributesContext extendedattributes() {
			return getRuleContext(ExtendedattributesContext.class,0);
		}
		public ExtendedattributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedattributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExtendedattributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExtendedattributeList(this);
		}
	}

	public final ExtendedattributeListContext extendedattributeList() throws RecognitionException {
		ExtendedattributeListContext _localctx = new ExtendedattributeListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_extendedattributeList);
		try {
			setState(417);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(T__37);
				setState(412);
				extendedattribute();
				setState(413);
				extendedattributes();
				setState(414);
				match(T__38);
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__11:
			case T__13:
			case T__15:
			case T__17:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case Identifier:
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

	public static class ExtendedattributesContext extends ParserRuleContext {
		public ExtendedattributeContext extendedattribute() {
			return getRuleContext(ExtendedattributeContext.class,0);
		}
		public ExtendedattributesContext extendedattributes() {
			return getRuleContext(ExtendedattributesContext.class,0);
		}
		public ExtendedattributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedattributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExtendedattributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExtendedattributes(this);
		}
	}

	public final ExtendedattributesContext extendedattributes() throws RecognitionException {
		ExtendedattributesContext _localctx = new ExtendedattributesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_extendedattributes);
		try {
			setState(424);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(T__12);
				setState(420);
				extendedattribute();
				setState(421);
				extendedattributes();
				}
				break;
			case T__38:
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

	public static class ExtendedattributeContext extends ParserRuleContext {
		public ExtendedattributeInnerContext extendedattributeInner() {
			return getRuleContext(ExtendedattributeInnerContext.class,0);
		}
		public ExtendedattributeRestContext extendedattributeRest() {
			return getRuleContext(ExtendedattributeRestContext.class,0);
		}
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public ExtendedattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExtendedattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExtendedattribute(this);
		}
	}

	public final ExtendedattributeContext extendedattribute() throws RecognitionException {
		ExtendedattributeContext _localctx = new ExtendedattributeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_extendedattribute);
		try {
			setState(444);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(T__13);
				setState(427);
				extendedattributeInner();
				setState(428);
				match(T__14);
				setState(429);
				extendedattributeRest();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(T__37);
				setState(432);
				extendedattributeInner();
				setState(433);
				match(T__38);
				setState(434);
				extendedattributeRest();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(T__2);
				setState(437);
				extendedattributeInner();
				setState(438);
				match(T__3);
				setState(439);
				extendedattributeRest();
				}
				break;
			case T__0:
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__9:
			case T__10:
			case T__11:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case Identifier:
			case Integer:
			case Other:
			case String:
			case Float:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				other();
				setState(442);
				extendedattributeRest();
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

	public static class ExtendedattributeRestContext extends ParserRuleContext {
		public ExtendedattributeContext extendedattribute() {
			return getRuleContext(ExtendedattributeContext.class,0);
		}
		public ExtendedattributeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedattributeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExtendedattributeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExtendedattributeRest(this);
		}
	}

	public final ExtendedattributeRestContext extendedattributeRest() throws RecognitionException {
		ExtendedattributeRestContext _localctx = new ExtendedattributeRestContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_extendedattributeRest);
		try {
			setState(448);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case Identifier:
			case Integer:
			case Other:
			case String:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				extendedattribute();
				}
				break;
			case T__12:
			case T__38:
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

	public static class ExtendedattributeInnerContext extends ParserRuleContext {
		public List<ExtendedattributeInnerContext> extendedattributeInner() {
			return getRuleContexts(ExtendedattributeInnerContext.class);
		}
		public ExtendedattributeInnerContext extendedattributeInner(int i) {
			return getRuleContext(ExtendedattributeInnerContext.class,i);
		}
		public OtherOrCommaContext otherOrComma() {
			return getRuleContext(OtherOrCommaContext.class,0);
		}
		public ExtendedattributeInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedattributeInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExtendedattributeInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExtendedattributeInner(this);
		}
	}

	public final ExtendedattributeInnerContext extendedattributeInner() throws RecognitionException {
		ExtendedattributeInnerContext _localctx = new ExtendedattributeInnerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_extendedattributeInner);
		try {
			setState(469);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(T__13);
				setState(451);
				extendedattributeInner();
				setState(452);
				match(T__14);
				setState(453);
				extendedattributeInner();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(T__37);
				setState(456);
				extendedattributeInner();
				setState(457);
				match(T__38);
				setState(458);
				extendedattributeInner();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				match(T__2);
				setState(461);
				extendedattributeInner();
				setState(462);
				match(T__3);
				setState(463);
				extendedattributeInner();
				}
				break;
			case T__0:
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case Identifier:
			case Integer:
			case Other:
			case String:
			case Float:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				otherOrComma();
				setState(466);
				extendedattributeInner();
				}
				break;
			case T__3:
			case T__14:
			case T__38:
				enterOuterAlt(_localctx, 5);
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

	public static class OtherContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(WebIdlParser.Integer, 0); }
		public TerminalNode Float() { return getToken(WebIdlParser.Float, 0); }
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public TerminalNode String() { return getToken(WebIdlParser.String, 0); }
		public TerminalNode Other() { return getToken(WebIdlParser.Other, 0); }
		public ArgumentNameKeywordContext argumentNameKeyword() {
			return getRuleContext(ArgumentNameKeywordContext.class,0);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitOther(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_other);
		try {
			setState(507);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(Integer);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(Float);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(Identifier);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				match(String);
				}
				break;
			case Other:
				enterOuterAlt(_localctx, 5);
				{
				setState(475);
				match(Other);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(476);
				match(T__21);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 7);
				{
				setState(477);
				match(T__39);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 8);
				{
				setState(478);
				match(T__36);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 9);
				{
				setState(479);
				match(T__10);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 10);
				{
				setState(480);
				match(T__4);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 11);
				{
				setState(481);
				match(T__40);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 12);
				{
				setState(482);
				match(T__7);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 13);
				{
				setState(483);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 14);
				{
				setState(484);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 15);
				{
				setState(485);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 16);
				{
				setState(486);
				match(T__44);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 17);
				{
				setState(487);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 18);
				{
				setState(488);
				match(T__23);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 19);
				{
				setState(489);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 20);
				{
				setState(490);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 21);
				{
				setState(491);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 22);
				{
				setState(492);
				match(T__48);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 23);
				{
				setState(493);
				match(T__20);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 24);
				{
				setState(494);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 25);
				{
				setState(495);
				match(T__50);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 26);
				{
				setState(496);
				match(T__18);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 27);
				{
				setState(497);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 28);
				{
				setState(498);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 29);
				{
				setState(499);
				match(T__53);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 30);
				{
				setState(500);
				match(T__35);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 31);
				{
				setState(501);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 32);
				{
				setState(502);
				match(T__55);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 33);
				{
				setState(503);
				match(T__19);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 34);
				{
				setState(504);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 35);
				{
				setState(505);
				match(T__57);
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__11:
			case T__15:
			case T__16:
			case T__17:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__58:
				enterOuterAlt(_localctx, 36);
				{
				setState(506);
				argumentNameKeyword();
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

	public static class ArgumentNameKeywordContext extends ParserRuleContext {
		public ArgumentNameKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentNameKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterArgumentNameKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitArgumentNameKeyword(this);
		}
	}

	public final ArgumentNameKeywordContext argumentNameKeyword() throws RecognitionException {
		ArgumentNameKeywordContext _localctx = new ArgumentNameKeywordContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_argumentNameKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__58))) != 0)) ) {
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

	public static class OtherOrCommaContext extends ParserRuleContext {
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public OtherOrCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherOrComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterOtherOrComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitOtherOrComma(this);
		}
	}

	public final OtherOrCommaContext otherOrComma() throws RecognitionException {
		OtherOrCommaContext _localctx = new OtherOrCommaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_otherOrComma);
		try {
			setState(513);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__9:
			case T__10:
			case T__11:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case Identifier:
			case Integer:
			case Other:
			case String:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				other();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(T__12);
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

	public static class TypeContext extends ParserRuleContext {
		public SingletypeContext singletype() {
			return getRuleContext(SingletypeContext.class,0);
		}
		public UniontypeContext uniontype() {
			return getRuleContext(UniontypeContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_type);
		try {
			setState(519);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				singletype();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				uniontype();
				setState(517);
				typeSuffix();
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

	public static class SingletypeContext extends ParserRuleContext {
		public NonAnytypeContext nonAnytype() {
			return getRuleContext(NonAnytypeContext.class,0);
		}
		public TypeSuffixStartingWithArrayContext typeSuffixStartingWithArray() {
			return getRuleContext(TypeSuffixStartingWithArrayContext.class,0);
		}
		public SingletypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singletype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterSingletype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitSingletype(this);
		}
	}

	public final SingletypeContext singletype() throws RecognitionException {
		SingletypeContext _localctx = new SingletypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_singletype);
		try {
			setState(524);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				nonAnytype();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(T__45);
				setState(523);
				typeSuffixStartingWithArray();
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

	public static class UniontypeContext extends ParserRuleContext {
		public List<UnionMembertypeContext> unionMembertype() {
			return getRuleContexts(UnionMembertypeContext.class);
		}
		public UnionMembertypeContext unionMembertype(int i) {
			return getRuleContext(UnionMembertypeContext.class,i);
		}
		public UnionMembertypesContext unionMembertypes() {
			return getRuleContext(UnionMembertypesContext.class,0);
		}
		public UniontypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniontype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterUniontype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitUniontype(this);
		}
	}

	public final UniontypeContext uniontype() throws RecognitionException {
		UniontypeContext _localctx = new UniontypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_uniontype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__13);
			setState(527);
			unionMembertype();
			setState(528);
			match(T__53);
			setState(529);
			unionMembertype();
			setState(530);
			unionMembertypes();
			setState(531);
			match(T__14);
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

	public static class UnionMembertypeContext extends ParserRuleContext {
		public NonAnytypeContext nonAnytype() {
			return getRuleContext(NonAnytypeContext.class,0);
		}
		public UniontypeContext uniontype() {
			return getRuleContext(UniontypeContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public UnionMembertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMembertype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterUnionMembertype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitUnionMembertype(this);
		}
	}

	public final UnionMembertypeContext unionMembertype() throws RecognitionException {
		UnionMembertypeContext _localctx = new UnionMembertypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unionMembertype);
		try {
			setState(541);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				nonAnytype();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				uniontype();
				setState(535);
				typeSuffix();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				match(T__45);
				setState(538);
				match(T__37);
				setState(539);
				match(T__38);
				setState(540);
				typeSuffix();
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

	public static class UnionMembertypesContext extends ParserRuleContext {
		public UnionMembertypeContext unionMembertype() {
			return getRuleContext(UnionMembertypeContext.class,0);
		}
		public UnionMembertypesContext unionMembertypes() {
			return getRuleContext(UnionMembertypesContext.class,0);
		}
		public UnionMembertypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMembertypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterUnionMembertypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitUnionMembertypes(this);
		}
	}

	public final UnionMembertypesContext unionMembertypes() throws RecognitionException {
		UnionMembertypesContext _localctx = new UnionMembertypesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unionMembertypes);
		try {
			setState(548);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(T__53);
				setState(544);
				unionMembertype();
				setState(545);
				unionMembertypes();
				}
				break;
			case T__14:
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

	public static class NonAnytypeContext extends ParserRuleContext {
		public PrimitivetypeContext primitivetype() {
			return getRuleContext(PrimitivetypeContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Null1Context null1() {
			return getRuleContext(Null1Context.class,0);
		}
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public NonAnytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonAnytype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterNonAnytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitNonAnytype(this);
		}
	}

	public final NonAnytypeContext nonAnytype() throws RecognitionException {
		NonAnytypeContext _localctx = new NonAnytypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nonAnytype);
		try {
			setState(574);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				primitivetype();
				setState(551);
				typeSuffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(T__44);
				setState(554);
				typeSuffix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				match(T__54);
				setState(556);
				match(T__40);
				setState(557);
				type();
				setState(558);
				match(T__41);
				setState(559);
				null1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(561);
				match(Identifier);
				setState(562);
				typeSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				match(Identifier);
				setState(564);
				match(T__40);
				setState(565);
				type();
				setState(566);
				match(T__41);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(568);
				match(Identifier);
				setState(569);
				match(T__59);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(570);
				match(T__51);
				setState(571);
				typeSuffix();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(572);
				match(T__43);
				setState(573);
				typeSuffix();
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

	public static class ConsttypeContext extends ParserRuleContext {
		public PrimitivetypeContext primitivetype() {
			return getRuleContext(PrimitivetypeContext.class,0);
		}
		public Null1Context null1() {
			return getRuleContext(Null1Context.class,0);
		}
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public ConsttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consttype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterConsttype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitConsttype(this);
		}
	}

	public final ConsttypeContext consttype() throws RecognitionException {
		ConsttypeContext _localctx = new ConsttypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_consttype);
		try {
			setState(581);
			switch (_input.LA(1)) {
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__52:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				primitivetype();
				setState(577);
				null1();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(Identifier);
				setState(580);
				null1();
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

	public static class PrimitivetypeContext extends ParserRuleContext {
		public UnsignedintegertypeContext unsignedintegertype() {
			return getRuleContext(UnsignedintegertypeContext.class,0);
		}
		public UnrestrictedfloattypeContext unrestrictedfloattype() {
			return getRuleContext(UnrestrictedfloattypeContext.class,0);
		}
		public PrimitivetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterPrimitivetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitPrimitivetype(this);
		}
	}

	public final PrimitivetypeContext primitivetype() throws RecognitionException {
		PrimitivetypeContext _localctx = new PrimitivetypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_primitivetype);
		try {
			setState(588);
			switch (_input.LA(1)) {
			case T__50:
			case T__55:
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				unsignedintegertype();
				}
				break;
			case T__48:
			case T__58:
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				unrestrictedfloattype();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(T__47);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				match(T__52);
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

	public static class UnrestrictedfloattypeContext extends ParserRuleContext {
		public FloattypeContext floattype() {
			return getRuleContext(FloattypeContext.class,0);
		}
		public UnrestrictedfloattypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unrestrictedfloattype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterUnrestrictedfloattype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitUnrestrictedfloattype(this);
		}
	}

	public final UnrestrictedfloattypeContext unrestrictedfloattype() throws RecognitionException {
		UnrestrictedfloattypeContext _localctx = new UnrestrictedfloattypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unrestrictedfloattype);
		try {
			setState(593);
			switch (_input.LA(1)) {
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(T__58);
				setState(591);
				floattype();
				}
				break;
			case T__48:
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				floattype();
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

	public static class FloattypeContext extends ParserRuleContext {
		public FloattypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floattype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterFloattype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitFloattype(this);
		}
	}

	public final FloattypeContext floattype() throws RecognitionException {
		FloattypeContext _localctx = new FloattypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_floattype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__60) ) {
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

	public static class UnsignedintegertypeContext extends ParserRuleContext {
		public IntegertypeContext integertype() {
			return getRuleContext(IntegertypeContext.class,0);
		}
		public UnsignedintegertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedintegertype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterUnsignedintegertype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitUnsignedintegertype(this);
		}
	}

	public final UnsignedintegertypeContext unsignedintegertype() throws RecognitionException {
		UnsignedintegertypeContext _localctx = new UnsignedintegertypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unsignedintegertype);
		try {
			setState(600);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(T__56);
				setState(598);
				integertype();
				}
				break;
			case T__50:
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				integertype();
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

	public static class IntegertypeContext extends ParserRuleContext {
		public OptionalLongContext optionalLong() {
			return getRuleContext(OptionalLongContext.class,0);
		}
		public IntegertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integertype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterIntegertype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitIntegertype(this);
		}
	}

	public final IntegertypeContext integertype() throws RecognitionException {
		IntegertypeContext _localctx = new IntegertypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_integertype);
		try {
			setState(605);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(T__55);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(T__50);
				setState(604);
				optionalLong();
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

	public static class OptionalLongContext extends ParserRuleContext {
		public OptionalLongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalLong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterOptionalLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitOptionalLong(this);
		}
	}

	public final OptionalLongContext optionalLong() throws RecognitionException {
		OptionalLongContext _localctx = new OptionalLongContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_optionalLong);
		try {
			setState(609);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(T__50);
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__37:
			case T__41:
			case T__42:
			case T__53:
			case T__58:
			case Identifier:
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

	public static class TypeSuffixContext extends ParserRuleContext {
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TypeSuffixStartingWithArrayContext typeSuffixStartingWithArray() {
			return getRuleContext(TypeSuffixStartingWithArrayContext.class,0);
		}
		public TypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterTypeSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitTypeSuffix(this);
		}
	}

	public final TypeSuffixContext typeSuffix() throws RecognitionException {
		TypeSuffixContext _localctx = new TypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeSuffix);
		try {
			setState(617);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				match(T__37);
				setState(612);
				match(T__38);
				setState(613);
				typeSuffix();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(T__42);
				setState(615);
				typeSuffixStartingWithArray();
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__41:
			case T__53:
			case T__58:
			case Identifier:
				enterOuterAlt(_localctx, 3);
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

	public static class TypeSuffixStartingWithArrayContext extends ParserRuleContext {
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TypeSuffixStartingWithArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSuffixStartingWithArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterTypeSuffixStartingWithArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitTypeSuffixStartingWithArray(this);
		}
	}

	public final TypeSuffixStartingWithArrayContext typeSuffixStartingWithArray() throws RecognitionException {
		TypeSuffixStartingWithArrayContext _localctx = new TypeSuffixStartingWithArrayContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typeSuffixStartingWithArray);
		try {
			setState(623);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(T__37);
				setState(620);
				match(T__38);
				setState(621);
				typeSuffix();
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__41:
			case T__53:
			case T__58:
			case Identifier:
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

	public static class Null1Context extends ParserRuleContext {
		public Null1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterNull1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitNull1(this);
		}
	}

	public final Null1Context null1() throws RecognitionException {
		Null1Context _localctx = new Null1Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_null1);
		try {
			setState(627);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(T__42);
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__41:
			case T__53:
			case T__58:
			case Identifier:
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

	public static class ReturntypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterReturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitReturntype(this);
		}
	}

	public final ReturntypeContext returntype() throws RecognitionException {
		ReturntypeContext _localctx = new ReturntypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_returntype);
		try {
			setState(631);
			switch (_input.LA(1)) {
			case T__13:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				type();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(T__57);
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

	public static class ExtendedattributeNoArgsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public ExtendedattributeNoArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedattributeNoArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExtendedattributeNoArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExtendedattributeNoArgs(this);
		}
	}

	public final ExtendedattributeNoArgsContext extendedattributeNoArgs() throws RecognitionException {
		ExtendedattributeNoArgsContext _localctx = new ExtendedattributeNoArgsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_extendedattributeNoArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
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

	public static class ExtendedattributeArgListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WebIdlParser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExtendedattributeArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedattributeArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExtendedattributeArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExtendedattributeArgList(this);
		}
	}

	public final ExtendedattributeArgListContext extendedattributeArgList() throws RecognitionException {
		ExtendedattributeArgListContext _localctx = new ExtendedattributeArgListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_extendedattributeArgList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(Identifier);
			setState(636);
			match(T__13);
			setState(637);
			argumentList();
			setState(638);
			match(T__14);
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

	public static class ExtendedattributeIdentContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(WebIdlParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(WebIdlParser.Identifier, i);
		}
		public ExtendedattributeIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedattributeIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExtendedattributeIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExtendedattributeIdent(this);
		}
	}

	public final ExtendedattributeIdentContext extendedattributeIdent() throws RecognitionException {
		ExtendedattributeIdentContext _localctx = new ExtendedattributeIdentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_extendedattributeIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(Identifier);
			setState(641);
			match(T__7);
			setState(642);
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

	public static class ExtendedattributeNamedArgListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(WebIdlParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(WebIdlParser.Identifier, i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExtendedattributeNamedArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedattributeNamedArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).enterExtendedattributeNamedArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIdlListener ) ((WebIdlListener)listener).exitExtendedattributeNamedArgList(this);
		}
	}

	public final ExtendedattributeNamedArgListContext extendedattributeNamedArgList() throws RecognitionException {
		ExtendedattributeNamedArgListContext _localctx = new ExtendedattributeNamedArgListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_extendedattributeNamedArgList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(Identifier);
			setState(645);
			match(T__7);
			setState(646);
			match(Identifier);
			setState(647);
			match(T__13);
			setState(648);
			argumentList();
			setState(649);
			match(T__14);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u028e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\5\2\u009e\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\u00a7\n\3\3\4\3\4\3\4\5\4\u00ac\n\4\3\5\3\5\5\5\u00b0"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\7\3\7"+
		"\3\7\3\b\3\b\5\b\u00c4\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00cb\n\t\3\n\3\n\5"+
		"\n\u00cf\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00de\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00e8\n\16\3"+
		"\17\3\17\3\17\5\17\u00ed\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00fc\n\21\3\22\3\22\3\22\5\22\u0101\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0112\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0132\n\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u013b\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0142\n"+
		"\35\3\36\3\36\3\36\5\36\u0147\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \5 \u0153\n \3!\3!\5!\u0157\n!\3\"\3\"\3\"\3#\3#\5#\u015e\n"+
		"#\3$\3$\3$\3$\5$\u0164\n$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\5\'\u0171"+
		"\n\'\3(\3(\3(\3(\5(\u0177\n(\3)\3)\3)\3)\3)\5)\u017e\n)\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u018c\n+\3,\3,\5,\u0190\n,\3-\3-\5-\u0194\n"+
		"-\3.\3.\5.\u0198\n.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01a4"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\5\61\u01ab\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u01bf\n\62\3\63\3\63\5\63\u01c3\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01d8"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01fe\n\65\3\66\3\66"+
		"\3\67\3\67\5\67\u0204\n\67\38\38\38\38\58\u020a\n8\39\39\39\59\u020f\n"+
		"9\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0220\n;\3<\3<\3<\3"+
		"<\3<\5<\u0227\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\5=\u0241\n=\3>\3>\3>\3>\3>\5>\u0248\n>\3?\3?\3?\3"+
		"?\3?\5?\u024f\n?\3@\3@\3@\5@\u0254\n@\3A\3A\3B\3B\3B\5B\u025b\nB\3C\3"+
		"C\3C\5C\u0260\nC\3D\3D\5D\u0264\nD\3E\3E\3E\3E\3E\3E\5E\u026c\nE\3F\3"+
		"F\3F\3F\5F\u0272\nF\3G\3G\5G\u0276\nG\3H\3H\5H\u027a\nH\3I\3I\3J\3J\3"+
		"J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\2\2M\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\2\6\3\2\26\27\3\2!%\13\2\3\4\b\t\f\f\16\16\22\24\33\33\35\36 %"+
		"==\4\2\63\63??\u02b5\2\u009d\3\2\2\2\4\u00a6\3\2\2\2\6\u00ab\3\2\2\2\b"+
		"\u00af\3\2\2\2\n\u00bc\3\2\2\2\f\u00be\3\2\2\2\16\u00c3\3\2\2\2\20\u00ca"+
		"\3\2\2\2\22\u00ce\3\2\2\2\24\u00d0\3\2\2\2\26\u00dd\3\2\2\2\30\u00df\3"+
		"\2\2\2\32\u00e7\3\2\2\2\34\u00ec\3\2\2\2\36\u00ee\3\2\2\2 \u00fb\3\2\2"+
		"\2\"\u0100\3\2\2\2$\u0102\3\2\2\2&\u0109\3\2\2\2(\u0111\3\2\2\2*\u0113"+
		"\3\2\2\2,\u011b\3\2\2\2.\u0121\3\2\2\2\60\u0126\3\2\2\2\62\u0131\3\2\2"+
		"\2\64\u0133\3\2\2\2\66\u013a\3\2\2\28\u0141\3\2\2\2:\u0146\3\2\2\2<\u0148"+
		"\3\2\2\2>\u0152\3\2\2\2@\u0156\3\2\2\2B\u0158\3\2\2\2D\u015d\3\2\2\2F"+
		"\u0163\3\2\2\2H\u0165\3\2\2\2J\u0167\3\2\2\2L\u0170\3\2\2\2N\u0176\3\2"+
		"\2\2P\u017d\3\2\2\2R\u017f\3\2\2\2T\u018b\3\2\2\2V\u018f\3\2\2\2X\u0193"+
		"\3\2\2\2Z\u0197\3\2\2\2\\\u0199\3\2\2\2^\u01a3\3\2\2\2`\u01aa\3\2\2\2"+
		"b\u01be\3\2\2\2d\u01c2\3\2\2\2f\u01d7\3\2\2\2h\u01fd\3\2\2\2j\u01ff\3"+
		"\2\2\2l\u0203\3\2\2\2n\u0209\3\2\2\2p\u020e\3\2\2\2r\u0210\3\2\2\2t\u021f"+
		"\3\2\2\2v\u0226\3\2\2\2x\u0240\3\2\2\2z\u0247\3\2\2\2|\u024e\3\2\2\2~"+
		"\u0253\3\2\2\2\u0080\u0255\3\2\2\2\u0082\u025a\3\2\2\2\u0084\u025f\3\2"+
		"\2\2\u0086\u0263\3\2\2\2\u0088\u026b\3\2\2\2\u008a\u0271\3\2\2\2\u008c"+
		"\u0275\3\2\2\2\u008e\u0279\3\2\2\2\u0090\u027b\3\2\2\2\u0092\u027d\3\2"+
		"\2\2\u0094\u0282\3\2\2\2\u0096\u0286\3\2\2\2\u0098\u0099\5^\60\2\u0099"+
		"\u009a\5\4\3\2\u009a\u009b\5\2\2\2\u009b\u009e\3\2\2\2\u009c\u009e\7\2"+
		"\2\3\u009d\u0098\3\2\2\2\u009d\u009c\3\2\2\2\u009e\3\3\2\2\2\u009f\u00a7"+
		"\5\6\4\2\u00a0\u00a7\5\f\7\2\u00a1\u00a7\5\24\13\2\u00a2\u00a7\5\36\20"+
		"\2\u00a3\u00a7\5$\23\2\u00a4\u00a7\5,\27\2\u00a5\u00a7\5.\30\2\u00a6\u009f"+
		"\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\5\3\2\2\2"+
		"\u00a8\u00a9\7\3\2\2\u00a9\u00ac\5\b\5\2\u00aa\u00ac\5\n\6\2\u00ab\u00a8"+
		"\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\7\3\2\2\2\u00ad\u00b0\5*\26\2\u00ae"+
		"\u00b0\5\n\6\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\t\3\2\2\2"+
		"\u00b1\u00b2\7\4\2\2\u00b2\u00b3\7B\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b5"+
		"\7\5\2\2\u00b5\u00b6\5\20\t\2\u00b6\u00b7\7\6\2\2\u00b7\u00b8\7\7\2\2"+
		"\u00b8\u00bd\3\2\2\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\7B\2\2\u00bb\u00bd"+
		"\7\7\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\13\3\2\2\2\u00be"+
		"\u00bf\7\b\2\2\u00bf\u00c0\5\16\b\2\u00c0\r\3\2\2\2\u00c1\u00c4\5\n\6"+
		"\2\u00c2\u00c4\5\24\13\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\17\3\2\2\2\u00c5\u00c6\5^\60\2\u00c6\u00c7\5\22\n\2\u00c7\u00c8\5\20"+
		"\t\2\u00c8\u00cb\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\21\3\2\2\2\u00cc\u00cf\5\60\31\2\u00cd\u00cf\58\35"+
		"\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\23\3\2\2\2\u00d0\u00d1"+
		"\7\t\2\2\u00d1\u00d2\7B\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d4\7\5\2\2\u00d4"+
		"\u00d5\5\26\f\2\u00d5\u00d6\7\6\2\2\u00d6\u00d7\7\7\2\2\u00d7\25\3\2\2"+
		"\2\u00d8\u00d9\5^\60\2\u00d9\u00da\5\30\r\2\u00da\u00db\5\26\f\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\27\3\2\2\2\u00df\u00e0\5n8\2\u00e0\u00e1\7B\2\2\u00e1\u00e2"+
		"\5\32\16\2\u00e2\u00e3\7\7\2\2\u00e3\31\3\2\2\2\u00e4\u00e5\7\n\2\2\u00e5"+
		"\u00e8\5\34\17\2\u00e6\u00e8\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\33\3\2\2\2\u00e9\u00ed\5\62\32\2\u00ea\u00ed\7\13\2\2\u00eb"+
		"\u00ed\7E\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ed\35\3\2\2\2\u00ee\u00ef\7\f\2\2\u00ef\u00f0\7B\2\2\u00f0\u00f1"+
		"\5\"\22\2\u00f1\u00f2\7\5\2\2\u00f2\u00f3\5 \21\2\u00f3\u00f4\7\6\2\2"+
		"\u00f4\u00f5\7\7\2\2\u00f5\37\3\2\2\2\u00f6\u00f7\5^\60\2\u00f7\u00f8"+
		"\5Z.\2\u00f8\u00f9\5 \21\2\u00f9\u00fc\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f6\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc!\3\2\2\2\u00fd\u00fe\7\r\2\2"+
		"\u00fe\u0101\7B\2\2\u00ff\u0101\3\2\2\2\u0100\u00fd\3\2\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101#\3\2\2\2\u0102\u0103\7\16\2\2\u0103\u0104\7B\2\2\u0104"+
		"\u0105\7\5\2\2\u0105\u0106\5&\24\2\u0106\u0107\7\6\2\2\u0107\u0108\7\7"+
		"\2\2\u0108%\3\2\2\2\u0109\u010a\7E\2\2\u010a\u010b\5(\25\2\u010b\'\3\2"+
		"\2\2\u010c\u010d\7\17\2\2\u010d\u010e\7E\2\2\u010e\u0112\5(\25\2\u010f"+
		"\u0112\7\17\2\2\u0110\u0112\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010f\3"+
		"\2\2\2\u0111\u0110\3\2\2\2\u0112)\3\2\2\2\u0113\u0114\7B\2\2\u0114\u0115"+
		"\7\n\2\2\u0115\u0116\5\u008eH\2\u0116\u0117\7\20\2\2\u0117\u0118\5N(\2"+
		"\u0118\u0119\7\21\2\2\u0119\u011a\7\7\2\2\u011a+\3\2\2\2\u011b\u011c\7"+
		"\22\2\2\u011c\u011d\5^\60\2\u011d\u011e\5n8\2\u011e\u011f\7B\2\2\u011f"+
		"\u0120\7\7\2\2\u0120-\3\2\2\2\u0121\u0122\7B\2\2\u0122\u0123\7\23\2\2"+
		"\u0123\u0124\7B\2\2\u0124\u0125\7\7\2\2\u0125/\3\2\2\2\u0126\u0127\7\24"+
		"\2\2\u0127\u0128\5z>\2\u0128\u0129\7B\2\2\u0129\u012a\7\n\2\2\u012a\u012b"+
		"\5\62\32\2\u012b\u012c\7\7\2\2\u012c\61\3\2\2\2\u012d\u0132\5\64\33\2"+
		"\u012e\u0132\5\66\34\2\u012f\u0132\7C\2\2\u0130\u0132\7\25\2\2\u0131\u012d"+
		"\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\63\3\2\2\2\u0133\u0134\t\2\2\2\u0134\65\3\2\2\2\u0135\u013b\7F\2\2\u0136"+
		"\u0137\7\30\2\2\u0137\u013b\7\31\2\2\u0138\u013b\7\31\2\2\u0139\u013b"+
		"\7\32\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0138\3\2\2\2"+
		"\u013a\u0139\3\2\2\2\u013b\67\3\2\2\2\u013c\u013d\7\33\2\2\u013d\u0142"+
		"\5:\36\2\u013e\u0142\5<\37\2\u013f\u0142\5B\"\2\u0140\u0142\7\34\2\2\u0141"+
		"\u013c\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2"+
		"\2\2\u01429\3\2\2\2\u0143\u0147\5<\37\2\u0144\u0147\5J&\2\u0145\u0147"+
		"\7\7\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		";\3\2\2\2\u0148\u0149\5D#\2\u0149\u014a\5> \2\u014a\u014b\5@!\2\u014b"+
		"\u014c\7\35\2\2\u014c\u014d\5n8\2\u014d\u014e\7B\2\2\u014e\u014f\7\7\2"+
		"\2\u014f=\3\2\2\2\u0150\u0153\7\36\2\2\u0151\u0153\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0151\3\2\2\2\u0153?\3\2\2\2\u0154\u0157\7\37\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157A\3\2\2\2"+
		"\u0158\u0159\5D#\2\u0159\u015a\5J&\2\u015aC\3\2\2\2\u015b\u015e\7 \2\2"+
		"\u015c\u015e\5F$\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015eE\3\2"+
		"\2\2\u015f\u0160\5H%\2\u0160\u0161\5F$\2\u0161\u0164\3\2\2\2\u0162\u0164"+
		"\3\2\2\2\u0163\u015f\3\2\2\2\u0163\u0162\3\2\2\2\u0164G\3\2\2\2\u0165"+
		"\u0166\t\3\2\2\u0166I\3\2\2\2\u0167\u0168\5\u008eH\2\u0168\u0169\5L\'"+
		"\2\u0169\u016a\7\20\2\2\u016a\u016b\5N(\2\u016b\u016c\7\21\2\2\u016c\u016d"+
		"\7\7\2\2\u016dK\3\2\2\2\u016e\u0171\7B\2\2\u016f\u0171\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u016f\3\2\2\2\u0171M\3\2\2\2\u0172\u0173\5R*\2\u0173\u0174"+
		"\5P)\2\u0174\u0177\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0172\3\2\2\2\u0176"+
		"\u0175\3\2\2\2\u0177O\3\2\2\2\u0178\u0179\7\17\2\2\u0179\u017a\5R*\2\u017a"+
		"\u017b\5P)\2\u017b\u017e\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u0178\3\2\2"+
		"\2\u017d\u017c\3\2\2\2\u017eQ\3\2\2\2\u017f\u0180\5^\60\2\u0180\u0181"+
		"\5T+\2\u0181S\3\2\2\2\u0182\u0183\7&\2\2\u0183\u0184\5n8\2\u0184\u0185"+
		"\5V,\2\u0185\u0186\5\32\16\2\u0186\u018c\3\2\2\2\u0187\u0188\5n8\2\u0188"+
		"\u0189\5X-\2\u0189\u018a\5V,\2\u018a\u018c\3\2\2\2\u018b\u0182\3\2\2\2"+
		"\u018b\u0187\3\2\2\2\u018cU\3\2\2\2\u018d\u0190\5j\66\2\u018e\u0190\7"+
		"B\2\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190W\3\2\2\2\u0191\u0194"+
		"\7\'\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"Y\3\2\2\2\u0195\u0198\5\60\31\2\u0196\u0198\5\\/\2\u0197\u0195\3\2\2\2"+
		"\u0197\u0196\3\2\2\2\u0198[\3\2\2\2\u0199\u019a\5n8\2\u019a\u019b\7B\2"+
		"\2\u019b\u019c\7\7\2\2\u019c]\3\2\2\2\u019d\u019e\7(\2\2\u019e\u019f\5"+
		"b\62\2\u019f\u01a0\5`\61\2\u01a0\u01a1\7)\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4_\3\2\2\2"+
		"\u01a5\u01a6\7\17\2\2\u01a6\u01a7\5b\62\2\u01a7\u01a8\5`\61\2\u01a8\u01ab"+
		"\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a5\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"a\3\2\2\2\u01ac\u01ad\7\20\2\2\u01ad\u01ae\5f\64\2\u01ae\u01af\7\21\2"+
		"\2\u01af\u01b0\5d\63\2\u01b0\u01bf\3\2\2\2\u01b1\u01b2\7(\2\2\u01b2\u01b3"+
		"\5f\64\2\u01b3\u01b4\7)\2\2\u01b4\u01b5\5d\63\2\u01b5\u01bf\3\2\2\2\u01b6"+
		"\u01b7\7\5\2\2\u01b7\u01b8\5f\64\2\u01b8\u01b9\7\6\2\2\u01b9\u01ba\5d"+
		"\63\2\u01ba\u01bf\3\2\2\2\u01bb\u01bc\5h\65\2\u01bc\u01bd\5d\63\2\u01bd"+
		"\u01bf\3\2\2\2\u01be\u01ac\3\2\2\2\u01be\u01b1\3\2\2\2\u01be\u01b6\3\2"+
		"\2\2\u01be\u01bb\3\2\2\2\u01bfc\3\2\2\2\u01c0\u01c3\5b\62\2\u01c1\u01c3"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3e\3\2\2\2\u01c4"+
		"\u01c5\7\20\2\2\u01c5\u01c6\5f\64\2\u01c6\u01c7\7\21\2\2\u01c7\u01c8\5"+
		"f\64\2\u01c8\u01d8\3\2\2\2\u01c9\u01ca\7(\2\2\u01ca\u01cb\5f\64\2\u01cb"+
		"\u01cc\7)\2\2\u01cc\u01cd\5f\64\2\u01cd\u01d8\3\2\2\2\u01ce\u01cf\7\5"+
		"\2\2\u01cf\u01d0\5f\64\2\u01d0\u01d1\7\6\2\2\u01d1\u01d2\5f\64\2\u01d2"+
		"\u01d8\3\2\2\2\u01d3\u01d4\5l\67\2\u01d4\u01d5\5f\64\2\u01d5\u01d8\3\2"+
		"\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01c4\3\2\2\2\u01d7\u01c9\3\2\2\2\u01d7"+
		"\u01ce\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8g\3\2\2\2"+
		"\u01d9\u01fe\7C\2\2\u01da\u01fe\7F\2\2\u01db\u01fe\7B\2\2\u01dc\u01fe"+
		"\7E\2\2\u01dd\u01fe\7D\2\2\u01de\u01fe\7\30\2\2\u01df\u01fe\7*\2\2\u01e0"+
		"\u01fe\7\'\2\2\u01e1\u01fe\7\r\2\2\u01e2\u01fe\7\7\2\2\u01e3\u01fe\7+"+
		"\2\2\u01e4\u01fe\7\n\2\2\u01e5\u01fe\7,\2\2\u01e6\u01fe\7-\2\2\u01e7\u01fe"+
		"\7.\2\2\u01e8\u01fe\7/\2\2\u01e9\u01fe\7\31\2\2\u01ea\u01fe\7\32\2\2\u01eb"+
		"\u01fe\7\60\2\2\u01ec\u01fe\7\61\2\2\u01ed\u01fe\7\62\2\2\u01ee\u01fe"+
		"\7\63\2\2\u01ef\u01fe\7\27\2\2\u01f0\u01fe\7\64\2\2\u01f1\u01fe\7\65\2"+
		"\2\u01f2\u01fe\7\25\2\2\u01f3\u01fe\7\66\2\2\u01f4\u01fe\7\67\2\2\u01f5"+
		"\u01fe\78\2\2\u01f6\u01fe\7&\2\2\u01f7\u01fe\79\2\2\u01f8\u01fe\7:\2\2"+
		"\u01f9\u01fe\7\26\2\2\u01fa\u01fe\7;\2\2\u01fb\u01fe\7<\2\2\u01fc\u01fe"+
		"\5j\66\2\u01fd\u01d9\3\2\2\2\u01fd\u01da\3\2\2\2\u01fd\u01db\3\2\2\2\u01fd"+
		"\u01dc\3\2\2\2\u01fd\u01dd\3\2\2\2\u01fd\u01de\3\2\2\2\u01fd\u01df\3\2"+
		"\2\2\u01fd\u01e0\3\2\2\2\u01fd\u01e1\3\2\2\2\u01fd\u01e2\3\2\2\2\u01fd"+
		"\u01e3\3\2\2\2\u01fd\u01e4\3\2\2\2\u01fd\u01e5\3\2\2\2\u01fd\u01e6\3\2"+
		"\2\2\u01fd\u01e7\3\2\2\2\u01fd\u01e8\3\2\2\2\u01fd\u01e9\3\2\2\2\u01fd"+
		"\u01ea\3\2\2\2\u01fd\u01eb\3\2\2\2\u01fd\u01ec\3\2\2\2\u01fd\u01ed\3\2"+
		"\2\2\u01fd\u01ee\3\2\2\2\u01fd\u01ef\3\2\2\2\u01fd\u01f0\3\2\2\2\u01fd"+
		"\u01f1\3\2\2\2\u01fd\u01f2\3\2\2\2\u01fd\u01f3\3\2\2\2\u01fd\u01f4\3\2"+
		"\2\2\u01fd\u01f5\3\2\2\2\u01fd\u01f6\3\2\2\2\u01fd\u01f7\3\2\2\2\u01fd"+
		"\u01f8\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fd\u01fc\3\2\2\2\u01fei\3\2\2\2\u01ff\u0200\t\4\2\2\u0200k\3\2"+
		"\2\2\u0201\u0204\5h\65\2\u0202\u0204\7\17\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0202\3\2\2\2\u0204m\3\2\2\2\u0205\u020a\5p9\2\u0206\u0207\5r:\2\u0207"+
		"\u0208\5\u0088E\2\u0208\u020a\3\2\2\2\u0209\u0205\3\2\2\2\u0209\u0206"+
		"\3\2\2\2\u020ao\3\2\2\2\u020b\u020f\5x=\2\u020c\u020d\7\60\2\2\u020d\u020f"+
		"\5\u008aF\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020fq\3\2\2\2\u0210"+
		"\u0211\7\20\2\2\u0211\u0212\5t;\2\u0212\u0213\78\2\2\u0213\u0214\5t;\2"+
		"\u0214\u0215\5v<\2\u0215\u0216\7\21\2\2\u0216s\3\2\2\2\u0217\u0220\5x"+
		"=\2\u0218\u0219\5r:\2\u0219\u021a\5\u0088E\2\u021a\u0220\3\2\2\2\u021b"+
		"\u021c\7\60\2\2\u021c\u021d\7(\2\2\u021d\u021e\7)\2\2\u021e\u0220\5\u0088"+
		"E\2\u021f\u0217\3\2\2\2\u021f\u0218\3\2\2\2\u021f\u021b\3\2\2\2\u0220"+
		"u\3\2\2\2\u0221\u0222\78\2\2\u0222\u0223\5t;\2\u0223\u0224\5v<\2\u0224"+
		"\u0227\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0221\3\2\2\2\u0226\u0225\3\2"+
		"\2\2\u0227w\3\2\2\2\u0228\u0229\5|?\2\u0229\u022a\5\u0088E\2\u022a\u0241"+
		"\3\2\2\2\u022b\u022c\7/\2\2\u022c\u0241\5\u0088E\2\u022d\u022e\79\2\2"+
		"\u022e\u022f\7+\2\2\u022f\u0230\5n8\2\u0230\u0231\7,\2\2\u0231\u0232\5"+
		"\u008cG\2\u0232\u0241\3\2\2\2\u0233\u0234\7B\2\2\u0234\u0241\5\u0088E"+
		"\2\u0235\u0236\7B\2\2\u0236\u0237\7+\2\2\u0237\u0238\5n8\2\u0238\u0239"+
		"\7,\2\2\u0239\u0241\3\2\2\2\u023a\u023b\7B\2\2\u023b\u0241\7>\2\2\u023c"+
		"\u023d\7\66\2\2\u023d\u0241\5\u0088E\2\u023e\u023f\7.\2\2\u023f\u0241"+
		"\5\u0088E\2\u0240\u0228\3\2\2\2\u0240\u022b\3\2\2\2\u0240\u022d\3\2\2"+
		"\2\u0240\u0233\3\2\2\2\u0240\u0235\3\2\2\2\u0240\u023a\3\2\2\2\u0240\u023c"+
		"\3\2\2\2\u0240\u023e\3\2\2\2\u0241y\3\2\2\2\u0242\u0243\5|?\2\u0243\u0244"+
		"\5\u008cG\2\u0244\u0248\3\2\2\2\u0245\u0246\7B\2\2\u0246\u0248\5\u008c"+
		"G\2\u0247\u0242\3\2\2\2\u0247\u0245\3\2\2\2\u0248{\3\2\2\2\u0249\u024f"+
		"\5\u0082B\2\u024a\u024f\5~@\2\u024b\u024f\7\61\2\2\u024c\u024f\7\62\2"+
		"\2\u024d\u024f\7\67\2\2\u024e\u0249\3\2\2\2\u024e\u024a\3\2\2\2\u024e"+
		"\u024b\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2\u024f}\3\2\2\2"+
		"\u0250\u0251\7=\2\2\u0251\u0254\5\u0080A\2\u0252\u0254\5\u0080A\2\u0253"+
		"\u0250\3\2\2\2\u0253\u0252\3\2\2\2\u0254\177\3\2\2\2\u0255\u0256\t\5\2"+
		"\2\u0256\u0081\3\2\2\2\u0257\u0258\7;\2\2\u0258\u025b\5\u0084C\2\u0259"+
		"\u025b\5\u0084C\2\u025a\u0257\3\2\2\2\u025a\u0259\3\2\2\2\u025b\u0083"+
		"\3\2\2\2\u025c\u0260\7:\2\2\u025d\u025e\7\65\2\2\u025e\u0260\5\u0086D"+
		"\2\u025f\u025c\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0085\3\2\2\2\u0261\u0264"+
		"\7\65\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2"+
		"\u0264\u0087\3\2\2\2\u0265\u0266\7(\2\2\u0266\u0267\7)\2\2\u0267\u026c"+
		"\5\u0088E\2\u0268\u0269\7-\2\2\u0269\u026c\5\u008aF\2\u026a\u026c\3\2"+
		"\2\2\u026b\u0265\3\2\2\2\u026b\u0268\3\2\2\2\u026b\u026a\3\2\2\2\u026c"+
		"\u0089\3\2\2\2\u026d\u026e\7(\2\2\u026e\u026f\7)\2\2\u026f\u0272\5\u0088"+
		"E\2\u0270\u0272\3\2\2\2\u0271\u026d\3\2\2\2\u0271\u0270\3\2\2\2\u0272"+
		"\u008b\3\2\2\2\u0273\u0276\7-\2\2\u0274\u0276\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0275\u0274\3\2\2\2\u0276\u008d\3\2\2\2\u0277\u027a\5n8\2\u0278\u027a"+
		"\7<\2\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027a\u008f\3\2\2\2\u027b"+
		"\u027c\7B\2\2\u027c\u0091\3\2\2\2\u027d\u027e\7B\2\2\u027e\u027f\7\20"+
		"\2\2\u027f\u0280\5N(\2\u0280\u0281\7\21\2\2\u0281\u0093\3\2\2\2\u0282"+
		"\u0283\7B\2\2\u0283\u0284\7\n\2\2\u0284\u0285\7B\2\2\u0285\u0095\3\2\2"+
		"\2\u0286\u0287\7B\2\2\u0287\u0288\7\n\2\2\u0288\u0289\7B\2\2\u0289\u028a"+
		"\7\20\2\2\u028a\u028b\5N(\2\u028b\u028c\7\21\2\2\u028c\u0097\3\2\2\2\65"+
		"\u009d\u00a6\u00ab\u00af\u00bc\u00c3\u00ca\u00ce\u00dd\u00e7\u00ec\u00fb"+
		"\u0100\u0111\u0131\u013a\u0141\u0146\u0152\u0156\u015d\u0163\u0170\u0176"+
		"\u017d\u018b\u018f\u0193\u0197\u01a3\u01aa\u01be\u01c2\u01d7\u01fd\u0203"+
		"\u0209\u020e\u021f\u0226\u0240\u0247\u024e\u0253\u025a\u025f\u0263\u026b"+
		"\u0271\u0275\u0279";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}