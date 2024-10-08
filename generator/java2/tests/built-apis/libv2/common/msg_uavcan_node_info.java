/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE UAVCAN_NODE_INFO PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;
        
/**
 * General information describing a particular UAVCAN node. Please refer to the definition of the UAVCAN service "uavcan.protocol.GetNodeInfo" for the background information. This message should be emitted by the system whenever a new node appears online, or an existing node reboots. Additionally, it can be emitted upon request from the other end of the MAVLink channel (see MAV_CMD_UAVCAN_GET_NODE_INFO). It is also not prohibited to emit this message unconditionally at a low frequency. The UAVCAN specification is available at http://uavcan.org.
 */
public class msg_uavcan_node_info extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_UAVCAN_NODE_INFO = 311;
    public static final int MAVLINK_MSG_LENGTH = 116;
    private static final long serialVersionUID = MAVLINK_MSG_ID_UAVCAN_NODE_INFO;


      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * Time since the start-up of the node.
     */
    public long uptime_sec;
      
    /**
     * Version control system (VCS) revision identifier (e.g. git short commit hash). Zero if unknown.
     */
    public long sw_vcs_commit;
      
    /**
     * Node name string. For example, "sapog.px4.io".
     */
    public byte name[] = new byte[80];
      
    /**
     * Hardware major version number.
     */
    public short hw_version_major;
      
    /**
     * Hardware minor version number.
     */
    public short hw_version_minor;
      
    /**
     * Hardware unique 128-bit ID.
     */
    public short hw_unique_id[] = new short[16];
      
    /**
     * Software major version number.
     */
    public short sw_version_major;
      
    /**
     * Software minor version number.
     */
    public short sw_version_minor;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_UAVCAN_NODE_INFO;
        
        packet.payload.putUnsignedLong(time_usec);
        
        packet.payload.putUnsignedInt(uptime_sec);
        
        packet.payload.putUnsignedInt(sw_vcs_commit);
        
        
        for (int i = 0; i < name.length; i++) {
            packet.payload.putByte(name[i]);
        }
                    
        
        packet.payload.putUnsignedByte(hw_version_major);
        
        packet.payload.putUnsignedByte(hw_version_minor);
        
        
        for (int i = 0; i < hw_unique_id.length; i++) {
            packet.payload.putUnsignedByte(hw_unique_id[i]);
        }
                    
        
        packet.payload.putUnsignedByte(sw_version_major);
        
        packet.payload.putUnsignedByte(sw_version_minor);
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a uavcan_node_info message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        
        this.uptime_sec = payload.getUnsignedInt();
        
        this.sw_vcs_commit = payload.getUnsignedInt();
        
         
        for (int i = 0; i < this.name.length; i++) {
            this.name[i] = payload.getByte();
        }
                
        
        this.hw_version_major = payload.getUnsignedByte();
        
        this.hw_version_minor = payload.getUnsignedByte();
        
         
        for (int i = 0; i < this.hw_unique_id.length; i++) {
            this.hw_unique_id[i] = payload.getUnsignedByte();
        }
                
        
        this.sw_version_major = payload.getUnsignedByte();
        
        this.sw_version_minor = payload.getUnsignedByte();
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_uavcan_node_info() {
        msgid = MAVLINK_MSG_ID_UAVCAN_NODE_INFO;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_uavcan_node_info(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_UAVCAN_NODE_INFO;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

           
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setName(String str) {
        int len = Math.min(str.length(), 80);
        for (int i=0; i<len; i++) {
            name[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<80; i++) {            // padding for the rest of the buffer
            name[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getName() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 80; i++) {
            if (name[i] != 0)
                buf.append((char) name[i]);
            else
                break;
        }
        return buf.toString();

    }
                                   
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_UAVCAN_NODE_INFO - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" uptime_sec:"+uptime_sec+" sw_vcs_commit:"+sw_vcs_commit+" name:"+name+" hw_version_major:"+hw_version_major+" hw_version_minor:"+hw_version_minor+" hw_unique_id:"+hw_unique_id+" sw_version_major:"+sw_version_major+" sw_version_minor:"+sw_version_minor+"";
    }
}
        