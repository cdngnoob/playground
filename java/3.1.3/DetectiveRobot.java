class DetectiveRobot extends Robot {
    int spareBatteryRuntime = 5;
    
    int giveTotalBatteryRuntime() {
        int result = giveBatteryRuntime() + spareBatteryRuntime;
        return result;
    }
}
