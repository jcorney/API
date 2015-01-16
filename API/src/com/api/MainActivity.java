package com.api;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	int myValue = 0;
	String myString = "Hello World";

	private TextView myAPILevel;

	@SuppressWarnings("deprecation")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myAPILevel = (TextView) this
				.findViewById(R.id.text_APILevel);
		
		myValue = Integer.valueOf(android.os.Build.VERSION.SDK);
		
		String myString = String.valueOf(myValue);
		
		switch (myValue) {
		case 1:
			myAPILevel.setText("Android 1.0 \t" + "API = " + myString);			
			break;
			
		case 2:
			myAPILevel.setText("Android 1.1 \t" + "API = " + myString);			
			break;
		
		case 3:
			myAPILevel.setText("Android 1.5 \t" + "API = " + myString);					
			break;
			
		case 4:
			myAPILevel.setText("Android 1.6 \t" + "API = " + myString);			
			break;
			
		case 5:
			myAPILevel.setText("Android 2.0 \t" + "API = " + myString);			
			break;
		
		case 6:
			myAPILevel.setText("Android 2.0.1 \t" + "API = " + myString);					
			break;			
		
		case 7:
			myAPILevel.setText("Android 2.1 \t" + "API = " + myString);					
			break;
			
		case 8:
			myAPILevel.setText("Android 2.2 \t" + "API = " + myString);			
			break;
			
		case 9:
			myAPILevel.setText("Android 2.3 \t" + "API = " + myString);			
			break;
		
		case 10:
			myAPILevel.setText("Android 2.3.3 \t" + "API = " + myString);					
			break;			
		
		case 11:
			myAPILevel.setText("Android 3.0 \t" + "API = " + myString);					
			break;
			
		case 12:
			myAPILevel.setText("Android 3.1 \t" + "API = " + myString);			
			break;
			
		case 13:
			myAPILevel.setText("Android 3.2 \t" + "API = " + myString);			
			break;
		
		case 14:
			myAPILevel.setText("Android 4.0 \t" + "API = " + myString);					
			break;			
		
		case 15:
			myAPILevel.setText("Android 4.0.3 \t" + "API = " + myString);					
			break;
		
		case 16:
			myAPILevel.setText("Android 4.1 \t" + "API = " + myString);					
			break;
			
		case 17:
			myAPILevel.setText("Android 4.2 \t" + "API = " + myString);			
			break;
			
		case 18:
			myAPILevel.setText("Android 4.3 \t" + "API = " + myString);			
			break;
		
		case 19:
			myAPILevel.setText("Android 4.4 \t" + "API = " + myString);					
			break;			
		
		case 20:
			myAPILevel.setText("Android 4.4W \t" + "API = " + myString);					
			break;
			
		case 21:
			myAPILevel.setText("Android 4.X \t" + "API = " + myString);					
			break;
		

		default:
			break;
		}
			
		
		
	}

}
