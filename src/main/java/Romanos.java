
public class Romanos {

	public String convertirARomano(int input) {
		String retorno = "";
		if (input > 999 || input < 0)
			throw new RuntimeException();

		if (input >= 100) {
			retorno += analizar((input - (input % 100)) / 100, "C", "D", "M");
			input = (input - (input / 100) * 100);
		}
		if (input > 10) {
			retorno += analizar((input - (input % 10)) / 10, "X", "L", "C");
			input = (input - (input / 10) * 10);
		}
		if (input < 10) {
			retorno += analizar(input, "I", "V", "X");
		}
		return retorno;
	}

	private String analizar(int numeroAAnalizar, String unidad, String quinquena, String decena) {
		switch (numeroAAnalizar) {
		case 1:
			return unidad;

		case 2:
			return unidad + unidad;

		case 3:
			return unidad + unidad + unidad;

		case 4:
			return unidad + quinquena;

		case 5:
			return quinquena;

		case 6:
			return quinquena + unidad;

		case 7:
			return quinquena + unidad + unidad;

		case 8:
			return quinquena + unidad + unidad + unidad;
		case 9:
			return unidad + decena;

		case 0:
			return "";

		default:
			return "";

		}
	}
}
