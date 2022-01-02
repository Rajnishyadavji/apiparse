package restassuredproject;

import io.restassured.RestAssured;
import java.util.*;

public class jsonpojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Root root=RestAssured.get("https://api.jsonbin.io/b/61a0a59501558c731cc910b5/1")
				.as(Root.class);
		Menu obj=root.getMenu();
		String id=obj.getId();
		String value=obj.getValue();
		String oneclick;
		int height=obj.getHeight();
		System.out.println("id :"+id);
		System.out.println("value :"+value);
		System.out.println("height :"+height);
		Popup obj2=obj.getPopup();
		List<Menuitem> menuitem=obj2.getMenuitem();
		for(int i=0;i<menuitem.size();i++) {
			Menuitem obj3=menuitem.get(i);
			value=obj3.getValue();
			oneclick=obj3.getOnclick();
			System.out.println("value :"+value);
			System.out.println("Oneclick :"+oneclick);
			
			
		}
		
		
		

	}

}
