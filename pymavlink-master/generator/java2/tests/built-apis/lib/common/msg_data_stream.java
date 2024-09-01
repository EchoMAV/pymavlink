/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DATA_STREAM PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* THIS INTERFACE IS DEPRECATED. USE MESSAGE_INTERVAL INSTEAD.
*/
public class msg_data_stream extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_DATA_STREAM = 67;
    public static final int MAVLINK_MSG_LENGTH = 4;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DATA_STREAM;


      
    /**
    * The message rate
    */
    public int message_rate;
      
    /**
    * The ID of the requested data stream
    */
    public short stream_id;
      
    /**
    * 1 stream is enabled, 0 stream is stopped.
    */
    public short on_off;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_DATA_STREAM;
              
        packet.payload.putUnsignedShort(message_rate);
              
        packet.payload.putUnsignedByte(stream_id);
              
        packet.payload.putUnsignedByte(on_off);
        
        return packet;
    }

    /**
    * Decode a data_stream message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.message_rate = payload.getUnsignedShort();
              
        this.stream_id = payload.getUnsignedByte();
              
        this.on_off = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_data_stream(){
        msgid = MAVLINK_MSG_ID_DATA_STREAM;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_data_stream(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_DATA_STREAM;
        unpack(mavLinkPacket.payload);        
    }

          
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_DATA_STREAM -"+" message_rate:"+message_rate+" stream_id:"+stream_id+" on_off:"+on_off+"";
    }
}
        