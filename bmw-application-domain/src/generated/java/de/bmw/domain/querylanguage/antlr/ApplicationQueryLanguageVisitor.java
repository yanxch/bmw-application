// Generated from ApplicationQueryLanguage.g4 by ANTLR 4.3

	package de.bmw.domain.querylanguage.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ApplicationQueryLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ApplicationQueryLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code lade}
	 * labeled alternative in {@link ApplicationQueryLanguageParser#ladeexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLade(@NotNull ApplicationQueryLanguageParser.LadeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code von}
	 * labeled alternative in {@link ApplicationQueryLanguageParser#vonexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVon(@NotNull ApplicationQueryLanguageParser.VonContext ctx);

	/**
	 * Visit a parse tree produced by {@link ApplicationQueryLanguageParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull ApplicationQueryLanguageParser.QueryContext ctx);

	/**
	 * Visit a parse tree produced by the {@code wenn}
	 * labeled alternative in {@link ApplicationQueryLanguageParser#wennexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWenn(@NotNull ApplicationQueryLanguageParser.WennContext ctx);
}