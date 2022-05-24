public class ExceptionIssue {

    public static void main(String[] args) {

        try{
            throw new RuntimeException("Jsssss");
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Fuck you");

        }



    }

}
