#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 *  The MIT License (MIT)
 *
 *  Copyright (C) 2014 by Kuali Foundation
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *
 *  all copies or substantial portions of the Software.
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package ${package}.${toolNameShort}.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * Implementation of the <code>${fileNamePrefix}Dao</code>
 * @author Kuali Mobility Team (mobility.collab@kuali.org)
 * @since ${version}
 */
@Repository
public class ${fileNamePrefix}DaoImpl implements ${fileNamePrefix}Dao {
	
	/**
	 * A reference to a logger
	 */
	private static final Logger LOG = Logger.getLogger( ${fileNamePrefix}DaoImpl.class );

	/**
	 * A reference to the <code>EntityManager</code>
	 */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Gets the reference to the <code>EntityManager</code>
	 * @returns The reference to the <code>EntityManager</code>
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Sets the reference to the <code>EntityManager</code>
	 * @param entityManager The reference to the <code>EntityManager</code>
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
