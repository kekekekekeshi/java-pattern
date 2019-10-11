package ink.cecece.pattern.action.chainofresponsibility;

import org.junit.Test;

/**
 * 责任链模式
 * 关注的是处理流程
 */
public class ChainOfResponsibilityTest {

    @Test
    public void test(){

        Leader director = new Director("主任");
        Leader manager = new Manager("经理");
        Leader generalManager = new GeneralManager("总经理");
        director.setNextLeader(manager);
        manager.setNextLeader(generalManager);
        LeaveRequest leaveRequest = new LeaveRequest("张三", 1, "临时有事");
        LeaveRequest leaveRequest1 = new LeaveRequest("张三", 5, "临时有事");
        LeaveRequest leaveRequest2 = new LeaveRequest("张三", 20, "临时有事");
        LeaveRequest leaveRequest3 = new LeaveRequest("张三", 35, "临时有事");
        director.handlerRequest(leaveRequest);
        director.handlerRequest(leaveRequest1);
        director.handlerRequest(leaveRequest2);
        director.handlerRequest(leaveRequest3);
    }
}
