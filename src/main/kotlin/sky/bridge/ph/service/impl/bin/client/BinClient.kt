package sky.bridge.ph.service.impl.bin.client

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import sky.bridge.ph.service.impl.bin.model.BinResp
import javax.ws.rs.*
import io.smallrye.mutiny.Uni
import javax.ws.rs.core.MediaType

@RegisterRestClient(configKey = "bin-service")
interface BinClient {
    @GET
    @Path("/{get-public}")
    @Produces(MediaType.APPLICATION_JSON)
    fun uniqueIdentifier(@PathParam("get-public") id: String?) : Uni<BinResp>

    @POST
    @Path("/{post-public}")
    @Consumes(value = [MediaType.APPLICATION_FORM_URLENCODED])
    @Produces(MediaType.APPLICATION_JSON)
    fun postIdentifier(@PathParam("post-public") id: String?) : Uni<BinResp>
    fun info(message: String) {

    }
}