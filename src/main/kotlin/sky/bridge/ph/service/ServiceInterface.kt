package sky.bridge.ph.service

import io.smallrye.mutiny.Uni
import sky.bridge.ph.service.impl.bin.model.BinResp

interface ServiceInterface {
    fun uniqueIdentifier(cardNo: String?): Uni<BinResp>

    fun postIdentifier(new_cardNo: String?): Uni<BinResp>
}