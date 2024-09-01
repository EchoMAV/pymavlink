/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LOG_DATA PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* Reply to LOG_REQUEST_DATA
*/
public class msg_log_data extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_LOG_DATA = 120;
    public static final int MAVLINK_MSG_LENGTH = 97;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LOG_DATA;


      
    /**
    * Offset into the log
    */
    public long ofs;
      
    /**
    * Log id (from LOG_ENTRY reply)
    */
    public int id;
      
    /**
    * Number of bytes (zero for end of log)
    */
    public short count;
      
    /**
    * log data
    */
    public short data[] = new short[90];
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LOG_DATA;
              
        packet.payload.putUnsignedInt(ofs);
              
        packet.payload.putUnsignedShort(id);
              
        packet.payload.putUnsignedByte(count);
              
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        return packet;
    }

    /**
    * Decode a log_data message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.ofs = payload.getUnsignedInt();
              
        this.id = payload.getUnsignedShort();
              
        this.count = payload.getUnsignedByte();
              
         
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_log_data(){
        msgid = MAVLINK_MSG_ID_LOG_DATA;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_log_data(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_LOG_DATA;
        unpack(mavLinkPacket.payload);        
    }

            
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_LOG_DATA -"+" ofs:"+ofs+" id:"+id+" count:"+count+" data:"+data+"";
    }
}
        