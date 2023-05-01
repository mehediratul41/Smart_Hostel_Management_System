/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;


public class RoomInfo {
    private String roomId;
    private String buildingNo;
    private String floor;
    private String type;
    private int totalBed;
    private int emptyBed;
    
    public RoomInfo()
    {
        ;
    }
    
    public RoomInfo(String roomId, String buildingNo, String floor, String type, int totalBed, int emptyBed) {
        this.roomId = roomId;
        this.buildingNo = buildingNo;
        this.floor = floor;
        this.type = type;
        this.totalBed = totalBed;
        this.emptyBed = emptyBed;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalBed() {
        return totalBed;
    }

    public void setTotalBed(int totalBed) {
        this.totalBed = totalBed;
    }

    public int getEmptyBed() {
        return emptyBed;
    }

    public void setEmptyBed(int emptyBed) {
        this.emptyBed = emptyBed;
    }

   
}
