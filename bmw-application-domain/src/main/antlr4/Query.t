grammar Query;

@header {
	package de.bmw.domain.querylanguage.antlr;
}

query: expr+ ;										

expr
	: expr 'and' expr												#and
	| expr 'or' expr												#or
	| '(' e=expr ')'												#parens
	| DOKUMENTKLASSE OPERATOR WORD OPERATORPOSTFIX					#dokumentklasse
	| DOKUMENTERWEITERUNG OPERATOR WORD OPERATORPOSTFIX				#dokumenterweiterung
	| ABLAGE OPERATOR WORD OPERATORPOSTFIX							#ablage
	| METADATA OPERATOR WORD OPERATORPOSTFIX 						#metadata
	;
	
		
DOKUMENTKLASSE: 		'dokumentklasse' 		;
DOKUMENTERWEITERUNG: 	'dokumenterweiterung' 	;
ABLAGE: 				'ablage' 				;

OPERATOR
		: ':"'
		| ':*'
		;
		
OPERATORPOSTFIX
			: '"'
			| '*"'
			;

WORD:	[a-zA-Z]+ ;
METADATA: [a-zA-Z]+ '.' WORD ;	
WS: (' ' | '\t' | '\n' )+  -> skip		;