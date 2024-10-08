/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE UAVIONIX_ADSB_OUT_DYNAMIC PACKING
package com.mavlink.uAvionix;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;
        
/**
 * Dynamic data used to generate ADS-B out transponder data (send at 5Hz)
 */
public class msg_uavionix_adsb_out_dynamic extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_DYNAMIC = 10002;
    public static final int MAVLINK_MSG_LENGTH = 41;
    private static final long serialVersionUID = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_DYNAMIC;


      
    /**
     * UTC time in seconds since GPS epoch (Jan 6, 1980). If unknown set to UINT32_MAX
     */
    public long utcTime;
      
    /**
     * Latitude WGS84 (deg * 1E7). If unknown set to INT32_MAX
     */
    public int gpsLat;
      
    /**
     * Longitude WGS84 (deg * 1E7). If unknown set to INT32_MAX
     */
    public int gpsLon;
      
    /**
     * Altitude (WGS84). UP +ve. If unknown set to INT32_MAX
     */
    public int gpsAlt;
      
    /**
     * Barometric pressure altitude (MSL) relative to a standard atmosphere of 1013.2 mBar and NOT bar corrected altitude (m * 1E-3). (up +ve). If unknown set to INT32_MAX
     */
    public int baroAltMSL;
      
    /**
     * Horizontal accuracy in mm (m * 1E-3). If unknown set to UINT32_MAX
     */
    public long accuracyHor;
      
    /**
     * Vertical accuracy in cm. If unknown set to UINT16_MAX
     */
    public int accuracyVert;
      
    /**
     * Velocity accuracy in mm/s (m * 1E-3). If unknown set to UINT16_MAX
     */
    public int accuracyVel;
      
    /**
     * GPS vertical speed in cm/s. If unknown set to INT16_MAX
     */
    public short velVert;
      
    /**
     * North-South velocity over ground in cm/s North +ve. If unknown set to INT16_MAX
     */
    public short velNS;
      
    /**
     * East-West velocity over ground in cm/s East +ve. If unknown set to INT16_MAX
     */
    public short VelEW;
      
    /**
     * ADS-B transponder dynamic input state flags
     */
    public int state;
      
    /**
     * Mode A code (typically 1200 [0x04B0] for VFR)
     */
    public int squawk;
      
    /**
     * 0-1: no fix, 2: 2D fix, 3: 3D fix, 4: DGPS, 5: RTK
     */
    public short gpsFix;
      
    /**
     * Number of satellites visible. If unknown set to UINT8_MAX
     */
    public short numSats;
      
    /**
     * Emergency status
     */
    public short emergencyStatus;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_DYNAMIC;
        
        packet.payload.putUnsignedInt(utcTime);
        
        packet.payload.putInt(gpsLat);
        
        packet.payload.putInt(gpsLon);
        
        packet.payload.putInt(gpsAlt);
        
        packet.payload.putInt(baroAltMSL);
        
        packet.payload.putUnsignedInt(accuracyHor);
        
        packet.payload.putUnsignedShort(accuracyVert);
        
        packet.payload.putUnsignedShort(accuracyVel);
        
        packet.payload.putShort(velVert);
        
        packet.payload.putShort(velNS);
        
        packet.payload.putShort(VelEW);
        
        packet.payload.putUnsignedShort(state);
        
        packet.payload.putUnsignedShort(squawk);
        
        packet.payload.putUnsignedByte(gpsFix);
        
        packet.payload.putUnsignedByte(numSats);
        
        packet.payload.putUnsignedByte(emergencyStatus);
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a uavionix_adsb_out_dynamic message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.utcTime = payload.getUnsignedInt();
        
        this.gpsLat = payload.getInt();
        
        this.gpsLon = payload.getInt();
        
        this.gpsAlt = payload.getInt();
        
        this.baroAltMSL = payload.getInt();
        
        this.accuracyHor = payload.getUnsignedInt();
        
        this.accuracyVert = payload.getUnsignedShort();
        
        this.accuracyVel = payload.getUnsignedShort();
        
        this.velVert = payload.getShort();
        
        this.velNS = payload.getShort();
        
        this.VelEW = payload.getShort();
        
        this.state = payload.getUnsignedShort();
        
        this.squawk = payload.getUnsignedShort();
        
        this.gpsFix = payload.getUnsignedByte();
        
        this.numSats = payload.getUnsignedByte();
        
        this.emergencyStatus = payload.getUnsignedByte();
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_uavionix_adsb_out_dynamic() {
        msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_DYNAMIC;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_uavionix_adsb_out_dynamic(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_DYNAMIC;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

                                    
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_DYNAMIC - sysid:"+sysid+" compid:"+compid+" utcTime:"+utcTime+" gpsLat:"+gpsLat+" gpsLon:"+gpsLon+" gpsAlt:"+gpsAlt+" baroAltMSL:"+baroAltMSL+" accuracyHor:"+accuracyHor+" accuracyVert:"+accuracyVert+" accuracyVel:"+accuracyVel+" velVert:"+velVert+" velNS:"+velNS+" VelEW:"+VelEW+" state:"+state+" squawk:"+squawk+" gpsFix:"+gpsFix+" numSats:"+numSats+" emergencyStatus:"+emergencyStatus+"";
    }
}
        