package org.allenai.scienceparse;

import org.allenai.scienceparse.pdfapi.PDFToken;

public class PaperToken {
	private PDFToken pdfToken; //the underlying pdf token
								//TODO: perhaps this class should inherit from PDFToken
	private int page; //page number in pdf doc
	private int line; //line number in pdf doc
	
	public static PaperToken generateStartStopToken() {
		return new PaperToken(null, -1, -1);
	}
	
	public PaperToken(PDFToken pt, int ln, int pg) {
		setPdfToken(pt);
		setLine(ln);
		setPage(pg);
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public PDFToken getPdfToken() {
		return pdfToken;
	}

	public void setPdfToken(PDFToken pdfToken) {
		this.pdfToken = pdfToken;
	}
	
	public String toStringShort() {
		if(pdfToken==null)
			return "";
		else
			return pdfToken.token;
	}
	
}
