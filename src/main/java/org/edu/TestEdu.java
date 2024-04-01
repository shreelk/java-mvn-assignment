package org.edu;


class HelloWorld {
	private int abc;
	
    private String ip = "127.0.0.1";
    
    public static void main(String[] args) {
        System.out.println("Checkstyle"); 
        Boolean testVar = true;
        if (testVar == true) {
        	System.out.println("testVar is true"); 
        } else if (testVar == false) {
        	System.out.println("testVar is false");
        }
    }
    public void test() {

        String[] field = {"a", "b", "c", "s", "e"};

        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(ip);

    }
}