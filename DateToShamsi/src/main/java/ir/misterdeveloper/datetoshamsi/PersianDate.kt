package ir.misterdeveloper.datetoshamsi

class PersianDate(private val date: String) {

    private var dateShamsi: String? = null

    private fun convert() {


        if (date.contains("/")) {

            val dateGregorianToPersian = date!!.split("/").toTypedArray()
            val dateConvert = DateConvert()
            dateConvert.GregorianToPersian(

                dateGregorianToPersian[0].toInt(),
                dateGregorianToPersian[1].toInt(),
                dateGregorianToPersian[2].toInt()
            )
            dateShamsi = dateConvert.year
                .toString() + "/" + dateConvert.month + "/" + dateConvert.day

        } else {

            val dateGregorianToPersian = date!!.split("-").toTypedArray()
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

    fun getPersianDate(): String {
        convert()
        return dateShamsi.toString()
    }


}