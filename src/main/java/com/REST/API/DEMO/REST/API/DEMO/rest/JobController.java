package com.REST.API.DEMO.REST.API.DEMO.rest;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.REST.API.DEMO.REST.API.DEMO.job.Datum;
import com.REST.API.DEMO.REST.API.DEMO.job.JobResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/job")
public class JobController {

    @GetMapping("/{geoID}/{Keyword}")
    public ResponseEntity<List<Datum>> searchJob(@PathVariable String Keyword, @PathVariable String geoID) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://linkedin-data-api.p.rapidapi.com/search-jobs-v2?keywords="+Keyword+"&locationId="+geoID+"&datePosted=anyTime&sort=mostRelevant"))
		.header("x-rapidapi-key", "efa875b554msha464c70acb393b0p108ae5jsnb84ee8b04248")
		.header("x-rapidapi-host", "linkedin-data-api.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        ObjectMapper mapper = new ObjectMapper();
        JobResponse jobResponse = mapper.readValue(response.body(), JobResponse.class);
        
        return ResponseEntity.ok(jobResponse.getData());
    }

}
