package com.example.first;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//вариант 15
public class first {
    public static void main(String[] args) throws IOException {

        ArrayList<PhotoFrame> PhotoFrame = new ArrayList<PhotoFrame>();
        PhotoFrame.add(new DigitalFrame(1, "lol", "200f", "RED", "digital", 12, 12, "12x6"));
        PhotoFrame.add(new PlainFrame(2, "lol", "200f", "RED", "base", "water", 12, "13x4"));

        FileWriter csvWrite = new FileWriter("test.csv");
//

        csvWrite.append(PhotoFrame.toString());
        csvWrite.close();


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("new.dat"))) {
            oos.writeObject(PhotoFrame);
            System.out.println("File has been written");
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }


        ArrayList<PhotoFrame> newPhotoFrame = new ArrayList<PhotoFrame>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("new.dat"))) {

            newPhotoFrame = ((ArrayList<PhotoFrame>) ois.readObject());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        for (PhotoFrame p : newPhotoFrame) {
//            if (p.getType().equals("digital"))
//                System.out.println(p.toString());
            System.out.println(p.getClass());
        }


        // write data
//        PhotoFrame frame = new DigitalFrame(1, "lol", "200f", "RED", "digital", 12, 12, "12Х6");
//        PhotoFrame frame1 = new PlainFrame(2, "lol", "200f", "RED", "base", "water", 12, "13x5");
//        FileWriter csvWrite = new FileWriter("test.csv");
//
//        ArrayList<PhotoFrame> PhotoFrame = new ArrayList<PhotoFrame>();
//        csvWrite.append(frame.toString());
//        csvWrite.append(frame1.toString());
//        csvWrite.close();
//
//
//        // read data
//        List<String[]> myList = new ArrayList<>();
//        BufferedReader csvReader = new BufferedReader(new FileReader("test.csv"));
//        String row;
//        while ((row = csvReader.readLine()) != null) {
//            String[] data = row.split(",");
//            myList.add(data);
//        }
//
//        System.out.println(myList);
//        ArrayList<PhotoFrame> serializeList = new ArrayList<>();
//
//    }


        //
//        List<String> serializeList = new ArrayList<>();
//        for (String[] v : myList) {
//            if (v[4].equals("digital")) {
//                String a = "Id: " + v[0] + " Name: " + v[1] + " Price: " + v[2] + " Color: " + v[3] + " Digital: " + v[4] + " Memory: " + v[5] + " Viewing angle: " + v[6] + " Size: " + v[7] + "\n";
//                serializeList.add(a);
//                System.out.println("Id: " + v[0] + " Name: " + v[1] + " Price: " + v[2] + " Color: " + v[3] + " Digital: " + v[4] + " Memory: " + v[5] + " Viewing angle: " + v[6] + " Size: " + v[7] + "\n");
//            } else if (v[4].equals("base")) {
//                String b = "Id: " + v[0] + " Name: " + v[1] + " Price: " + v[2] + " Color: " + v[3] + " Digital: " + v[4] + " Material: " + v[5] + " Width:  " + v[6] + " Material insert: " + v[7] + "\n";
//                serializeList.add(b);
//                System.out.println("Id: " + v[0] + " Name: " + v[1] + " Price: " + v[2] + " Color: " + v[3] + " Digital: " + v[4] + " Material: " + v[5] + " Width:  " + v[6] + " Material insert: " + v[7] + "\n");
//            } else {
//                System.out.print("Sorry, error");
//            }
//        }


        //serializable
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializable.dat"))) {
//            oos.writeObject(serializeList);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//
//        List<String[]> dserializeList = new ArrayList<>();
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializable.dat"))) {
//            dserializeList = (List<String[]>) ois.readObject();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println(dserializeList);
//        System.out.printf("After deserializable\n");
//        for (String[] k : dserializeList) {
//            if (k[4].equals("digital")) {
//                System.out.println("Id: " + k[0] + " Name: " + k[1] + " Price: " + k[2] + " Color: " + k[3] + " Digital: " + k[4] + " Memory: " + k[5] + " Viewing angle: " + k[6] + " Size: " + k[7]);
//            } else if (k[4].equals("base")) {
//                System.out.println("Id: " + k[0] + " Name: " + k[1] + " Price: " + k[2] + " Color: " + k[3] + " Digital: " + k[4] + " Material: " + k[5] + " Width:  " + k[6] + " Material insert: " + k[7] + "\n");
//            } else {
//                System.out.print("Sorry, error");
//            }
//        }
//    }

    }
}






