package main;

import model.Company;

import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);
    Company company = new Company();

    public static void main(String[]args){
        Main m = new Main();

        m.menu();
    }

    public void menu(){
        company.insertElementsToGraph();
        int option = 1;
        while (option !=0){
            System.out.println("Please select an option: " +"\n"+
                    "1. See the cheapest route to the destination of a worker" + "\n"+
                    "2. YA ESTAREMOS POR VER QUÉ MONDÁ HACER CON ESTA OPCION" + "\n");
            option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    destinationWorker();
                    break;
                case 2:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void destinationWorker() {
        String city1,city2 = "";
        System.out.println("Enter the initial point city:");
        city1 = sc.next();
        System.out.println("Enter the destiny of the delivery:");
        city2 = sc.next();

        List<String> ans= company.djkSolution(city1,city2);
        System.out.println("Shortest Path: ");
        for(int i=0; i<ans.size();i++){
            System.out.println(ans.get(i));
        }




    }
}