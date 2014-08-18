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

package ${package}.${toolNameShort}.service;

import ${package}.${toolNameShort}.dao.${fileNamePrefix}Dao;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Implementation of the <code>${fileNamePrefix}Service</code>
 * @author Kuali Mobility Team (mobility.collab@kuali.org)
 * @since ${version}
 */
@Service
public class ${fileNamePrefix}ServiceImpl implements ${fileNamePrefix}Service {
	
	/** A reference to a logger */
	private static final Logger LOG = Logger.getLogger( ${fileNamePrefix}ServiceImpl.class );

	/**
	 * A reference to the <code>${fileNamePrefix}Dao</code>.
	 */
    @Resource(name="${toolNameShort}Dao")
	private ${fileNamePrefix}Dao dao;
	
	/**
	 * Sets the reference to the <code>${fileNamePrefix}Dao</code>.
	 * @param dao The reference to the <code>${fileNamePrefix}Dao</code>.
	 */
	public void setDao(${fileNamePrefix}Dao dao) {
		this.dao = dao;
	}
	
	/**
	 * Gets the reference to the <code>${fileNamePrefix}Dao</code>.
	 * @returns The reference to the <code>${fileNamePrefix}Dao</code>.
	 */
	public ${fileNamePrefix}Dao getDao() {
		return dao;
	}

}