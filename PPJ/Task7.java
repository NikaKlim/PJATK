public class Task7 {
    public static String norm(String name) {
        String firstLetter = name.substring(0, 1).toUpperCase();
        String remainingLetters = name.substring(1).toLowerCase();
        return firstLetter + remainingLetters;
    }

    public static String init(String name) {
        String[] nameParts = name.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String part : nameParts) {
            if (!part.isEmpty()) {
                initials.append(part.substring(0, 1).toUpperCase()).append(". ");
            }
        }
        String lastName = nameParts[nameParts.length - 1].substring(0, 1).toUpperCase()
                + nameParts[nameParts.length - 1].substring(1).toLowerCase();
        return initials.toString().trim() + lastName;
    }

    public static String tr(String s, String from, String to) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int index = from.indexOf(current);
            if (index != -1) {
                result.append(to.charAt(index));
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("November 2016", "abcdefghijklmnopqrstuvwyz", "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ", "aZcX", "||Cx"));
    }
}
