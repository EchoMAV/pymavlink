/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RALLY_POINT PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* A rally point. Used to set a point when from GCS -> MAV. Also used to return a point from MAV -> GCS
*/
public class msg_rally_point extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_RALLY_POINT = 175;
    public static final int MAVLINK_MSG_LENGTH = 19;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RALLY_POINT;


      
    /**
    * Latitude of point in degrees * 1E7
    */
    public int lat;
      
    /**
    * Longitude of point in degrees * 1E7
    */
    public int lng;
      
    /**
    * Transit / loiter altitude in meters relative to home
    */
    public short alt;
      
    /**
    * Break altitude in meters relative to home
    */
    public short break_alt;
      
    /**
    * Heading to aim for when landing. In centi-degrees.
    */
    public int land_dir;
      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
      
    /**
    * point index (first point is 0)
    */
    public short idx;
      
    /**
    * total number of points (for sanity checking)
    */
    public short count;
      
    /**
    * See RALLY_FLAGS enum for definition of the bitmask.
    */
    public short flags;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_RALLY_POINT;
              
        packet.payload.putInt(lat);
              
        packet.payload.putInt(lng);
              
        packet.payload.putShort(alt);
              
        packet.payload.putShort(break_alt);
              
        packet.payload.putUnsignedShort(land_dir);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
              
        packet.payload.putUnsignedByte(idx);
              
        packet.payload.putUnsignedByte(count);
              
        packet.payload.putUnsignedByte(flags);
        
        return packet;
    }

    /**
    * Decode a rally_point message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.lat = payload.getInt();
              
        this.lng = payload.getInt();
              
        this.alt = payload.getShort();
              
        this.break_alt = payload.getShort();
              
        this.land_dir = payload.getUnsignedShort();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
              
        this.idx = payload.getUnsignedByte();
              
        this.count = payload.getUnsignedByte();
              
        this.flags = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_rally_point(){
        msgid = MAVLINK_MSG_ID_RALLY_POINT;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_rally_point(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_RALLY_POINT;
        unpack(mavLinkPacket.payload);        
    }

                        
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_RALLY_POINT -"+" lat:"+lat+" lng:"+lng+" alt:"+alt+" break_alt:"+break_alt+" land_dir:"+land_dir+" target_system:"+target_system+" target_component:"+target_component+" idx:"+idx+" count:"+count+" flags:"+flags+"";
    }
}
        