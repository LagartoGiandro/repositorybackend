package sky.bridge.ph

import io.quarkus.vertx.web.Param
import io.quarkus.vertx.web.Route
import io.smallrye.mutiny.Uni
import io.vertx.ext.web.RoutingContext
import sky.bridge.ph.service.impl.bin.BinImpl
import sky.bridge.service.impl.bin.model.BinResp
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.core.MediaType

class SampleResource (
    private val service: BinImpl
) {
    @Route(
        path = "/uniqueIdentifier/:cardNo",
        methods = [Route.HttpMethod.GET],
        produces = [MediaType.APPLICATION_JSON]
    )
    fun uniqueIdentifier(
        @Param(value = "cardNo") id: String? = null,
        rc: RoutingContext
    ): Uni<BinResp> {
        return this.service.uniqueIdentifier(id)
    }
}
