using System;
using System.Linq;
using Xunit;
using MavnetCore.Mavlink;
using System.Text;

namespace tests
{
    public class RoundTripTests
    {
        public MavnetMessage RoundTrip(MavnetMessage msg)
        {
            MavnetParser parser = new MavnetParser();
            return parser.ParseBytes(msg.toBytes()).FirstOrDefault();
        }

        [Fact]
        public void RoverState()
        {
            var p = new MAVLink.mavlink_mavnet_state_rover_t { };
            p.system_type = MAVLink.MAV_TYPE.GROUND_ROVER;
            p.command_sequence = 0;
            p.state_sequence = 0;
            p.subscription = (byte)99;

            p.time_usec = 12345;

            p.pause = 0;

            p.speed = (byte)4;

            //param hash TBD
            p.param_hash = new byte[16];

            p.destination_latitude = 0;
            p.destination_longitude = 0;
            p.destination_altitude_ahl = 0;

            p.target_latitude = 0;
            p.target_longitude = 0;
            p.target_altitude_ahl = 0;

            p.home_latitude = 0;
            p.home_longitude = 0;
            p.home_altitude_amsl = 0;

            //mission
            p.mission_active = 55;
            p.mission_id = new byte[16] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
            p.mission_upload = -1;
            p.mission_delay = 0;
            p.mission_sequence = (ushort)0;

            //comm status
            p.transmit_interface = MAVLink.COMM_INTERFACE.INTERNET;  //only option for this version
            p.los_rssi = -1;
            p.cellular_rssi = (sbyte)100;
            p.satellite_rssi = -1;

            //clutched
            p.flags = MAVLink.ASSET_STATE_FLAG.CLUTCHED;
            //heartbeat info
            p.base_mode = MAVLink.MAV_MODE_FLAG.CUSTOM_MODE_ENABLED;
            p.custom_mode = 0;
            p.system_status = MAVLink.MAV_STATE.ACTIVE;
            p.latitude = 0;
            p.longitude = 0;

            //altitude
            p.altitude_amsl = 0;
            p.heading = 90;
            p.groundspeed = 0.97f;
            p.gps_fix_type = MAVLink.GPS_FIX_TYPE._3D_FIX;
            p.gps_satellites_visible = 12;
            p.voltage_battery = 12343;
            p.battery_remaining = 90;
            p.target_altitude_ahl = 0;
            p.v_acc = 0;
            p.h_acc = 0;
            p.interval = 0;
            p.los_rssi = 0;
            p.system_temperature = new short[2] { 09, 10 };

            p.param_hash = new byte[16] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };

            MavnetMessage packet = new MavnetMessage
            {
                message_id = (uint) MAVLink.MAVLINK_MSG_ID.MAVNET_STATE_ROVER,
                payload = p,
                component_id = 0,
                system_id = (byte)2
            };

            MAVLink.mavlink_mavnet_state_rover_t m = RoundTrip(packet).payload as MAVLink.mavlink_mavnet_state_rover_t;

            Assert.StrictEqual(9, m.system_temperature[0]);
            Assert.StrictEqual(10, m.system_temperature[1]);
            Assert.StrictEqual(90, m.heading);
            Assert.StrictEqual(12343, m.voltage_battery);
            Assert.StrictEqual(55, m.mission_active);
            Assert.StrictEqual(MAVLink.MAV_TYPE.GROUND_ROVER, m.system_type);
            Assert.Equal(p.mission_id, m.mission_id);
            Assert.Equal(p.param_hash, m.param_hash);
        }


        [Fact]
        public void CommRegistrationMessage()
        {
            const string SERIAL_NUMBER = "I've got your serial number right here yo. In fact it should be truncated...";
            const string CALLSIGN = "Short";
            const string COMM_GROUP = "The league of extraordinary UAVs";

            var p = new MAVLink.mavlink_mavnet_comm_registration_t { };
            p.comm_group_name = Encoding.ASCII.GetBytes(COMM_GROUP);
            p.callsign = Encoding.ASCII.GetBytes(CALLSIGN);
            p.serial_number = Encoding.ASCII.GetBytes(SERIAL_NUMBER);
            p.micro_hard_id = 33;
            p.system_type = 7;


            MavnetMessage packet = new MavnetMessage
            {
                message_id = (uint)MAVLink.MAVLINK_MSG_ID.MAVNET_COMM_REGISTRATION,
                payload = p,
                component_id = 0,
                system_id = (byte)2
            };

            MAVLink.mavlink_mavnet_comm_registration_t m = RoundTrip(packet).payload as MAVLink.mavlink_mavnet_comm_registration_t;

            Assert.StrictEqual((uint)33, m.micro_hard_id);
            Assert.StrictEqual(7, m.system_type);
            Assert.Equal(SERIAL_NUMBER.Substring(0, Math.Min(24, SERIAL_NUMBER.Length)), Encoding.ASCII.GetString(m.serial_number).TrimEnd('\0'));
            Assert.Equal(CALLSIGN.Substring(0, Math.Min(24, CALLSIGN.Length)), Encoding.ASCII.GetString(m.callsign).TrimEnd('\0'));
            Assert.Equal(COMM_GROUP.Substring(0, Math.Min(16, COMM_GROUP.Length)), Encoding.ASCII.GetString(m.comm_group_name).TrimEnd('\0'));
        }
    }
}
