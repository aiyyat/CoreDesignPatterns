package org.technicalyorker.dp.behavioural.memento;

public class Client {
	public static void main(String[] args) {
		SnapshotManager care = new SnapshotManager();
		Policy policy = new Policy();
		
		policy.setStage(Stage.INITIATED);
		policy.setAttendingStaff("Thomas");
		System.out.println(policy);
		care.saveMemento(policy.createSnapShot());
		
		policy.setStage(Stage.MODIFIED);
		policy.setAttendingStaff("Henry");
		System.out.println(policy);
		care.saveMemento(policy.createSnapShot());
		
		policy.setStage(Stage.REVIEWED);
		policy.setAttendingStaff("Simpson");
		System.out.println(policy);

		// The action gets rejected
		policy.restoreToPreviousState(care.popMemento());
		System.out.println(policy);

		// The action gets rejected
		policy.restoreToPreviousState(care.popMemento());
		System.out.println(policy); 
	}
}
