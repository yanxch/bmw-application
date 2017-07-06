grammar ApplicationQueryLanguage;

@header {
	package de.bmw.domain.querylanguage.antlr;
}

query: ladeexpr+ vonexpr wennexpr+ ;	

ladeexpr
	: LADE OPERATOR WORD OPERATORPOSTFIX 	#lade
	;
vonexpr
	: VON OPERATOR WORD OPERATORPOSTFIX		#von
	;

wennexpr
	: WENN OPERATOR WORD OPERATORPOSTFIX	#wenn
	;
	
LADE:		'lade' 	| 'LADE'	;
VON:		'von' 	| 'VON' 	;
WENN:		'wenn'	| 'WENN'	;			


OPERATOR
		: ':"'
		| ':*'
		;
		
OPERATORPOSTFIX
			: '"'
			| '*"'
			;
 



WORD:	[a-zA-Z]+ ;
WS: (' ' | '\t' | '\n' )+  -> skip		;