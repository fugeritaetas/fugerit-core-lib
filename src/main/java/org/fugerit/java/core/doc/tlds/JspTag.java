package org.fugerit.java.core.doc.tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import org.fugerit.java.core.web.tld.helpers.TagSupportHelper;

/*
 * 
 *
 * @author Morozko
 *
 */
public class JspTag extends TagSupportHelper {

	/*
	 * 
	 */
	private static final long serialVersionUID = -4312310531274216168L;

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.TagSupport#doEndTag()
	 */
	public int doEndTag() throws JspException {
		try {
			this.pageContext.getOut().flush();
		} catch (IOException e) {
			//e.printStackTrace();
		}
		return super.doEndTag();
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
	 */
	public int doStartTag() throws JspException {
		return EVAL_PAGE;
	}

}


