class Office {
    PasswordGenerator pg;
    String password;
    
    void printPassword() {
        pg = new PasswordGenerator();
        password = pg.getPassword();
        System.out.println(password);
    }
}
