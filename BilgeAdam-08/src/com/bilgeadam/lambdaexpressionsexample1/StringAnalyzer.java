package com.bilgeadam.lambdaexpressionsexample1;

@FunctionalInterface
public interface StringAnalyzer {
    public boolean analyze(String target, String seachedStr);
}
