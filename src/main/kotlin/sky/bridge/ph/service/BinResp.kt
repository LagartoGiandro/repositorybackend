package sky.bridge.service.impl.bin.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.awt.image.ByteLookupTable

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class BinResp(
    //data class
    @field:JsonProperty(value = "Number")
    val num: Number? = null,
    @field:JsonProperty(value = "Country")
    val country: Country? = null,
    @field:JsonProperty(value = "Bank")
    val bank: Bank? = null,


//    var lookup = require("binlookup")();
//    lookup('45717360').then(data=> console.log(data)),

    @field:JsonProperty(value = "Scheme")
    val scheme: String? = null,
    @field:JsonProperty(value = "Type")
    val type: String? = null,
    @field:JsonProperty(value = "Brand")
    val brand: String? = null,
    @field:JsonProperty(value = "Prepaid")
    val prepaid: Boolean? = null
)

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Number(
    //underNumber
    @field:JsonProperty(value = "Length")
    val length: Int? = null,
    @field:JsonProperty(value = "Luhn")
    val luhn: Boolean? = null,

)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Sample(
    @field:JsonProperty(value = "Car")
    val length: String? = null
)

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Country(
    //underCountry
    @field:JsonProperty(value = "Numeric")
    val numeric: String? = null,
    @field:JsonProperty(value = "Alpha2")
    val alpha2: String? = null,
    @field:JsonProperty(value = "Name")
    val name: String? = null,
    @field:JsonProperty(value = "Emoji")
    val emoji: String? = null,
    @field:JsonProperty(value = "Currency")
    val currency: String? = null,
    @field:JsonProperty(value = "Latitude")
    val latitude: Int? = null,
    @field:JsonProperty(value = "Longitude")
    val longitude: Int? = null,
)

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Bank(
    //underBank
    @field:JsonProperty(value = "Names")
    val names: String? = null,
    @field:JsonProperty(value = "Url")
    val url: String? = null,
    @field:JsonProperty(value = "Phone")
    val phone: String? = null,
    @field:JsonProperty(value = "City")
    val city: String? = null
)

