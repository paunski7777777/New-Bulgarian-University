public class IllegalNumberOfParticipantsException extends Exception {

    public IllegalNumberOfParticipantsException(String message){
        super(message);
    }
    public IllegalNumberOfParticipantsException(Throwable cause){
        super(cause);
    }

    public IllegalNumberOfParticipantsException(String message, Throwable cause){
        super(message, cause);
    }
}
