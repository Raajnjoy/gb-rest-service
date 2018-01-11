/**
 * @author Raju K Singh
 */
package rest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Api {

    private final int calls;
    private final String timestamp;

    public Api(int call) {
        this.calls = call;
        this.timestamp = getISO8601StringForDate(new Date());
    }

	public int getCalls() {
		return calls;
	}

	public String getTimestamp() {
		return timestamp;
	}
	private static String getISO8601StringForDate(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		return dateFormat.format(date);
	}
   
}
