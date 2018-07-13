package chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    private List<String> rows;

    /**
     * Creates a new instance of the CSVReader class
     */
    public CSVReader() {
        rows = new ArrayList<>();
    }

    /**
     * Adds a row to the rows
     * @param row row to add
     */
    public void addRow(String row) {
        rows.add(row);
    }


    /**
     * Returns the number of rows in a CSV file
     * @return number of rows
     */
    public int numberOfRows() {
        return rows.size();
    }

    /**
     * Return the number of fields in a CSV file
     * @param row the row to return fields for
     * @return the number of fields
     */
    public int numberOfFields(int row) {
        validateRow(row);


        return getColumns(row).size();
    }

    /**
     * Returns the number of columns in a field with a quote
     * @param row
     * @return
     */
    private List<String> getColumns(int row) {
        Scanner scanner = new Scanner(rows.get(row - 1));
        List<String> columns = new ArrayList<>();
        scanner.useDelimiter(",");
        while(scanner.hasNext()) {
            String field = scanner.next().trim();

            if(field.startsWith("\"")) {
                while(field.endsWith("\"")) {
                    field += "," + scanner.next();
                }
                field = field.substring(1, field.length() - 1);
            }
            field = field.replaceAll("\"\"", "\"");
            columns.add(field);
        }
        return columns;
    }

    /**
     * Verifies the row is valid
     * @param row the row
     * @throws IllegalArgumentException if the row is not valid
     */
    private void validateRow (int row) {
        if(row < 0 || row > rows.size()) {
            throw new IllegalArgumentException(("Row must be between 1 and " + rows.size()));
        }
    }

    /**
     * Returns a given field from a specific row and column
     * @param row the row
     * @param column the column
     * @return the field
     */
    public String field(int row, int column) {
        validateRow(row);
        validateColumns(column, numberOfFields(row));
        List<String> columns = getColumns(row);
        return columns.get(column - 1);
    }

    /**
     * Verifies the column is valid
     * @param column the column
     * @param numberOfColumns
     */
    private void validateColumns(int column, int numberOfColumns) {
        if(column < 0 || column > numberOfColumns) {
            throw new IllegalArgumentException("Column must be between 1 and " + numberOfColumns);
        }
    }


}
