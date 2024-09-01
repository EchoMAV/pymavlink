/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LOGGING_DATA PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;
        
/**
 * A message containing logged data (see also MAV_CMD_LOGGING_START)
 */
public class msg_logging_data extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LOGGING_DATA = 266;
    public static final int MAVLINK_MSG_LENGTH = 255;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LOGGING_DATA;


      
    /**
     * sequence number (can wrap)
     */
    public int sequence;
      
    /**
     * system ID of the target
     */
    public short target_system;
      
    /**
     * component ID of the target
     */
    public short target_component;
      
    /**
     * data length
     */
    public short length;
      
    /**
     * offset into data where first message starts. This can be used for recovery, when a previous message got lost (set to 255 if no start exists).
     */
    public short first_message_offset;
      
    /**
     * logged data
     */
    public short data[] = new short[249];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LOGGING_DATA;
        
        packet.payload.putUnsignedShort(sequence);
        
        packet.payload.putUnsignedByte(target_system);
        
        packet.payload.putUnsignedByte(target_component);
        
        packet.payload.putUnsignedByte(length);
        
        packet.payload.putUnsignedByte(first_message_offset);
        
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a logging_data message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.sequence = payload.getUnsignedShort();
        
        this.target_system = payload.getUnsignedByte();
        
        this.target_component = payload.getUnsignedByte();
        
        this.length = payload.getUnsignedByte();
        
        this.first_message_offset = payload.getUnsignedByte();
        
         
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_logging_data() {
        msgid = MAVLINK_MSG_ID_LOGGING_DATA;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_logging_data(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_LOGGING_DATA;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_LOGGING_DATA - sysid:"+sysid+" compid:"+compid+" sequence:"+sequence+" target_system:"+target_system+" target_component:"+target_component+" length:"+length+" first_message_offset:"+first_message_offset+" data:"+data+"";
    }
}
        