import org.flip.Homepage;
import org.flip.Secondpage;xaa
import org.flip.pagethree;
import org.test.BaseClass;

public class Maven extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		
		chromelanuch();
		UrlLanuch("https://www.flipkart.com/");
		timeout(10);
		
		
		Homepage h = new Homepage();
		Click(h.getCancel());
		sendkeys(h.getSearchbox(), "nothingmobile");
		Click(h.getSearchbtn());
		
		
		Secondpage s = new Secondpage();
		Click(s.getClc2());
		
		WindowsHandels(1);
		
		pagethree t = new pagethree();
		Click(t.getBuy());
		
	}}
