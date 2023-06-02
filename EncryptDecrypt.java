public class EncryptDecrypt {
    public static void main(String[] args) {
        char grade ='B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
