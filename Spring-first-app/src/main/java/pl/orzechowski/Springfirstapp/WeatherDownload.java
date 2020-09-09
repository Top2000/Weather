package pl.orzechowski.Springfirstapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import pl.orzechowski.Springfirstapp.entity.WeatherR;
import pl.orzechowski.Springfirstapp.model.WeatherApp;
import pl.orzechowski.Springfirstapp.model.dto.WeatherDTO;
import pl.orzechowski.Springfirstapp.repo.WeatherRepo;
@CrossOrigin
@RestController

public class WeatherDownload {
	private WeatherRepo weatherRepo;
	
	public WeatherDownload(WeatherRepo weatherRepo) {
		this.weatherRepo = weatherRepo;
	}
	@GetMapping("/location/{q}")
    public List<WeatherDTO> getWeatherDownload(@PathVariable String q)
	{
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
       httpHeaders.add( "X-Cache-Key", "/data/2.5/forecast?APPID=02dd1ffb98e6bd6168f3f60819abbc05&q=suwalki&units=metric");
        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        ResponseEntity<WeatherApp> exchange = restTemplate.exchange("http://api.openweathermap.org/data/2.5/forecast?q=Suwalki&units=metric&APPID=02dd1ffb98e6bd6168f3f60819abbc05", 
        		HttpMethod.GET, 
        		httpEntity, 
        		WeatherApp.class);
        
        
      List<WeatherDTO> weatherDtos = exchange.getBody().getList().stream().
    		   map(list -> new WeatherDTO( 
    				   list.getMain().getTemp(),
    				   list.getMain().getTempMin(), 
    				   list.getMain().getTempMax(),
    				   list.getMain().getPressure(),
    				   list.getMain().getHumidity())).
    				//   list.getWind().getSpeed(),
    				  // list.getRain().get3h())).
    		   collect(Collectors.toList());
        return  weatherDtos;
    //  return exchange.getBody();
       
	}
	@PostMapping("/adddata")
	public void addData (@RequestBody WeatherR weatherR) {
	weatherRepo.save(weatherR);
	}
	@GetMapping ("/getdata")
	public List<WeatherR>getRs(WeatherR weatherR){
	return weatherRepo.findAll();
	}
	
}
	
