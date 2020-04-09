package com.ozan.singletonpatterntest;

		public class SingletonExample {
			private SingletonExample() {}
		 
		    private static class SingletonHelper {
		 
		        private static final SingletonExample instance = new SingletonExample();
		    }
		 
		    public static SingletonExample getInstance() {
		        return SingletonHelper.instance;
		    }
		}

		
		