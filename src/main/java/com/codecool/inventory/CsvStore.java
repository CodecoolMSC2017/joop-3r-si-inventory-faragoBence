package com.codecool.inventory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvStore implements StoreCapable {
    private final List<Product> list = new ArrayList<>();

    @Override
    public List<Product> getAllProduct() {
        return list;
    }

    @Override
    public void storeCDProduct(String name, int price, int tracks) {
        list.add(new CDProduct(name, price, tracks));
    }

    @Override
    public void storeBookProduct(String name, int price, int pages) {
        list.add(new BookProduct(name, price, pages));
    }

    public void loadProducts(String CSVPath) {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(CSVPath))) {
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split(",");
                if (attributes[0].equals("CDProduct")) {
                    list.add(new CDProduct(attributes[1], Integer.parseInt(attributes[2]), Integer.parseInt(attributes[3])));
                } else if (attributes[0].equals("BookProduct")) {
                    list.add(new BookProduct(attributes[1], Integer.parseInt(attributes[2]), Integer.parseInt(attributes[3])));
                }
            }
            reader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void saveProducts(String CSVPath) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(CSVPath));
            StringBuilder sb = new StringBuilder();
            for (Product product : list) {
                if (product instanceof CDProduct) {
                    sb.append("CDProduct" + ",");
                    sb.append(product.getName()).append(",");
                    sb.append(Integer.toString(product.getPrice())).append(",");
                    sb.append(Integer.toString(((CDProduct) product).getNumOfTracks()));
                } else if (product instanceof BookProduct) {
                    sb.append("BookProduct" + ",");
                    sb.append(product.getName()).append(",");
                    sb.append(Integer.toString(product.getPrice())).append(",");
                    sb.append(Integer.toString(((BookProduct) product).getNumOfPages()));
                }
                sb.append("\n");

            }
            String mystr = sb.toString();
            mystr = mystr.substring(0, mystr.length() - 1);
            bw.write(mystr);
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
