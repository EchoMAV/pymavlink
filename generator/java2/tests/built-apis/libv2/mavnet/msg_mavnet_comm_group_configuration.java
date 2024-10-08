/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MAVNET_COMM_GROUP_CONFIGURATION PACKING
package com.mavlink.mavnet;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;
        
/**
 * MAVNet comms configuration - sent from the server to configure a comm system.
 */
public class msg_mavnet_comm_group_configuration extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MAVNET_COMM_GROUP_CONFIGURATION = 43001;
    public static final int MAVLINK_MSG_LENGTH = 41;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MAVNET_COMM_GROUP_CONFIGURATION;


      
    /**
     * Mavlink unit ID for this system.
     */
    public short mavlink_id;
      
    /**
     * Name of the comm group the system has joined.
     */
    public byte comm_group_name[] = new byte[16];
      
    /**
     * The callsign for this system.
     */
    public byte callsign[] = new byte[24];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MAVNET_COMM_GROUP_CONFIGURATION;
        
        packet.payload.putUnsignedByte(mavlink_id);
        
        
        for (int i = 0; i < comm_group_name.length; i++) {
            packet.payload.putByte(comm_group_name[i]);
        }
                    
        
        
        for (int i = 0; i < callsign.length; i++) {
            packet.payload.putByte(callsign[i]);
        }
                    
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a mavnet_comm_group_configuration message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.mavlink_id = payload.getUnsignedByte();
        
         
        for (int i = 0; i < this.comm_group_name.length; i++) {
            this.comm_group_name[i] = payload.getByte();
        }
                
        
         
        for (int i = 0; i < this.callsign.length; i++) {
            this.callsign[i] = payload.getByte();
        }
                
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mavnet_comm_group_configuration() {
        msgid = MAVLINK_MSG_ID_MAVNET_COMM_GROUP_CONFIGURATION;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_mavnet_comm_group_configuration(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_MAVNET_COMM_GROUP_CONFIGURATION;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
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
    public String toString() {
        return "MAVLINK_MSG_ID_MAVNET_COMM_GROUP_CONFIGURATION - sysid:"+sysid+" compid:"+compid+" mavlink_id:"+mavlink_id+" comm_group_name:"+comm_group_name+" callsign:"+callsign+"";
    }
}
        