package com.uxteam.reload.facestudiod.intro;

//import javax.swing.text.View;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.sun.glass.ui.View;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
//		layout.setEditorAreaVisible(false);
//		layout.addStandaloneView(NavigationView.ID, false, 
//				IPageLayout.LEFT, 0.25f, editorArea);
//		IFolderLayout folder = layout.createFolder("message", 
//				IPageLayout.TOP, 0.5f, editorArea);
//		folder.addPlaceholder(View.ID+":");
//		folder.addView(View.ID);
//		layout.getViewLayout(NavigationView.ID).setCloseable(false);
//		
//		
		layout.addView("org.uxteam.example.crm.customerview",
				IPageLayout.LEFT, 0.25f, editorArea);
		
		
		
		
		
	}
}
