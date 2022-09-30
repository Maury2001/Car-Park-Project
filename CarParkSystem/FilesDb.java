
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class FilesDb {

    String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\aprk\\n.txt";
    String clientFile = "C:\\Users\\DELL\\OneDrive\\Desktop\\aprk\\try.txt";

    void clientFile(String name, String id, String vehicle, String plate, String slot) {
        try {

            String one = name + " " + " " + id + " " + vehicle + " " + plate + " " + slot + "\n";
            BufferedWriter writer = new BufferedWriter(new FileWriter(clientFile));
            writer.write(one);
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void search() {

        double count = 0, countBuffer = 0, countLine = 0;
        BufferedReader br;
        String inputSearch = JOptionPane.showInputDialog(null, "ENTER NO.PLATE:", "CAR PARK", JOptionPane.QUESTION_MESSAGE);
        String line = " ";

        try {
            br = new BufferedReader(new FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\aprk\\try.txt"));
            try {
                while ((line = br.readLine()) != null) {
                    countLine++;
                    //System.out.println(line);
                    String[] words = line.split(" ");

                    for (String word : words) {
                        if (word.equals(inputSearch)) {
                            JOptionPane.showMessageDialog(null, "CAR FOUND", "CAR PARK", JOptionPane.INFORMATION_MESSAGE);
                            System.out.print("Car found");
                            count++;
                            countBuffer++;
                        } else if (!word.equals(inputSearch)) {
                            JOptionPane.showMessageDialog(null, "CAR NOT FOUND", "CAR PARK", JOptionPane.ERROR_MESSAGE);
                        }

                    }

                }
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Times found at--" + count);

    }

    //create File
    void createFile(String user, String pass) {

        String oneLine = user + " " + pass + "\n";
        byte data[] = oneLine.getBytes();
        try {
            File usersFile = new File(fileName);
            if (!usersFile.exists()) {
                OutputStream outPassFile = new FileOutputStream(fileName);
                outPassFile.write(data, 0, data.length);
            } else {
                OutputStream outPassFile = new FileOutputStream(fileName, true);
                outPassFile.write(data, 0, data.length);
            }
        } catch (IOException e) {
            System.out.print("Exception: ");

        }

    }

    //verify user and password
    boolean verify(String user, String pass) {

        if (validate(user, pass)) {

            JOptionPane.showMessageDialog(null, "ACCESS GRANTED", "VERIFIED", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("ACCESS GRANTED!!");

            int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose Action:\n1. PARK\n2. PAY"));

            switch (choice) {
                case 1:
                    Park parkk = new Park();
                    parkk.park();

                    break;

                case 2:

                    Pay payy = new Pay();
                    payy.pay();

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "!!ACCESS DENIED!!", "NOT VERIFIED", JOptionPane.ERROR_MESSAGE);
                    System.out.println("!!ACCESS DENIED!!");
                    break;

            }

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "!!ACCESS DENIED!!", "NOT VERIFIED", JOptionPane.ERROR_MESSAGE);
            System.out.println("!!ACCESS DENIED!!");
            return false;
        }
    }

    //check if user is registered
    boolean validate(String user, String pass) {
        boolean tempValidation = false;
        BufferedReader fileReader;
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            String oneLine = fileReader.readLine();
            while (oneLine != null) {
                String tmpUser = oneLine.substring(0, oneLine.indexOf(" "));
                // austine 123
                // godwin abc
                String tmpPass = oneLine.substring(oneLine.indexOf(" ") + 1);
                if ((tmpUser.equals(user)) && (tmpPass.equals(pass))) {
                    tempValidation = true;
                }
                // System.out.println(tmpUser);
                // System.out.println(tmpPass);
                oneLine = fileReader.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return tempValidation;
    }
}