package uvt.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Déclaration des objets relatifs à l'interface
    //*******************************************************
    public Button btn;
    public RadioButton rbHomme;
    public TextView txtHi;
    public EditText txtNom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Etablissement des liens avec l'interface graphique
        //*******************************************************
        btn=(Button) findViewById(R.id.bouton);
        txtHi=(TextView) findViewById(R.id.msg);
        rbHomme=(RadioButton) findViewById(R.id.boutonHomme);
        txtNom=(EditText) findViewById(R.id.nom);

        //Création du listner (Ecouteur) sur l'évènement onClick du bouton btn
        //***********************************************************************
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Variable locale pour le titre de l'utilisateur "Mr" ou "Mrs"
                //***************************************************************
                String titre="";
                //Définition de titre et de la couleur du texte en fonction du sexe
                //*******************************************************************
                if (rbHomme.isChecked()){
                    titre="Mr";
                    txtHi.setTextColor(Color.rgb(255,0,0));
                }else {
                    titre = "Mme";
                    txtHi.setTextColor(Color.rgb(0,255,0));
                }
                //Modification du message affiché
                //*******************************************************
                txtHi.setText("Bonjour "+titre+" "+txtNom.getText());
             }
        });
    }
}
