package br.com.desafio.common.infrastructure.hibernate.dialect;

import br.com.desafio.common.infrastructure.hibernate.functions.PostgreSQLFilterFunction;

/**
 * 
 * @author rodrigo@eits.com.br
 */
public class PostgreSQLDialect extends org.hibernate.dialect.PostgreSQL9Dialect 
{
	/**
	 * 
	 */
	public PostgreSQLDialect() 
	{
		super.registerFunction("FILTER", new PostgreSQLFilterFunction());
	}
}
