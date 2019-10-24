package com.hedera.demo.config;

public final class AppNet {
    private boolean signMessages = false;
    private boolean encryptMessages = false;
    private boolean rotateKeys = false;
    private int rotateKeyFrequency = 0;
    private String kmsSolution = "";
    private String mirrorAddress = "";
    private String queueProtocol = "";

    public boolean getSignMessages() {
        return signMessages;
    }
    public void setSignMessages(boolean signMessages) {
        this.signMessages = signMessages;
    }
    public boolean getEncryptMessages() {
        return encryptMessages;
    }
    public void setEncryptMessages(boolean encryptMessages) {
        this.encryptMessages = encryptMessages;
    }
    public boolean getRotateKeys() {
        return this.rotateKeys;
    }
    public void setRotateKeys(boolean rotateKeys) {
        this.rotateKeys = rotateKeys;
    }
    public int getRotateKeyFrequency() {
        return this.rotateKeyFrequency;
    }
    public void setRotateKeyFrequency(int rotateKeyFrequency) {
        this.rotateKeyFrequency = rotateKeyFrequency;
    }
    public String getKmsSolution() {
        return this.kmsSolution;
    }
    public void setKmsSolution(String kmsSolution) {
        this.kmsSolution = kmsSolution;
    }
    public String getMirrorAddress() {
        return this.mirrorAddress;
    }
    public void setMirrorAddress(String mirrorAddress) {
        this.mirrorAddress = mirrorAddress;
    }
    public String getQueueProtocol() {
        return queueProtocol;
    }
    public void setQueueProtocol(String queueProtocol) {
        this.queueProtocol = queueProtocol;
    }
}
