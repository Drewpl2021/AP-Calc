package pe.edu.upeu.calcxml

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var valAnt=0.0
    var valAct=0.0
    var operador=""
    private lateinit var resultado:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        resultado=findViewById(R.id.txtResult)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonSetup()

    }

    fun buttonSetup(){
        var listaB= arrayOf(R.id.nueve, R.id.ocho, R.id.siete, R.id.seis, R.id.cinco, R.id.cuatro, R.id.tres, R.id.dos, R.id.uno,
            R.id.btnSum, R.id.btnMult,R.id.igual, R.id.btnRest,R.id.division)
        for (button in listaB){
            val buttonx=findViewById<Button>(button)
            buttonx.setOnClickListener { onclikListTener(buttonx) }
        }
    }

    fun  onclikListTener(view:View){
        when(view.id){
            R.id.nueve, R.id.ocho, R.id.siete, R.id.seis, R.id.cinco, R.id.cuatro, R.id.tres, R.id.dos, R.id.uno->{
                var buttonx=findViewById<Button>(view.id)
                apenddNum(buttonx.text.toString())
            }


        }
    }

    fun apenddNum(valor: String){
        resultado.append(valor)
    }



}