package pl.orzechowski.Springfirstapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="weather")
public  class WeatherR{
	@Id
	//private String id;
	//private String Name;
	private double temp;
	private double  temp_min;
	private double  temp_max;
	private double  pressure;
	private double  humidity;
//	private int wind_speed;
//	private int rain_3h;
//	private int Date;
	


//	public String getid() {
//		return id;
//	}
//	public void setdt(String id) {
//		this.id = id;
//	}
//	public String getName() {
//		return Name;
//	}
//	public void setName(String name) {
//		Name = name;
//	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(int temp_min) {
		this.temp_min = temp_min;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(int temp_max) {
		this.temp_max = temp_max;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
//	public int getWind_speed() {
//		return wind_speed;
//	}
//	public void setWind_speed(int wind_speed) {
//		this.wind_speed = wind_speed;
//	}
//	public int getRain_3h() {
//		return rain_3h;
//	}
//	public void setRain_3h(int rain_3h) {
//		this.rain_3h = rain_3h;
//	}
//	public int getDate() {
//		return Date;
//	}
//	public void setDate(int date) {
//		Date = date;
//	}
	
}
