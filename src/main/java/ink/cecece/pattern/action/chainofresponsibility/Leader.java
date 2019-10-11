package ink.cecece.pattern.action.chainofresponsibility;

public abstract class Leader {

    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public Leader setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
        return this;
    }

    public abstract void handlerRequest(LeaveRequest request);
}
