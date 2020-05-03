class Robot {
    EncryptedEMail encryptedEMail = new EncryptedEMail();

    void decryptSender(){
        for (int i = 0; i < 4; i++){
            for (int k = 0; k < 28; k++){
                System.out.print(encryptedEMail.decryptChar(i,k));
            }
            System.out.println();
        }
    }
}
