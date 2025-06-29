public class Assignment {

    //str="abc@#%hgyt@#%dkdhjhk@#%kdhkdhhs k@#%dhkjdhfkhfk@#%";
    //WAP to get to count of times the substring @#% is repeating.
    public static void main(String[] args) {
        String a="abc@#%hgyt@#%dkdhjhk@#%kdhkdhhs k@#%dhkjdhfkhfk@#%";
        System.out.println((a.split("@#%").length)-1);
    }
}
