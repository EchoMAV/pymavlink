/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DIGICAM_CONTROL PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* Control on-board Camera Control System to take shots.
*/
public class msg_digicam_control extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_DIGICAM_CONTROL = 155;
    public static final int MAVLINK_MSG_LENGTH = 13;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DIGICAM_CONTROL;


      
    /**
    * Correspondent value to given extra_param
    */
    public float extra_value;
      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
      
    /**
    * 0: stop, 1: start or keep it up //Session control e.g. show/hide lens
    */
    public short session;
      
    /**
    * 1 to N //Zoom's absolute position (0 means ignore)
    */
    public short zoom_pos;
      
    /**
    * -100 to 100 //Zooming step value to offset zoom from the current position
    */
    public byte zoom_step;
      
    /**
    * 0: unlock focus or keep unlocked, 1: lock focus or keep locked, 3: re-lock focus
    */
    public short focus_lock;
      
    /**
    * 0: ignore, 1: shot or start filming
    */
    public short shot;
      
    /**
    * Command Identity (incremental loop: 0 to 255)//A command sent multiple times will be executed or pooled just once
    */
    public short command_id;
      
    /**
    * Extra parameters enumeration (0 means ignore)
    */
    public short extra_param;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_DIGICAM_CONTROL;
              
        packet.payload.putFloat(extra_value);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
              
        packet.payload.putUnsignedByte(session);
              
        packet.payload.putUnsignedByte(zoom_pos);
              
        packet.payload.putByte(zoom_step);
              
        packet.payload.putUnsignedByte(focus_lock);
              
        packet.payload.putUnsignedByte(shot);
              
        packet.payload.putUnsignedByte(command_id);
              
        packet.payload.putUnsignedByte(extra_param);
        
        return packet;
    }

    /**
    * Decode a digicam_control message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.extra_value = payload.getFloat();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
              
        this.session = payload.getUnsignedByte();
              
        this.zoom_pos = payload.getUnsignedByte();
              
        this.zoom_step = payload.getByte();
              
        this.focus_lock = payload.getUnsignedByte();
              
        this.shot = payload.getUnsignedByte();
              
        this.command_id = payload.getUnsignedByte();
              
        this.extra_param = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_digicam_control(){
        msgid = MAVLINK_MSG_ID_DIGICAM_CONTROL;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_digicam_control(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_DIGICAM_CONTROL;
        unpack(mavLinkPacket.payload);        
    }

                        
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_DIGICAM_CONTROL -"+" extra_value:"+extra_value+" target_system:"+target_system+" target_component:"+target_component+" session:"+session+" zoom_pos:"+zoom_pos+" zoom_step:"+zoom_step+" focus_lock:"+focus_lock+" shot:"+shot+" command_id:"+command_id+" extra_param:"+extra_param+"";
    }
}
        