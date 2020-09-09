package pl.orzechowski.Springfirstapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.orzechowski.Springfirstapp.entity.WeatherR;

@Repository
public interface WeatherRepo extends JpaRepository<WeatherR, String>{
	
}
