public class Main {
    public static void main(String[] args) {

        String nama = "Abi Mael";

    
        System.out.println("nama asli: " + nama);
        System.out.println("Length: " + nama.length());
        System.out.println("UpperCase: " + nama.toUpperCase());
        System.out.println("LowerCase: " + nama.toLowerCase());
        System.out.println("Substring: " + nama.substring(0, 4));
        System.out.println("Replace: " + nama.replace("a", "o"));
        System.out.println("Trim: " + nama.trim());
        System.out.println("Equals: " + nama.equals("Abi Mael"));
        System.out.println("EqualsIgnoreCase: " +
                nama.equalsIgnoreCase("ABI MAEL"));
        System.out.println("Contains: " + nama.contains("Mael"));
        System.out.println("IsEmpty: " + nama.isEmpty());
    }
    }
