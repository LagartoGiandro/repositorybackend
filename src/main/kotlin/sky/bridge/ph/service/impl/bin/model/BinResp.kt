package sky.bridge.ph.service.impl.bin.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class BinResp(
    //data class
    @field:JsonProperty(value = "number")
    val num: number? = null,
    @field:JsonProperty(value = "country")
    val country: country? = null,
    @field:JsonProperty(value = "bank")
    val bank: bank? = null,

    @field:JsonProperty(value = "scheme")
    val scheme: String? = null,
    @field:JsonProperty(value = "type")
    val type: String? = null,
    @field:JsonProperty(value = "brand")
    val brand: String? = null,
    @field:JsonProperty(value = "prepaid")
    val prepaid: Boolean? = null
)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class number(
    //underNumber
    @field:JsonProperty(value = "length")
    val length: Int? = null,
    @field:JsonProperty(value = "luhn")
    val luhn: Boolean? = null,
)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class country(
    //underCountry
    @field:JsonProperty(value = "numeric")
    val numeric: String? = null,
    @field:JsonProperty(value = "alpha2")
    val alpha2: String? = null,
    @field:JsonProperty(value = "name")
    val name: String? = null,
    @field:JsonProperty(value = "emoji")
    val emoji: String? = null,
    @field:JsonProperty(value = "currency")
    val currency: String? = null,
    @field:JsonProperty(value = "latitude")
    val latitude: Int? = null,
    @field:JsonProperty(value = "longitude")
    val longitude: Int? = null,
)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class bank(
    //underBank
    @field:JsonProperty(value = "names")
    val names: String? = null,
    @field:JsonProperty(value = "url")
    val url: String? = null,
    @field:JsonProperty(value = "phone")
    val phone: String? = null,
    @field:JsonProperty(value = "city")
    val city: String? = null
)

