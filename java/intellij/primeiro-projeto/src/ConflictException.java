public class ConflictException extends RuntimeException{
    public ConflictException(String msg){
        super(msg);
    }

    public ConflictException(String msg, Throwable causa){
        super(msg, causa);
    }
}
