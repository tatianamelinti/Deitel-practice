package Chap11_20;

public class Except {

    private static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
        private static void someMethod2 () throws Exception {
            throw new Exception("Exception thrown in someMethod 2");

        }


        public static void main (String[]args){
            try {
                someMethod();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
