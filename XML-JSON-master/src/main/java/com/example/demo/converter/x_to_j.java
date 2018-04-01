package com.example.demo.converter;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;

import de.odysseus.staxon.json.JsonXMLConfig;
import de.odysseus.staxon.json.JsonXMLConfigBuilder;
import de.odysseus.staxon.json.JsonXMLOutputFactory;

public class x_to_j {

	   public static String xml2json(String xml){    
	        StringReader input = new StringReader(xml);    
	        StringWriter output = new StringWriter();    
	        JsonXMLConfig config = new JsonXMLConfigBuilder().autoArray(true).autoPrimitive(true).prettyPrint(true).build();    
	        try {    
	            XMLEventReader reader = XMLInputFactory.newInstance().createXMLEventReader(input);    
	            XMLEventWriter writer = new JsonXMLOutputFactory(config).createXMLEventWriter(output);    
	            writer.add(reader);    
	            reader.close();    
	            writer.close();    
	        } catch( Exception e){    
	            e.printStackTrace();    
	        } finally {    
	            try {    
	                output.close();    
	                input.close();    
	            } catch (IOException e) {    
	                e.printStackTrace();    
	            }    
	        }    
	        return output.toString();    
	    }    
}
