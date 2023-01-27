package ir.misterdeveloper.datetoshamsi


import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class PersianTimeAndDate(private val dateAndTime: String) {


    private var timeIran: String? = null
    private var dateShamsi: String? = null


    private fun convert() {

        val separationTimeAndDate = dateAndTime.split("T").toTypedArray()

        val time = separationTimeAndDate[1]
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


        val dateMatch = separationTimeAndDate[0]
        if (dateMatch.contains("/")){

            val dateGregorianToPersian = dateMatch.split("/").toTypedArray()

            val dateConvert = DateConvert()
            dateConvert.GregorianToPersian(
                dateGregorianToPersian[0].toInt(),
                dateGregorianToPersian[1].toInt(),
                dateGregorianToPersian[2].toInt()
            )

            dateShamsi = dateConvert.year
                .toString() + "/" + dateConvert.month + "/" + dateConvert.day

        }
        else{

            val dateGregorianToPersian = dateMatch.split("-").toTypedArray()

            val dateConvert = DateConvert()
            dateConvert.GregorianToPersian(
                dateGregorianToPersian[0].toInt(),
                dateGregorianToPersian[1].toInt(),
                dateGregorianToPersian[2].toInt()
            )

            dateShamsi = dateConvert.year
                .toString() + "/" + dateConvert.month + "/" + dateConvert.day

        }

    }

    fun getPersianTime(): String {
        convert()
        return timeIran.toString()

    }

    fun getPersianDate(): String {
        convert()
        return dateShamsi.toString()
    }



}