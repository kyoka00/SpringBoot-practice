package com.example.demo.controller;

public class Util {
	 public static boolean isNullOrEmpty(String str) {
	        if (str == null || str.isEmpty()) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	 public static boolean isNullOrEmpty(Integer integer) {
	        if (integer == null || integer.equals(null)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
}
