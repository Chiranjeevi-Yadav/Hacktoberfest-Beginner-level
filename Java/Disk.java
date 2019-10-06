import javax.tv.xlet.XletContext;

import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;

import java.awt.Container;
import javax.tv.graphics.TVContainer;

// Getting a container for the screen could be

public void initXlet(XletContext context) {

// Java TV API to be compatible with Java TV
TVContainer scene = TVContainer.getRootContainer(context);

// Or for BD-J, to utilize HAVi features not available in Java TV
HScene scene = HSceneFactory.getInstance().getDefaultHScene();

// Or perhaps more generally...
Container container = null;
boolean realBDJ = true;
if (realBDJ)
	container = HSceneFactory.getInstance().getDefaultHScene();
else
	container = TVContainer.getRootContainer(context);
...
}