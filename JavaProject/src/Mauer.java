
public class Mauer{
	private int height;
	private int width;
	private String baumaterial;
	private String Name;
	
	Mauer(int h, int b, String bm, String n){ 
		this.setD(h,b, bm, n); 
		}
	
	public void setD(int h, int b, String bm, String n) {
	  this.height=h;
	  this.width=b;
	  this.baumaterial = bm;
	  this.Name = n;
	  
	  
	}
	
	public int getH() {
		return height; 
		}
	public int getW() {	
		return width; 
		}
	public String getBM() {
		return baumaterial;
	    }
    public String getN() {
    	return Name;
    }
}

