

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
//You can use this function to implement your manual testing	   
	   
   }
   
   
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing	   

   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing	   

   }

   /* Note: We were confused by this part of the assignment. The instructions say that our test should be "very similar"
      to the test code for URLValidatorCorrect. In addition, there didn't seem to be much way to improve the code. I
      asked a question on Piazza about how similar the tests are supposed to be, and the answer seemed to suggest that
      the test code should be largely copied from URLValidatorCorrect.testIsValid() with just the test values changed.
      As a result, our code for testIsValid() is largely copied from URLValidatorCorrect.testIsValid().
   */
   public void testIsValid()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       assertTrue(urlVal.isValid("http://www.facebook.com"));

       String[] validURLs = {
               "www.google.com",
               "google.com",
               "www.blah.edu/",
               "http://www.blah.edu/",
               "https://hi.org",
               "https://hi.com",
               "ftp://someftp.com/",
               "www.google.com/q?word=something&otherword=somethingelse",
               "google.com",
               "www.10.0.1.42",
               "10.0.1.42:42000",
               "somesite.org/page1",
               "somesite.org/page1/page2",
               "10.12.13.1:80/someotherpage/whatever?p=param"
       };

       String[] invalidURLs = {
               "http:google.com",
               "http:/google.com",
               "http/google.com",
               "256.0.0.1",
               "http://somesite.somesite",
               "www..somewhere.com",
               "aport.com:-1",
               "aport.com:700000",
               "aport.com:hi",
               "www.somewhere.com//",
               "www.somewhere.com/a//",
               "www.somewhere.com/a/../"
       };

       for (int i = 0; i < validURLs.length; i++) {
          assertTrue(validURLs[i], urlVal.isValid(validURLs[i]));
       }

       for (int i = 0; i < invalidURLs.length; i++) {
           assertFalse(invalidURLs[i], urlVal.isValid(invalidURLs[i]));
       }
   }


   public static void main(String[] argv) {

      UrlValidatorTest fct = new UrlValidatorTest("url test");
      fct.testIsValid();
   }
}
