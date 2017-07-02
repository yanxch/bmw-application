package de.bmw.query.impl;

import de.bmw.query.Query;

/**
 * Just here to define our CV specific query interfaces in one place
 * 
 * @author chrisyanx
 *
 */
public class CvQueryLanguage {
	private CvQueryLanguage() {}
}	

interface CvQueryBuilder extends Query {
	LadeQuery create();
}

interface CvQuery extends Query {}

interface LadeQuery extends Query {
	LogicalOperator lade(String keyword);
}

interface VonQuery extends Query {
	CvQuery von(String resource);
}

interface LogicalOperator extends Query {
	QueryIntermediate and();
}

interface QueryIntermediate extends LadeQuery, VonQuery {}