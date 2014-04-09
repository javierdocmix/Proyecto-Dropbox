package android.Dropbox;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.ByteArrayBuffer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Dropbox1Activity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Obtenemos una referencia a los controles de la interfaz
		final EditText txtCorreo = (EditText) findViewById(R.id.TxtCorreo);
		final EditText txtPassword = (EditText) findViewById(R.id.TxtPassword);
		final Button btnLogin = (Button) findViewById(R.id.BtnLogin);

		// Implementamos el evento “click” del botón
		btnLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String email, pswd;
				email = txtCorreo.getText().toString();
				pswd = txtPassword.getText().toString();
				if (email == null || email.length() < 1 || pswd == null || pswd.length() < 1) {
					Context context = getApplicationContext();
					int duration = Toast.LENGTH_LONG;
					Toast toast = Toast.makeText(context,
							"Introduzca correo y contraseña", duration);
					toast.show();

				} else {

					// Comprobamos que el correo y contraseña aportados pertenecen a una cuenta de dropbox
					
					
					
					// Creamos el Intent
					Intent intent = new Intent(Dropbox1Activity.this, Logueado.class);
					// Añadimos la información correo al intent que se le pasa a la nueva actividad
					Bundle b = new Bundle();
					b.putString("CORREO", txtCorreo.getText().toString());
					intent.putExtras(b);
					startActivity(intent);
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.layout.main, menu);
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}