// Generated from WebIdl.g4 by ANTLR 4.5
package org.niklas.elemental.Elemental.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebIdlParser}.
 */
public interface WebIdlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(WebIdlParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(WebIdlParser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(WebIdlParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(WebIdlParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#callbackOrinterface1}.
	 * @param ctx the parse tree
	 */
	void enterCallbackOrinterface1(WebIdlParser.CallbackOrinterface1Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#callbackOrinterface1}.
	 * @param ctx the parse tree
	 */
	void exitCallbackOrinterface1(WebIdlParser.CallbackOrinterface1Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#callbackRestOrinterface1}.
	 * @param ctx the parse tree
	 */
	void enterCallbackRestOrinterface1(WebIdlParser.CallbackRestOrinterface1Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#callbackRestOrinterface1}.
	 * @param ctx the parse tree
	 */
	void exitCallbackRestOrinterface1(WebIdlParser.CallbackRestOrinterface1Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#interface1}.
	 * @param ctx the parse tree
	 */
	void enterInterface1(WebIdlParser.Interface1Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#interface1}.
	 * @param ctx the parse tree
	 */
	void exitInterface1(WebIdlParser.Interface1Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#partial}.
	 * @param ctx the parse tree
	 */
	void enterPartial(WebIdlParser.PartialContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#partial}.
	 * @param ctx the parse tree
	 */
	void exitPartial(WebIdlParser.PartialContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#partialdefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartialdefinition(WebIdlParser.PartialdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#partialdefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartialdefinition(WebIdlParser.PartialdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#interface1Members}.
	 * @param ctx the parse tree
	 */
	void enterInterface1Members(WebIdlParser.Interface1MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#interface1Members}.
	 * @param ctx the parse tree
	 */
	void exitInterface1Members(WebIdlParser.Interface1MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#interface1Member}.
	 * @param ctx the parse tree
	 */
	void enterInterface1Member(WebIdlParser.Interface1MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#interface1Member}.
	 * @param ctx the parse tree
	 */
	void exitInterface1Member(WebIdlParser.Interface1MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void enterDictionary(WebIdlParser.DictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void exitDictionary(WebIdlParser.DictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryMembers(WebIdlParser.DictionaryMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryMembers(WebIdlParser.DictionaryMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#dictionaryMember}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryMember(WebIdlParser.DictionaryMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#dictionaryMember}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryMember(WebIdlParser.DictionaryMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#default1}.
	 * @param ctx the parse tree
	 */
	void enterDefault1(WebIdlParser.Default1Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#default1}.
	 * @param ctx the parse tree
	 */
	void exitDefault1(WebIdlParser.Default1Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#default1Value}.
	 * @param ctx the parse tree
	 */
	void enterDefault1Value(WebIdlParser.Default1ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#default1Value}.
	 * @param ctx the parse tree
	 */
	void exitDefault1Value(WebIdlParser.Default1ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#exception}.
	 * @param ctx the parse tree
	 */
	void enterException(WebIdlParser.ExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#exception}.
	 * @param ctx the parse tree
	 */
	void exitException(WebIdlParser.ExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#exceptionMembers}.
	 * @param ctx the parse tree
	 */
	void enterExceptionMembers(WebIdlParser.ExceptionMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#exceptionMembers}.
	 * @param ctx the parse tree
	 */
	void exitExceptionMembers(WebIdlParser.ExceptionMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(WebIdlParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(WebIdlParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#enum1}.
	 * @param ctx the parse tree
	 */
	void enterEnum1(WebIdlParser.Enum1Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#enum1}.
	 * @param ctx the parse tree
	 */
	void exitEnum1(WebIdlParser.Enum1Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#enumValueList}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueList(WebIdlParser.EnumValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#enumValueList}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueList(WebIdlParser.EnumValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void enterEnumValues(WebIdlParser.EnumValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void exitEnumValues(WebIdlParser.EnumValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#callbackRest}.
	 * @param ctx the parse tree
	 */
	void enterCallbackRest(WebIdlParser.CallbackRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#callbackRest}.
	 * @param ctx the parse tree
	 */
	void exitCallbackRest(WebIdlParser.CallbackRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(WebIdlParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(WebIdlParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStatement(WebIdlParser.ImplementsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStatement(WebIdlParser.ImplementsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#const1}.
	 * @param ctx the parse tree
	 */
	void enterConst1(WebIdlParser.Const1Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#const1}.
	 * @param ctx the parse tree
	 */
	void exitConst1(WebIdlParser.Const1Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#constValue}.
	 * @param ctx the parse tree
	 */
	void enterConstValue(WebIdlParser.ConstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#constValue}.
	 * @param ctx the parse tree
	 */
	void exitConstValue(WebIdlParser.ConstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(WebIdlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(WebIdlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(WebIdlParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(WebIdlParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#attributeOroperation}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOroperation(WebIdlParser.AttributeOroperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#attributeOroperation}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOroperation(WebIdlParser.AttributeOroperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#stringifierattributeOroperation}.
	 * @param ctx the parse tree
	 */
	void enterStringifierattributeOroperation(WebIdlParser.StringifierattributeOroperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#stringifierattributeOroperation}.
	 * @param ctx the parse tree
	 */
	void exitStringifierattributeOroperation(WebIdlParser.StringifierattributeOroperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(WebIdlParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(WebIdlParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#inherit}.
	 * @param ctx the parse tree
	 */
	void enterInherit(WebIdlParser.InheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#inherit}.
	 * @param ctx the parse tree
	 */
	void exitInherit(WebIdlParser.InheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#readOnly}.
	 * @param ctx the parse tree
	 */
	void enterReadOnly(WebIdlParser.ReadOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#readOnly}.
	 * @param ctx the parse tree
	 */
	void exitReadOnly(WebIdlParser.ReadOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(WebIdlParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(WebIdlParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#qualifiers}.
	 * @param ctx the parse tree
	 */
	void enterQualifiers(WebIdlParser.QualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#qualifiers}.
	 * @param ctx the parse tree
	 */
	void exitQualifiers(WebIdlParser.QualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#specials}.
	 * @param ctx the parse tree
	 */
	void enterSpecials(WebIdlParser.SpecialsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#specials}.
	 * @param ctx the parse tree
	 */
	void exitSpecials(WebIdlParser.SpecialsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(WebIdlParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(WebIdlParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#operationRest}.
	 * @param ctx the parse tree
	 */
	void enterOperationRest(WebIdlParser.OperationRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#operationRest}.
	 * @param ctx the parse tree
	 */
	void exitOperationRest(WebIdlParser.OperationRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOptionalIdentifier(WebIdlParser.OptionalIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOptionalIdentifier(WebIdlParser.OptionalIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(WebIdlParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(WebIdlParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(WebIdlParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(WebIdlParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(WebIdlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(WebIdlParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#optionalOrRequiredargument}.
	 * @param ctx the parse tree
	 */
	void enterOptionalOrRequiredargument(WebIdlParser.OptionalOrRequiredargumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#optionalOrRequiredargument}.
	 * @param ctx the parse tree
	 */
	void exitOptionalOrRequiredargument(WebIdlParser.OptionalOrRequiredargumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(WebIdlParser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(WebIdlParser.ArgumentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void enterEllipsis(WebIdlParser.EllipsisContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void exitEllipsis(WebIdlParser.EllipsisContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#exceptionMember}.
	 * @param ctx the parse tree
	 */
	void enterExceptionMember(WebIdlParser.ExceptionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#exceptionMember}.
	 * @param ctx the parse tree
	 */
	void exitExceptionMember(WebIdlParser.ExceptionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#exceptionField}.
	 * @param ctx the parse tree
	 */
	void enterExceptionField(WebIdlParser.ExceptionFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#exceptionField}.
	 * @param ctx the parse tree
	 */
	void exitExceptionField(WebIdlParser.ExceptionFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#extendedattributeList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedattributeList(WebIdlParser.ExtendedattributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#extendedattributeList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedattributeList(WebIdlParser.ExtendedattributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#extendedattributes}.
	 * @param ctx the parse tree
	 */
	void enterExtendedattributes(WebIdlParser.ExtendedattributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#extendedattributes}.
	 * @param ctx the parse tree
	 */
	void exitExtendedattributes(WebIdlParser.ExtendedattributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#extendedattribute}.
	 * @param ctx the parse tree
	 */
	void enterExtendedattribute(WebIdlParser.ExtendedattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#extendedattribute}.
	 * @param ctx the parse tree
	 */
	void exitExtendedattribute(WebIdlParser.ExtendedattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#extendedattributeRest}.
	 * @param ctx the parse tree
	 */
	void enterExtendedattributeRest(WebIdlParser.ExtendedattributeRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#extendedattributeRest}.
	 * @param ctx the parse tree
	 */
	void exitExtendedattributeRest(WebIdlParser.ExtendedattributeRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#extendedattributeInner}.
	 * @param ctx the parse tree
	 */
	void enterExtendedattributeInner(WebIdlParser.ExtendedattributeInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#extendedattributeInner}.
	 * @param ctx the parse tree
	 */
	void exitExtendedattributeInner(WebIdlParser.ExtendedattributeInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(WebIdlParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(WebIdlParser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNameKeyword(WebIdlParser.ArgumentNameKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNameKeyword(WebIdlParser.ArgumentNameKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#otherOrComma}.
	 * @param ctx the parse tree
	 */
	void enterOtherOrComma(WebIdlParser.OtherOrCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#otherOrComma}.
	 * @param ctx the parse tree
	 */
	void exitOtherOrComma(WebIdlParser.OtherOrCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WebIdlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WebIdlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#singletype}.
	 * @param ctx the parse tree
	 */
	void enterSingletype(WebIdlParser.SingletypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#singletype}.
	 * @param ctx the parse tree
	 */
	void exitSingletype(WebIdlParser.SingletypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#uniontype}.
	 * @param ctx the parse tree
	 */
	void enterUniontype(WebIdlParser.UniontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#uniontype}.
	 * @param ctx the parse tree
	 */
	void exitUniontype(WebIdlParser.UniontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#unionMembertype}.
	 * @param ctx the parse tree
	 */
	void enterUnionMembertype(WebIdlParser.UnionMembertypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#unionMembertype}.
	 * @param ctx the parse tree
	 */
	void exitUnionMembertype(WebIdlParser.UnionMembertypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#unionMembertypes}.
	 * @param ctx the parse tree
	 */
	void enterUnionMembertypes(WebIdlParser.UnionMembertypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#unionMembertypes}.
	 * @param ctx the parse tree
	 */
	void exitUnionMembertypes(WebIdlParser.UnionMembertypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#nonAnytype}.
	 * @param ctx the parse tree
	 */
	void enterNonAnytype(WebIdlParser.NonAnytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#nonAnytype}.
	 * @param ctx the parse tree
	 */
	void exitNonAnytype(WebIdlParser.NonAnytypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#consttype}.
	 * @param ctx the parse tree
	 */
	void enterConsttype(WebIdlParser.ConsttypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#consttype}.
	 * @param ctx the parse tree
	 */
	void exitConsttype(WebIdlParser.ConsttypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#primitivetype}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivetype(WebIdlParser.PrimitivetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#primitivetype}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivetype(WebIdlParser.PrimitivetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#unrestrictedfloattype}.
	 * @param ctx the parse tree
	 */
	void enterUnrestrictedfloattype(WebIdlParser.UnrestrictedfloattypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#unrestrictedfloattype}.
	 * @param ctx the parse tree
	 */
	void exitUnrestrictedfloattype(WebIdlParser.UnrestrictedfloattypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#floattype}.
	 * @param ctx the parse tree
	 */
	void enterFloattype(WebIdlParser.FloattypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#floattype}.
	 * @param ctx the parse tree
	 */
	void exitFloattype(WebIdlParser.FloattypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#unsignedintegertype}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedintegertype(WebIdlParser.UnsignedintegertypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#unsignedintegertype}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedintegertype(WebIdlParser.UnsignedintegertypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#integertype}.
	 * @param ctx the parse tree
	 */
	void enterIntegertype(WebIdlParser.IntegertypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#integertype}.
	 * @param ctx the parse tree
	 */
	void exitIntegertype(WebIdlParser.IntegertypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#optionalLong}.
	 * @param ctx the parse tree
	 */
	void enterOptionalLong(WebIdlParser.OptionalLongContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#optionalLong}.
	 * @param ctx the parse tree
	 */
	void exitOptionalLong(WebIdlParser.OptionalLongContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffix(WebIdlParser.TypeSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffix(WebIdlParser.TypeSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffixStartingWithArray(WebIdlParser.TypeSuffixStartingWithArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffixStartingWithArray(WebIdlParser.TypeSuffixStartingWithArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#null1}.
	 * @param ctx the parse tree
	 */
	void enterNull1(WebIdlParser.Null1Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#null1}.
	 * @param ctx the parse tree
	 */
	void exitNull1(WebIdlParser.Null1Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#returntype}.
	 * @param ctx the parse tree
	 */
	void enterReturntype(WebIdlParser.ReturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#returntype}.
	 * @param ctx the parse tree
	 */
	void exitReturntype(WebIdlParser.ReturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#extendedattributeNoArgs}.
	 * @param ctx the parse tree
	 */
	void enterExtendedattributeNoArgs(WebIdlParser.ExtendedattributeNoArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#extendedattributeNoArgs}.
	 * @param ctx the parse tree
	 */
	void exitExtendedattributeNoArgs(WebIdlParser.ExtendedattributeNoArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#extendedattributeArgList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedattributeArgList(WebIdlParser.ExtendedattributeArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#extendedattributeArgList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedattributeArgList(WebIdlParser.ExtendedattributeArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#extendedattributeIdent}.
	 * @param ctx the parse tree
	 */
	void enterExtendedattributeIdent(WebIdlParser.ExtendedattributeIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#extendedattributeIdent}.
	 * @param ctx the parse tree
	 */
	void exitExtendedattributeIdent(WebIdlParser.ExtendedattributeIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIdlParser#extendedattributeNamedArgList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedattributeNamedArgList(WebIdlParser.ExtendedattributeNamedArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIdlParser#extendedattributeNamedArgList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedattributeNamedArgList(WebIdlParser.ExtendedattributeNamedArgListContext ctx);
}