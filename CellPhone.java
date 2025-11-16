class CellPhone {

    void ring() {
        System.out.println("Ringing...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }

    void callFriend() {
        System.out.println("Calling friend...");
    }

    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.ring();
        phone.vibrate();
        phone.callFriend();
    }
}