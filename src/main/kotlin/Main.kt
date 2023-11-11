fun main() {
    // ایجاد یک نمونه از کتاب
    val book = Book("هری پاتر", "رمان", "+10",  7000)

//    اجرای تابع مربوط به مشخصات کتاب
    book.displayBookInfo()

    // ایجاد یک نمونه از مشتری
    val customer = Customer("ایمان سعادت","kotlin",1)

    // ایجاد یک نمونه از تراکنشهای مالی
    val financialTransactions = FinancialTransactions(customer.quantity)

    //    اجرای تابع نمایش قیمت کتاب
    financialTransactions.showPrimaryPrice(book.price,book.name)

//     اجرای تابع نمایش قیمت کتاب بعد از اعمال کردن کد تخفیف
    financialTransactions.showDiscountPrice(customer.discountCode,book.price)





}






