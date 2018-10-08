package com.kotlination.sum
 
fun main(args: Array<String>) {
 
	val productList = listOf(
			Product("A", 100),
			Product("B", 200),
			Product("C", 300)
	)
 
	val totalPriceInList1: Int = productList.map { it.quantity }.sum()
	println("sum(): " + totalPriceInList1)
 
	val totalPriceInList2: Int = productList.sumBy { it.quantity }
	println("sumBy(): " + totalPriceInList2)
}
