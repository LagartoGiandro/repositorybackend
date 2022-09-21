package sky.bridge.ph.service.impl.bin.client

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import sky.bridge.service.impl.bin.model.BinResp
import javax.ws.rs.*
import io.smallrye.mutiny.Uni
import javax.ws.rs.core.MediaType

@RegisterRestClient(configKey = "bin-service")
interface BinClient {
    @GET
    @Path("/{public}")
    @Produces(MediaType.APPLICATION_JSON)
    fun uniqueIdentifier(@PathParam("public") id: String?) : Uni<BinResp>
}