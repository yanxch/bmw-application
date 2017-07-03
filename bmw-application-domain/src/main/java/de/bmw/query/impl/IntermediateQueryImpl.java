package de.bmw.query.impl;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableList;

import de.bmw.query.QueryItem;

/**
 * 
 * @author chrisyanx
 *
 */
public class IntermediateQueryImpl implements IntermediateQuery {
	
	private final List<QueryItem> items;
	
	private final LadeQuery ladeQuery;
	private final VonQuery vonQuery;
	
	public IntermediateQueryImpl(Collection<QueryItem> items) {
		this.items = ImmutableList.copyOf(items);
		/* No dependency injection here - dependending on an implemention for now  - this is a already a concrete implementation so why not*/
		this.ladeQuery = new LadeQueryImpl(this.items);
		this.vonQuery = new VonQueryImpl(this.items);
	}
	
	public IntermediateQuery lade(String keyword) {
		return ladeQuery.lade(keyword);
	}

	public CvQuery von(String resource) {
		return vonQuery.von(resource);
	}
	
	public List<QueryItem> items() {
		return items;
	}
}
