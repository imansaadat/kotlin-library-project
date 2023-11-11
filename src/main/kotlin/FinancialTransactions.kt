class FinancialTransactions(var quantity:Int= 0) {

    var sum:Int = 0;
    var total:Int = 0;
    var discount = 0;

    // محاسیه قیمت اصلی کتاب بدون تخفیف
    fun showPrimaryPrice(price:Int,name:String?){
        sum = price * quantity
        println(" قیمت $quantity عدد کتاب $name بدون احتساب کد تخفیف $sum تومان می باشد ")
    }

    //  اعمال کد تخفیف
    fun showDiscountPrice(code:String?,price:Int){
        if(quantity >= 2 && !code.isNullOrBlank()){
            sum = price * quantity
            discount = sum * 35 / 100
            total = sum - discount
            println("هزینه نهایی کتاب های شما یا احتساب 35 درصد تخفیف $total می باشد.")
        }
    }
}



