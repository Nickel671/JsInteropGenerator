
grammar WebIdl;
WS     : [ \r\t\n]+ -> skip ;
COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        | '#ifdef' .*? '#endif'
        ) -> skip
    ;
Identifier
: JavaLetter JavaLetterOrDigit*
;
Integer 	: 	'-'?('0'([0-7]*|[Xx][0-9A-Fa-f]+)|[1-9][0-9]*);
Other 	: 	[^\t\n\r 0-9A-Z_a-z];

String 	: 	'"'~['"']*'"';
Float 	:	'-'?(([0-9]+'.'[0-9]*|[0-9]*'.'[0-9]+)([Ee][+-]?[0-9]+)?|[0-9]+[Ee][+-]?[0-9]+);



JavaLetter
: [a-zA-Z$_] // these are the "java letters" below 0xFF
| // covers all characters above 0xFF which are not a surrogate
~[\u0000-\u00FF\uD800-\uDBFF]
{Character.isJavaIdentifierStart(_input.LA(-1))}?
| // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
[\uD800-\uDBFF] [\uDC00-\uDFFF]
{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?

;

JavaLetterOrDigit
: [a-zA-Z0-9$_] 
| '-'
| ~[\u0000-\u00FF\uD800-\uDBFF]
{Character.isJavaIdentifierPart(_input.LA(-1))}?
| [\uD800-\uDBFF] [\uDC00-\uDFFF]
{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?

;	



definitions	:	extendedattributeList definition definitions
 | EOF;
definition	:	callbackOrinterface1
 | partial
 | dictionary
 | exception
 | enum1
 | typedef
 | implementsStatement;

callbackOrinterface1	:	'callback' callbackRestOrinterface1
 | interface1;
callbackRestOrinterface1	:	callbackRest
 | interface1;
interface1	:	'interface' Identifier inheritance '{' interface1Members '}' ';'
| 'interface' Identifier ';';
partial	:	'partial' partialdefinition;
partialdefinition	:	interface1
 | dictionary ;
interface1Members	:	extendedattributeList interface1Member interface1Members
 | ;
interface1Member	:	const1
 | attributeOroperation;
dictionary	:	'dictionary' Identifier inheritance '{' dictionaryMembers '}' ';';
dictionaryMembers	:	extendedattributeList dictionaryMember dictionaryMembers
 | ;
dictionaryMember	:	type Identifier default1 ';';
default1	:	'=' default1Value
 | ;
default1Value	:	constValue
 | '[]'
 | String;
exception	:	'exception' Identifier inheritance '{' exceptionMembers '}' ';';
exceptionMembers	:	extendedattributeList exceptionMember exceptionMembers
 | ;
inheritance	:	':' Identifier
 | ;
enum1	:	'enum' Identifier '{' enumValueList '}' ';';
enumValueList	:	String enumValues;
enumValues	:	',' String enumValues
 | ','
 | ;
callbackRest	:	Identifier '=' returntype '(' argumentList ')' ';';
typedef	:	'typedef' extendedattributeList type Identifier ';';
implementsStatement	:	Identifier 'implements' Identifier ';';
const1	:	'const' consttype Identifier '=' constValue ';';
constValue	:	booleanLiteral
 | floatLiteral
 | Integer
 | 'null';
booleanLiteral	:	'true'
 | 'false';
 
floatLiteral	:	Float
 | '-' 'Infinity'
 | 'Infinity'
 | 'NaN';
attributeOroperation	:	'stringifier' stringifierattributeOroperation
 | attribute
 | operation
 | 'jsonifier;';
stringifierattributeOroperation	:	attribute
 | operationRest
 | ';';
attribute	:	qualifiers inherit readOnly 'attribute' type Identifier ';';
inherit	:	'inherit'
 | ;
readOnly	:	'readonly'
 | ;

operation	:	qualifiers operationRest;
qualifiers	:	'static'
 | specials;
specials	:	special specials
 | ;
special	:	'getter'
 | 'setter'
 | 'creator'
 | 'deleter'
 | 'legacycaller';
operationRest	:	returntype optionalIdentifier '(' argumentList ')' ';';
optionalIdentifier	:	Identifier
 | ;
argumentList	:	argument arguments
 | ;
arguments	:	',' argument arguments
 | ;
argument	:	extendedattributeList optionalOrRequiredargument;
optionalOrRequiredargument	:	'optional' type argumentName default1
 | type ellipsis argumentName;
argumentName	:	argumentNameKeyword
 | Identifier;
ellipsis	:	'...'
 | ;
exceptionMember	:	const1
 | exceptionField;
exceptionField	:	type Identifier ';';
extendedattributeList	:	'[' extendedattribute extendedattributes ']'
 | ;
extendedattributes	:	',' extendedattribute extendedattributes
 | ;
extendedattribute	:	'(' extendedattributeInner ')' extendedattributeRest
 | '[' extendedattributeInner ']' extendedattributeRest
 | '{' extendedattributeInner '}' extendedattributeRest
 | other extendedattributeRest;
extendedattributeRest	:	extendedattribute
 | ;
extendedattributeInner	:	'(' extendedattributeInner ')' extendedattributeInner
 | '[' extendedattributeInner ']' extendedattributeInner
 | '{' extendedattributeInner '}' extendedattributeInner
 | otherOrComma extendedattributeInner
 | ;
other	:	Integer
 | Float
 | Identifier
 | String
 | Other
 | '-'
 | '.'
 | '...'
 | ':'
 | ';'
 | '<'
 | '='
 | '>'
 | '?'
 | 'Date'
 | 'DOMString'
 | 'Infinity'
 | 'NaN'
 | 'any'
 | 'boolean'
 | 'byte'
 | 'double'
 | 'false'
 | 'Float'
 | 'long'
 | 'null'
 | 'object'
 | 'octet'
 | 'or'
 | 'optional'
 | 'sequence'
 | 'short'
 | 'true'
 | 'unsigned'
 | 'void'
 | argumentNameKeyword;
argumentNameKeyword	:	'attribute'
 | 'callback'
 | 'const'
 | 'creator'
 | 'deleter'
 | 'dictionary'
 | 'enum'
 | 'exception'
 | 'getter'
 | 'implements'
 | 'inherit'
 | 'interface'
 | 'legacycaller'
 | 'partial'
 | 'setter'
 | 'static'
 | 'stringifier'
 | 'typedef'
 | 'unrestricted';
otherOrComma	:	other
 | ',';
type	:	singletype
 | uniontype typeSuffix;
singletype	:	nonAnytype
 | 'any' typeSuffixStartingWithArray;
uniontype	:	'(' unionMembertype 'or' unionMembertype unionMembertypes ')';
unionMembertype	:	nonAnytype
 | uniontype typeSuffix
 | 'any' '[' ']' typeSuffix;
unionMembertypes	:	'or' unionMembertype unionMembertypes
 | ;
nonAnytype	:	primitivetype typeSuffix
 | 'DOMString' typeSuffix
 | 'sequence' '<' type '>' null1
 | Identifier typeSuffix
 | Identifier '<'type'>'
 | Identifier '<void>'
 | 'object' typeSuffix
 | 'Date' typeSuffix;
consttype	:	primitivetype null1
 | Identifier null1;
primitivetype	:	unsignedintegertype
 | unrestrictedfloattype
 | 'boolean'
 | 'byte'
 | 'octet';
unrestrictedfloattype	:	'unrestricted' floattype
 | floattype;
floattype	:	'float'
 | 'double';
unsignedintegertype	:	'unsigned' integertype
 | integertype;
integertype	:	'short'
 | 'long' optionalLong;
optionalLong	:	'long'
 | ;
typeSuffix	:	'[' ']' typeSuffix
 | '?' typeSuffixStartingWithArray
 | ;
typeSuffixStartingWithArray	:	'[' ']' typeSuffix
 | ;
null1	:	'?'
 | ;
returntype	:	type
 | 'void';
extendedattributeNoArgs	:	Identifier;
extendedattributeArgList	:	Identifier '(' argumentList ')';
extendedattributeIdent	:	Identifier '=' Identifier;
extendedattributeNamedArgList	:	Identifier '=' Identifier '(' argumentList ')';