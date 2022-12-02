package chrvk.javaelementary.hw16.task2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

public class Main {

    public static void whenJavaSerializedToXmlFile_thenCorrect(Group group, File file) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(file, group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Group whenJavaGotFromXmlFile_thenCorrect(File file) {
        Group group = new Group();
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = inputStreamToString(new FileInputStream(file));
            group = xmlMapper.readValue(xml, Group.class);
        } catch (IOException e) {
            System.out.println(e);
        }

        return group;
    }

    public static String inputStreamToString(InputStream is) {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try {
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        File file1 = new File("my_xml_1.xml");
        File file2 = new File("my_xml_2.xml");

        Group group = whenJavaGotFromXmlFile_thenCorrect(file1);
        whenJavaSerializedToXmlFile_thenCorrect(group, file2);
    }
}
