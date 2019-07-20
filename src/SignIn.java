import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.time.*;

public class SignIn {
    private String date;
    private String timeIn;

    public SignIn() {
    }

    public void toLogWriter(LogWriter w, String date, int id) throws IOException {
        timeIn = (LocalTime.now().toString()).substring(0, 8);
        w.addSignIn(id, timeIn, date);
    }
}