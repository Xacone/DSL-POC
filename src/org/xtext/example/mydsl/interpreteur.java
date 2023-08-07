package org.xtext.example.mydsl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.arrayElement;
import org.xtext.example.mydsl.myDsl.identify;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.api_token;
import org.xtext.example.mydsl.myDsl.array;
import org.json.JSONArray;
import org.json.JSONObject;

public class interpreteur {

	private static ApiRequests apiRequests = new ApiRequests();
	private static HashMap<String, String> tokens = new HashMap<String, String>();
	private static HashMap<String, ArrayList<String>> identifications = new HashMap<String, ArrayList<String>>();
	private static HashMap<String, ArrayList<String>> target_instances = new HashMap<String, ArrayList<String>>();
	private static HashMap<String, ArrayList<String>> target_repo = new HashMap<String, ArrayList<String>>();
	private static HashMap<String, ArrayList<String>> target_project = new HashMap<String, ArrayList<String>>();
	private static HashMap<String, ArrayList<String>> target_file = new HashMap<String, ArrayList<String>>();

	public static void main(String[] args) throws IOException {
		
		HashMap<String, EList<arrayElement>> arrays = new HashMap<String, EList<arrayElement>>();
		
		Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        MyDslPackage.eINSTANCE.eClass();

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mydsl", new XtextResourceFactory(null));

        URI uri = URI.createURI("eee2.yazidou");
        Resource resource = resourceSet.getResource(uri, true);
        XtextResource xtextResource = (XtextResource) resource;
        
        Model model = (Model) xtextResource.getContents().get(0);
        EList<api_token> api_tokens = model.getTokens();
        EList<identify> identifications = model.getIdentifications();

        for(int i = 0 ; i < model.getArrays().size() ; i++) {
        	String target = model.getArrays().get(i).getTargets().get(0);
        	String array_name = model.getArrays().get(i).getArray_names().get(0);
        	
        	System.out.println("name: " + array_name + "  |  type: " + target);
			ArrayList<String> arrayElements = new ArrayList<String>();
        	for(int j = 0 ; j < model.getArrays().get(i).getArray_contents().size() ; j++) {
        		for(int k = 0 ; k < model.getArrays().get(i).getArray_contents().get(j).getArray().size() ; k++) {
        			arrayElements.add(model.getArrays().get(i).getArray_contents().get(j).getArray().get(k).getValue());
        		}
        	}
        	
        	if(target.equals("instance")) {
         		target_instances.put(array_name, arrayElements);
            } else if(target.equals("repo")) {
        		target_repo.put(array_name, arrayElements);

        	} else if(target.equals("project")) {
        		target_project.put(array_name, arrayElements);

        	} else if(target.equals("file")) {
        		target_file.put(array_name, arrayElements);
        	}
        }
        
        for(int i = 0 ; i < api_tokens.size() ; i++) {
        	tokens.put(api_tokens.get(i).getNom_token(), api_tokens.get(i).getToken());
        	System.out.println(api_tokens.get(i).getToken());
        }
        
        for (String name : target_repo.keySet()) {
            ArrayList<String> bouh = target_repo.get(name);
            System.out.println(name + ": " + bouh);
        }
        
        // Et ensuite chaque token doit être précédé par un "with token"
        String token = tokens.get("token_yazid"); // TOKEN FIXE 
        
        /*
        for (int i = 0 ; i < model.getLoops().size(); i++) {
        	System.out.println(model.getLoops().get(i));
        }
        s*/
        
        String repo_name = "https://github.com/Xacone/DE_MALWARE_DATA_ANALYSER";
        String[] splited_repo_name = repo_name.split("/");
        String repo_name_formated_for_api = "https://api.github.com/repos/" + splited_repo_name[3] + "/" + splited_repo_name[4];
        
        System.out.println(repo_name_formated_for_api);
        
        String target_languages = repo_name_formated_for_api + "/languages";
        String target_contents = repo_name_formated_for_api + "/contents";
        
        String gitApiRequestRepoLanguages = apiRequests.response(target_languages, token);
        String gitApiRequestRepoFirstContent = apiRequests.response(target_contents, token);
                
        //apiRequests.arbreRecursif(target_contents, gitApiRequestRepoFirstContent, "");
        
        // https://api.github.com/repos/ESIR2-PROJET-KEOLIS/processing-storage-unit/languages
        		
        JSONObject json_gitRepoFirstContent = new JSONObject(gitApiRequestRepoLanguages);          
    }
}
