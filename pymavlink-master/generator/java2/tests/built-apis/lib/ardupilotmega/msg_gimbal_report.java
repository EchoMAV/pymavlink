/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GIMBAL_REPORT PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* 3 axis gimbal mesuraments
*/
public class msg_gimbal_report extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_GIMBAL_REPORT = 200;
    public static final int MAVLINK_MSG_LENGTH = 42;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GIMBAL_REPORT;


      
    /**
    * Time since last update (seconds)
    */
    public float delta_time;
      
    /**
    * Delta angle X (radians)
    */
    public float delta_angle_x;
      
    /**
    * Delta angle Y (radians)
    */
    public float delta_angle_y;
      
    /**
    * Delta angle X (radians)
    */
    public float delta_angle_z;
      
    /**
    * Delta velocity X (m/s)
    */
    public float delta_velocity_x;
      
    /**
    * Delta velocity Y (m/s)
    */
    public float delta_velocity_y;
      
    /**
    * Delta velocity Z (m/s)
    */
    public float delta_velocity_z;
      
    /**
    * Joint ROLL (radians)
    */
    public float joint_roll;
      
    /**
    * Joint EL (radians)
    */
    public float joint_el;
      
    /**
    * Joint AZ (radians)
    */
    public float joint_az;
      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GIMBAL_REPORT;
              
        packet.payload.putFloat(delta_time);
              
        packet.payload.putFloat(delta_angle_x);
              
        packet.payload.putFloat(delta_angle_y);
              
        packet.payload.putFloat(delta_angle_z);
              
        packet.payload.putFloat(delta_velocity_x);
              
        packet.payload.putFloat(delta_velocity_y);
              
        packet.payload.putFloat(delta_velocity_z);
              
        packet.payload.putFloat(joint_roll);
              
        packet.payload.putFloat(joint_el);
              
        packet.payload.putFloat(joint_az);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
        
        return packet;
    }

    /**
    * Decode a gimbal_report message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.delta_time = payload.getFloat();
              
        this.delta_angle_x = payload.getFloat();
              
        this.delta_angle_y = payload.getFloat();
              
        this.delta_angle_z = payload.getFloat();
              
        this.delta_velocity_x = payload.getFloat();
              
        this.delta_velocity_y = payload.getFloat();
              
        this.delta_velocity_z = payload.getFloat();
              
        this.joint_roll = payload.getFloat();
              
        this.joint_el = payload.getFloat();
              
        this.joint_az = payload.getFloat();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_gimbal_report(){
        msgid = MAVLINK_MSG_ID_GIMBAL_REPORT;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_gimbal_report(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GIMBAL_REPORT;
        unpack(mavLinkPacket.payload);        
    }

                            
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_GIMBAL_REPORT -"+" delta_time:"+delta_time+" delta_angle_x:"+delta_angle_x+" delta_angle_y:"+delta_angle_y+" delta_angle_z:"+delta_angle_z+" delta_velocity_x:"+delta_velocity_x+" delta_velocity_y:"+delta_velocity_y+" delta_velocity_z:"+delta_velocity_z+" joint_roll:"+joint_roll+" joint_el:"+joint_el+" joint_az:"+joint_az+" target_system:"+target_system+" target_component:"+target_component+"";
    }
}
        