package me.ely.kotlin.issue.domain

@NoArgCons
data class Device(
    val imei: String,
    val sn: String,
    val productName: String,
    val productType: String
) : BaseEntity()