package customexceptions;

class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}
