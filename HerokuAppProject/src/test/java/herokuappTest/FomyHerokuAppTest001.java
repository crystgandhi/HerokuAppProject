package herokuappTest;

import org.testng.annotations.Test;

import herokuAppPageObjects.Autocompletepage;
import herokuAppPageObjects.CheckBoxesPage;
import herokuAppPageObjects.DragTheImage;
import herokuAppPageObjects.EnabledDisabledElements;
import herokuAppPageObjects.FileUploadPage;
import herokuAppPageObjects.FomPage;
import herokuAppPageObjects.FormSubmited;
import herokuAppPageObjects.HomePageComponents;
import herokuAppPageObjects.RadioButtons;
import herokuAppPageObjects.ScrollThePage;
import herokuAppPageObjects.SwitchWindow;

public class FomyHerokuAppTest001 extends BaseClass{
	
	HomePageComponents hpc;
	FomPage fp;
	FormSubmited fs;
	EnabledDisabledElements ede;
	RadioButtons rb;
	ScrollThePage sp;
	SwitchWindow sw;
	CheckBoxesPage cbp;
	Autocompletepage acp;
	FileUploadPage fup;
	DragTheImage dti;
	
	@Test
	public void lanuchApplication() throws InterruptedException {
		System.out.println("Application launched");
		// Creating an instance of HomePageComponents and initializing it with the 'driver' object
		hpc=new HomePageComponents(driver);
		// Printing various elements from the HomePageComponents
		System.out.println(hpc.getHeading());
		System.out.println(hpc.getLogoHeading());
		System.out.println(hpc.getNavItem1());
		System.out.println(hpc.getDDLink());
		System.out.println(hpc.getParagraph1());
		System.out.println(hpc.getParagraph2());
		// Getting and displaying a list of components from the HomePageComponents
		hpc.getComponentsList();
		hpc.clickNavItem1();
		// Creating an instance of FomPage and initializing it with the 'driver' object
		fp=new FomPage(driver);
		// Calling methods to enter personal information and select other details on FomPage
		fp.enterPersonalInformation();
		fp.selectotherDetails();
		// Creating an instance of FormSubmited and initializing it with the 'driver' object
		fs=new FormSubmited(driver);
		System.out.println(fs.getText());
		// Printing the heading 
		System.out.println(fs.getHeading());
		ede=new EnabledDisabledElements(driver);
		// Clicking on the drop-down menu link from FormSubmited
		fs.clickDDMenuLink();
		System.out.println(ede.getHeading());
		// Entering text in a disabled input field and  in an enabled input field 
		ede.enterTextinDisabledInput();
		ede.enterTextinEnabledInput();
		// Creating an instance of RadioButtons and initializing it with the 'driver' object
		rb=new RadioButtons(driver);
		ede.clickDDMenuLink();
		System.out.println(rb.getpageHeading());
		// Clicking a radio button 
		rb.clickRadBtn();
		// Clicking on the drop-down menu link from RadioButtons
		rb.clickDDMenuLink();
		// Creating an instance of ScrollThePage and initializing it with the 'driver' object
		sp=new ScrollThePage(driver);
		// Printing the scroll page heading
		System.out.println(sp.getScrollPageHeading());
		// Adding a delay of 3 seconds (3000 milliseconds) to allow time for actions to be performed
		Thread.sleep(3000);
		// Calling the method to enter a name
		sp.enterName();
		sw=new SwitchWindow (driver);
		sp.clickDDMenuLink();
		System.out.println(sw.getWindowHeading());
		// Opening a new tab
		sw.openNewTab();
		// Opening an alert box
		sw.openAlertBox();
		// Creating an instance of CheckBoxesPage 
		cbp=new CheckBoxesPage(driver);
		// Clicking on the drop-down menu link from SwitchWindow
		sw.clickDDMenuLink();
		System.out.println(cbp.getCheckBoxPageHeading());
		// Selecting the second and the third check boxes
		cbp.selectChkBox2();
		cbp.selectChkBox3();
		// Creating an instance of Autocompletepage
		acp=new Autocompletepage(driver);
		cbp.clickDDMenuLink();
		acp.getAutocompletePageHeading();
		// Getting the address from Autocompletepage
		acp.getAddress();
		acp.getStreetAddress1();
		acp.getStreetAddress2();
		acp.getLocality();
		acp.getState();
		acp.getPostalCode();
		acp.getCountry();
		acp.clickDDMenuLink();
		// Creating an instance of FileUploadPage 
		fup=new FileUploadPage (driver);
		System.out.println(fup.getFileUploadPageHeading());
		fup.clickChooseBtn();
		// Creating an instance of DragTheImage 
		dti=new DragTheImage(driver);
		fup.clickDDMenuLink();
		System.out.println(dti.getDragImageHeading());
		// Performing an action to move the image on the DragTheImage page
		dti.moveImage();
	}
}
