/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE EXTENDED_SYS_STATE PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* Provides state for additional features
*/
public class msg_extended_sys_state extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_EXTENDED_SYS_STATE = 245;
    public static final int MAVLINK_MSG_LENGTH = 2;
    private static final long serialVersionUID = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;


      
    /**
    * The VTOL state if applicable. Is set to MAV_VTOL_STATE_UNDEFINED if UAV is not in VTOL configuration.
    */
    public short vtol_state;
      
    /**
    * The landed state. Is set to MAV_LANDED_STATE_UNDEFINED if landed state is unknown.
    */
    public short landed_state;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;
              
        packet.payload.putUnsignedByte(vtol_state);
              
        packet.payload.putUnsignedByte(landed_state);
        
        return packet;
    }

    /**
    * Decode a extended_sys_state message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.vtol_state = payload.getUnsignedByte();
              
        this.landed_state = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_extended_sys_state(){
        msgid = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_extended_sys_state(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;
        unpack(mavLinkPacket.payload);        
    }

        
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_EXTENDED_SYS_STATE -"+" vtol_state:"+vtol_state+" landed_state:"+landed_state+"";
    }
}
        