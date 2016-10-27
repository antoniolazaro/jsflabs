package com.pilotojsf.managedbean.dia2.event;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class PhaseListenerSample implements PhaseListener{

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}
	
	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("Antes da fase...");
		
	}
	
	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Após fase...");
		
	}

}
