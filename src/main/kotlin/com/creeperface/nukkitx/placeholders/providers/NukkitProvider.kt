package com.creeperface.nukkitx.placeholders.providers

import com.creeperface.nukkit.placeholderapi.api.PlaceholderAPI
import kotlin.math.roundToInt

/**
 * @author CreeperFace, MEFRREEX
 */
object NukkitProvider {

    private const val PREFIX = ""

    fun registerPlaceholders(papi: PlaceholderAPI) {
        papi.build<Boolean>("has_permission") {
            processParameters(true)

            visitorLoader {
                return@visitorLoader player.hasPermission(parameters.single()?.value ?: "")
            }
        }

        papi.build<Int>("player_item_in_hand_id") {
            processParameters(true)

            visitorLoader {
                return@visitorLoader player.inventory.itemInHand.id
            }
        }

        papi.build<Int>("player_health_rounded_int") {
            processParameters(true)

            visitorLoader {
                return@visitorLoader player.health.roundToInt()
            }
        }

        papi.build<Float>("player_health_rounded_float") {
            processParameters(true)

            visitorLoader {
                return@visitorLoader "%.1f".format(player.health).toFloat()
            }
        }
    }
}