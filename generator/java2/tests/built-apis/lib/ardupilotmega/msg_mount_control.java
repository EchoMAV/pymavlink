/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MOUNT_CONTROL PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* Message to control a camera mount, directional antenna, etc.
*/
public class msg_mount_control extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_MOUNT_CONTROL = 157;
    public static final int MAVLINK_MSG_LENGTH = 15;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MOUNT_CONTROL;


      
    /**
    * pitch(deg*100) or lat, depending on mount mode
    */
    public int input_a;
      
    /**
    * roll(deg*100) or lon depending on mount mode
    */
    public int input_b;
      
    /**
    * yaw(deg*100) or alt (in cm) depending on mount mode
    */
    public int input_c;
      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
      
    /**
    * if "1" it will save current trimmed position on EEPROM (just valid for NEUTRAL and LANDING)
    */
    public short save_position;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MOUNT_CONTROL;
              
        packet.payload.putInt(input_a);
              
        packet.payload.putInt(input_b);
              
        packet.payload.putInt(input_c);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
              
        packet.payload.putUnsignedByte(save_position);
        
        return packet;
    }

    /**
    * Decode a mount_control message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.input_a = payload.getInt();
              
        this.input_b = payload.getInt();
              
        this.input_c = payload.getInt();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
              
        this.save_position = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_mount_control(){
        msgid = MAVLINK_MSG_ID_MOUNT_CONTROL;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_mount_control(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_MOUNT_CONTROL;
        unpack(mavLinkPacket.payload);        
    }

                
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_MOUNT_CONTROL -"+" input_a:"+input_a+" input_b:"+input_b+" input_c:"+input_c+" target_system:"+target_system+" target_component:"+target_component+" save_position:"+save_position+"";
    }
}
        