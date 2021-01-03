package com.bilgeadam.lambdaexpressionsexample1;

import java.util.List;

public class AnalyzeTool {

    public void showResult(List<String> list, String searchStr, StringAnalyzer analyzer) {

        for (String string : list) {
            if (analyzer.analyze(string, searchStr)) {
                System.out.println("Matched : " + string);
            }
        }
    }

}
