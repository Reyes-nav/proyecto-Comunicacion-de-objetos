package com.example.appoperaciones;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText capitalInput;
    private EditText interesInput;
    private EditText tiempoInput;
    private TextView resultadoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculamos los elementos de la interfaz con el código Java
        capitalInput = findViewById(R.id.capitalInput);
        interesInput = findViewById(R.id.interesInput);
        tiempoInput = findViewById(R.id.tiempoInput);
        resultadoText = findViewById(R.id.resultadoText);
    }

    // Función que se ejecuta cuando se presiona el botón "Calcular Interés"
    public void calcularInteres(View view) {
        // Obtenemos los valores de los inputs
        String capitalStr = capitalInput.getText().toString();
        String interesStr = interesInput.getText().toString();
        String tiempoStr = tiempoInput.getText().toString();

        // Verificamos que los campos no estén vacíos antes de hacer el cálculo
        if (!capitalStr.isEmpty() && !interesStr.isEmpty() && !tiempoStr.isEmpty()) {
            double capital = Double.parseDouble(capitalStr);
            double tasaInteres = Double.parseDouble(interesStr);
            double tiempo = Double.parseDouble(tiempoStr);

            // Calculamos el interés simple
            double interes = (capital * tasaInteres * tiempo) / 100;

            // Mostramos el resultado en el TextView
            resultadoText.setText("Interés: $" + interes);
        } else {
            resultadoText.setText("Por favor, complete todos los campos.");
        }
    }
}