package com.mavnet.api

import com.mavlink.MAVLinkPacket
import com.mavlink.Parser
import java.nio.charset.StandardCharsets
import java.util.*
import java.io.File


fun parseString(stateMavlink: ByteArray): MAVLinkPacket?{
    // Decode from Base64
    //val decodedString = Base64.getDecoder().decode(stateMavlink)

    val decodedString = stateMavlink

    // Create a Parser...
    val parser = Parser()

    // Continue to add characters to the parser, until we reach an object.
    var packet: MAVLinkPacket?
    for (c in decodedString) {
        packet = parser.mavlink_parse_char(c.toInt() and 0xFF)

        if (packet != null){
            return packet
        }
    }

    // Otherwise, we failed.
    return null
}

var data = File("test_packets_v1.bin");
val v1Result = parseString(data.readBytes())
println("v1 result: ${v1Result}")

data = File("test_packets_v2.bin");
val newResult = parseString(data.readBytes())
println("v2 result: ${newResult}")
