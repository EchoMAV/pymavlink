/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AP_ADC PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* raw ADC output
*/
public class msg_ap_adc extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_AP_ADC = 153;
    public static final int MAVLINK_MSG_LENGTH = 12;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AP_ADC;


      
    /**
    * ADC output 1
    */
    public int adc1;
      
    /**
    * ADC output 2
    */
    public int adc2;
      
    /**
    * ADC output 3
    */
    public int adc3;
      
    /**
    * ADC output 4
    */
    public int adc4;
      
    /**
    * ADC output 5
    */
    public int adc5;
      
    /**
    * ADC output 6
    */
    public int adc6;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AP_ADC;
              
        packet.payload.putUnsignedShort(adc1);
              
        packet.payload.putUnsignedShort(adc2);
              
        packet.payload.putUnsignedShort(adc3);
              
        packet.payload.putUnsignedShort(adc4);
              
        packet.payload.putUnsignedShort(adc5);
              
        packet.payload.putUnsignedShort(adc6);
        
        return packet;
    }

    /**
    * Decode a ap_adc message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.adc1 = payload.getUnsignedShort();
              
        this.adc2 = payload.getUnsignedShort();
              
        this.adc3 = payload.getUnsignedShort();
              
        this.adc4 = payload.getUnsignedShort();
              
        this.adc5 = payload.getUnsignedShort();
              
        this.adc6 = payload.getUnsignedShort();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_ap_adc(){
        msgid = MAVLINK_MSG_ID_AP_ADC;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_ap_adc(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_AP_ADC;
        unpack(mavLinkPacket.payload);        
    }

                
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_AP_ADC -"+" adc1:"+adc1+" adc2:"+adc2+" adc3:"+adc3+" adc4:"+adc4+" adc5:"+adc5+" adc6:"+adc6+"";
    }
}
        