package sky.bridge.ph

import io.quarkus.vertx.web.Header
import io.quarkus.vertx.web.Param
import io.quarkus.vertx.web.Route
import io.smallrye.mutiny.Uni
import io.vertx.ext.web.RoutingContext
import org.eclipse.microprofile.opentracing.Traced
import sky.bridge.service.impl.bin.model.Bank
import sky.bridge.service.impl.bin.model.BinResp
import sky.bridge.service.impl.bin.model.Country
import sky.bridge.service.impl.bin.model.Number
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.core.MediaType

@Traced
@ApplicationScoped
class SampleResource {

    @Route(
        path = "/type",
        methods = [Route.HttpMethod.GET],
        produces = [MediaType.APPLICATION_JSON]
    )
    fun introspect(
        @Param(value = "id") id: String? = null,
        rc: RoutingContext
    ): Uni<BinResp> {

        val resp = BinResp(
            num =  Number(
                length = 100,
                luhn = true
            ),
            scheme = "Visa",
            type = "Debit",
            brand = "Visa",
            prepaid = false,
            country = Country(
                numeric = "1000",
                alpha2 = "DK",
                name = "Gian",
                emoji = "DK",
                currency = "PESO",
                latitude = 20,
                longitude = 10,
            ),
            bank = Bank(
                names = "GIAN LAGARTO",
                url = "www.mingw64.dk",
                phone = "+639123456789",
                city = "Manila"
            )
        )
        return Uni.createFrom().item(resp)
//            .invoke { _ ->
//                this.log.apiRequest(rc = rc)
//            }
//            .flatMap { _ ->
//                this.service.introspect()
//            }


    }
}