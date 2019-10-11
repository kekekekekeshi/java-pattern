package ink.cecece.pattern.action.chainofresponsibility;

/**
 * 主任
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(LeaveRequest request) {
        if(request.getLeaveDays()<=30)
            System.out.println(name+"审批通过！");
        else
            System.out.println("大于30天，不允许请假！");
    }
}
