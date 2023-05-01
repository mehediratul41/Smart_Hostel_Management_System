
package database_project2;


public class SeatInfo {
    private String seatId;
    private String roomId;
    private int isEmpty;
    private String MemberId="";

    public SeatInfo() {
    }

    public SeatInfo(String seatId, String roomId, int isEmpty, String MemberId) {
        this.seatId = seatId;
        this.roomId = roomId;
        this.isEmpty = isEmpty;
        this.MemberId = MemberId;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(int isEmpty) {
        this.isEmpty = isEmpty;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }
    
    
}
