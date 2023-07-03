package sell;

public class Ca {

		public Ca(boolean x) {
		lightStatuse = x;
	}
	//public Ca() {
		
	//}
	
	private boolean lightStatuse;
	
		public void light(boolean inputValue) {
			
			if(inputValue==true && lightStatuse==false) {
		 		lightStatuse=inputValue;
				
			}else if(inputValue==false && lightStatuse==true){
				lightStatuse=inputValue;
			}
		}
		
		public boolean getlightStatuse() {
			return lightStatuse;
		}
		
}
