package model;
import structures.AdjacencyGraph;
public class Company {
    AdjacencyGraph<String> cities = new AdjacencyGraph<>();
    public Company(){

    }

    public void insertElementsToGraph() {


        cities.addVertex("Bogotá");
        cities.addVertex("Medellín");
        cities.addVertex("Barranquilla");
        cities.addVertex("Cartagena");
        cities.addVertex("Bucaramanga");
        cities.addVertex("Pereira");
        cities.addVertex("Santa Marta");
        cities.addVertex("Manizales");
        cities.addVertex("Cúcuta");
        cities.addVertex("Ibagué");
        cities.addVertex("Villavicencio");
        cities.addVertex("Valledupar");
        cities.addVertex("Cali");
        cities.addVertex("Montería");
        cities.addVertex("Armenia");
        cities.addVertex("Neiva");
        cities.addVertex("Sincelejo");
        cities.addVertex("Popayán");
        cities.addVertex("Tunja");
        cities.addVertex("Riohacha");
        cities.addVertex("Florencia");
        cities.addVertex("Palmira");
        cities.addVertex("Soledad");
        cities.addVertex("Buenaventura");
        cities.addVertex("Barrancabermeja");

        cities.addEdge("Bogotá", "Medellin", 400);
        cities.addEdge("Bogotá", "Ibagué", 200);
        cities.addEdge("Bogotá", "Manizales", 170);
        cities.addEdge("Bogotá", "Bucaramanga", 320);
        cities.addEdge("Bogotá", "Cartagena", 660);

        cities.addEdge("Medellin", "Bogotá", 400);
        cities.addEdge("Medellin", "Barranquilla", 1070);
        cities.addEdge("Medellin", "Pereira", 180);
        cities.addEdge("Medellin", "Santa Marta", 1150);
        cities.addEdge("Medellin", "Cúcuta", 430);

        cities.addEdge("Barranquilla", "Medellin", 1070);
        cities.addEdge("Barranquilla", "Cartagena", 130);
        cities.addEdge("Barranquilla", "Villavicencio", 840);
        cities.addEdge("Barranquilla", "Valledupar", 200);
        cities.addEdge("Barranquilla", "Cali", 1030);

        cities.addEdge("Cartagena", "Barranquilla", 130);
        cities.addEdge("Cartagena", "Bucaramanga", 840);
        cities.addEdge("Cartagena", "Bogotá", 660);
        cities.addEdge("Cartagena", "Montería", 690);
        cities.addEdge("Cartagena", "Armenia", 870);

        cities.addEdge("Bucaramanga", "Cartagena", 840);
        cities.addEdge("Bucaramanga", "Bogotá", 320);
        cities.addEdge("Bucaramanga", "Pereira", 200);
        cities.addEdge("Bucaramanga", "Neiva", 310);
        cities.addEdge("Bucaramanga", "Sincelejo", 540);

        cities.addEdge("Pereira", "Bucaramanga", 200);
        cities.addEdge("Pereira", "Medellin", 180);
        cities.addEdge("Pereira", "Santa Marta", 990);
        cities.addEdge("Pereira", "Barrancabermeja", 430);
        cities.addEdge("Pereira", "Riohacha", 640);

        cities.addEdge("Santa Marta", "Pereira", 990);
        cities.addEdge("Santa Marta", "Medellin", 1150);
        cities.addEdge("Santa Marta", "Manizales", 930);
        cities.addEdge("Santa Marta", "Popayán", 1000);
        cities.addEdge("Santa Marta", "Buenaventura", 480);

        cities.addEdge("Manizales", "Santa Marta", 930);
        cities.addEdge("Manizales", "Bogotá", 170);
        cities.addEdge("Manizales", "Cúcuta", 550);
        cities.addEdge("Manizales", "Soledad", 690);
        cities.addEdge("Manizales", "Florencia", 460);

        cities.addEdge("Cúcuta", "Manizales", 550);
        cities.addEdge("Cúcuta", "Medellin", 430);
        cities.addEdge("Cúcuta", "Ibagué", 430);
        cities.addEdge("Cúcuta", "Palmira", 530);
        cities.addEdge("Cúcuta", "Tunja", 550);

    }

}