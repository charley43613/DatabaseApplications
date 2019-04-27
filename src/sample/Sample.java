/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import com.connection.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author charl
 */
public class Sample {

    /**
     * @param args the command line arguments
     */
    private static Logger logger = LoggerFactory.getLogger(Sample.class);
    public static void main(String[] args) {
        
        BasicConfigurator.configure();
        logger.debug("Program Starting");
        DatabaseManager databaseManager = new DatabaseManager("database.properties");
        //DatabaseManager databaseManager = new DatabaseManager("C:\\Users\\charl\\Documents\\NetBeansProjects\\pkmonTCG\\sample\\src\\sample\\database.properties");

	Connection dataSource = databaseManager.establishConnection();//Create the connection
	if (null == dataSource) {
		System.exit(1); //exit if connection cannot be made
	}
        DatabaseManager newdb = new DatabaseManager();
        Lab labs = new Lab(dataSource);
        
        
        
        
        
        
        /*big lab start
        


        List<String> objWeights = new ArrayList();
        objWeights.add("50.5");
        objWeights.add("22.5");
        objWeights.add("15.7896");
        objWeights.add("5.5625");
       
        List<String> objNames = new ArrayList();
        objNames.add("Lead Ball");
        objNames.add("Aluminum Ball");
        objNames.add("Glass Ball");
        objNames.add("Plastic Ball");
        
        ArrayList locales = new ArrayList();//question 2
        locales.add("en_ZA");
        locales.add("en_US");
        locales.add("fr_FR");
        locales.add("fo_FO");
        locales.add("el_GR");
        locales.add("es_HN");
        locales.add("es_PE");
        locales.add("es_PY");
        locales.add("fo_FO");
        locales.add("gl_ES");
        
        
        List<String> dateformats = new ArrayList();//question 7
        dateformats.add("%W %M %d %Y");
        dateformats.add("%Y-%m-%d");
        dateformats.add("%a %M %d %Y");
        dateformats.add("");
        

        /*
        labs.errorByTypeQuery();//question 1
        
        labs.languageFormat(locales, objNames.get(0)); //question 2
        
        labs.addtoObject(objNames, objWeights);//question 3
        
        labs.add15ChildEntries(objNames);//question 4
        
        labs.delete1stChildRow();//question 5
        
        labs.add10toObjectWeightofMaxId();//question 6
        
        labs.dateFormatting(dateformats);//question 7
        
        labs.dateFormattingwithLocale(locales, dateformats);//question 8
        */


        //VIEWS AND PROCS HW
        /*
        labs.selectView();
        labs.procWithArgs(250);
        labs.procWithoutArgs();

        /*Triggers lab
        List<String> objRowIds = new ArrayList();
        objRowIds.add("12");
        objRowIds.add("20");
        objRowIds.add("32");
        objRowIds.add("41");
        objRowIds.add("22");
        
        labs.delete5fromObjectTypeData();
        labs.add5toObjectTypeData(objRowIds);
        labs.updateObjectTypeData();
        labs.returnAlltriggeredData();
        
        
        Triggers lab end
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Final project start
        
        //step 1 and 2 done in sql workbench for creating tables/triggers


        
        List<String> fnames = new ArrayList();
        List<String> lnames = new ArrayList();
        List<String> addresses = new ArrayList();
        List<String> newAddresses = new ArrayList();
        List<String> cities = new ArrayList();
        List<String> states = new ArrayList();
        fnames.add("Charles");
        fnames.add("Jacob");
        fnames.add("Kayla");
        fnames.add("Kaylie");
        fnames.add("Jimmy");
        fnames.add("Jackson");
        fnames.add("Sarah");
        fnames.add("Josh");
        fnames.add("Eric");
        fnames.add("Sam");
        fnames.add("Kalese");
        fnames.add("Marquis");
        fnames.add("Mckenna");
        fnames.add("Aaron");
        fnames.add("Rodger");
        fnames.add("Carlos");
        fnames.add("Hose");
        fnames.add("Daniel");
        fnames.add("Nathan");
        fnames.add("Cloud");
        fnames.add("Karl");
        fnames.add("Samuel");
        
        lnames.add("Smith");
        lnames.add("Johnson");
        lnames.add("Rodgers");
        lnames.add("Whitacre");
        lnames.add("Culpepper");
        lnames.add("Jones");
        lnames.add("Mann");
        lnames.add("Gaylord");
        
        
        
        addresses.add(  "Alexis");
        addresses.add(  "home lane");
        addresses.add(  "Brooke");
        addresses.add( "Washington");
        addresses.add( "Larson");
        addresses.add(  "Smith");
        addresses.add ( "Springdale");
        addresses.add( "Lakeview");
        addresses.add(  "Cambridge");
        addresses.add( "Forestview");
        Random rand = new Random(); 
        for(String address: addresses){
            int rand_int2 = rand.nextInt(1000);
            newAddresses.add(rand_int2 + " " +  address);
        }
        cities.add("Toledo");
        cities.add("Port Clinton");
        cities.add("Napoleon");
        cities.add("Columbus");
        cities.add("Cleveland");
        
        states.add("OH");
        
        
        
        /*
        labs.add30uniqueCustomers(fnames, lnames, newAddresses, cities, states); //step 3
        */
        List<String> ordersdesc = new ArrayList();
        ordersdesc.add("ABC Supply Co. supplies");
        ordersdesc.add("Builders FirstSource materials");
        ordersdesc.add("Beacon Roofing Supply materials");
        ordersdesc.add("BMC Stock Holdings Inc. supplies");
        ordersdesc.add("Allied Building Products supplies");
        ordersdesc.add("84 Lumber materials");
        ordersdesc.add("US LBM Holdings Inc. materials");
        ordersdesc.add("HD Supply White Cap supplies");
        ordersdesc.add("BlueLinx Corp. materials");
        ordersdesc.add("SRS Distribution supplies");
        ordersdesc.add("XYZ Supply Co. materials");
        
        //labs.insrt2Ordersfor15Customers(ordersdesc);//Step 4
 
        
        List<Integer> invCodesList = new ArrayList();
        List<String> descs = new ArrayList();
        List<Integer> quants = new ArrayList();
        List<Double> prices = new ArrayList();
        invCodesList.add(1010);
        invCodesList.add(1020);
        invCodesList.add(1030);
        invCodesList.add(1040);
        invCodesList.add(2010);
        invCodesList.add(2110);
        invCodesList.add(4010);
        invCodesList.add(4120);
        invCodesList.add(4410);
        invCodesList.add(4500);
        invCodesList.add(8900);
        invCodesList.add(6000);
        invCodesList.add(5500);
        invCodesList.add(5600);
        invCodesList.add(6100);
        descs.add("#1 HMS");
        descs.add("Carbon Steel");
        descs.add("Forgings");
        descs.add("Carbon Steel 1040");
        descs.add("Brass Truning");
        descs.add("Copper Chops");
        descs.add("Aluminum Turning");
        descs.add("Aluminum Chops");
        descs.add("Painted Aluminum");
        descs.add("Aluminum Clippings");
        descs.add("Waste");
        descs.add("Fluff");
        descs.add("Hastelloy");
        descs.add("Titanium");
        descs.add("Titanium Clippings");
        quants.add(50000);
        quants.add(150000);
        quants.add(75000);
        quants.add(65000);
        quants.add(175000);
        quants.add(250000);
        quants.add(250000);
        quants.add(175000);
        quants.add(25000);
        quants.add(275000);
        quants.add(350000);
        quants.add(150000);
        quants.add(175000);
        quants.add(135400);
        quants.add(675000);
        prices.add(.05);
        prices.add(.075 );
        prices.add(.065 );
        prices.add(.055 );
        prices.add(.120 );
        prices.add(.10 );
        prices.add(.25 );
        prices.add(.225 );
        prices.add(.075 );
        prices.add(.110 );
        prices.add(.01 );
        prices.add(.025 );
        prices.add(.45 );
        prices.add(.475 );
        prices.add(.376 );
        /*labs.add15InvCodes(invCodesList, descs, quants, prices);*///Step 5
        //labs.add5orderDetailsfor2OrdersofCstmrs(invCodesList);//step 6
        
        HashMap<Integer, Double> hmap = new HashMap<>();
        //hmap = labs.hghstToLwstCst();//step 7
        //labs.hghstToLwstOnHand();//step 8
        List<Double> totalPrice = new ArrayList();

        
        System.out.println("\n \n HIGHEST TO LOWEST ASSETS:");
        /*labs.costOfAllInventories();//step 9
        labs.orderByInventoryCost();//step 10
        labs.cstmrsThatdidntOrder();//step 11
        */
        //labs.crtCstmrWithOrdr();//step 12
        //labs.orderByInventoryCost();//step 13
        //labs.descOfHighestPrice();//step14
        //labs.updatelbsby100000but6100();//step15
        //labs.oneOrderand5detailsforMerl(invCodesList);//step16
        //labs.updatePricebasedonCode();//step 17
        //labs.orderByInventoryCost();//repeating step 10
        //labs.showAuditTable();//step18


        
        
        //Final project end
        
        
        //final exam start
        labs.selectInventoryCstView();//step 19
        labs.pplbGrtrthanX(.02);//step 20 place any number in here for second part of question
        labs.getAvgOrdersgrtrThanX(100.0);//step 21 (avg cost of orders are small and don't exceed 100, so it won't produce any significant results
        labs.getAvgOrdersgrtrThanX(3.0);//step 21 with signifcant results (avg cost of orders are small and don't exceed 100, so it won't produce any significant results
        
        
        
        
        
        
        //final exam end
        
        
        
        
        
        /* Close the database connection */
	databaseManager.closeConnection(dataSource);
	logger.debug("Program completed");
    }
    
}
