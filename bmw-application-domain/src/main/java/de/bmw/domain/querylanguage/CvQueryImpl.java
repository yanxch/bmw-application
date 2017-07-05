package de.bmw.domain.querylanguage;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableList;

import de.bmw.domain.querylanguage.CvQuery;
import de.bmw.query.QueryItem;

public class CvQueryImpl implements CvQuery {

	private final List<QueryItem> items;
	
	public CvQueryImpl(Collection<QueryItem> items) {
		this.items = ImmutableList.copyOf(items);
	}
	
	public List<QueryItem> items() {
		return items;
	}
}
