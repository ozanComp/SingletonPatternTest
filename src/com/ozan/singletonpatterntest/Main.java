package com.ozan.singletonpatterntest;

		public class Main {
			public static void main(String[] args) {
		        try {
		            SingletonExample singletonExample1 = SingletonExample.getInstance();
		            SingletonExample singletonExample2 = SingletonExample.getInstance();
		
		            System.out.println("singletonExample1 " + singletonExample1);
		            System.out.println("singletonExample2 " + singletonExample2);
		            System.out.println(singletonExample1 == singletonExample2);
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		}

		
		