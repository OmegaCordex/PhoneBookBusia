package com.example.phonebook.Activities

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.PopupMenu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phonebook.Adapters.RecAdapterCHV
import com.example.phonebook.R
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener

class CHVactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chvactivity)

        val bundle: Bundle? = intent.extras

        // val comUnit = bundle!!.getString("key")
        val chvName = bundle!!.getStringArray("nameKey")
        val chvNumber = bundle.getStringArray("numberKey")


        val recycler2 = findViewById(R.id.recCHVid) as RecyclerView

        recycler2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recycler2.setHasFixedSize(true)

        val adapterMine = RecAdapterCHV(chvName as Array<String>, chvNumber as Array<String>)

        recycler2.adapter = adapterMine

        adapterMine.setOnItemClickListener(object : RecAdapterCHV.OnItemClickListener {
            override fun onItemClick(view: View, position: Int) {


                val pop = PopupMenu(this@CHVactivity, view)
                pop.inflate(R.menu.chv_menu)
                pop.setOnMenuItemClickListener {

                    when (it.title) {

                        "CALL" ->
                            Dexter.withActivity(this@CHVactivity)
                                .withPermission(android.Manifest.permission.CALL_PHONE)
                                .withListener(object : PermissionListener {
                                    @SuppressLint("MissingPermission")

                                    override fun onPermissionGranted(response: PermissionGrantedResponse?) {


                                        val intentTwo = Intent(
                                            Intent.ACTION_CALL,
                                            Uri.parse("tel:" + chvNumber[position])
                                        );

                                        startActivity(intentTwo)


                                    }

                                    override fun onPermissionRationaleShouldBeShown(
                                        permission: PermissionRequest?,
                                        token: PermissionToken?
                                    ) {

                                        AlertDialog.Builder(this@CHVactivity)
                                            .setTitle("Permission to call required")
                                            .setMessage("Kindly allow this App to use the inbuilt call App")
                                            .setNegativeButton(
                                                "Cancel",
                                                DialogInterface.OnClickListener { dialogInterface, i ->
                                                    dialogInterface.dismiss()
                                                    token?.cancelPermissionRequest()

                                                })
                                            .setPositiveButton(
                                                "Yes",
                                                DialogInterface.OnClickListener { dialogInterface, i ->
                                                    dialogInterface.dismiss()
                                                    token?.continuePermissionRequest()


                                                })
                                            .show()

                                    }

                                    override fun onPermissionDenied(response: PermissionDeniedResponse?) {
                                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                                    }


                                }).check()

                        "SMS" ->

                            Dexter.withActivity(this@CHVactivity)
                                .withPermission(android.Manifest.permission.SEND_SMS)
                                .withListener(object : PermissionListener {
                                    @SuppressLint("MissingPermission")
                                    override fun onPermissionGranted(response: PermissionGrantedResponse?) {

                                        val uri = Uri.parse("smsto:" + chvNumber[position])
                                        val intentSMS = Intent(Intent.ACTION_SENDTO, uri)
                                        intentSMS.putExtra("sms_body", "Hello CHV...")
                                        startActivity(intentSMS)


//                                        val uri = StringBuilder("sms:")
//                                        for (i in chvNumber.indices) {
//                                            uri.append(chvNumber[i])
//                                            uri.append(", ")
//                                        }
//                                        val smsIntent = Intent(Intent.ACTION_VIEW)
//                                        smsIntent.type = "vnd.android-dir/mms-sms"
//                                        smsIntent.data = Uri.parse(uri.toString())
//                                        smsIntent.putExtra("sms_body", "Body of Message")
//                                        startActivity(smsIntent)

                                    }

                                    override fun onPermissionRationaleShouldBeShown(
                                        permission: PermissionRequest?,
                                        token: PermissionToken?
                                    ) {

                                        AlertDialog.Builder(this@CHVactivity)
                                            .setTitle("Allow this permission")
                                            .setMessage("Allow this App to use the inbuilt Text message App...")
                                            .setNegativeButton(
                                                "Cancel",
                                                DialogInterface.OnClickListener { dialogInterface, i ->
                                                    dialogInterface.dismiss()
                                                    token?.cancelPermissionRequest()

                                                })
                                            .setPositiveButton(
                                                "Yes",
                                                DialogInterface.OnClickListener { dialogInterface, i ->
                                                    dialogInterface.dismiss()
                                                    token?.continuePermissionRequest()


                                                })
                                            .show()


                                    }

                                    override fun onPermissionDenied(response: PermissionDeniedResponse?) {
                                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                                    }


                                }).check()


                    }
                    true

                }

                pop.show()


            }


        })


    }
}
