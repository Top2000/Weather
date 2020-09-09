package pl.orzechowski.Springfirstapp.model.dto;

public class WeatherDTO {

	
	//private String dt;
	private double temp;
	private double  temp_min;
	private double  temp_max;
	private double  pressure;
	private double  humidity;
//	private double wind_speed;
//	private double rain_3h;
//	private String Date;
	
	

	
	public WeatherDTO() {
		
	}


//	public WeatherDTO(String , Double temp, Double temp_min, Double temp_max, Integer pressure, Integer humidity, Integer wind_speed, Integer rain_3h, String dtTxt) {
//	
//		// TODO Auto-generated constructor stub
//	}


	public WeatherDTO(Double temp, Double temp_min, Double temp_max, Integer pressure, Integer humidity) {
		//this.dt = dt;
		this.temp = temp;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;

	}


//	public String getdt() {
//		return dt;
//	}
//	public void setdt(String dt) {
//		this.dt = dt;
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

	


}
