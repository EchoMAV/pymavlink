/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ARC_STATE_PLANE PACKING
package com.mavlink.ornl;
import com.mavlink.MAVLinkPacket;
import com.mavlink.Messages.MAVLinkMessage;
import com.mavlink.Messages.MAVLinkPayload;
        
/**
* ArcSoft state message for a fixed-wing, also works for a quadplane.
*/
public class msg_arc_state_plane extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_ARC_STATE_PLANE = 227;
    public static final int MAVLINK_MSG_LENGTH = 162;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ARC_STATE_PLANE;


      
    /**
    * Incrementing sequence number, device is expected to increment with each msg and not repeat even with reboot
    */
    public long state_sequence;
      
    /**
    * Timestamp (microseconds since UNIX epoch based on GPS)
    */
    public long time_usec;
      
    /**
    * Provides information on the current executing command on the device
    */
    public long command_sequence;
      
    /**
    * Latitude (WGS84), in degrees * 1E7
    */
    public int destination_latitude;
      
    /**
    * Longitude (WGS84, in degrees * 1E7
    */
    public int destination_longitude;
      
    /**
    * Altitude above home level, in meters * 1000 (positive for up)
    */
    public int destination_altitude_ahl;
      
    /**
    * Latitude (WGS84), in degrees * 1E7
    */
    public int target_latitude;
      
    /**
    * Longitude (WGS84, in degrees * 1E7
    */
    public int target_longitude;
      
    /**
    * Altitude above home level, in meters * 1000 (positive for up)
    */
    public int target_altitude_ahl;
      
    /**
    * Latitude (WGS84), in degrees * 1E7
    */
    public int home_latitude;
      
    /**
    * Longitude (WGS84, in degrees * 1E7
    */
    public int home_longitude;
      
    /**
    * Altitude above mean sea level, in meters * 1000 (positive for up)
    */
    public int home_altitude_amsl;
      
    /**
    * Immediate altitude set above home level, in meters * 1000 (positive for up)
    */
    public int immediate_altitude_ahl;
      
    /**
    * Current delay timer in seconds (-1: Infinite delay, 0: No delay, >1 delay sec)
    */
    public int mission_delay;
      
    /**
    * A bitfield for use for autopilot-specific flags.
    */
    public long custom_mode;
      
    /**
    * Latitude, expressed as degrees * 1E7
    */
    public int latitude;
      
    /**
    * Longitude, expressed as degrees * 1E7
    */
    public int longitude;
      
    /**
    * Altitude above mean sea level, in meters * 1000 (positive for up)
    */
    public int altitude_amsl;
      
    /**
    * Altitude above home level, in meters * 1000 (positive for up)
    */
    public int altitude_ahl;
      
    /**
    * Altitude above ground level, in meters * 1000 (positive for up)
    */
    public int altitude_agl;
      
    /**
    * Current airspeed in m/s
    */
    public float airspeed;
      
    /**
    * Current ground speed in m/s
    */
    public float groundspeed;
      
    /**
    * Execution point in the current mission
    */
    public int mission_sequence;
      
    /**
    * Radius of the waypoint acceptance criteria in centimeters (0-8000)
    */
    public int wp_radius;

    /**
    * Battery failsafe voltage in millivolts 0-65535
    */
    public int fs_batt_voltage;
      
    /**
    * Altitude of the geofence in meters (10-1000)
    */
    public int fence_alt_max;
      
    /**
    * Radius of the geofence in meters (30-10000)
    */
    public int fence_radius;
      
    /**
    * RTL altitude in centimeters (0-8000)
    */
    public int rtl_alt;
      
    /**
    * Vehicle speed in auto and guided modes in cm/s (20-2000)
    */
    public int wpnav_speed;
      
    /**
    * Altitude of the arcsoft rangefinder failsafe in meters (1-200)
    */
    public int fs_arc_rangefinder_alt;
      
    /**
    * EKF status flags
    */
    public int ekf_status_flags;
      
    /**
    * Current heading in degrees, in compass units (0..360, 0=north)
    */
    public short heading;
      
    /**
    * Roll in degrees * 1E2 (centidegrees)
    */
    public short roll;
      
    /**
    * Pitch in degrees * 1E2 (centidegrees)
    */
    public short pitch;

    /**
    * Battery voltage, in millivolts (1 = 1 millivolt)
    */
    public int voltage_battery;
      
    /**
    * Type of the system defined in MAV_TYPE ENUM
    */
    public short system_type;
      
    /**
    * System id of the device to which we wish to subscribe. (0: none, 255: all)
    */
    public short subscription;
      
    /**
    * Fly state parameter (0:false, 1: true)
    */
    public short fly;
      
    /**
    * Pause state parameter (0: false, 1: true)
    */
    public short pause;
      
    /**
    * Speed parameter in decimeters/sec.
    */
    public short speed;
      
    /**
    * Gripper state (0: Off, 1: On)
    */
    public short grip;
      
    /**
    * Indication if the plane is currently tethered or not (only applicable to quadplanes)
    */
    public short tethered;
      
    /**
    * Indication if this is a quadplane (1 = quadplane)
    */
    public short quadplane;
      
    /**
    * ID of the currently executing mission (MD5 hash)
    */
    public short mission_id[] = new short[16];
      
    /**
    * ArcSoft mission active flag (0:false, 1: true)
    */
    public short mission_active;
      
    /**
    * Status of a mission upload (-1: No upload, 0-100: percent complete)
    */
    public byte mission_upload;
      
    /**
    * Enable (1) or disable (0) the battery failsafe
    */
    public short fs_batt_enable;
      
    /**
    * Enable (1) or disable (0) the geofence
    */
    public short fence_enable;
      
    /**
    * Enable (1) or disable (0) the hand radio failsafe
    */
    public short fs_thr_enable;
      
    /**
    *
    */
    public short fs_ekf_action;
      
    /**
    * Enable (1) or disable (0) the arcsoft rangefinder failsafe. If turned on, then the vehicle will enter brake mode if altitude is less than the specified altitude and the vehicle is in GUIDED mode. 
    */
    public short fs_arc_rangefinder;
      
    /**
    * The interface transmitting this message
    */
    public byte transmit_interface;
      
    /**
    * LOS availability and signal strength. (-2: Faulted, -1: Disabled, 0-100: signal strength)
    */
    public byte los_rssi;
      
    /**
    * LOS availability and signal strength. (-2: Faulted, -1: Disabled, 0-100: signal strength)
    */
    public byte cellular_rssi;
      
    /**
    * LOS availability and signal strength. (-2: Faulted, -1: Disabled, 0-100: signal strength)
    */
    public byte satellite_rssi;
      
    /**
    * System mode bitfield, see MAV_MODE_FLAG ENUM in mavlink/include/mavlink_types.h
    */
    public short base_mode;
      
    /**
    * System status flag, see MAV_STATE ENUM
    */
    public short system_status;
      
    /**
    * See the GPS_FIX_TYPE enum.
    */
    public short gps_fix_type;
      
    /**
    * Number of satellites visible. If unknown, set to 255
    */
    public short gps_satellites_visible;
      
    /**
    * Remaining battery energy: (0%: 0, 100%: 100), -1: autopilot estimate the remaining battery
    */
    public byte battery_remaining;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ARC_STATE_PLANE;
              
        packet.payload.putLong(state_sequence);
              
        packet.payload.putUnsignedLong(time_usec);
              
        packet.payload.putUnsignedInt(command_sequence);
              
        packet.payload.putInt(destination_latitude);
              
        packet.payload.putInt(destination_longitude);
              
        packet.payload.putInt(destination_altitude_ahl);
              
        packet.payload.putInt(target_latitude);
              
        packet.payload.putInt(target_longitude);
              
        packet.payload.putInt(target_altitude_ahl);
              
        packet.payload.putInt(home_latitude);
              
        packet.payload.putInt(home_longitude);
              
        packet.payload.putInt(home_altitude_amsl);
              
        packet.payload.putInt(immediate_altitude_ahl);
              
        packet.payload.putInt(mission_delay);
              
        packet.payload.putUnsignedInt(custom_mode);
              
        packet.payload.putInt(latitude);
              
        packet.payload.putInt(longitude);
              
        packet.payload.putInt(altitude_amsl);
              
        packet.payload.putInt(altitude_ahl);
              
        packet.payload.putInt(altitude_agl);
              
        packet.payload.putFloat(airspeed);
              
        packet.payload.putFloat(groundspeed);
              
        packet.payload.putUnsignedShort(mission_sequence);
              
        packet.payload.putUnsignedShort(wp_radius);
              
        packet.payload.putUnsignedShort(fs_batt_voltage);
              
        packet.payload.putUnsignedShort(fence_alt_max);
              
        packet.payload.putUnsignedShort(fence_radius);
              
        packet.payload.putUnsignedShort(rtl_alt);
              
        packet.payload.putUnsignedShort(wpnav_speed);
              
        packet.payload.putUnsignedShort(fs_arc_rangefinder_alt);
              
        packet.payload.putUnsignedShort(ekf_status_flags);
              
        packet.payload.putShort(heading);
              
        packet.payload.putShort(roll);
              
        packet.payload.putShort(pitch);
              
        packet.payload.putUnsignedShort(voltage_battery);
              
        packet.payload.putUnsignedByte(system_type);
              
        packet.payload.putUnsignedByte(subscription);
              
        packet.payload.putUnsignedByte(fly);
              
        packet.payload.putUnsignedByte(pause);
              
        packet.payload.putUnsignedByte(speed);
              
        packet.payload.putUnsignedByte(grip);
              
        packet.payload.putUnsignedByte(tethered);
              
        packet.payload.putUnsignedByte(quadplane);
              
        
        for (int i = 0; i < mission_id.length; i++) {
            packet.payload.putUnsignedByte(mission_id[i]);
        }
                    
              
        packet.payload.putUnsignedByte(mission_active);
              
        packet.payload.putByte(mission_upload);
              
        packet.payload.putUnsignedByte(fs_batt_enable);
              
        packet.payload.putUnsignedByte(fence_enable);
              
        packet.payload.putUnsignedByte(fs_thr_enable);
              
        packet.payload.putUnsignedByte(fs_ekf_action);
              
        packet.payload.putUnsignedByte(fs_arc_rangefinder);
              
        packet.payload.putByte(transmit_interface);
              
        packet.payload.putByte(los_rssi);
              
        packet.payload.putByte(cellular_rssi);
              
        packet.payload.putByte(satellite_rssi);
              
        packet.payload.putUnsignedByte(base_mode);
              
        packet.payload.putUnsignedByte(system_status);
              
        packet.payload.putUnsignedByte(gps_fix_type);
              
        packet.payload.putUnsignedByte(gps_satellites_visible);
              
        packet.payload.putByte(battery_remaining);
        
        return packet;
    }

    /**
    * Decode a arc_state_plane message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.state_sequence = payload.getLong();
              
        this.time_usec = payload.getUnsignedLong();
              
        this.command_sequence = payload.getUnsignedInt();
              
        this.destination_latitude = payload.getInt();
              
        this.destination_longitude = payload.getInt();
              
        this.destination_altitude_ahl = payload.getInt();
              
        this.target_latitude = payload.getInt();
              
        this.target_longitude = payload.getInt();
              
        this.target_altitude_ahl = payload.getInt();
              
        this.home_latitude = payload.getInt();
              
        this.home_longitude = payload.getInt();
              
        this.home_altitude_amsl = payload.getInt();
              
        this.immediate_altitude_ahl = payload.getInt();
              
        this.mission_delay = payload.getInt();
              
        this.custom_mode = payload.getUnsignedInt();
              
        this.latitude = payload.getInt();
              
        this.longitude = payload.getInt();
              
        this.altitude_amsl = payload.getInt();
              
        this.altitude_ahl = payload.getInt();
              
        this.altitude_agl = payload.getInt();
              
        this.airspeed = payload.getFloat();
              
        this.groundspeed = payload.getFloat();
              
        this.mission_sequence = payload.getUnsignedShort();
              
        this.wp_radius = payload.getUnsignedShort();
              
        this.fs_batt_voltage = payload.getUnsignedShort();
              
        this.fence_alt_max = payload.getUnsignedShort();
              
        this.fence_radius = payload.getUnsignedShort();
              
        this.rtl_alt = payload.getUnsignedShort();
              
        this.wpnav_speed = payload.getUnsignedShort();
              
        this.fs_arc_rangefinder_alt = payload.getUnsignedShort();
              
        this.ekf_status_flags = payload.getUnsignedShort();
              
        this.heading = payload.getShort();
              
        this.roll = payload.getShort();
              
        this.pitch = payload.getShort();
              
        this.voltage_battery = payload.getUnsignedShort();
              
        this.system_type = payload.getUnsignedByte();
              
        this.subscription = payload.getUnsignedByte();
              
        this.fly = payload.getUnsignedByte();
              
        this.pause = payload.getUnsignedByte();
              
        this.speed = payload.getUnsignedByte();
              
        this.grip = payload.getUnsignedByte();
              
        this.tethered = payload.getUnsignedByte();
              
        this.quadplane = payload.getUnsignedByte();
              
         
        for (int i = 0; i < this.mission_id.length; i++) {
            this.mission_id[i] = payload.getUnsignedByte();
        }
                
              
        this.mission_active = payload.getUnsignedByte();
              
        this.mission_upload = payload.getByte();
              
        this.fs_batt_enable = payload.getUnsignedByte();
              
        this.fence_enable = payload.getUnsignedByte();
              
        this.fs_thr_enable = payload.getUnsignedByte();
              
        this.fs_ekf_action = payload.getUnsignedByte();
              
        this.fs_arc_rangefinder = payload.getUnsignedByte();
              
        this.transmit_interface = payload.getByte();
              
        this.los_rssi = payload.getByte();
              
        this.cellular_rssi = payload.getByte();
              
        this.satellite_rssi = payload.getByte();
              
        this.base_mode = payload.getUnsignedByte();
              
        this.system_status = payload.getUnsignedByte();
              
        this.gps_fix_type = payload.getUnsignedByte();
              
        this.gps_satellites_visible = payload.getUnsignedByte();
              
        this.battery_remaining = payload.getByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_arc_state_plane(){
        msgid = MAVLINK_MSG_ID_ARC_STATE_PLANE;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_arc_state_plane(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_ARC_STATE_PLANE;
        unpack(mavLinkPacket.payload);        
    }

                                                                                                                            
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_ARC_STATE_PLANE -"+" state_sequence:"+state_sequence+" time_usec:"+time_usec+" command_sequence:"+command_sequence+" destination_latitude:"+destination_latitude+" destination_longitude:"+destination_longitude+" destination_altitude_ahl:"+destination_altitude_ahl+" target_latitude:"+target_latitude+" target_longitude:"+target_longitude+" target_altitude_ahl:"+target_altitude_ahl+" home_latitude:"+home_latitude+" home_longitude:"+home_longitude+" home_altitude_amsl:"+home_altitude_amsl+" immediate_altitude_ahl:"+immediate_altitude_ahl+" mission_delay:"+mission_delay+" custom_mode:"+custom_mode+" latitude:"+latitude+" longitude:"+longitude+" altitude_amsl:"+altitude_amsl+" altitude_ahl:"+altitude_ahl+" altitude_agl:"+altitude_agl+" airspeed:"+airspeed+" groundspeed:"+groundspeed+" mission_sequence:"+mission_sequence+" wp_radius:"+wp_radius+" fs_batt_voltage:"+fs_batt_voltage+" fence_alt_max:"+fence_alt_max+" fence_radius:"+fence_radius+" rtl_alt:"+rtl_alt+" wpnav_speed:"+wpnav_speed+" fs_arc_rangefinder_alt:"+fs_arc_rangefinder_alt+" ekf_status_flags:"+ekf_status_flags+" heading:"+heading+" roll:"+roll+" pitch:"+pitch+" voltage_battery:"+voltage_battery+" system_type:"+system_type+" subscription:"+subscription+" fly:"+fly+" pause:"+pause+" speed:"+speed+" grip:"+grip+" tethered:"+tethered+" quadplane:"+quadplane+" mission_id:"+mission_id+" mission_active:"+mission_active+" mission_upload:"+mission_upload+" fs_batt_enable:"+fs_batt_enable+" fence_enable:"+fence_enable+" fs_thr_enable:"+fs_thr_enable+" fs_ekf_action:"+fs_ekf_action+" fs_arc_rangefinder:"+fs_arc_rangefinder+" transmit_interface:"+transmit_interface+" los_rssi:"+los_rssi+" cellular_rssi:"+cellular_rssi+" satellite_rssi:"+satellite_rssi+" base_mode:"+base_mode+" system_status:"+system_status+" gps_fix_type:"+gps_fix_type+" gps_satellites_visible:"+gps_satellites_visible+" battery_remaining:"+battery_remaining+"";
    }
}
        