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
public class LogicalOperatorImpl implements LogicalOperator {

	private /*final*/ List<QueryItem> items;
	
	public LogicalOperatorImpl(Collection<QueryItem> items) {
		this.items = ImmutableList.copyOf(items);
	}
	
	public List<QueryItem> items() {
		return items;
	}

	public QueryIntermediate and() {
		return new QueryIntermediateImpl(items);
	}
}
