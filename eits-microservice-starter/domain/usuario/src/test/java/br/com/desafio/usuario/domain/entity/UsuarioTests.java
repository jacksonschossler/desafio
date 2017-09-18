package br.com.desafio.usuario.domain.entity;

import org.junit.Test;

import br.com.desafio.usuario.AbstractUnitTests;


/**
 * 
 * @author rodrigo@eits.com.br
 * @since 09/05/2013
 * @version 1.0
 */
public class UsuarioTests extends AbstractUnitTests
{
	/*-------------------------------------------------------------------
	 *                           ATTRIBUTES
	 *-------------------------------------------------------------------*/

	/*-------------------------------------------------------------------
	 *                           TESTS
	 *-------------------------------------------------------------------*/
	/**
     * 
     */
	@Test
	public void test()
	{
		final Usuario usuario = new Usuario();
		System.out.println( usuario.getAuthorities() );
	}
}
