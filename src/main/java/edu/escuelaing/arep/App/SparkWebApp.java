package edu.escuelaing.arep.App;

import spark.Request;
import spark.Response;
import static spark.Spark.*;



import edu.escuelaing.arep.model.MyLinkedList;

/**
 *
 * @author Andres Gonzalez
 */
public class SparkWebApp {


    public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Mean and Standad Desviation</h2>"
                + "<p>Insert the numbers separated by commas(,) then press 'submit' to calculate the Mean and Standad Desviation </p>"
                + "<form action=\"/results\">"
                + "  Data:<br>"
                + "  <input type=\"text\" name=\"numbers\" value=\"\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        Calculator calculadora = Calculator.getInstance();
        String result = "<!DOCTYPE html>"
        + "<html>"
        + "<body>";
        String[] lista = req.queryParams("numbers").split(",");
        MyLinkedList<Double> lis = new MyLinkedList<>();
        for(int i=0;i<lista.length;i++){
            lis.add(Double.parseDouble(lista[i]));
        }
        //List<Double> lis = convertirDatos(lista);
        result+="<h2>Mean</h2><br> "+calculadora.operate(lis, calculadora.mean)+"<br>";
        result+="<h2>Standard Desviation</h2><br> "+calculadora.operate(lis, calculadora.standarDes)+ "</body>"
        + "</html>";
        return result;
    }
    

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}