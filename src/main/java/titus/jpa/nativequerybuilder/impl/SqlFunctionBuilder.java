package titus.jpa.nativequerybuilder.impl;

import titus.jpa.nativequerybuilder.ISqlFunction.IBasicSqlFunctionInstanceBuilder;
import titus.jpa.nativequerybuilder.ISqlFunction.ISqlFunctionBuilder;
import titus.jpa.nativequerybuilder.functions.ICount;
import titus.jpa.nativequerybuilder.functions.IWebSearchToTsQuery.IWebSearchToTsQueryBuilder;
import titus.jpa.nativequerybuilder.impl.functions.Count;
import titus.jpa.nativequerybuilder.impl.functions.WebSearchToTsQuery;

/**
 * The Class SqlFunctionBuilder.
 */
public class SqlFunctionBuilder implements ISqlFunctionBuilder {

	/**
	 * Instantiates a new sql function builder.
	 */
	private SqlFunctionBuilder() {
	}

	/**
	 * Builder.
	 *
	 * @return the i sql function builder
	 */
	public static ISqlFunctionBuilder builder() {
		return new SqlFunctionBuilder();
	}

	/**
	 * Count.
	 *
	 * @return the i basic sql function instance builder
	 */
	@Override
	public IBasicSqlFunctionInstanceBuilder<ICount> count() {
		return Count.builder();
	}

	/**
	 * Fts web query.
	 *
	 * @return the i web search to ts query builder
	 */
	@Override
	public IWebSearchToTsQueryBuilder ftsWebQuery() {
		return WebSearchToTsQuery.builder();
	}
}
