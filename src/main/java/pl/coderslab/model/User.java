package pl.coderslab.model;

import org.mindrot.jbcrypt.BCrypt;

public class User {

    private int id;
    private String userName;
    private String email;
    private String password;
    private int userGroupId;
    private String groupName = null;

    public User() {}

    public User(String userName, String email, String password, int userGroupId) {
        this.userName = userName;
        this.email = email;
        this.userGroupId = userGroupId;
        this.hashPassword(password);
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getUserGroupId() {
        return userGroupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserGroupId(int userGroupId) {
        this.userGroupId = userGroupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void hashPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id:          ").append(this.id).append("\n");
        stringBuilder.append("userName:    ").append(this.userName).append("\n");
        stringBuilder.append("email:       ").append(this.email).append("\n");
        stringBuilder.append("userGroupId: ").append(this.userGroupId).append("\n");
        return stringBuilder.toString();
    }


}
