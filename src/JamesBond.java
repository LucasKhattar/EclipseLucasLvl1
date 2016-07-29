
public class JamesBond {
int findcode(Vault safe){
	for (int i = 0; i < 100000000; i++) {
		if(safe.trycode(i)){
			return i;
		}
	}
	return -1;
}
}
