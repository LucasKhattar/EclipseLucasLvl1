
public class Vault {
	int code;

	public Vault(int i) {
		// TODO Auto-generated constructor stub
		code = i;
	}

	boolean trycode(int codes) {
		if (code == codes) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Vault vault = new Vault(1234);
		//System.out.println(vault.trycode());
		JamesBond james = new JamesBond();
		int j= james.findcode(vault);
		System.out.println(j);
	}
}