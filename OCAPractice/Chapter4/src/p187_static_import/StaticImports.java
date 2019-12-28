// Static imports are for importing static members of classes. 
// The purpose of static import is you don't have to specify which class each static method or variable comes from when calling them. 

package p187_static_import;

import java.util.List;
import static java.util.Arrays.asList;	// static import

class StaticImports {

	public static void main(String[] args) {
		List<String> list = asList("one", "two");		// not Arrays.asList()
	}
}
