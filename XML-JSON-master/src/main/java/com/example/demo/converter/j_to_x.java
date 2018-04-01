package com.example.demo.converter;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;

import de.odysseus.staxon.json.JsonXMLConfig;
import de.odysseus.staxon.json.JsonXMLConfigBuilder;
import de.odysseus.staxon.json.JsonXMLInputFactory;
import de.odysseus.staxon.xml.util.PrettyXMLEventWriter;

public class j_to_x {
    /**  
     * json string convert to xml string  
     */    
    public static String json2xml(String json){    
        StringReader input = new StringReader(json);    
        StringWriter output = new StringWriter();    
        JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();    
        try {    
            XMLEventReader reader = new JsonXMLInputFactory(config).createXMLEventReader(input);    
            XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);    
            writer = new PrettyXMLEventWriter(writer);    
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
        if(output.toString().length()>=38){//remove <?xml version="1.0" encoding="UTF-8"?>    
            return output.toString().substring(39);    
        }    
        return output.toString();    
    }
 
}
