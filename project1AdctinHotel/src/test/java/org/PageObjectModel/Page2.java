package org.PageObjectModel;

import org.BaseClass.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 extends Base {
	
	public Page2( ) {
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=("//*[text()='Search Hotel ']"))
	private WebElement p2;
	
	public WebElement getP2() {
		return p2;
	}

	public void setP2(WebElement p2) {
		this.p2 = p2;
	}

	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hotels ;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement numofroom;
	
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id="adult_room")
	private WebElement adultscount;
	
	@FindBy(id="child_room")
	private WebElement childrenscount;
	
	@FindBy(id="Submit")
	private WebElement search;

	public WebElement getLoc() {
		return loc;
	}

	public void setLoc(WebElement loc) {
		this.loc = loc;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getNumofroom() {
		return numofroom;
	}

	public void setNumofroom(WebElement numofroom) {
		this.numofroom = numofroom;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public void setCheckindate(WebElement checkindate) {
		this.checkindate = checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public void setCheckoutdate(WebElement checkoutdate) {
		this.checkoutdate = checkoutdate;
	}

	public WebElement getAdultscount() {
		return adultscount;
	}

	public void setAdultscount(WebElement adultscount) {
		this.adultscount = adultscount;
	}

	public WebElement getChildrenscount() {
		return childrenscount;
	}

	public void setChildrenscount(WebElement childrenscount) {
		this.childrenscount = childrenscount;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}
	
	public static void main(String[] args) {

		Page2 p2 = new Page2();
		
		Assert.assertTrue("p2", getText(p2.getP2()).contains("Search Hotel"));
		
		SelectIndex(p2.getLoc(),6);
		Assert.assertEquals("loction","New York", getatt(p2.getLoc()));
		SelectIndex(p2.getHotels(),2);
		Assert.assertEquals("hotels","Hotel Sunshine",getatt(p2.getHotels()));
		SelectIndex(p2.getRoomtype(),4);
		Assert.assertEquals("RoomTypes","Super Deluxe",getatt(p2.getRoomtype()));
		SelectIndex(p2.getNumofroom(),2);
		Assert.assertTrue(true);
		sendkeys(p2.getCheckindate(), "01/09/2023");
		Assert.assertTrue(true);
		sendkeys(p2.getCheckoutdate(),"07/09/2023");
		Assert.assertTrue(true);
		SelectIndex(p2.getAdultscount(),2);
		Assert.assertTrue(true);
		SelectIndex(p2.getChildrenscount(),2);
		Assert.assertTrue(true);
		Click(p2.getSearch());
	}
}
