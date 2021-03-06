package assign.services;

import java.sql.SQLException;
import java.util.ArrayList;

import assign.domain.Device;

public interface DeviceDBService {
    
    public void testDatabase(String deviceID) throws Exception;
    
    public boolean hasDevice(String deviceID) throws Exception;
    
    public void addDevice(String deviceID, int priority, boolean status) throws Exception;
    
    public void updateDevice(String deviceID, int priority, boolean status) throws Exception;
    
    public String makeDecision() throws SQLException;
    
    public Device getDevice(String deviceID) throws SQLException;
    
    public ArrayList<Device> analytics() throws SQLException;

	public void clearAll() throws Exception ;


    
}
