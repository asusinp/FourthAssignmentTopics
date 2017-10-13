/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author iaw21752927
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Clases utilizadas: Path, Paths, Files
//		List<String> records = Files.readAllLines(Paths.get("itv"));
//		List<ITV> itvs = new ArrayList<>();
//		for (String record : records) {
//			String[] fields = record.split(",");
//			long id = Long.parseLong(fields[0]);
//			ITV itv = new ITV(id, fields[1], fields[2], fields[3], fields[4]);
//			itvs.add(itv);
//		}
		//Collections.sort(itvs);
		//System.out.println(records);
		//System.out.println(itvs);
		
		ITVManagerImpl manager = new ITVManagerImpl("itv");
	}

}
