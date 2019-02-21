grammar Sparql11Parser;

import Sparql10Parser;

/* SPARQL 1.1 [1] */
queryUnit
    : query
    ;

/* SPARQL 1.1 [2] */
/* SPARQL 1.0 [1] */

/* SPARQL 1.1 [3] */
updateUnit
    : update
    ;

/* SPARQL 1.1 [4] */
prologue
    : ( baseDecl | prefixDecl)*
    ;

/* [5] */
baseDecl
    : 'BASE' IRI_REF
    ;

/* [6] */
prefixDecl
    : 'PREFIX' PNAME_NS IRI_REF
    ;

/* [7] */
selectQuery
    : selectClause datasetClause* whereClause solutionModifier
    ;

/* [8] */
subSelect
    : selectClause whereClause solutionModifier valuesClause
    ;
/* [9] */
  	// SelectClause	  ::=  	'SELECT' ( 'DISTINCT' | 'REDUCED' )? ( ( Var | ( '(' Expression 'AS' Var ')' ) )+ | '*' )
selectClause :
    SELECT ( DISTINCT | REDUCED )? ( (var | ( '(' expression AS var ')' ) )+ | STAR )

/* [10] */
 	//ConstructQuery	  ::=  	'CONSTRUCT' ( ConstructTemplate DatasetClause* WhereClause SolutionModifier | DatasetClause* 'WHERE' '{' TriplesTemplate? '}' SolutionModifier )
constructQuery
    : CONSTRUCT ( constructTemplate datasetClause* whereClause solutionModifier | datasetClause* WHERE '{' triplesTemplate? '}' solutionModifier )

/* [11] */
  	//DescribeQuery	  ::=  	'DESCRIBE' ( VarOrIri+ | '*' ) DatasetClause* WhereClause? SolutionModifier

/* [12] */
 	//AskQuery	  ::=  	'ASK' DatasetClause* WhereClause SolutionModifier


/* [13] */
 	// DatasetClause	  ::=  	'FROM' ( DefaultGraphClause | NamedGraphClause )

/* [14] */
 	// DefaultGraphClause	  ::=  	SourceSelector

/* [15] */
	// NamedGraphClause	  ::=  	'NAMED' SourceSelector

/* [16] */
 	// SourceSelector	  ::=  	iri

/* [17] */
 	// WhereClause	  ::=  	'WHERE'? GroupGraphPattern

/* [18] */
 	// SolutionModifier	  ::=  	GroupClause? HavingClause? OrderClause? LimitOffsetClauses?

/* [19] */
  	// GroupClause	  ::=  	'GROUP' 'BY' GroupCondition+

/* [20] */
 	// GroupCondition	  ::=  	BuiltInCall | FunctionCall | '(' Expression ( 'AS' Var )? ')' | Var

/* [21] */
  	// HavingClause	  ::=  	'HAVING' HavingCondition+

/* [22] */
  	// HavingCondition	  ::=  	Constraint

/* [23] */
  	// OrderClause	  ::=  	'ORDER' 'BY' OrderCondition+

/* [24] */
  	// OrderCondition	  ::=  	( ( 'ASC' | 'DESC' ) BrackettedExpression ) | ( Constraint | Var )

/* [25] */
  	// LimitOffsetClauses	  ::=  	LimitClause OffsetClause? | OffsetClause LimitClause?

/* [26] */
  	// LimitClause	  ::=  	'LIMIT' INTEGER

/* [27] */
  	// OffsetClause	  ::=  	'OFFSET' INTEGER

/* [28] */  	ValuesClause	  ::=  	( 'VALUES' DataBlock )?

/* [29] */  	Update	  ::=  	Prologue ( Update1 ( ';' Update )? )?

/* [30] */  	Update1	  ::=  	Load | Clear | Drop | Add | Move | Copy | Create | InsertData | DeleteData | DeleteWhere | Modify

/* [31] */  	Load	  ::=  	'LOAD' 'SILENT'? iri ( 'INTO' GraphRef )?

/* [32] */  	Clear	  ::=  	'CLEAR' 'SILENT'? GraphRefAll

/* [33] */  	Drop	  ::=  	'DROP' 'SILENT'? GraphRefAll

/* [34] */  	Create	  ::=  	'CREATE' 'SILENT'? GraphRef

/* [35] */  	Add	  ::=  	'ADD' 'SILENT'? GraphOrDefault 'TO' GraphOrDefault

/* [36] */  	Move	  ::=  	'MOVE' 'SILENT'? GraphOrDefault 'TO' GraphOrDefault

/* [37] */  	Copy	  ::=  	'COPY' 'SILENT'? GraphOrDefault 'TO' GraphOrDefault

/* [38] */  	InsertData	  ::=  	'INSERT DATA' QuadData

/* [39] */  	DeleteData	  ::=  	'DELETE DATA' QuadData

/* [40] */  	DeleteWhere	  ::=  	'DELETE WHERE' QuadPattern

/* [41] */  	Modify	  ::=  	( 'WITH' iri )? ( DeleteClause InsertClause? | InsertClause ) UsingClause* 'WHERE' GroupGraphPattern

/* [42] */  	DeleteClause	  ::=  	'DELETE' QuadPattern

/* [43] */  	InsertClause	  ::=  	'INSERT' QuadPattern

/* [44] */  	UsingClause	  ::=  	'USING' ( iri | 'NAMED' iri )

/* [45] */  	GraphOrDefault	  ::=  	'DEFAULT' | 'GRAPH'? iri

/* [46] */  	GraphRef	  ::=  	'GRAPH' iri

/* [47] */  	GraphRefAll	  ::=  	GraphRef | 'DEFAULT' | 'NAMED' | 'ALL'

/* [48] */  	QuadPattern	  ::=  	'{' Quads '}'

/* [49] */  	QuadData	  ::=  	'{' Quads '}'

/* [50] */  	Quads	  ::=  	TriplesTemplate? ( QuadsNotTriples '.'? TriplesTemplate? )*

/* [51] */  	QuadsNotTriples	  ::=  	'GRAPH' VarOrIri '{' TriplesTemplate? '}'

/* [52] */  	TriplesTemplate	  ::=  	TriplesSameSubject ( '.' TriplesTemplate? )?

/* [53] */  	GroupGraphPattern	  ::=  	'{' ( SubSelect | GroupGraphPatternSub ) '}'

/* [54] */ 	GroupGraphPatternSub	  ::=  	TriplesBlock? ( GraphPatternNotTriples '.'? TriplesBlock? )*

/* [55] */  	TriplesBlock	  ::=  	TriplesSameSubjectPath ( '.' TriplesBlock? )?

/* [56] */  	GraphPatternNotTriples	  ::=  	GroupOrUnionGraphPattern | OptionalGraphPattern | MinusGraphPattern | GraphGraphPattern | ServiceGraphPattern | Filter | Bind | InlineData

/* [57] */  	OptionalGraphPattern	  ::=  	'OPTIONAL' GroupGraphPattern

/* [58] */  	GraphGraphPattern	  ::=  	'GRAPH' VarOrIri GroupGraphPattern

/* [59] */  	ServiceGraphPattern	  ::=  	'SERVICE' 'SILENT'? VarOrIri GroupGraphPattern

/* [60] */  	Bind	  ::=  	'BIND' '(' Expression 'AS' Var ')'

/* [61] */  	InlineData	  ::=  	'VALUES' DataBlock

/* [62] */  	DataBlock	  ::=  	InlineDataOneVar | InlineDataFull

/* [63] */  	InlineDataOneVar	  ::=  	Var '{' DataBlockValue* '}'

/* [64] */  	InlineDataFull	  ::=  	( NIL | '(' Var* ')' ) '{' ( '(' DataBlockValue* ')' | NIL )* '}'

/* [65] */  	DataBlockValue	  ::=  	iri |	RDFLiteral |	NumericLiteral |	BooleanLiteral |	'UNDEF'

/* [66] */  	MinusGraphPattern	  ::=  	'MINUS' GroupGraphPattern

/* [67] */  	GroupOrUnionGraphPattern	  ::=  	GroupGraphPattern ( 'UNION' GroupGraphPattern )*

/* [68] */ 	Filter	  ::=  	'FILTER' Constraint

/* [69] */ 	Constraint	  ::=  	BrackettedExpression | BuiltInCall | FunctionCall

/* [70] */  	FunctionCall	  ::=  	iri ArgList

/* [71] */  	ArgList	  ::=  	NIL | '(' 'DISTINCT'? Expression ( ',' Expression )* ')'

/* [72] */  	ExpressionList	  ::=  	NIL | '(' Expression ( ',' Expression )* ')'

/* [73] */  	ConstructTemplate	  ::=  	'{' ConstructTriples? '}'

/* [74] */  	ConstructTriples	  ::=  	TriplesSameSubject ( '.' ConstructTriples? )?

/* [75] */  	TriplesSameSubject	  ::=  	VarOrTerm PropertyListNotEmpty |	TriplesNode PropertyList

/* [76] */  	PropertyList	  ::=  	PropertyListNotEmpty?

/* [77] */  	PropertyListNotEmpty	  ::=  	Verb ObjectList ( ';' ( Verb ObjectList )? )*

/* [78] */  	Verb	  ::=  	VarOrIri | 'a'

/* [79] */  	ObjectList	  ::=  	Object ( ',' Object )*

[80]  	Object	  ::=  	GraphNode

[81]  	TriplesSameSubjectPath	  ::=  	VarOrTerm PropertyListPathNotEmpty |	TriplesNodePath PropertyListPath

[82]  	PropertyListPath	  ::=  	PropertyListPathNotEmpty?

[83]  	PropertyListPathNotEmpty	  ::=  	( VerbPath | VerbSimple ) ObjectListPath ( ';' ( ( VerbPath | VerbSimple ) ObjectList )? )*

[84]  	VerbPath	  ::=  	Path

[85]  	VerbSimple	  ::=  	Var

[86]  	ObjectListPath	  ::=  	ObjectPath ( ',' ObjectPath )*

[87]  	ObjectPath	  ::=  	GraphNodePath

[88]  	Path	  ::=  	PathAlternative

[89]  	PathAlternative	  ::=  	PathSequence ( '|' PathSequence )*

[90]  	PathSequence	  ::=  	PathEltOrInverse ( '/' PathEltOrInverse )*

[91]  	PathElt	  ::=  	PathPrimary PathMod?

[92]  	PathEltOrInverse	  ::=  	PathElt | '^' PathElt

[93]  	PathMod	  ::=  	'?' | '*' | '+'

[94]  	PathPrimary	  ::=  	iri | 'a' | '!' PathNegatedPropertySet | '(' Path ')'

[95]  	PathNegatedPropertySet	  ::=  	PathOneInPropertySet | '(' ( PathOneInPropertySet ( '|' PathOneInPropertySet )* )? ')'

[96]  	PathOneInPropertySet	  ::=  	iri | 'a' | '^' ( iri | 'a' )

[97]  	Integer	  ::=  	INTEGER

[98]  	TriplesNode	  ::=  	Collection |	BlankNodePropertyList

[99]  	BlankNodePropertyList	  ::=  	'[' PropertyListNotEmpty ']'

[100]  	TriplesNodePath	  ::=  	CollectionPath |	BlankNodePropertyListPath

[101]  	BlankNodePropertyListPath	  ::=  	'[' PropertyListPathNotEmpty ']'

[102]  	Collection	  ::=  	'(' GraphNode+ ')'

[103]  	CollectionPath	  ::=  	'(' GraphNodePath+ ')'

[104]  	GraphNode	  ::=  	VarOrTerm |	TriplesNode

[105]  	GraphNodePath	  ::=  	VarOrTerm |	TriplesNodePath

[106]  	VarOrTerm	  ::=  	Var | GraphTerm

[107]  	VarOrIri	  ::=  	Var | iri

[108]  	Var	  ::=  	VAR1 | VAR2

[109]  	GraphTerm	  ::=  	iri |	RDFLiteral |	NumericLiteral |	BooleanLiteral |	BlankNode |	NIL

[110]  	Expression	  ::=  	ConditionalOrExpression

[111]  	ConditionalOrExpression	  ::=  	ConditionalAndExpression ( '||' ConditionalAndExpression )*

[112]  	ConditionalAndExpression	  ::=  	ValueLogical ( '&&' ValueLogical )*

[113]  	ValueLogical	  ::=  	RelationalExpression

[114]  	RelationalExpression	  ::=  	NumericExpression ( '=' NumericExpression | '!=' NumericExpression | '<' NumericExpression | '>' NumericExpression | '<=' NumericExpression | '>=' NumericExpression | 'IN' ExpressionList | 'NOT' 'IN' ExpressionList )?

[115]  	NumericExpression	  ::=  	AdditiveExpression

[116]  	AdditiveExpression	  ::=  	MultiplicativeExpression ( '+' MultiplicativeExpression | '-' MultiplicativeExpression | ( NumericLiteralPositive | NumericLiteralNegative ) ( ( '*' UnaryExpression ) | ( '/' UnaryExpression ) )* )*

[117]  	MultiplicativeExpression	  ::=  	UnaryExpression ( '*' UnaryExpression | '/' UnaryExpression )*

[118]  	UnaryExpression	  ::=  	  '!' PrimaryExpression |	'+' PrimaryExpression |	'-' PrimaryExpression |	PrimaryExpression

[119]  	PrimaryExpression	  ::=  	BrackettedExpression | BuiltInCall | iriOrFunction | RDFLiteral | NumericLiteral | BooleanLiteral | Var

[120]  	BrackettedExpression	  ::=  	'(' Expression ')'

[121]  	BuiltInCall	  ::=  	  Aggregate
|	'STR' '(' Expression ')'
|	'LANG' '(' Expression ')'
|	'LANGMATCHES' '(' Expression ',' Expression ')'
|	'DATATYPE' '(' Expression ')'
|	'BOUND' '(' Var ')'
|	'IRI' '(' Expression ')'
|	'URI' '(' Expression ')'
|	'BNODE' ( '(' Expression ')' | NIL )
|	'RAND' NIL
|	'ABS' '(' Expression ')'
|	'CEIL' '(' Expression ')'
|	'FLOOR' '(' Expression ')'
|	'ROUND' '(' Expression ')'
|	'CONCAT' ExpressionList
|	SubstringExpression
|	'STRLEN' '(' Expression ')'
|	StrReplaceExpression
|	'UCASE' '(' Expression ')'
|	'LCASE' '(' Expression ')'
|	'ENCODE_FOR_URI' '(' Expression ')'
|	'CONTAINS' '(' Expression ',' Expression ')'
|	'STRSTARTS' '(' Expression ',' Expression ')'
|	'STRENDS' '(' Expression ',' Expression ')'
|	'STRBEFORE' '(' Expression ',' Expression ')'
|	'STRAFTER' '(' Expression ',' Expression ')'
|	'YEAR' '(' Expression ')'
|	'MONTH' '(' Expression ')'
|	'DAY' '(' Expression ')'
|	'HOURS' '(' Expression ')'
|	'MINUTES' '(' Expression ')'
|	'SECONDS' '(' Expression ')'
|	'TIMEZONE' '(' Expression ')'
|	'TZ' '(' Expression ')'
|	'NOW' NIL
|	'UUID' NIL
|	'STRUUID' NIL
|	'MD5' '(' Expression ')'
|	'SHA1' '(' Expression ')'
|	'SHA256' '(' Expression ')'
|	'SHA384' '(' Expression ')'
|	'SHA512' '(' Expression ')'
|	'COALESCE' ExpressionList
|	'IF' '(' Expression ',' Expression ',' Expression ')'
|	'STRLANG' '(' Expression ',' Expression ')'
|	'STRDT' '(' Expression ',' Expression ')'
|	'sameTerm' '(' Expression ',' Expression ')'
|	'isIRI' '(' Expression ')'
|	'isURI' '(' Expression ')'
|	'isBLANK' '(' Expression ')'
|	'isLITERAL' '(' Expression ')'
|	'isNUMERIC' '(' Expression ')'
|	RegexExpression
|	ExistsFunc
|	NotExistsFunc
[122]  	RegexExpression	  ::=  	'REGEX' '(' Expression ',' Expression ( ',' Expression )? ')'

[123]  	SubstringExpression	  ::=  	'SUBSTR' '(' Expression ',' Expression ( ',' Expression )? ')'

[124]  	StrReplaceExpression	  ::=  	'REPLACE' '(' Expression ',' Expression ',' Expression ( ',' Expression )? ')'

[125]  	ExistsFunc	  ::=  	'EXISTS' GroupGraphPattern

[126]  	NotExistsFunc	  ::=  	'NOT' 'EXISTS' GroupGraphPattern

[127]  	Aggregate	  ::=  	  'COUNT' '(' 'DISTINCT'? ( '*' | Expression ) ')'
| 'SUM' '(' 'DISTINCT'? Expression ')'
| 'MIN' '(' 'DISTINCT'? Expression ')'
| 'MAX' '(' 'DISTINCT'? Expression ')'
| 'AVG' '(' 'DISTINCT'? Expression ')'
| 'SAMPLE' '(' 'DISTINCT'? Expression ')'
| 'GROUP_CONCAT' '(' 'DISTINCT'? Expression ( ';' 'SEPARATOR' '=' String )? ')'

[128]  	iriOrFunction	  ::=  	iri ArgList?

[129]  	RDFLiteral	  ::=  	String ( LANGTAG | ( '^^' iri ) )?

[130]  	NumericLiteral	  ::=  	NumericLiteralUnsigned | NumericLiteralPositive | NumericLiteralNegative

[131]  	NumericLiteralUnsigned	  ::=  	INTEGER |	DECIMAL |	DOUBLE

[132]  	NumericLiteralPositive	  ::=  	INTEGER_POSITIVE |	DECIMAL_POSITIVE |	DOUBLE_POSITIVE

[133]  	NumericLiteralNegative	  ::=  	INTEGER_NEGATIVE |	DECIMAL_NEGATIVE |	DOUBLE_NEGATIVE

[134]  	BooleanLiteral	  ::=  	'true' |	'false'

[135]  	String	  ::=  	STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2

[136]  	iri	  ::=  	IRIREF |	PrefixedName

[137]  	PrefixedName	  ::=  	PNAME_LN | PNAME_NS

[138]  	BlankNode	  ::=  	BLANK_NODE_LABEL |	ANON

*/
