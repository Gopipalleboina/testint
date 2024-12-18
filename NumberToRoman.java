public class NumberToRoman {
    public static void main(String[] args) {
        int number = 1987;  // You can change this number to any other value
        System.out.println("The Roman numeral of " + number + " is " + convertToRoman(number));
    }

    public static String convertToRoman(int number) {
        // Arrays of Roman numerals and corresponding integer values
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String roman = ""; // Start with an empty string

        // Loop through each value, subtracting it from the number and appending the corresponding Roman numeral
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                roman += romanNumerals[i]; // Append Roman numeral directly to the string
            }
        }

        return roman;
    }
}
