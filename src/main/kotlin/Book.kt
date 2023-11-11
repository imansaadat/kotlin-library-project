class Book(
    val name: String,
    val topic: String,
    var ageGroup: String?,
    val price: Int = 10000  // مقدار پیشفرض 10000 می باشد
) {

    //    نمایش نام و موضوع کتاب
    fun displayBookInfo() {
        println("نام کتاب مورد نظر شما $name و نوع آن $topic می باشد ")
    }

    //  نمایش قیمت اصلی
    fun displayPrice() {
        println("قیمت اصلی کتاب مورد نظر شما بدون در نظر گرفتن کد تخفیف $price هزار تومان می باشد. ")
    }

}