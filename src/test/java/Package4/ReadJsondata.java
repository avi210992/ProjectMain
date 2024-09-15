package Package4;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsondata {

	
static	List<HashMap<String,String>> func() throws IOException 
	{
	String readdatafromJson = 	FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\test\\java\\Package4\\testdata.json"),StandardCharsets.UTF_8);
		ObjectMapper obj = new ObjectMapper();
	List<HashMap<String,String>> al1	= obj.readValue(readdatafromJson, new TypeReference<List<HashMap<String,String>>>(){});
		return al1;
	}
}
