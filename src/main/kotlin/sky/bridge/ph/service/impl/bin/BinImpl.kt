package sky.bridge.ph.service.impl.bin

import io.smallrye.mutiny.Uni
import org.eclipse.microprofile.rest.client.inject.RestClient
import sky.bridge.ph.service.impl.bin.client.BinClient
import sky.bridge.ph.service.ServiceInterface
import sky.bridge.ph.service.impl.bin.model.BinResp
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class BinImpl (
    private val name: BinClient,
    private val sub_name: BinClient,

    @RestClient private val client: BinClient
    ): ServiceInterface {
    override fun uniqueIdentifier(cardNo: String?): Uni<BinResp> = this.client.uniqueIdentifier(cardNo)

    override fun postIdentifier(new_cardNo: String?): Uni<BinResp> {
        return TODO("Provide the return value")
    }


}
