public class User {

    private int userIdAsInt;

    /**
     * You can instantiate it with no args if you like, you will just have to call the setter
     */
    public User() {

    }

    public User(String userIdAsString) {
        setFromString(userIdAsString);
    }

    public User(int userIdAsInt) {
        this.userIdAsInt = userIdAsInt;
    }

    private void setFromString(String asString) {
        try {
            this.userIdAsInt = Integer.parseInt(asString);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("We recieved a string that matched 1-9");
        }
    }

    public int getUserIdAsInt() {
        return userIdAsInt;
    }

    public void setUserIdAsString(String userIdAsString) {
        setFromString(userIdAsString);
    }

}
