package restassuredproject;

public class Menu {
	    private String id;
	    private String value;
	    private int height;
	    private Popup popup;
		public Popup getPopup() {
			return popup;
		}
		public void setPopup(Popup popup) {
			this.popup = popup;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		

}
