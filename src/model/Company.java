package model;
import structures.AdjacencyGraph;

import java.util.ArrayList;
import java.util.List;

public class Company {
    AdjacencyGraph<String> cities = new AdjacencyGraph<>();
    public Company(){

    }

    public List<String> djkSolution(String city1, String city2){
        return  cities.dijkstra(city1,city2);
    }



    public void insertElementsToGraph() {


        cities.addVertex("Bogota");
        cities.addVertex("Medellin");
        cities.addVertex("Barranquilla");
        cities.addVertex("Cartagena");
        cities.addVertex("Bucaramanga");
        cities.addVertex("Pereira");
        cities.addVertex("SantaMarta");
        cities.addVertex("Manizales");
        cities.addVertex("Cucuta");
        cities.addVertex("Ibague");
        cities.addVertex("Villavicencio");
        cities.addVertex("Valledupar");
        cities.addVertex("Cali");
        cities.addVertex("Monteria");
        cities.addVertex("Armenia");
        cities.addVertex("Neiva");
        cities.addVertex("Sincelejo");
        cities.addVertex("Popayan");
        cities.addVertex("Tunja");
        cities.addVertex("Riohacha");
        cities.addVertex("Florencia");
        cities.addVertex("Palmira");
        cities.addVertex("Soledad");
        cities.addVertex("Buenaventura");
        cities.addVertex("Barrancabermeja");

        cities.addEdge("Bogota", "Medellin", 400);
        cities.addEdge("Bogota", "Ibague", 200);
        cities.addEdge("Bogota", "Manizales", 170);
        cities.addEdge("Bogota", "Bucaramanga", 320);
        cities.addEdge("Bogota", "Cartagena", 660);

        cities.addEdge("Medellin", "Bogota", 400);
        cities.addEdge("Medellin", "Barranquilla", 1070);
        cities.addEdge("Medellin", "Pereira", 180);
        cities.addEdge("Medellin", "SantaMarta", 1150);
        cities.addEdge("Medellin", "Cucuta", 430);

        cities.addEdge("Barranquilla", "Medellin", 1070);
        cities.addEdge("Barranquilla", "Cartagena", 130);
        cities.addEdge("Barranquilla", "Villavicencio", 840);
        cities.addEdge("Barranquilla", "Valledupar", 200);
        cities.addEdge("Barranquilla", "Cali", 1030);

        cities.addEdge("Cartagena", "Barranquilla", 130);
        cities.addEdge("Cartagena", "Bucaramanga", 840);
        cities.addEdge("Cartagena", "Bogota", 660);
        cities.addEdge("Cartagena", "Monteria", 690);
        cities.addEdge("Cartagena", "Armenia", 870);

        cities.addEdge("Bucaramanga", "Cartagena", 840);
        cities.addEdge("Bucaramanga", "Bogota", 320);
        cities.addEdge("Bucaramanga", "Pereira", 200);
        cities.addEdge("Bucaramanga", "Neiva", 310);
        cities.addEdge("Bucaramanga", "Sincelejo", 540);

        cities.addEdge("Pereira", "Bucaramanga", 200);
        cities.addEdge("Pereira", "Medellin", 180);
        cities.addEdge("Pereira", "SantaMarta", 990);
        cities.addEdge("Pereira", "Barrancabermeja", 430);
        cities.addEdge("Pereira", "Riohacha", 640);

        cities.addEdge("SantaMarta", "Pereira", 990);
        cities.addEdge("SantaMarta", "Medellin", 1150);
        cities.addEdge("SantaMarta", "Manizales", 930);
        cities.addEdge("SantaMarta", "Popayan", 1000);
        cities.addEdge("SantaMarta", "Buenaventura", 480);

        cities.addEdge("Manizales", "SantaMarta", 930);
        cities.addEdge("Manizales", "Bogota", 170);
        cities.addEdge("Manizales", "Cucuta", 550);
        cities.addEdge("Manizales", "Soledad", 690);
        cities.addEdge("Manizales", "Florencia", 460);

        cities.addEdge("Cucuta", "Manizales", 550);
        cities.addEdge("Cucuta", "Medellin", 430);
        cities.addEdge("Cucuta", "Ibague", 430);
        cities.addEdge("Cucuta", "Palmira", 530);
        cities.addEdge("Cucuta", "Tunja", 550);

    }

}