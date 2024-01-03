class Decipherer {

    public static String dechiffrer(String message) {

        int keyNumber = message.length() / 2;
        String sousChaine = message.substring(5, 5 + keyNumber);
        String replacedString = sousChaine.replace("@#?", " ");
        String messageDecode = new StringBuilder(replacedString).reverse().toString();

        System.out.println(messageDecode);
        return (messageDecode);
    }

    public static void main(String[] args) {
        String[] messages = { "0@sn9sirppa@#?ia'jgtvryko1", "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
                "aopi?sedohtém@#?sedhtmg+p9l!" };
        for (String message : messages) {
            dechiffrer(message);
        }
    }
}