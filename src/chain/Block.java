package chain;

import java.util.Date;

public class Block {
	public String hash;
	public String previousHash;
	public String data;
	private long timeStamp;

	// Block constructor
	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		// Making sure we do this after we set the other values;
		this.hash = calculateHash();
	}

	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256(previousHash + Long.toBinaryString(timeStamp) + data);
		return calculatedhash;
	}

}
