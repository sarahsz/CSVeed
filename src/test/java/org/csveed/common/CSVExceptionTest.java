package org.csveed.common;

import org.csveed.report.CsvException;
import org.csveed.report.GeneralError;
import org.csveed.report.RowPart;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CSVExceptionTest {

	@Test
	public void getError() {
		GeneralError error = new GeneralError("error");
		CsvException exception = new CsvException(error);
		assertEquals(exception.getError(), error);
	}

	@Test
	public void getMessageTest() {
		GeneralError error = new GeneralError("Message ERROR");
		CsvException exception = new CsvException(error);
		assertEquals(exception.getMessage(), "Message ERROR");
	}

	@Test
	public void getLocalizedMessageTest() {
		GeneralError error = new GeneralError("Message ERROR");
		List<String> errorInLines = error.getPrintableLines();
		CsvException exception = new CsvException(error);
		assertEquals(exception.getLocalizedMessage(), "Message ERROR");
	}

	@Test
	public void generalErrorTest() {
		GeneralError error = new GeneralError("Message ERROR");
		assertEquals(error.getLineNumber(), -1);
	}

	@Test
	public void getRowTest() {
		GeneralError error = new GeneralError("Message ERROR");
		ArrayList<RowPart> emptyRowparts = new ArrayList<RowPart>();
		assertEquals(error.getRowParts(), emptyRowparts);
	}

}
