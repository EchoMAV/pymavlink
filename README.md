## Pymavlink generator

This version is modified from the common version at: https://github.com/ArduPilot/pymavlink

It has been modified to generate C# files following the convention originally created by Michale Osborne for Mission Planner. EchoMAV's C# software is dependent on headers generated using ONLY this generator. Don't be confused by the fact that the common version above can also generate C# headers. YOU MUST USE THIS GENERATOR IF YOU ARE WORKING WITH AN ECHOMAV C# APP! 

If you are here to generate mavlink headers, you are in the wrong place. This repo should not be used directly by users, rather use https://github.com/EchoMAV/mavlink_header_generator which will pull this repo and use it during the generation script. 
