/**
 * The MIT License
 * Copyright (c) 2011 Kuali Mobility Team
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
import javax.annotation.Resource;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.${toolNameShort}.controllers;

import ${package}.${toolNameShort}.service.${fileNamePrefix}Service;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Controller for ${fileNamePrefix}
 * @author Kuali Mobility Team (mobility.collab@kuali.org)
 * @since ${version}
 */
@Controller
@RequestMapping("/${toolNameShort}")
public class ${fileNamePrefix}ControllerImpl {

	/** 
	 * A reference to a Logger 
	 */
	private static final Logger LOG = Logger.getLogger( ${fileNamePrefix}ControllerImpl.class );

	/**
	 * A reference to the <code>${fileNamePrefix}Service</code>
	 */
	@Resource(name="${toolNameShort}Service")
	private ${fileNamePrefix}Service service;

	@Resource(name="kmeProperties")
	private Properties kmeProperties;

	/**
	 * Controller to load the index page for this tool
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpServletRequest request, Model uiModel) {
		String viewName = null;

		if( "3".equalsIgnoreCase( getKmeProperties().getProperty("kme.uiVersion","classic") ) ) {
				viewName = "ui3/${toolNameShort}/index";
		} else {
				viewName = "${toolNameShort}/index";
		}
		return viewName;
	}

	@RequestMapping(value="/templates/{key}")
	public String getAngularTemplates(
		@PathVariable("key") String key,
		HttpServletRequest request,
		Model uiModel ) {
		return "ui3/${toolNameShort}/templates/"+key;
	}

	@RequestMapping(value = "/js/{key}.js")
	public String getJavaScript(
		@PathVariable("key") String key,
		HttpServletRequest request,
		Model uiModel) {
		return "ui3/${toolNameShort}/js/"+key;
	}

	/**
	 * Sets the reference to the <code>${fileNamePrefix}Service</code>
	 */
	public void setService(${fileNamePrefix}Service service) {
		this.service = service;
	}

	public Properties getKmeProperties() {
		return kmeProperties;
	}

	public void setKmeProperties(Properties kmeProperties) {
		this.kmeProperties = kmeProperties;
	}
}
