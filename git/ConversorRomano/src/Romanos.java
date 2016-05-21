
public class Romanos {

	public String convertirARomano(int i) {
		String retorno ="";
		if(i<999 && i<= 0)
			return "";
		
		if(i >= 100){
		retorno += analizar((i - (i%100))/100,"C","D","M");
		i = (i - (i/100)*100);}
		if(i >10){
		retorno += analizar((i - (i%10))/10,"X","L","C");
		i = (i - (i/10)*10);}
		if(i<10){
		retorno += analizar(i,"I","V","X");}
		return retorno;
	}

	private String analizar(int numeroAAnalizar,String unidad, String quinquena,String decena) {
		String retornito = "";
		switch (numeroAAnalizar) {
		case 1:
			retornito =  unidad;
			break;
		case 2:
			retornito =  unidad + unidad;
			break;
			
		case 3:
			retornito =  unidad + unidad +unidad;
			break;
			
		case 4:
			retornito =  unidad + quinquena;
			break;
			
		case 5:
			retornito =  quinquena;
			break;
			
		case 6:
			retornito =  quinquena+unidad;
			break;
			
		case 7:
			retornito =  quinquena + unidad + unidad;
			break;
			
		case 8:
			retornito =  quinquena + unidad + unidad + unidad;
			break;
			
		case 9:
			retornito =  unidad + decena;
			break;
		case 0: 
			retornito = "";
			
		}
		return retornito;
	}
}
