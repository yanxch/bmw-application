package de.bmw.query;

/**
 * Build a CV-Query (curriculum vitae) with this class
 * 
 * @author chrisyanx
 *
 */
public class CvQueryBuilder {
	private CvQueryBuilder() {
		
	}
	
	public static CvQueryBuilder of() {
		return new CvQueryBuilder();
	}
}
