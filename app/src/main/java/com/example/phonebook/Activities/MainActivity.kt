package com.example.phonebook.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phonebook.Adapters.RecAdapterCU
import com.example.phonebook.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cuArray = resources.getStringArray(R.array.cUnit)

        initCUdetails()

        val alungoliNames = resources.getStringArray(R.array.alungoliNames)
        val alungoliNums = resources.getStringArray(R.array.alungoliNums)
        val bugengiNames = resources.getStringArray(R.array.bugengiNames)
        val bugengiNums = resources.getStringArray(R.array.bugengiNums)
        val busendeNames = resources.getStringArray(R.array.busendeNames)
        val busendeNums = resources.getStringArray(R.array.busendeNums)
        val buyamaNames = resources.getStringArray(R.array.buyamaNames)
        val buyamaNums = resources.getStringArray(R.array.buyamaNums)
        val esikuluNames = resources.getStringArray(R.array.esikuluNames)
        val esikuluNums = resources.getStringArray(R.array.esikuluNums)
        val igeroNames = resources.getStringArray(R.array.igeroNames)
        val igeroNums = resources.getStringArray(R.array.igeroNums)
        val lulibaNames = resources.getStringArray(R.array.lulibaNames)
        val lulibaNums = resources.getStringArray(R.array.lulibaNums)
        val lungaNames = resources.getStringArray(R.array.lungaNames)
        val lungaNums = resources.getStringArray(R.array.lungaNums)
        val mabungeNames = resources.getStringArray(R.array.mabungeNames)
        val mabungeNums = resources.getStringArray(R.array.mabungeNums)
        val mayenjeNames = resources.getStringArray(R.array.mayenjeNames)
        val mayenjeNums = resources.getStringArray(R.array.mayenjeNums)
        val mjiniNames = resources.getStringArray(R.array.mjiniNames)
        val mjiniNums = resources.getStringArray(R.array.mjiniNums)
        val mundikaNames = resources.getStringArray(R.array.mundikaNames)
        val mundikaNums = resources.getStringArray(R.array.mundikaNums)
        val murendeNames = resources.getStringArray(R.array.murendeNames)
        val murendeNums = resources.getStringArray(R.array.murendeNums)
        val muyafwaNames = resources.getStringArray(R.array.muyafwaNames)
        val muyafwaNums = resources.getStringArray(R.array.muyafwaNums)
        val nakhakinaNames = resources.getStringArray(R.array.nakhakinaNames)
        val nakhakinaNums = resources.getStringArray(R.array.nakhakinaNums)
        val namalengaNames = resources.getStringArray(R.array.namalengaNames)
        val namalengaNums = resources.getStringArray(R.array.namalengaNums)
        val nangomaNames = resources.getStringArray(R.array.nangomaNames)
        val nangomaNums = resources.getStringArray(R.array.nangomaNums)
        val nasiraNames = resources.getStringArray(R.array.nasiraNames)
        val nasiraNums = resources.getStringArray(R.array.nasiraNums)

        val cuRecyclerView = findViewById<RecyclerView>(R.id.recCUid)

        cuRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        cuRecyclerView.setHasFixedSize(true)

        val cuRecAdapter = RecAdapterCU(cuArray)

        cuRecyclerView.adapter = cuRecAdapter

        cuRecAdapter.setOnItemClickListener(object : RecAdapterCU.OnItemClickListener {
            override fun onItemClick(v: View, position: Int) {

                val tvClickText = v.findViewById<TextView>(R.id.textViewCU).text.toString()

                val intent = Intent(this@MainActivity, CHVactivity::class.java)

                if (tvClickText.equals("Alungoli", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", alungoliNames)

                    intent.putExtra("numberKey", alungoliNums)

                    startActivity(intent)

                } else if (tvClickText.equals("Bugengi", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", bugengiNames)

                    intent.putExtra("numberKey", bugengiNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Busende", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", busendeNames)

                    intent.putExtra("numberKey", busendeNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Buyama", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", buyamaNames)

                    intent.putExtra("numberKey", buyamaNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Esikulu", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", esikuluNames)

                    intent.putExtra("numberKey", esikuluNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Igero", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", igeroNames)

                    intent.putExtra("numberKey", igeroNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Luliba", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", lulibaNames)

                    intent.putExtra("numberKey", lulibaNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Lunga", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", lungaNames)

                    intent.putExtra("numberKey", lungaNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Mabunge", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", mabungeNames)

                    intent.putExtra("numberKey", mabungeNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Mayenje", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", mayenjeNames)

                    intent.putExtra("numberKey", mayenjeNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Mjini", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", mjiniNames)

                    intent.putExtra("numberKey", mjiniNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Mundika", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", mundikaNames)

                    intent.putExtra("numberKey", mundikaNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Murende", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", murendeNames)

                    intent.putExtra("numberKey", murendeNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Muyafwa", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", muyafwaNames)

                    intent.putExtra("numberKey", muyafwaNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Nakhakina", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", nakhakinaNames)

                    intent.putExtra("numberKey", nakhakinaNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Namalenga", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", namalengaNames)

                    intent.putExtra("numberKey", namalengaNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Nangoma", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", nangomaNames)

                    intent.putExtra("numberKey", nangomaNums)

                    startActivity(intent)


                }else if (tvClickText.equals("Nasira", true)) {

                    val intent = Intent(this@MainActivity, CHVactivity::class.java)

                    intent.putExtra("cuNameKey", cuArray[position])

                    intent.putExtra("nameKey", nasiraNames)

                    intent.putExtra("numberKey", nasiraNums)

                    startActivity(intent)


                }

            }


        })
    }

    private fun initCUdetails() {

        val alungoliNames = resources.getStringArray(R.array.alungoliNames)
        val alungoliNums = resources.getStringArray(R.array.alungoliNums)
        val bugengiNames = resources.getStringArray(R.array.bugengiNames)
        val bugengiNums = resources.getStringArray(R.array.bugengiNums)
        val busendeNames = resources.getStringArray(R.array.busendeNames)
        val busendeNums = resources.getStringArray(R.array.busendeNums)
        val buyamaNames = resources.getStringArray(R.array.buyamaNames)
        val buyamaNums = resources.getStringArray(R.array.buyamaNums)
        val esikuluNames = resources.getStringArray(R.array.esikuluNames)
        val esikuluNums = resources.getStringArray(R.array.esikuluNums)
        val igeroNames = resources.getStringArray(R.array.igeroNames)
        val igeroNums = resources.getStringArray(R.array.igeroNums)
        val lulibaNames = resources.getStringArray(R.array.lulibaNames)
        val lulibaNums = resources.getStringArray(R.array.lulibaNums)
        val lungaNames = resources.getStringArray(R.array.lungaNames)
        val lungaNums = resources.getStringArray(R.array.lungaNums)
        val mabungeNames = resources.getStringArray(R.array.mabungeNames)
        val mabungeNums = resources.getStringArray(R.array.mabungeNums)
        val mayenjeNames = resources.getStringArray(R.array.mayenjeNames)
        val mayenjeNums = resources.getStringArray(R.array.mayenjeNums)
        val mjiniNames = resources.getStringArray(R.array.mjiniNames)
        val mjiniNums = resources.getStringArray(R.array.mjiniNums)
        val mundikaNames = resources.getStringArray(R.array.mundikaNames)
        val mundikaNums = resources.getStringArray(R.array.mundikaNums)
        val murendeNames = resources.getStringArray(R.array.murendeNames)
        val murendeNums = resources.getStringArray(R.array.murendeNums)
        val muyafwaNames = resources.getStringArray(R.array.muyafwaNames)
        val muyafwaNums = resources.getStringArray(R.array.muyafwaNums)
        val nakhakinaNames = resources.getStringArray(R.array.nakhakinaNames)
        val nakhakinaNums = resources.getStringArray(R.array.nakhakinaNums)
        val namalengaNames = resources.getStringArray(R.array.namalengaNames)
        val namalengaNums = resources.getStringArray(R.array.namalengaNums)
        val nangomaNames = resources.getStringArray(R.array.nangomaNames)
        val nangomaNums = resources.getStringArray(R.array.nangomaNums)
        val nasiraNames = resources.getStringArray(R.array.nasiraNames)
        val nasiraNums = resources.getStringArray(R.array.nasiraNums)


    }
}
