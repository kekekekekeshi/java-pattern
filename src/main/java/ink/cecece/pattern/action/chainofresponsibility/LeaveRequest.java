package ink.cecece.pattern.action.chainofresponsibility;

/**
 * 假条
 */
public class LeaveRequest {

    private String name;
    private int leaveDays;
    private String reason;

    public LeaveRequest(String name, int leaveDays, String reason) {
        this.name = name;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public LeaveRequest setName(String name) {
        this.name = name;
        return this;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public LeaveRequest setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public LeaveRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
