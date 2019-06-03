public class String8 {
    public String standardizeString(String str) {
        str = str.replaceAll("[ ]+", " ").trim().toLowerCase();
        
        return str;
    }
}
