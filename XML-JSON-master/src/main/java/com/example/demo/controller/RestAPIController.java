package com.example.demo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;

import com.example.demo.converter.JsonConverter;
import com.example.demo.converter.j_to_x;
import com.example.demo.converter.x_to_j;
import com.example.demo.entity.xjdb;
import com.example.demo.repositories.DBservice;
import com.github.asilvestre.jpurexml.XmlParseException;

@SpringBootApplication
@EnableJpaRepositories("com.example.demo.*")
@EntityScan("com.example.demo.*")   
@RestController
public class RestAPIController {

    @Autowired
    private DBservice dbsvc;
    private JsonConverter js;    
    private DOMParserCheck xv;
    
	@RequestMapping(value = "/xml2json", method = RequestMethod.POST, consumes = "application/xml", produces = "application/json")
	public ResponseEntity<String> xtoj(HttpServletRequest request, @RequestBody String xml) throws XmlParseException, ParserConfigurationException, SAXException, IOException {


		String json="";
		System.out.println(xv.xmlvalid(xml));
		if(xv.xmlvalid(xml)) {
			//XMLcheck(xml)
			json = js.convertXml(xml);
			return new ResponseEntity<String>(json, HttpStatus.OK);
		}
//		if(XMLcheck(xml)) {
//			if(xml.contains("<?")) {// 헤더에 형식이 들어가있으며 
//			xml=xml.substring(xml.indexOf("?>")+2);
//			xml = "<root>"+ xml+"</root>";
//			json = js.convertXml(xml);
//			return new ResponseEntity<String>(json, HttpStatus.OK);
//		}
//		else {
//			xml = "<root>"+ xml+"</root>";
//			json = js.convertXml(xml);
//			return new ResponseEntity<String>(json, HttpStatus.OK);
//		}
//		}
		else {
			return new ResponseEntity<String>(json, HttpStatus.BAD_REQUEST);
		}				
	}
	@RequestMapping(value = "/json2xml", method = RequestMethod.POST, consumes = "application/json", produces = "application/xml")
	public ResponseEntity<String> jtox(HttpServletRequest request, @RequestBody String jsonx) throws JSONException {

		String output="";
		String json = jsonx.trim();		//띄워쓰기, 엔터 제거
		System.out.println(JSONUtils.isJSONValid(json));
		
		if(JSONUtils.isJSONValid(json) && !(j_to_x.json2xml(json).equals("")) && LengCheck(json)) {
			output = j_to_x.json2xml(json);
			
			output = "<root>" + output + "</root>";

			return new ResponseEntity<String>(output, HttpStatus.OK);
		}
		else {
			System.out.println("체크2 : "+JSONUtils.isJSONValid(json));
			return new ResponseEntity<String>(output, HttpStatus.BAD_REQUEST);
		}	
		
	}

	
	@RequestMapping(value = "/dbinfo", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Map<String, Map<String, Object>>> status() {
		Map<String, Map<String, Object>> dbmap = new HashMap<String, Map<String, Object>>();
		//map.put("status", "success");
		Map<String,Object> x2jdb = new HashMap<String,Object>();
		x2jdb.put("well", dbsvc.countByX2j("well"));
		x2jdb.put("fail", dbsvc.countByX2j("fail"));
	
		Map<String,Object> j2xdb = new HashMap<String,Object>();
		j2xdb.put("well", dbsvc.countByJ2x("well"));
		j2xdb.put("fail", dbsvc.countByJ2x("fail"));
		
		dbmap.put("x2j",x2jdb);
		dbmap.put("j2x", j2xdb);
		
		return new ResponseEntity<Map<String,Map<String,Object>>>(dbmap, HttpStatus.OK);
	}

    @RequestMapping(value="/save", method=RequestMethod.GET)
    public xjdb test(xjdb testdata) {
    	
    	System.out.println(testdata.toString());
    	xjdb val = dbsvc.save(testdata);
    	
    	return val;
    }
	
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST, produces = "application/xml")
	public ResponseEntity<String> uploadJsonFile(HttpServletRequest request, @RequestParam("file") MultipartFile file)
			throws IOException {
		String json = new String(file.getBytes());
		System.out.println("uploadJsonFile success \n" + json);

		return new ResponseEntity<String>(json, HttpStatus.OK);
	}
	
	//-------------
	public boolean XMLcheck(String x) {
		if(x.contains("<") && x.contains(">") && x.contains("</")) {
			return true;
		}
		else {
			return false;
		}		
	}

	public boolean LengCheck(String json) {
		if(json.substring(json.length()-1).equals("}")) {
			return true;
		}else {
			return false;
		}
	}
}