package ec.edu.espe.virtualgamestore.model;

/**
 *
 * @author JavaMasters
 */
public class UserName {

    private String name;
    private String password;
    private String address;
    private String email;
    private String dateOfBirth;

    public UserName(String name, String password, String address, String email,
            String dateOfBirth) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public UserName(String name, String password) {
        this.name = name;
        this.password = password;

    }

    @Override
    public String toString() {
        return getName() + ";" + getPassword() + ";" + getAddress() + ";"
                + getEmail() + ";" + getDateOfBirth();
    }

    public String generateCsvData() {
        return getName() + ";" + getPassword() + ";" + getAddress() + ";"
                + getEmail() + ";" + getDateOfBirth();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
