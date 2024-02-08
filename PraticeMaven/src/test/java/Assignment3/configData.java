package Assignment3;

import java.io.IOException;

public interface configData {

	public void readExcel() throws IOException;
	public void fetchData(String k);
	public void teardown();
}
