/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GOPRO_SET_RESPONSE PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;
        
/**
 * Response from a GOPRO_COMMAND set request.
 */
public class msg_gopro_set_response extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GOPRO_SET_RESPONSE = 219;
    public static final int MAVLINK_MSG_LENGTH = 2;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;


      
    /**
     * Command ID.
     */
    public short cmd_id;
      
    /**
     * Status.
     */
    public short status;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;
        
        packet.payload.putUnsignedByte(cmd_id);
        
        packet.payload.putUnsignedByte(status);
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gopro_set_response message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.cmd_id = payload.getUnsignedByte();
        
        this.status = payload.getUnsignedByte();
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gopro_set_response() {
        msgid = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gopro_set_response(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_GOPRO_SET_RESPONSE - sysid:"+sysid+" compid:"+compid+" cmd_id:"+cmd_id+" status:"+status+"";
    }
}
        