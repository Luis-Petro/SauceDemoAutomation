package com.co.vozy.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CucumberUtil {
    //     removed this concept because of version issues in DataTable
//     public static synchronized Map<String, String> TableDictionaryConverter(DataTable table) {
    public static synchronized Map<String, String> TableDictionaryConverter(List<List<String>> data) {
        Map<String, String> mapTable = new HashMap<String, String>();
        for (List<String> rows : data) {
            mapTable.put(rows.get(0), rows.get(1));
        }
        return mapTable;
    }
}
