package com.jimersylee;

public class Main {

    public static void main(String[] args) {

        String salt = BCrypt.gensalt(13);
        System.out.println(salt);
        System.out.println(BCrypt.hashpw("Qq111111", salt));
        System.out.println(BCrypt.hashpw("Qq111111", "$2y$13$NlCI6yL1C4xVXdy8/JFExJ"));
        System.out.println(BCrypt.checkpw("Qq111111", "$2y$13$NlCI6yL1C4xVXdy8/JFEx.6.qXlDLh7XyfNshTR4eIrcqCz/M439q"));
    }
}
