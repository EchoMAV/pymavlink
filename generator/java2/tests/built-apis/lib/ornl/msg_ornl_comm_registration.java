/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ORNL_COMM_REGISTRATION PACKING
package com.mavlink.ornl;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* ORNL Comms registration message (sent on system startup and at regular intervals).
*/
public class msg_ornl_comm_registration extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_ORNL_COMM_REGISTRATION = 238;
    public static final int MAVLINK_MSG_LENGTH = 69;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ORNL_COMM_REGISTRATION;


      
    /**
    * Placeholder for microhard information, currently not implemented.
    */
    public long micro_hard_id;
      
    /**
    * The type of the system (see: ORNL_SYSTEM_TYPE)
    */
    public short system_type;
      
    /**
    * Name of the comm group the as defined on the local system.
    */
    public byte comm_group_name[] = new byte[16];
      
    /**
    * The serial number of the comm system which is based on the system factory serial number.
    */
    public byte serial_number[] = new byte[24];
      
    /**
    * The callsign for this system.
    */
    public byte callsign[] = new byte[24];
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ORNL_COMM_REGISTRATION;
              
        packet.payload.putUnsignedInt(micro_hard_id);
              
        packet.payload.putUnsignedByte(system_type);
              
        
        for (int i = 0; i < comm_group_name.length; i++) {
            packet.payload.putByte(comm_group_name[i]);
        }
                    
              
        
        for (int i = 0; i < serial_number.length; i++) {
            packet.payload.putByte(serial_number[i]);
        }
                    
              
        
        for (int i = 0; i < callsign.length; i++) {
            packet.payload.putByte(callsign[i]);
        }
                    
        
        return packet;
    }

    /**
    * Decode a ornl_comm_registration message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.micro_hard_id = payload.getUnsignedInt();
              
        this.system_type = payload.getUnsignedByte();
              
         
        for (int i = 0; i < this.comm_group_name.length; i++) {
            this.comm_group_name[i] = payload.getByte();
        }
                
              
         
        for (int i = 0; i < this.serial_number.length; i++) {
            this.serial_number[i] = payload.getByte();
        }
                
              
         
        for (int i = 0; i < this.callsign.length; i++) {
            this.callsign[i] = payload.getByte();
        }
                
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_ornl_comm_registration(){
        msgid = MAVLINK_MSG_ID_ORNL_COMM_REGISTRATION;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_ornl_comm_registration(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_ORNL_COMM_REGISTRATION;
        unpack(mavLinkPacket.payload);        
    }

         
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setComm_Group_Name(String str) {
        int len = Math.min(str.length(), 16);
        for (int i=0; i<len; i++) {
            comm_group_name[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<16; i++) {            // padding for the rest of the buffer
            comm_group_name[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getComm_Group_Name() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            if (comm_group_name[i] != 0)
                buf.append((char) comm_group_name[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setSerial_Number(String str) {
        int len = Math.min(str.length(), 24);
        for (int i=0; i<len; i++) {
            serial_number[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<24; i++) {            // padding for the rest of the buffer
            serial_number[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getSerial_Number() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 24; i++) {
            if (serial_number[i] != 0)
                buf.append((char) serial_number[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setCallsign(String str) {
        int len = Math.min(str.length(), 24);
        for (int i=0; i<len; i++) {
            callsign[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<24; i++) {            // padding for the rest of the buffer
            callsign[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getCallsign() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 24; i++) {
            if (callsign[i] != 0)
                buf.append((char) callsign[i]);
            else
                break;
        }
        return buf.toString();

    }
                         
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_ORNL_COMM_REGISTRATION -"+" micro_hard_id:"+micro_hard_id+" system_type:"+system_type+" comm_group_name:"+comm_group_name+" serial_number:"+serial_number+" callsign:"+callsign+"";
    }
}
        