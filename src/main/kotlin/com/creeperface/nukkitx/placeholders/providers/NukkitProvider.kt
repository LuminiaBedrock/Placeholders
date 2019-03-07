package com.creeperface.nukkitx.placeholders.providers

import com.creeperface.nukkit.placeholderapi.api.PlaceholderAPI
import java.util.function.BiFunction

/**
 * @author CreeperFace
 */
object NukkitProvider {

    private const val PREFIX = ""

    fun registerPlaceholders(papi: PlaceholderAPI) {
        papi.visitorSensitivePlaceholder<Boolean>(
            name = "has_permission",
            loader = BiFunction { p, params -> p.hasPermission(params.single() ?: "") },
            processParameters = true
        )
    }
}