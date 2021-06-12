package com.simpleblockchain;

public class TransactionInput {
    public String transactionOutputId;
    public TransactionOutput UTXO;

    public TransactionInput(String transactionOuputId) {
        this.transactionOutputId = transactionOuputId;
    }
}
