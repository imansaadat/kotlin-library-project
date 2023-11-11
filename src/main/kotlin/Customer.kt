class Customer{
    var fullName: String? = null
    var discountCode: String? = null
    var quantity: Int = 0
    constructor(fullName: String?, discountCode: String?,quantity:Int) {
        this.fullName = fullName
        this.discountCode = discountCode
        this.quantity = quantity
        showCode()
    }

    constructor(fullName: String?) {
        this.fullName = fullName
        showText()
    }

    fun showCode() {
        if(quantity >= 2){
            println("اقا/ خانم $fullName کد تخفیف $discountCode با موفقیت برای شما ثبت گردید.")
        }
        else{
            println("شما باید حداقل 2 عدد کتاب خریداری کنید تا کد تخفیف برای شما اعمال شود")
        }

    }

    fun showText() {
        println("متاسفانه برای شما کد تخفیفی ثبت نشده است")
    }
}
