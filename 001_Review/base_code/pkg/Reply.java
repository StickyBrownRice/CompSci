package pkg;
import java.util.*;
import java.io.*;

public class Reply extends Message {

	// Default Constructor
	public Reply() {
		super();
	}

	// Parameterized Constructor
	public Reply(String auth, String subj, String bod, int i) {
		super(auth, subj, bod, i);
	}

	// Returns if this is a reply (true)
	public boolean isReply(){
		if(!(auth.equals("") && subj.equals("") && bod.equals("") && i == 0) {
			return false;
		}
		return true;
	}
}
