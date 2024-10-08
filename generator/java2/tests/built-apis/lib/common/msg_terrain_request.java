/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE TERRAIN_REQUEST PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* Request for terrain data and terrain status
*/
public class msg_terrain_request extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_TERRAIN_REQUEST = 133;
    public static final int MAVLINK_MSG_LENGTH = 18;
    private static final long serialVersionUID = MAVLINK_MSG_ID_TERRAIN_REQUEST;


      
    /**
    * Bitmask of requested 4x4 grids (row major 8x7 array of grids, 56 bits)
    */
    public long mask;
      
    /**
    * Latitude of SW corner of first grid (degrees *10^7)
    */
    public int lat;
      
    /**
    * Longitude of SW corner of first grid (in degrees *10^7)
    */
    public int lon;
      
    /**
    * Grid spacing in meters
    */
    public int grid_spacing;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_TERRAIN_REQUEST;
              
        packet.payload.putUnsignedLong(mask);
              
        packet.payload.putInt(lat);
              
        packet.payload.putInt(lon);
              
        packet.payload.putUnsignedShort(grid_spacing);
        
        return packet;
    }

    /**
    * Decode a terrain_request message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.mask = payload.getUnsignedLong();
              
        this.lat = payload.getInt();
              
        this.lon = payload.getInt();
              
        this.grid_spacing = payload.getUnsignedShort();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_terrain_request(){
        msgid = MAVLINK_MSG_ID_TERRAIN_REQUEST;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_terrain_request(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_TERRAIN_REQUEST;
        unpack(mavLinkPacket.payload);        
    }

            
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_TERRAIN_REQUEST -"+" mask:"+mask+" lat:"+lat+" lon:"+lon+" grid_spacing:"+grid_spacing+"";
    }
}
        