package com.rentcentric.mobileagent.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class CarRentalPrefs {
    public  static String CustomerID = "";
	private SharedPreferences prefs;
	private SharedPreferences.Editor prefs_edit;
	private static CarRentalPrefs instance;

	private CarRentalPrefs(Context context) {
		prefs = PreferenceManager.getDefaultSharedPreferences(context);
		prefs_edit = prefs.edit();
	}

	public static CarRentalPrefs getInstance(Context context) {
		if (instance == null) {
			instance = new CarRentalPrefs(context);
		}
		return instance;
	}

	// is login
			public void setLogin(boolean isLogin) {
				prefs_edit.putBoolean("isLogin", isLogin);
				prefs_edit.commit();
			}

			public boolean isLogin(){
				return prefs.getBoolean("isLogin", false);
			}

	
	// card number
	public void setCardNumber(String CardNumber) {
		prefs_edit.putString("CardNumber", CardNumber);
		prefs_edit.commit();
	}

	public String getCardNumber() {
		return prefs.getString("CardNumber", "");
	}


	// locktype
	public void setLockType(String type)
	{
		prefs_edit.putString("TYPE", type);
		prefs_edit.commit();
	}
	public String getLockType()
	{
		return prefs.getString("TYPE", "");
	}
	// customer id


	public void setAdminAllowChickins(String allowChickins)
	{
		prefs_edit.putString("AllowChickins", allowChickins);
		prefs_edit.commit();
	}
	public String getAdminAllowChickins()
	{
		return prefs.getString("AllowChickins", "");
	}
	// customer id



	public void setAdminAllowDamagesAdd(String allowDamagesAdd)
	{
		prefs_edit.putString("AllowDamagesAdd", allowDamagesAdd);
		prefs_edit.commit();
	}
	public String getAdminAllowDamagesAdd()
	{
		return prefs.getString("AllowDamagesAdd", "");
	}
	// customer id


	public void setAdminLocationID(String AdminLocationID) {
		prefs_edit.putString("AdminLocationID", AdminLocationID);
		prefs_edit.commit();
	}

	public String getAdminLocationID() {
		return prefs.getString("AdminLocationID", "");
	}

	public void setAdminID(String AdminID) {
		prefs_edit.putString("AdminID", AdminID);
		prefs_edit.commit();
	}

	public String getAdminID() {
		return prefs.getString("AdminID", "");
	}

	public void setAdminFullName(String AdminFullName) {
		prefs_edit.putString("AdminFullName", AdminFullName);
		prefs_edit.commit();
	}

	public String getAdminFullName() {
		return prefs.getString("AdminFullName", "");
	}



	public void setCustomerID(String CustomerID) {
		prefs_edit.putString("CustomerID", CustomerID);
		prefs_edit.commit();
	}

	public String getCustomerID() {
		return prefs.getString("CustomerID", "");
	}

	// first name
	public void setFirstName(String FirstName) {
		prefs_edit.putString("FirstName", FirstName);
		prefs_edit.commit();
	}

	public String getFirstName() {
		return prefs.getString("FirstName", "");
	}
	
	// lastname
		public void setLastName(String LastName) {
			prefs_edit.putString("LastName", LastName);
			prefs_edit.commit();
		}

		public String getLastName() {
			return prefs.getString("LastName", "");
		}

		// gender
		public void setGender(String Gender) {
			prefs_edit.putString("Gender", Gender);
			prefs_edit.commit();
		}

		public String getGender() {
			return prefs.getString("Gender", "");
		}

		// location id
		public void setLocationID(String LocationID) {
			prefs_edit.putString("LocationID", LocationID);
			prefs_edit.commit();
		}

		public String getLocationID() {
			return prefs.getString("LocationID", "");
		}

	//vehicle lock/unlock

	public void setLock(Boolean isLocked) {
		prefs_edit.putBoolean("isLocked", isLocked);
		prefs_edit.commit();
	}

	public Boolean isLocked() {
		return prefs.getBoolean("isLocked", true);
	}


	//booking pickup date
	public String getPickDate(){
		return prefs.getString("pickDate","");
	}
	public void setPickDate(String pickDate){
		prefs_edit.putString("pickDate",pickDate);
		prefs_edit.commit();
	}

	//booking dropout date
	public String getDropDate(){
		return prefs.getString("dropDate", "");
	}
	public void setDropDate(String dropDate){
		prefs_edit.putString("dropDate",dropDate);
		prefs_edit.commit();
	}


	//booking formated pickup date
	public String getFormatedPickDate(){
		return prefs.getString("pickFormatedDate","");
	}
	public void setPickFormatedDate(String pickDate){
		prefs_edit.putString("pickFormatedDate",pickDate);
		prefs_edit.commit();
	}

	//booking formated dropout date
	public String getDropFormatedDate(){
		return prefs.getString("dropFormatedDate", "");
	}
	public void setDropFormatedDate(String dropDate){
		prefs_edit.putString("dropFormatedDate",dropDate);
		prefs_edit.commit();
	}


	//booking pickup time
	public String getPickTime(){
		return prefs.getString("pickTime","");
	}
	public void setPickTime(String pickTime){
		prefs_edit.putString("pickTime",pickTime);
		prefs_edit.commit();
	}

	//booking dropout time
	public String getDropTime(){
		return prefs.getString("dropTime", "");
	}
	public void setDropTime(String dropTime){
		prefs_edit.putString("dropTime",dropTime);
		prefs_edit.commit();
	}


	//location phone number
	public String getPhoneNumber(){
		return prefs.getString("phoneNumber","");
	}
	public void setPhoneNumber(String phoneNumber){
		prefs_edit.putString("phoneNumber",phoneNumber);
		prefs_edit.commit();
	}

	public String getCurrentRef(){
		return prefs.getString("current_ref","0");
	}
	public void setCurrentRef(String currentRef){
		prefs_edit.putString("current_ref",currentRef);
		prefs_edit.commit();
	}

	public String getLocID(){
		return prefs.getString("loc_id","");
	}
	public void setLocID(String loc_id){
		prefs_edit.putString("loc_id",loc_id);
		prefs_edit.commit();
	}
	public String getLocName(){
		return prefs.getString("loc_name","");
	}
	public void setLocName(String loc_name){
		prefs_edit.putString("loc_name",loc_name);
		prefs_edit.commit();
	}

	public String getLocLat(){
		return prefs.getString("loc_lat","");
	}
	public void setLocLat(String loc_lat){
		prefs_edit.putString("loc_lat",loc_lat);
		prefs_edit.commit();
	}

	public String getLocLng(){
		return prefs.getString("loc_lng","");
	}
	public void setLocLng(String loc_lng){
		prefs_edit.putString("loc_lng",loc_lng);
		prefs_edit.commit();
	}
	public String getLocAdd(){
		return prefs.getString("loc_add","");
	}
	public void setLocAdd(String loc_add){
		prefs_edit.putString("loc_add",loc_add);
		prefs_edit.commit();
	}

	public void logOut() {
			prefs_edit.clear();
			prefs_edit.commit();
		}
	public boolean hasLocID(){
		return prefs.getBoolean("has_loc_id",true);
	}
	public void setHasLocID(boolean has_loc_id){
		prefs_edit.putBoolean("has_loc_id", has_loc_id);
		prefs_edit.commit();
	}

	public String getNewLocID(){
		return prefs.getString("new_loc_id", "");
	}
	public void setNewLocID(String new_loc_id){
		prefs_edit.putString("new_loc_id", new_loc_id);
		prefs_edit.commit();
	}

	public void setCurLatitude(String lat){
		prefs_edit.putString("cur_lat_val",lat);
		prefs_edit.commit();
	}
	public String getCurLatitude(){
		return prefs.getString("cur_lat_val","0");
	}

	public void setCurLongitude(String lng){
		prefs_edit.putString("cur_lng_val", lng);
		prefs_edit.commit();
	}
	public String getCurLongitude(){
		return prefs.getString("cur_lng_val","0");
	}


	public void setFilterType(String type){
		prefs_edit.putString("filter_type_val", type);
		prefs_edit.commit();
	}
	public String getFilterType(){
		return prefs.getString("filter_type_val","");
	}

	public void setFilterValue(String value){
		prefs_edit.putString("filter_value", value);
		prefs_edit.commit();
	}
	public String getFilterValue(){
		return prefs.getString("filter_value","");
	}

}
