package chain;

import java.security.*;
import java.util.ArrayList;

public class Transactions {
	public String transactionId;
	public PublicKey sender;
	public PublicKey recipient;
	public float value;
	public byte[] signature;
	
	public ArrayList<TransactionInput> inputs = new ArrayList<TransactionInput>();
}
