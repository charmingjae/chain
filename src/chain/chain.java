package chain;
import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class chain {
	
	// 블록체인의 형태로 만들기 위해 ArrayList 안에 집어넣음
	public static ArrayList<Block> blockchain = new ArrayList<Block>();
	
	public static void main(String[] args) {
		blockchain.add(new Block("Hi im the first bock", "0"));
	}
}
