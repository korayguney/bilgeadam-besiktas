package com.bilgeadam.utils;

public enum HashAlgorithm {

    MD2("MD2"),
    MD5("MD5"),
    SHA1("SHA-1"),
    SHA256("SHA-256"),
    SHA512("SHA-512");

    private String hashAlg;

    private HashAlgorithm(String hashAlg) {
        this.hashAlg = hashAlg;
    }

    public String getHashAlg(){
        return hashAlg;
    }


}
