import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DataPars parsData = new DataPars();
        String newFileName = null;
        Write writeFile = new Write();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DateException();
            } catch (DateException e) {
                data = parsData.parsInputData();
            }
        }

        newFileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);

    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter surname: ");
//        String surname = in.nextLine();
//        System.out.println("Enter name: ");
//        String name = in.nextLine();
//        System.out.println("Enter lastname: ");
//        String lastname = in.nextLine();
//        System.out.println("Enter phone: ");
//        Integer phone = Integer.valueOf(in.nextLine());
//        System.out.println("Enter date of birthday: ");
//        Date date = in.nextLine();
//        System.out.println("Enter sex: ");
//        String sex = in.nextLine();


}
