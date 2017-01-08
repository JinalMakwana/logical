package util;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class GetResult {

    public static void main(String[] args) throws Exception {
        
    }

   public String finalpath(String singlepath) throws Exception {
        List<String> l = new ArrayList<String>();
        StringTokenizer st1 = new StringTokenizer(singlepath);
        read1 r1 = new read1();
        ArrayList<bean> a = r1.readsecond();
        String finalpath = "";
        while (st1.hasMoreTokens()) {
            l.add(st1.nextToken());
        }
        String transport;
        String f;
        String t;
        int j;
        for (int i = 0; i < l.size() - 1; i++) {

            for (j = 0; j < a.size(); j++) {
                if (a.get(j).getFromcity().equals(l.get(i)) && a.get(j).getTocity().equals(l.get(i + 1))) {
                    f = a.get(j).getFromcity();
                    t = a.get(j).getTocity();
                    break;
                }
            }

            transport = a.get(j).getTransport();

            finalpath = finalpath + l.get(i) + "-->" + transport + "-->";

      
        }

        finalpath = finalpath + l.get(l.size() - 1);
        return finalpath;
    }

   public int finaltime(String singlepath) throws Exception {
        List<String> l = new ArrayList<String>();
        StringTokenizer st1 = new StringTokenizer(singlepath);
        read1 r1 = new read1();
        ArrayList<bean> a = r1.readsecond();
        String finalpath = "";
        while (st1.hasMoreTokens()) {
            l.add(st1.nextToken());
        }

        int time = 0;
        String f;
        String t;
        int j;
        for (int i = 0; i < l.size() - 1; i++) {

            for (j = 0; j < a.size(); j++) {
                if (a.get(j).getFromcity().equals(l.get(i)) && a.get(j).getTocity().equals(l.get(i + 1))) {
                    f = a.get(j).getFromcity();
                    t = a.get(j).getTocity();
                    break;
                }
            }

            time = time + a.get(j).getTime();

        }

        
        return time;
    }

   public int finalcost(String singlepath) throws Exception {
        List<String> l = new ArrayList<String>();
        StringTokenizer st1 = new StringTokenizer(singlepath);
        read1 r1 = new read1();
        ArrayList<bean> a = r1.readsecond();
        String finalpath = "";
        while (st1.hasMoreTokens()) {
            l.add(st1.nextToken());
        }

        int cost = 0;
        int j;
        String f;
        String t;
        for (int i = 0; i < l.size() - 1; i++) {
            for (j = 0; j < a.size(); j++) {
                if (a.get(j).getFromcity().equals(l.get(i)) && a.get(j).getTocity().equals(l.get(i + 1))) {
                    f = a.get(j).getFromcity();
                    t = a.get(j).getTocity();
                    break;
                }
            }

            cost = cost + a.get(j).getCost();

        }
        //  System.out.println(cost);

        return cost;
    }

}
