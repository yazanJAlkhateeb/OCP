package H$$IO;

import javax.print.*;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashPrintJobAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestPrinter {

    public static void main(String[] args) {
        try {
            printPayment(new File(""));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printPayment(File payment) throws FileNotFoundException {
        AttributeSet aset = new HashPrintJobAttributeSet();
        aset.add(MediaSizeName.ISO_A4);
        DocPrintJob job = getPrinterByName(PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.PDF, aset), "HP_LaserJet_M402dn_08A791_");
        try {
            FileInputStream paymentFileStream = new FileInputStream("/home/yazan/Downloads/Credit_Transactions_root_SERVICE_USER_19-06-2018_03-21-05_PM_21.pdf");
            Doc doc = new SimpleDoc(paymentFileStream, DocFlavor.INPUT_STREAM.PDF, null);
            job.print(doc, new HashPrintRequestAttributeSet());
        } catch (FileNotFoundException | PrintException fe) {
            throw new IllegalStateException("No File Found");
        }

    }

    private static DocPrintJob getPrinterByName(PrintService[] printServices, String printerName) {

        for (PrintService printService : printServices) {
            if (printService.getName().equalsIgnoreCase(printerName))
                return printService.createPrintJob();
        }
        throw new IllegalArgumentException("Printer Not found");
    }
}


