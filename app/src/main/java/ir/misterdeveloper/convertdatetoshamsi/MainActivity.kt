package ir.misterdeveloper.convertdatetoshamsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.misterdeveloper.datetoshamsi.PersianDate
import ir.misterdeveloper.datetoshamsi.PersianTime
import ir.misterdeveloper.datetoshamsi.PersianTimeAndDate
import ir.misterdeveloper.toastcustom.ToastCustom

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convertDate = PersianDate("2022-12-4")

        ToastCustom.Mammad(this, convertDate.getPersianDate())

        val convertTime = PersianTime("15:00")
        ToastCustom.Mammad(this, convertTime.getPersianTime())

        val convertTimee = PersianTimeAndDate("2022/12/04T15:00:00")
        ToastCustom.Mammad(this, convertTimee.getPersianTime())
        ToastCustom.Mammad(this, convertTimee.getPersianDate())


    }
}