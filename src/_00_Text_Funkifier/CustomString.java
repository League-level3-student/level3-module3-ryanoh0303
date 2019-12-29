package _00_Text_Funkifier;

public  class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String text= "";
		for(int i=0; i<s.length(); i++) {
			if((i)%2==0) {
				text= text+ s.toUpperCase().charAt(i);
			}
			else {
				text= text+s.toLowerCase().charAt(i);
			}
		}
		
		return text;
	}

}
