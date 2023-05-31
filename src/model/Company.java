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

        cities.addEdge("Bogotá", "Medellin", 520);
        cities.addEdge("Bogotá", "Ibagué", 520);
        cities.addEdge("Bogotá", "Manizales", 520);
        cities.addEdge("Bogotá", "Bucaramanga", 520);
        cities.addEdge("Bogotá", "Cartagena", 520);

    }

}