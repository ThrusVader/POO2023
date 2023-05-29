package maps;

import java.util.HashMap;
import java.util.Map;

public class ConverterMatrizMaps {
	
	public static void main(String[] args) {
		String[][] vehicles = {{"FIAT","ARGO"},
							   {"RENAULT","SANDERO"},
							   {"FORD","EXPLORER"},
							   {"VW","POLO"}};
		
		Map<String, String> mapVeh = new HashMap<String, String>();
		
		for (int linha = 0; linha < vehicles.length; linha++) {
			for (int coluna = 0; coluna < vehicles[linha].length; coluna++) {
				if (coluna == 0) {
					mapVeh.put(vehicles[linha][coluna], vehicles[linha][coluna + 1]);
					break;
				}
			}
		}
		System.out.println(mapVeh);
	}
}
