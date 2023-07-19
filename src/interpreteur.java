
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

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
import org.xtext.example.mydsl.myDsl.Addition;
import org.xtext.example.mydsl.myDsl.Greeting;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SumElement;

public class interpreteur {

	public static void main(String[] args) {
		
		Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        MyDslPackage.eINSTANCE.eClass();

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mydsl", new XtextResourceFactory(null));

        URI uri = URI.createURI("eee2.yazidou");
        Resource resource = resourceSet.getResource(uri, true);
        XtextResource xtextResource = (XtextResource) resource;
        
        
        Model model = (Model) xtextResource.getContents().get(0);
        
        if (model.getGreetings().size() > 0) {
            for (EObject greeting : model.getGreetings()) {
                System.out.println("bwahahahhaha hahahahah hahaha " + ((Greeting) greeting).getName() + " hahaha hahahahahah!");
            }
        }
      
        for(Addition addition : model.getAdditions()) {
        	int result = 0;
        	for(SumElement element : addition.getElements()) {
        		result += element.getValue();
        	}
        	System.out.println("Somme = " + result);
        }
        
        
	        /*
	        if (model.getGreetings().size() > 0) {
	            // Interpréter les salutations
	            for (Greeting greeting : model.getGreetings()) {
	                System.out.println("Hello " + greeting.getName() + "!");
	            }
	        } else if (model.getSum() != null) {
	            // Effectuer le calcul de somme
	            int result = calculateSum(model.getSum());
	            System.out.println("Le résultat de la somme est : " + result);
	        } else if (model.getDouleur() != null) {
	            // Traiter la douleur
	            String name = model.getDouleur().getName();
	            System.out.println("Douleur de " + name);
	        } else {
	            System.out.println("Aucune instruction valide trouvée dans le fichier.");
	        }
	     	*/
	}
	
	
}
