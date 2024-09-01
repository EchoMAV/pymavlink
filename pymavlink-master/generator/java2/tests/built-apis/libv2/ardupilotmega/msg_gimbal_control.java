/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GIMBAL_CONTROL PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;
        
/**
 * Control message for rate gimbal.
 */
public class msg_gimbal_control extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GIMBAL_CONTROL = 201;
    public static final int MAVLINK_MSG_LENGTH = 14;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GIMBAL_CONTROL;


      
    /**
     * Demanded angular rate X.
     */
    public float demanded_rate_x;
      
    /**
     * Demanded angular rate Y.
     */
    public float demanded_rate_y;
      
    /**
     * Demanded angular rate Z.
     */
    public float demanded_rate_z;
      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Component ID.
     */
    public short target_component;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GIMBAL_CONTROL;
        
        packet.payload.putFloat(demanded_rate_x);
        
        packet.payload.putFloat(demanded_rate_y);
        
        packet.payload.putFloat(demanded_rate_z);
        
        packet.payload.putUnsignedByte(target_system);
        
        packet.payload.putUnsignedByte(target_component);
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gimbal_control message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.demanded_rate_x = payload.getFloat();
        
        this.demanded_rate_y = payload.getFloat();
        
        this.demanded_rate_z = payload.getFloat();
        
        this.target_system = payload.getUnsignedByte();
        
        this.target_component = payload.getUnsignedByte();
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gimbal_control() {
        msgid = MAVLINK_MSG_ID_GIMBAL_CONTROL;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gimbal_control(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GIMBAL_CONTROL;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

              
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_GIMBAL_CONTROL - sysid:"+sysid+" compid:"+compid+" demanded_rate_x:"+demanded_rate_x+" demanded_rate_y:"+demanded_rate_y+" demanded_rate_z:"+demanded_rate_z+" target_system:"+target_system+" target_component:"+target_component+"";
    }
}
        