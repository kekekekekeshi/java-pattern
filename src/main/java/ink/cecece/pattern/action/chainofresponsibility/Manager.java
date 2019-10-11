package ink.cecece.pattern.action.chainofresponsibility;

/**
 * 主任
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(LeaveRequest request) {
        if(request.getLeaveDays()<10)
            System.out.println(name+"审批通过！");
        else
            if(nextLeader!=null)
                this.nextLeader.handlerRequest(request);
    }
}
