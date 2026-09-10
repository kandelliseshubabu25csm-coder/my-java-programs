// illegal state exception
public class EphProm10 {
        static boolean start = false;
        static void post(){
            if(!start){
                throw new IllegalStateException("cannot start , post can't start to post");
            }
            System.out.println("post is ready to social media ");
        }
     public static void main(String[] args) {
     try {
        System.out.println("the posting is stopped");
     } catch (IllegalStateException ise) {
        // TODO: handle exception
        System.out.println("error" + ise.getMessage());
     }
       finally{
        System.out.println("the exception is done");
       } 



    }
}