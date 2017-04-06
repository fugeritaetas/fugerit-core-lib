package org.fugerit.java.core.doc.tlds;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * 
 *
 * @author Morozko
 *
 */
public class UrlTag extends TagSupport {

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
	 */
	public int doStartTag() throws JspException {
		StringBuffer buffer = new StringBuffer();
		if ( "true".equalsIgnoreCase( this.getRelative() ) ) {
			HttpServletRequest request = (HttpServletRequest) this.pageContext.getRequest();
			buffer.append( request.getScheme() );
			buffer.append( "://" );
			buffer.append( request.getServerName() );
			buffer.append( ":" );
			buffer.append( request.getServerPort() );
			buffer.append( request.getContextPath() );
		}
		buffer.append( this.getUrl() );
		System.out.println( "URL : "+buffer );
		try {
			this.pageContext.getOut().print( buffer.toString() );
		} catch (Exception e) {}
		return EVAL_PAGE;
	}

	/*
	 * 
	 */
	private static final long serialVersionUID = -6000737096593291817L;

	private String url;
	
	private String relative;

	/*
	 * @return the relative
	 */
	public String getRelative() {
		return relative;
	}

	/*
	 * @param relative the relative to set
	 */
	public void setRelative(String relative) {
		this.relative = relative;
	}

	/*
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/*
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
}
