package com.tutorial.javatips.resource;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Slf4j
public class CsvApp {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = CsvApp.class.getResourceAsStream("/csv/MOCK_DATA.csv");
        InputStreamReader reader = new InputStreamReader(inputStream);
        CSVParser records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader); // DEFAULT csv delimiter koma (,)  | withFirstRecordAsHeader() kita angap record pertama ada header

        for (CSVRecord record : records){

            String id = record.get("id"); // get("value_header") membaca key header pada file csv
            String firstName = record.get("first_name");
            String lastName = record.get("last_name");
            String email = record.get("email");
            String gender = record.get("gender");
            String ipAddress = record.get("ip_address");

            log.info("{} {} {} {} {} {}", id, firstName, lastName, email, gender, ipAddress);

        }


    }

}
