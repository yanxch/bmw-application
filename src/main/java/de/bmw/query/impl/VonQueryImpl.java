package de.bmw.query.impl;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableList;

import de.bmw.query.QueryItem;

public class VonQueryImpl implements VonQuery {

	private /*final*/ List<QueryItem> items;
	
	public VonQueryImpl(Collection<QueryItem> items) {
		this.items = ImmutableList.copyOf(items);
	}

	public CvQuery von(String resource) {
		this.items = ImmutableList.<QueryItem>builder()
				.addAll(this.items)
				.add(new Von(resource))
				.build();
		return new CvQueryImpl(items);
	}
	
	public List<QueryItem> items() {
		return items;
	}
}
