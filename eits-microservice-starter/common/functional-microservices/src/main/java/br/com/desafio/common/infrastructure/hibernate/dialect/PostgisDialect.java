package br.com.desafio.common.infrastructure.hibernate.dialect;

import br.com.desafio.common.infrastructure.hibernate.functions.PostgreSQLFilterFunction;

/**
 * Created by eduardo on 17/07/17.
 */
public class PostgisDialect extends org.hibernate.spatial.dialect.postgis.PostgisDialect
{
	public PostgisDialect()
	{
		super.registerFunction( "FILTER", new PostgreSQLFilterFunction() );
	}
}
