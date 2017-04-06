package org.fugerit.java.core.doc.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;

public class DataServletOutputStream extends ServletOutputStream {

	private ByteArrayOutputStream baos;
	
	/* (non-Javadoc)
	 * @see java.io.OutputStream#write(int)
	 */
	public void write(int b) throws IOException {
		baos.write( b );
	}

	public DataServletOutputStream(ByteArrayOutputStream baos) {
		this.baos = baos;
	}
	
}