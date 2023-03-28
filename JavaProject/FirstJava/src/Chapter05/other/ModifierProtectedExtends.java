package Chapter05.other;

import Chapter05.ModifierProtected;

public class ModifierProtectedExtends extends ModifierProtected {
	
	// name, age, tell()
	
	public static void main(String[] args) {
		
		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
		
		mpe.name = "이강인";
		mpe.age = 30;
		
		mpe.tell();
		
	}

}
