package com.pagerank;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.*;


public class ExtractLinks {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String csv= args[0];
		String htmlfile = args[1];
		String output ="Edge.txt";
		
		BufferedReader buffer = new BufferedReader(new FileReader(csv));
		Map<String,String> map = new HashMap<String,String>();
		Set<String> edges = new HashSet<String>();
		
		String line;
		while((line = buffer.readLine()) != null ) {
			String[] pair = line.split(",");
			map.put(pair[1], pair[0]);
		}
		buffer.close();
		
		File folder = new File(htmlfile);
		for(File file : folder.listFiles()) {
			System.out.println("Running...");
			Document doc = Jsoup.parse(file,"UTF-8", args[2]);
			Elements links = doc.select("a[href]");
			
			for(Element link : links){
		        String url = link.attr("abs:href").trim();
		        if(map.containsKey(url)){
		        	edges.add(file.getName() + " " + map.get(url));
		        }
		    }
		}
		
		PrintWriter writer = new PrintWriter(output, "UTF-8");
	    for( String s: edges) {
	    		writer.println(s);
	    }
	    writer.flush();
	    writer.close();
	}
}
