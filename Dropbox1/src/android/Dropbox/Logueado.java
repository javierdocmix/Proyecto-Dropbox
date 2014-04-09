package android.Dropbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Logueado extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueado);
        
      //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.TxtEmail);

        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola " + bundle.getString("CORREO"));
       }
}
