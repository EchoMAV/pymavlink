/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE WIND PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;
        
/**
 * Wind estimation.
 */
public class msg_wind extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_WIND = 168;
    public static final int MAVLINK_MSG_LENGTH = 12;
    private static final long serialVersionUID = MAVLINK_MSG_ID_WIND;


      
    /**
     * Wind direction (that wind is coming from).
     */
    public float direction;
      
    /**
     * Wind speed in ground plane.
     */
    public float speed;
      
    /**
     * Vertical wind speed.
     */
    public float speed_z;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_WIND;
        
        packet.payload.putFloat(direction);
        
        packet.payload.putFloat(speed);
        
        packet.payload.putFloat(speed_z);
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a wind message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.direction = payload.getFloat();
        
        this.speed = payload.getFloat();
        
        this.speed_z = payload.getFloat();
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_wind() {
        msgid = MAVLINK_MSG_ID_WIND;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_wind(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_WIND;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_WIND - sysid:"+sysid+" compid:"+compid+" direction:"+direction+" speed:"+speed+" speed_z:"+speed_z+"";
    }
}
        