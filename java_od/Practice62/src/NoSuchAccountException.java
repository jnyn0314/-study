@SuppressWarnings("serial")
class NoSuchAccountException extends Exception {
    public NoSuchAccountException() {
        super("잘못된 입력입니다.");
    }
}
