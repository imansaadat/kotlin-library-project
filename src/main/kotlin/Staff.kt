class Staff(
    var name: String?,
    var family: String?,
    var age: Int?,
    var address: String?,
    var cellPhone: String?,
    var salary: Int?
) {
    fun displayFinancialRewards() {
        println("مزایا و پاداش‌های مالی برای کارمند $name محاسبه شد.")
    }
}