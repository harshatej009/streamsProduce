package harsh.rane;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJson {
	public Patient fromJson(String json) throws JsonParseException, JsonMappingException, IOException
	{
		Patient patient = new ObjectMapper().readValue(json, Patient.class);
		return patient;
	}

}
