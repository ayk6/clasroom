package javaLess.day16;

public class methodCreationPassword {
    public static void main(String[] args) {
        // şifre oluştur.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali
        String password = "Aasdasd8a";

        boolean firstLetter = firstLetterControl(password);

        boolean lastLetter = lastLetterControl(password);

        boolean space = spaceControl(password);

        boolean length = lengthControl(password);


        if (firstLetter && lastLetter && space && length) {
            System.out.println("\nşifre geçerli");
        } else System.out.println("\ngeçersiz şifre - yeni şifre oluşturun");
    }

    private static boolean lengthControl(String password) {
        boolean length = false;
        if (password.length() >= 8) {
            length = true;
        } else System.out.println("Şifre en az 8 karakter olmalı");
        return length;
    }

    private static boolean spaceControl(String password) {
        boolean space = false;
        if (!password.contains(" ")) {
            space = true;
        } else System.out.println("Şifre boşluk (\" \") içeremez");
        return space;
    }

    private static boolean lastLetterControl(String password) {
        boolean lastLetter =false;
        if (password.charAt(password.length() - 1) >= 'a' &&
                password.charAt(password.length() - 1) <= 'z') {
            lastLetter = true;
        } else System.out.println("Şifrenin son harfi küçük olmalı");
        return lastLetter;
    }

    private static boolean firstLetterControl(String password) {
        boolean firstLetter = false;
        if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
            firstLetter = true;
        } else System.out.println("Şifrenin ilk harfi büyük olmalı");
        return firstLetter;

    }
}
