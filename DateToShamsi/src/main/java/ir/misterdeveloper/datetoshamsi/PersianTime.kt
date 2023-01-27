package ir.misterdeveloper.datetoshamsi

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class PersianTime(private val time: String) {

    private var timeIran: String? = null


    private fun convert() {

        val df = SimpleDateFormat("HH:mm")
        df.timeZone = TimeZone.getTimeZone("UTC")
        var date: Date? = null
        try {
            date = df.parse(time)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        df.timeZone = TimeZone.getTimeZone("GMT+3:30")
        timeIran = df.format(date)
    }

    fun getPersianTime(): String {
        convert()
        return timeIran.toString()
    }
}