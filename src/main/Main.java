package main;

import Model.DataModel;
import ui.Login;

public class Main {

   public static void main(String[] args) {

      String modelPath = "data_model.dat";
      
      DataModel dataModel = DataModel.loadFromFile(modelPath);

      Login lf = new Login(dataModel);

   }
}
