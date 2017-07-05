package de.bmw.domain.querylanguage;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableList;

import de.bmw.domain.querylanguage.IntermediateQuery;
import de.bmw.domain.querylanguage.LadeQuery;
import de.bmw.query.QueryItem;

/**
 * 
 * @author chrisyanx
 *
 */
public class LadeQueryImpl implements LadeQuery {

	private /*final*/ List<QueryItem> items;

	public LadeQueryImpl(Collection<QueryItem> items) {
		this.items = ImmutableList.copyOf(items);
	}

	public IntermediateQuery lade(String keyword) {
		this.items = ImmutableList.<QueryItem>builder()
				.addAll(this.items)
				.add(new Lade(keyword))
				.build();
		return new IntermediateQueryImpl(items);
	}
	
	public List<QueryItem> items() {
		return items;
	}
}
