package com.bilgeadam.lambdaexpressionsexample1;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ahmet");
        list.add("ali");
        list.add("Ayşe");
        list.add("Bekir");
        list.add("Behçet");

        String searchStr = "Be";
        String searchStr2 = "a";
        String searchStr3 = "Bekir";
        char myChar = 't';

        AnalyzeTool analyzeTool = new AnalyzeTool();

        System.out.println("==== EQUALS ====");
        analyzeTool.showResult(list, searchStr, new StringAnalyzer() {
            @Override
            public boolean analyze(String target, String seachedStr) {
                return target.equals(seachedStr);
            }
        });

        analyzeTool.showResult(list, searchStr3, (target, seachedStr) -> target.equals(seachedStr));

        System.out.println("==== CONTAINS ====");

        analyzeTool.showResult(list, searchStr, new StringAnalyzer() {
            @Override
            public boolean analyze(String target, String seachedStr) {
                return target.contains(seachedStr);
            }
        });

        analyzeTool.showResult(list, searchStr, (target, seachedStr) -> target.contains(seachedStr));

        System.out.println("==== END WITH ====");
        analyzeTool.showResult(list, String.valueOf(myChar), (t, s) -> t.endsWith(s));

        System.out.println("==== LESS THEN 5 ====");
        analyzeTool.showResult(list, searchStr, (t, s) -> t.length() < 5);

        System.out.println("==== GREATER THEN 4 ====");
        analyzeTool.showResult(list, searchStr, (t, s) -> t.length() > 4);

        System.out.println("==== STARTS WITH ====");
        analyzeTool.showResult(list, searchStr2, new StringAnalyzer() {
            @Override
            public boolean analyze(String target, String seachedStr) {
                return target.toLowerCase().startsWith(seachedStr);
            }
        });

        analyzeTool.showResult(list, searchStr2, (t, s) -> t.toLowerCase().startsWith(s));
    }
}
