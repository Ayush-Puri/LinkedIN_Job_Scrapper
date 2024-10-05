package com.REST.API.DEMO.REST.API.DEMO.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/job")
public class JobController {

    @GetMapping("/{geoID}/{Keyword}")
    public void searchJob(@PathVariable String Keyword, @PathVariable String geoID) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://linkedin-data-api.p.rapidapi.com/search-jobs?keywords="+Keyword+"&locationId="+geoID+"&datePosted=anyTime&sort=mostRelevant"))
                .header("x-rapidapi-key", "efa875b554msha464c70acb393b0p108ae5jsnb84ee8b04248")
                .header("x-rapidapi-host", "linkedin-data-api.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
