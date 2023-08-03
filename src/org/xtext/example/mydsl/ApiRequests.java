package org.xtext.example.mydsl;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiRequests {

	String last_token = "";
	
	ArrayList<String> docker_files = new ArrayList<String>() {{ 
		add("dockerfile"); 
		add(".dockerignore"); 
		add("Dockerfile"); 
		add("docker-compose.yml");
	}};
	
	ArrayList<String> maven_files = new ArrayList<String>() {{
		add("mvnw.cmd");
		add("pom.xml");
		add("mvnw");
	}};
	
	ArrayList<String> python_files_req = new ArrayList<String>() {{
		add("requirements.txt");
	}};

	ArrayList<String> npm_packages_files = new ArrayList<String>() {{
		add("package.json");
	}};
	
    public void arbreRecursif(String link, String root, String indent) throws IOException {
    	
    	JSONArray repo_content = new JSONArray(root);
    	    	
    	for(int i = 0 ; i < repo_content.length() ; i++) {
    		
    		//System.out.println(repo_content.get(i).toString());
    		
    		JSONObject jsonObject = new JSONObject(repo_content.get(i).toString());
    		
    		String name = jsonObject.get("name").toString();
    		String type = jsonObject.get("type").toString();
    		
    		if(type.equals("dir")) {
    			System.out.println("\u001B[40m" + indent + "📂 " + name + "\u001B[0m");
    			String link_reformat = link + "/" + name;
    			String resp = this.response(link_reformat, last_token);
    			arbreRecursif(link_reformat, resp.toString(), indent + "  ");
    		} else if(docker_files.contains(name)) {
    			System.out.println("\u001B[44m" + indent + "📄 " + name + " -> Docker 🐋\u001B[0m");
    		} else if(maven_files.contains(name)) {
    			System.out.println("\u001B[44m" + indent + "📄 " + name + " -> Maven 🪶\u001B[0m");
    		} else if(python_files_req.contains(name)) {
    			System.out.println("\u001B[44m" + indent + "📄 " + name + " -> Python packages 🐍\u001B[0m");
    		} else if(npm_packages_files.contains(name)) {
    			System.out.println("\u001B[44m" + indent + "📄 " + name + " -> NPM packages 🇳🅿️Ⓜ️\u001B[0m");
    		} else {
    			System.out.println("\u001B[40m" + indent + "📄 " + name + "\u001B[0m");
    		}	
    	}
    }

	
	public String response(String target, String token) throws IOException {

		last_token = token;
		
        String apiUrl = target; // Replace this with the actual API URL

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // !!
            connection.setRequestProperty("Authorization", "Bearer " + token);
            //connection.setRequestProperty("Content-Type", "application/json");
            // Add more headers if needed

            int statusCode = connection.getResponseCode();

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder responseBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                responseBuilder.append(line);
            }
            reader.close();
            String responseBody = responseBuilder.toString();

            connection.disconnect();

            return responseBody;
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return "null";
    }
}
