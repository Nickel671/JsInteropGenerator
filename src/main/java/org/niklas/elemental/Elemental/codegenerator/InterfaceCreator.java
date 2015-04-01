package org.niklas.elemental.Elemental.codegenerator;

import java.io.File;
import java.io.PrintWriter;
import javax.lang.model.element.Modifier;

import org.niklas.elemental.Elemental.parser.idl.IdlAttribute;
import org.niklas.elemental.Elemental.parser.idl.IdlInterface;
import org.niklas.elemental.Elemental.parser.idl.IdlOperation;
import org.niklas.elemental.Elemental.parser.idl.IdlOperationArgument;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;

public class InterfaceCreator {
	
	public String createJsInterop(IdlInterface value){
		TypeSpec.Builder classSpec = TypeSpec.interfaceBuilder(value.getName())
				.addAnnotation(createJsTypeAnnotation(value));
		for(String extender : value.getExtender()){
			classSpec.addSuperinterface(TypeVariableName.get(extender));
		}
		createGetterAndSetter(value, classSpec);
		generateMethods(value, classSpec);
		JavaFile file = JavaFile.builder("org.niklas.elemental.Elemental.client.elements", classSpec.build()).build();
		String rtn = file.toString();
		saveFile(value.getName(), rtn);
		return rtn;
	}

	private void generateMethods(IdlInterface value, TypeSpec.Builder classSpec) {
		
		for(IdlOperation operation : value.getOperations()){
			if(!operation.isContainsObjectType()){
			try{
				MethodSpec.Builder method = MethodSpec.methodBuilder(operation.getName())
						.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
						.returns(TypeVariableName.get(operation.getType()));
			
			for(IdlOperationArgument argument : operation.getArguments()){
				try{
					method.addParameter(TypeVariableName.get(argument.getType()), argument.getName());
				}catch(IllegalArgumentException e){
					method.addParameter(TypeVariableName.get(argument.getType()), argument.getName()+"_");
				}
			}
			classSpec.addMethod(method.build());
			}catch(IllegalArgumentException e){
				
			}
			}
		}
	}

	private void createGetterAndSetter(IdlInterface value,
			TypeSpec.Builder classSpec) {
		for(IdlAttribute attribute : value.getAttributes()){
			if(!attribute.isConatinsObjectType()){
			String methodName = attribute.getName().substring(0,1).toUpperCase()+attribute.getName().substring(1);
			TypeVariableName typeName = TypeVariableName.get(attribute.getType());
			MethodSpec attributeGet = MethodSpec
					.methodBuilder("get"+methodName)
					.addAnnotation(JsProperty.class)
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
					.returns(typeName)
					.build();
			classSpec.addMethod(attributeGet);
			if(!attribute.isOnlyGetter()){
				
				MethodSpec attributeSet = MethodSpec
						.methodBuilder("set"+methodName)
						.addAnnotation(JsProperty.class)
						.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
						.addParameter(typeName, "value")
						.build();
				classSpec.addMethod(attributeSet);
			}
			}
			
		}
	}

	private AnnotationSpec createJsTypeAnnotation(IdlInterface value) {
		return AnnotationSpec.builder(JsType.class).addMember("prototype", "$S", value.getName()).build();
	}
	public void saveFile(String name,String file){
		String pathName = "target/generated-sources/gwt/org/niklas/elemental/Elemental/client/elements/"+name+".java";
		PrintWriter out;
		try{
			File a = new File(pathName);
			
			
			a.createNewFile();
			out = new PrintWriter(a);
			out.print(file);
			out.flush();
			out.close();
		}catch(Exception e){
			
		}
	}
	
}
