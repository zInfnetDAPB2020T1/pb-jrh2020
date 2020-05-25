package com.example.gestorfinanceiro.operacoes.tasks

import android.content.Context
import android.os.AsyncTask
import android.widget.Toast
import com.example.gestorfinanceiro.database.DbBuilder
import com.example.gestorfinanceiro.entidades.Operacao

class AddOperacaoTask(val context: Context, val nome:String, val valor:Double, val id : Int) : AsyncTask<Void, Void, String>(){

    override fun doInBackground(vararg params: Void?): String {
     val db = DbBuilder.getInstance(context)
     db.operacaoDAO().armazenarOp(Operacao(valor, nome, id))
     return "Ganho adicionado"
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        Toast.makeText(context, result, Toast.LENGTH_LONG).show()
    }

}