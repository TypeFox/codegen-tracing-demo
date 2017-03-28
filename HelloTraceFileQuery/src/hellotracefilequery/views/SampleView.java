package hellotracefilequery.views;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.ui.generator.trace.IEclipseTrace;
import org.eclipse.xtext.ui.generator.trace.ILocationInEclipseResource;
import org.eclipse.xtext.ui.generator.trace.ITraceForStorageProvider;
import org.eclipse.xtext.util.TextRegion;

import com.google.inject.Inject;
import com.google.inject.Injector;

import cbbdemo.ui.internal.CbbdemoActivator;

public class SampleView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "hellotracefilequery.views.SampleView";

	/* Used to find the trace from the generated file. */
	private ITraceForStorageProvider iTraceForStorageProvider = null;

	/*
	 * Trace data, used to get text regions in the source file from text regions
	 * in the generated file.
	 */
	private IEclipseTrace fTraceToSource = null;

	/* Reference to the selected generated file. */
	private IFile fGeneratedFile = null;

	/* GUI text fields. */
	private Text fLineText, fOffsetInLineText;

	public SampleView() {
		Injector injector = CbbdemoActivator.getInstance().getInjector(CbbdemoActivator.COM_ERICSSON_TOSIDE_CBBDEMO);
		iTraceForStorageProvider = injector.getInstance(ITraceForStorageProvider.class);
	}

	/* Listener for when the user selects something. */
	ISelectionListener fSelectionListener = new ISelectionListener() {

		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			try {
				if (part == SampleView.this)
					return;

				/* Is it a selection in a Tree? */
				if (selection instanceof ITreeSelection) {
					ITreeSelection treeSelection = (ITreeSelection) selection;

					Object firstElement = treeSelection.getFirstElement();

					if (firstElement == null)
						return;

					/* Is is a CDT C source file? */
					if (firstElement instanceof ITranslationUnit) {
						ITranslationUnit tu = (ITranslationUnit) firstElement;

						fGeneratedFile = tu.getFile();
						System.out.println("You selected TU " + fGeneratedFile.getName());

						/*
						 * Get a reference to the trace associated to this file.
						 */
						fTraceToSource = iTraceForStorageProvider.getTraceToSource(fGeneratedFile);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

	/* Listener for when the user clicks on the Go button. */
	private SelectionListener fButtonSelectionListener = new SelectionListener() {

		@Override
		public void widgetSelected(SelectionEvent arg0) {
			try {
				if (fTraceToSource == null)
					return;

				int lineInGenerated = Integer.parseInt(fLineText.getText());
				int offsetInLine = Integer.parseInt(fOffsetInLineText.getText());

				InputStream contents = fGeneratedFile.getContents();
				BufferedReader reader = new BufferedReader(new InputStreamReader(contents));
				String s = null;
				int offset = 0;

				/* Read the file content line by line, calculating the offset, until the desired line. */
				for (int i = 1; i < lineInGenerated; i++) {
					s = reader.readLine();
					/* + 1 to account for the \n */
					offset += s.length() + 1;

					if (s == null)
						return;
				}

				/* Try to read the desired line. */
				s = reader.readLine();

				if (s == null)
					return;

				System.out.println(s);
				for (int i = 0; i < offsetInLine; i++) {
					System.out.print(' ');
				}
				System.out.println('^');

				offset += offsetInLine;

				TextRegion textRegion = new TextRegion(offset, 1);

				Iterable<? extends ILocationInEclipseResource> allAssociatedLocations
					= fTraceToSource.getAllAssociatedLocations(textRegion);

				for (ILocationInEclipseResource loc : allAssociatedLocations) {
					System.out.println(loc);
				}
			} catch (NumberFormatException e) {

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		@Override
		public void widgetDefaultSelected(SelectionEvent arg0) {
			// TODO Auto-generated method stub

		}
	};

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {

		getSite().getPage().addPostSelectionListener(fSelectionListener);

		GridLayout layout = new GridLayout(2, false);

		parent.setLayout(layout);

		new Label(parent, 0).setText("Line:");
		fLineText = new Text(parent, SWT.SINGLE);

		new Label(parent, 0).setText("Offset in line:");
		fOffsetInLineText = new Text(parent, SWT.SINGLE);

		new Label(parent, 0).setText("");
		Button btn = new Button(parent, SWT.PUSH);
		btn.addSelectionListener(fButtonSelectionListener);
		btn.setText("Go");
	}

	@Override
	public void dispose() {
		getSite().getPage().removePostSelectionListener(fSelectionListener);
		super.dispose();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
}
