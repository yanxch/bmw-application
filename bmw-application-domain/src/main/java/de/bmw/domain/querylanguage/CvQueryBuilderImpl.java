package de.bmw.domain.querylanguage;

import java.util.List;

import com.google.common.collect.ImmutableList;

import de.bmw.query.QueryItem;

/**
 * 
 * @author chrisyanx
 *
 */
public class CvQueryBuilderImpl implements CvQueryBuilder {
	private final List<QueryItem> items;

	private CvQueryBuilderImpl() {
		this.items = ImmutableList.of();
	}
	
	public static CvQueryBuilderImpl of() {
		return new CvQueryBuilderImpl();
	}

	public List<QueryItem> items() {
		return items;
	}

	public LadeQuery create() {
		return new LadeQueryImpl(items);
	}
}
