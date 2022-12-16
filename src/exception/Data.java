package exception;

public class Data {

    private static final String VALID_CHARACHTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "0123456789_";
    private Data(){
    }
    public static boolean validate(String login,
                                String password,
                                String confirmPassword){
        try{
            check(login, password,confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void check(String login,
                                String password,
                                String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!validate(login)){
            throw new WrongLoginException("Логин не валидный!");
        }
        if (!validate(password)){
            throw new WrongPasswordException("Пароль не валидный!");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли должны совпадать!");
        }

    }

    private static boolean validate (String s){
        if(s.length() > 20){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            if(!VALID_CHARACHTERS.contains(String.valueOf(s.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
