import java.util.Locale;

class Badge {
    public String print(Integer id, String name, String department) {


        String message = "";
        if (id != null) {
            message += "[" + id + "] - ";
        }
        message += name + " - ";
        if (department != null) {
            message += department.toUpperCase();
        } else {
            message += "OWNER";
        }
        return message;


    }
}
