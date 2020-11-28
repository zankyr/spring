import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    private static final String LINE_SEPARATOR = "\n";
    private static final String FIELD_SEPARATOR = ",";

    private static final String GSM_NET_CODE = "INT_VF_GDSP_VPN";
    private static final String SIM_TYPE = "VODAFONE_GDSP_M2M";
    private static final Integer PROVIDER_ID = 9;


    public static List<String> getInsertQueriesFromCsv(String inputString) {
        String[] lines = inputString.split(LINE_SEPARATOR);

        List<String> insertQueries = new ArrayList<>();
        for (String line : lines) {
            insertQueries.add(createInsertQuery(line));
        }

        return insertQueries;
    }

    private static String createInsertQuery(String line) {
        String[] fields = line.split(FIELD_SEPARATOR);

        return String.format(INSERT_TEMPLATE, PROVIDER_ID, GSM_NET_CODE, fields[0], fields[1], SIM_TYPE);
    }

}
