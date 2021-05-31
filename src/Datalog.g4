/**
 * A Datalog grammar inspired from the textbook definition and heavily taken
 * from http://blogs.evergreen.edu/sosw/files/2014/04/Green-Vol5-DBS-017.pdf
 *
 * As per the semantics mentioned in the above link the grammar below supports
 * negation and aggregation as well. Main differences from the above spec to
 * this is how literals and variables are represented which differ a bit from
 * traditional logic programming convention.
 *
 * All literals are typed in below grammar and variables must be explicitly
 * indicated by '?' prefix. Predicates follow same rules as identifiers except
 * that they don't have the '?' character. These changes are so that grammar
 * can be used to store/query typed data from database.
 */
grammar Datalog;

// Top level program to perform two functions.
// Stores data using facts or performs a query over existing/new facts
program
    : facts
    | facts? rules? query
    ;
//parte sintáctica

// Facts that represent ground truth information
fact
    : predicate '(' literalList ')' end
    ;

literalList
    : literal ( ',' literal ) *
    ;

facts
    : fact*
    ;

condition
    : variableOrLiteral BIGGERTHAN variableOrLiteral
    |variableOrLiteral BIGGEREQUALTHAN variableOrLiteral
    |variableOrLiteral SMALLEREQUALTHAN variableOrLiteral
    |variableOrLiteral SMALLERTHAN variableOrLiteral
    |variableOrLiteral NOTEQUAL variableOrLiteral
    |variableOrLiteral EQUAL variableOrLiteral
    |
    ;

// Horn clauses or rules in the query
rule
    : atom ':-' atoms end
    ;

end
    : '.'
    ;
rules
    : rule+
    ;

query
    : '?-' atom ( ',' condition ) * end
    ;

// Definition of atom (or goal) used in horn clauses (or rules)
atom
    : predicate '(' variableOrLiterals ')'
    | NOT atom
    ;

atoms
    : atom ( ',' atom )*
    ;

// Types of things allowed within arguments of rules
variableOrLiteral
    : variable
    | literal
    | aggregateVariable
    ;

variableOrLiterals
    : variableOrLiteral (',' variableOrLiteral)*
    ;

aggregateVariable
    : aggregateOp '<' variable '>'
    ;

aggregateOp
    : COUNT
    | AVG
    | SUM
    | MIN
    | MAX
    ;

variable
    : IDENTIFIER
    ;

predicate
    : PREDICATE
    ;

literal
	:	INTEGERLITERAL
	|	FLOATINGPOINTLITERAL
	|	BOOLEANLITERAL
	|	CHARACTERLITERAL
	|	STRINGLITERAL
	;

// Lexer rules

//
// Keywords
//
NOT: 'not';
COUNT: 'count';
AVG: 'avg';
SUM: 'sum';
MIN: 'min';
MAX: 'max';

//
// Integers
//
INTEGERLITERAL
	:	DECIMALINTEGERLITERAL
	|	HEXINTEGERLITERAL
	|	OCTALINTEGERLITERAL
	|	BINARYINTEGERLITERAL
	;

fragment
DECIMALINTEGERLITERAL
	:	DECIMALNUMERAL INTEGERTYPESUFFIX?
	;

fragment
HEXINTEGERLITERAL
	:	HEXNUMERAL INTEGERTYPESUFFIX?
	;

fragment
OCTALINTEGERLITERAL
	:	OCTALNUMERAL INTEGERTYPESUFFIX?
	;

fragment
BINARYINTEGERLITERAL
	:	BINARYNUMERAL INTEGERTYPESUFFIX?
	;

fragment
INTEGERTYPESUFFIX
	:	[lL]
	;

fragment
DECIMALNUMERAL
	:	'0'
	|	NONZERODIGIT (DIGITS? | UNDERSCORES DIGITS)
	;

fragment
DIGITS
	:	DIGIT (DIGITSANDUNDERSCORES? DIGIT)?
	;

fragment
DIGIT
	:	'0'
	|	NONZERODIGIT
	;

fragment
NONZERODIGIT
	:	[1-9]
	;

fragment
DIGITSANDUNDERSCORES
	:	DIGITORUNDERSCORE+
	;

fragment
DIGITORUNDERSCORE
	:	DIGIT
	|	'_'
	;

fragment
UNDERSCORES
	:	'_'+
	;

fragment
HEXNUMERAL
	:	'0' [xX] HEXDIGITS
	;

fragment
HEXDIGITS
	:	HEXDIGIT (HEXDIGITSANDUNDERSCORES? HEXDIGIT)?
	;

fragment
HEXDIGIT
	:	[0-9a-fA-F]
	;

fragment
HEXDIGITSANDUNDERSCORES
	:	HEXDIGITORUNDERSCORE+
	;

fragment
HEXDIGITORUNDERSCORE
	:	HEXDIGIT
	|	'_'
	;

fragment
OCTALNUMERAL
	:	'0' UNDERSCORES? OCTALDIGITS
	;

fragment
OCTALDIGITS
	:	OCTALDIGIT (OCTALDIGITSANDUNDERSCORES? OCTALDIGIT)?
	;

fragment
OCTALDIGIT
	:	[0-7]
	;

fragment
OCTALDIGITSANDUNDERSCORES
	:	OCTALDIGITORUNDERSCORE+
	;

fragment
OCTALDIGITORUNDERSCORE
	:	OCTALDIGIT
	|	'_'
	;

fragment
BINARYNUMERAL
	:	'0' [bB] BINARYDIGITS
	;

fragment
BINARYDIGITS
	:	BINARYDIGIT (BINARYDIGITSANDUNDERSCORES? BINARYDIGIT)?
	;

fragment
BINARYDIGIT
	:	[01]
	;

fragment
BINARYDIGITSANDUNDERSCORES
	:	BINARYDIGITORUNDERSCORE+
	;

fragment
BINARYDIGITORUNDERSCORE
	:	BINARYDIGIT
	|	'_'
	;

//
// Floating point numbers
//
FLOATINGPOINTLITERAL
	:	DECIMALFLOATINGPOINTLITERAL
	|	HEXADECIMALFLOATINGPOINTLITERAL
	;

fragment
DECIMALFLOATINGPOINTLITERAL
	:	DIGITS '.' DIGITS? EXPONENTPART? FLOATTYPESUFFIX?
	|	'.' DIGITS EXPONENTPART? FLOATTYPESUFFIX?
	|	DIGITS EXPONENTPART FLOATTYPESUFFIX?
	|	DIGITS FLOATTYPESUFFIX
	;

fragment
EXPONENTPART
	:	EXPONENTINDICATOR SIGNEDINTEGER
	;

fragment
EXPONENTINDICATOR
	:	[eE]
	;

fragment
SIGNEDINTEGER
	:	SIGN? DIGITS
	;

fragment
SIGN
	:	[+-]
	;

fragment
FLOATTYPESUFFIX
	:	[fFdD]
	;

fragment
HEXADECIMALFLOATINGPOINTLITERAL
	:	HEXSIGNIFICAND BINARYEXPONENT FLOATTYPESUFFIX?
	;

fragment
HEXSIGNIFICAND
	:	HEXNUMERAL '.'?
	|	'0' [xX] HEXDIGITS? '.' HEXDIGITS
	;

fragment
BINARYEXPONENT
	:	BINARYEXPONENTINDICATOR SIGNEDINTEGER
	;

fragment
BINARYEXPONENTINDICATOR
	:	[pP]
	;

//
// Boolean
//
BOOLEANLITERAL
	:	'true'
	|	'false'
	;

//
// Characters
//
CHARACTERLITERAL
	:	'\'' SINGLECHARACTER '\''
	|	'\'' ESCAPESEQUENCE '\''
	;

fragment
SINGLECHARACTER
	:	~['\\\r\n]
	;
//
// Strings
//
STRINGLITERAL
	:	'"' STRINGCHARACTERS? '"'
	;
fragment
STRINGCHARACTERS
	:	STRINGCHARACTER+
	;
fragment
STRINGCHARACTER
	:	~["\\\r\n]
	|	ESCAPESEQUENCE
	;
// §3.10.6 Escape Sequences for Character and String Literals
fragment
ESCAPESEQUENCE
	:	'\\' [btnfr"'\\]
	|	OCTALESCAPE
	;

fragment
OCTALESCAPE
	:	'\\' OCTALDIGIT
	|	'\\' OCTALDIGIT OCTALDIGIT
	|	'\\' ZEROTOTHREE OCTALDIGIT OCTALDIGIT
	;

fragment
ZEROTOTHREE
	:	[0-3]
	;

//
// Identifiers & Predicates
//
PREDICATE
    : IDENTIFIERLETTER IDENTIFIERLETTERORDIGIT*
    ;

IDENTIFIER
    : '?' IDENTIFIERLETTER IDENTIFIERLETTERORDIGIT*
    ;

fragment
IDENTIFIERLETTER
    : [a-zA-Z]
    ;

fragment
IDENTIFIERLETTERORDIGIT
    : [a-zA-Z0-9_]
    ;

//
// Whitespace and comments
//
WS
    : [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    : '%' ~[\n\r]* ( [\n\r] | EOF) -> skip
    ;

MULTILINE_COMMENT
    : '/*' ( MULTILINE_COMMENT | . )*? ('*/' | EOF) -> skip
    ;

BIGGERTHAN
    : '>'
    ;

BIGGEREQUALTHAN
    : '>='
    ;

SMALLERTHAN
    : '<'
    ;

SMALLEREQUALTHAN
    : '<='
    ;

NOTEQUAL
    : '<>'
    ;

EQUAL
    : '='
    ;
