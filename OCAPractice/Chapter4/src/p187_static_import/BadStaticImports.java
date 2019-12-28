package p187_static_import;

import static java.util.Arrays;
import static java.util.Arrays.asList;
static import java.util.Arrays.*;

public class BadStaticImports {

	public static void main(String[] args) {
		Arrays.asList("one");
	}
}
