package de.bmw.query.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.hasItem;

import org.junit.Test;

/**
 * 
 * @author chrisyanx
 *
 */
public class WhenCreatingCvQuery {
	
	// SUT
	CvQueryBuilderImpl queryBuilder = CvQueryBuilderImpl.of();
	
	@Test
	public void it_should_have_the_correct_count_of_items() {
		// Given
		
		// When 
		 CvQuery query = queryBuilder.create()
			.lade("vorname")
			.lade("nachname")
			.lade("telefonnummer")
			.von("Christian.Janker");
		
		// Then
		assertThat(query.items(), hasSize(4));

	}
	
	@Test
	public void it_should_have_the_correct_items() {
		// Given
		 
		// When 
		 CvQuery query = queryBuilder.create()
			.lade("vorname")
			.lade("nachname")
			.lade("telefonnummer")
			.von("Christian.Janker");
		
		// Then
		assertThat((Lade) query.items().get(0), is(equalTo(new Lade("vorname"))));
		assertThat((Lade) query.items().get(1), is(equalTo(new Lade("nachname"))));
		assertThat((Lade) query.items().get(2), is(equalTo(new Lade("telefonnummer"))));
		assertThat((Von) query.items().get(3), is(equalTo(new Von("Christian.Janker"))));
	}
	
	@Test
	public void it_should_not_include_following_item() {
		// Given
		 
		// When 
		 CvQuery query = queryBuilder.create()
			.lade("vorname")
			.lade("nachname")
			.lade("telefonnummer")
			.von("Christian.Janker");
		
		// Then
		assertThat(query.items(), not(hasItem(new Lade("Vorname"))));
	}
}
