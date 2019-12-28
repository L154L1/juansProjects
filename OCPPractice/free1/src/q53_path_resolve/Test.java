// Passquestion q83

//What is the result?
//A. /app/sys/log
//	/readme/server/exe
//B. /app/log/sys
//	/server/exe/readme
//C. /app/./sys/log
//	/readme
//D. /app/./sys/log
//	/server/exe/readme

//Correct Answer: C

package q53_path_resolve;

import java.nio.file.*;

public class Test {

	public static void main(String[] args) {
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log");
		Path path2 = Paths.get("/server/exe/");
		Path res2 = path2.resolve("/readme/");
		System.out.println(res1);
		System.out.println(res2);

	}

}

// \app\.\sys\log
// \readme
