package com.relation.dependency;

public class User {
	
    public Schedule crateSchedule() {
    	// ��ü ���� �� ����
        return new Schedule();
    }
    
    public void useSchedule(Schedule schedule) {
    	// ��ü�� �Ű������� �޾� ���
    	// use schedule...
    	Schedule schedule2014 = schedule.getScheduleByYear(2014);
	}
}




