/**
 * TestEdu Demo
 */
package com.org.edu;

/**
 *  TestEdu class.
 */
public class TestEdu {
    /**
     * Main method.
     * @param args Input args.
     */
    public static void main(final String[] args) {
        System.out.println("Checkstyle");

        final boolean testVar = true;

        if (testVar) {
            System.out.println("testVar is true");
        } else if (!testVar) {
            System.out.println("testVar is false");
        }
    }

    /**
     * Test method.
     */
    public void test() {
         // Array of strings.
        String[] fields = {"a", "b", "c", "s", "e"};

        //String variable.
        String s = "";

        for (String field : fields) {
            s += field;
            System.out.println(s);
        }
    }
}
