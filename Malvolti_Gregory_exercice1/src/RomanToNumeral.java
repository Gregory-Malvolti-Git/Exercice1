
public class RomanToNumeral {
	public Integer getNumeral(String nbRomain) {
		Integer nombre = 0;
		if(nbRomain == "") {
			return nombre;
		}
		if(nbRomain == "I") {
			nombre = 1;
			return nombre;
		}
		if(nbRomain == "V") {
			nombre = 5;
			return nombre;
		}
		if(nbRomain == "X") {
			nombre = 10;
			return nombre;
		}
		if(nbRomain == "L") {
			nombre = 50;
			return nombre;
		}
		if(nbRomain == "C") {
			nombre = 100;
			return nombre;
		}
		if(nbRomain == "D") {
			nombre = 500;
			return nombre;
		}
		if(nbRomain == "M") {
			nombre = 1000;
			return nombre;
		}
		return nombre;
	}
}
