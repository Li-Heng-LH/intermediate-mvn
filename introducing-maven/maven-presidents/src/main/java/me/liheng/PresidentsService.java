package me.liheng;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class PresidentsService {

    private static List<President> presidents;

    private static final Logger LOGGER = LoggerFactory.getLogger(PresidentsService.class);

    /**
     * Default constructor for the service. This service will load the readonly data of the {@link President}s
     */
    public PresidentsService(){
        super();
        if(null == presidents) {
            LOGGER.debug("Loading presidents into class storage");
            loadPresidents();
        }
    }


    public List<President> getPresidents(){
        return presidents;
    }



    private void loadPresidents(){
        String json = "";

        ClassLoader classLoader = getClass().getClassLoader();
        try {
            json = IOUtils.toString(classLoader.getResourceAsStream("presidents.json"));
            ObjectMapper mapper = new ObjectMapper();
            presidents = mapper.readValue(json, new TypeReference<List<President>>(){});
        } catch (IOException e) {
            LOGGER.error("Failure loading presidents from file", e);
            throw new RuntimeException(e);
        }
        LOGGER.info("Presidents have been loaded");
    }

    public static void main(String[] args){
        PresidentsService service = new PresidentsService();
        service.getPresidents().forEach(System.out::println);
    }

}
