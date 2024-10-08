/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MISSION_COUNT PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;
        
/**
 * This message is emitted as response to MISSION_REQUEST_LIST by the MAV and to initiate a write transaction. The GCS can then request the individual mission item based on the knowledge of the total number of waypoints.
 */
public class msg_mission_count extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MISSION_COUNT = 44;
    public static final int MAVLINK_MSG_LENGTH = 5;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MISSION_COUNT;


      
    /**
     * Number of mission items in the sequence
     */
    public int count;
      
    /**
     * System ID
     */
    public short target_system;
      
    /**
     * Component ID
     */
    public short target_component;
      
    /**
     * Mission type.
     */
    public short mission_type;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MISSION_COUNT;
        
        packet.payload.putUnsignedShort(count);
        
        packet.payload.putUnsignedByte(target_system);
        
        packet.payload.putUnsignedByte(target_component);
        
        if(isMavlink2) {
            
            packet.payload.putUnsignedByte(mission_type);
            
        }
        return packet;
    }

    /**
     * Decode a mission_count message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.count = payload.getUnsignedShort();
        
        this.target_system = payload.getUnsignedByte();
        
        this.target_component = payload.getUnsignedByte();
        
        if(isMavlink2) {
            
            this.mission_type = payload.getUnsignedByte();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mission_count() {
        msgid = MAVLINK_MSG_ID_MISSION_COUNT;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_mission_count(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_MISSION_COUNT;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

            
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_MISSION_COUNT - sysid:"+sysid+" compid:"+compid+" count:"+count+" target_system:"+target_system+" target_component:"+target_component+" mission_type:"+mission_type+"";
    }
}
        